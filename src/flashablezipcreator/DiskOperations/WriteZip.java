/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.DiskOperations;

import flashablezipcreator.Protocols.Logs;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Nikhil
 */
public final class WriteZip extends Write {

    ZipOutputStream zos = null;

    public WriteZip() {

    }

    //constructor overloading
    public WriteZip(String filePath) throws FileNotFoundException, IOException {
        this.zos = createZOS(filePath);
        System.out.println("Zip created at " + filePath);
    }

    //Method to retrieve the Public Key from a file
    public PublicKey getPublic(String filename) throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePublic(spec);
    }

    //Method to retrieve the Private Key from a file
    public PrivateKey getPrivate(String filename) throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    //this will create a zip outputstream
    public ZipOutputStream createZOS(String filePath) throws FileNotFoundException, IOException {
        return new ZipOutputStream(new FileOutputStream(createFile(filePath)));
    }

    //this function will create zip File.
    public File createFile(String filePath) throws IOException {
        File fileDest = new File(filePath);
        if (!fileDest.exists()) {
            fileDest.createNewFile();
            System.out.println("File Created..");
        } else {
            fileDest.delete();
            System.out.println("Existing File Deleted..!!");
            fileDest.createNewFile();
            System.out.println("File Created..");
        }
        return fileDest;
    }

    //this function will create a file in zip and write specified string to it.
    public void writeStringToZip(String strToWrite, String WriteAt) throws IOException {
        writeFileToZip(new ByteArrayInputStream(strToWrite.getBytes()), WriteAt);
    }

    //this will be used to write binaries to zip.
    @Override
    public void writeByteToFile(byte buffer[], String filePath) throws IOException {
        writeFileToZip(new ByteArrayInputStream(buffer), filePath);
    }

    //this function is simple to use, source and destination path will do the work.
    public void writeFileToZip(String filePath, String writeAt) throws IOException {
        writeFileToZip(new FileInputStream(new File(filePath)), writeAt);
    }

    //this function is used to write file to zip for any zos.
    public void writeFileToZip(InputStream in, ZipOutputStream zos, String writeAt) throws IOException {
        Logs.write("File Writing at " + writeAt);
        byte[] buffer = new byte[1024];
        ZipEntry ze = new ZipEntry(writeAt);
        try {
            zos.putNextEntry(ze);
            int len;
            while ((len = in.read(buffer)) > 0) {
                zos.write(buffer, 0, len);
            }
            Logs.write("File Written..");
        } catch (ZipException e) {
            Logs.write("Skipping Duplicate Entry : " + ze.getName());
        }
        in.close();
    }

    public void createFolderInZip(String path) throws IOException {
        ZipEntry ze = new ZipEntry(path);
        this.zos.putNextEntry(ze);
    }

    //this function is used to write file to zip for default zos.
    public void writeFileToZip(InputStream in, String writeAt) throws IOException {
        writeFileToZip(in, this.zos, writeAt);
    }

    //this function will close all the open streams
    public void close() throws IOException {
        this.zos.closeEntry();
        this.zos.close();
    }
}
