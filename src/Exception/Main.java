/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Mencoba membaca berkas latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);
            // Jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }    
}
