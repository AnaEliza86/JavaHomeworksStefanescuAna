/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomeworksstefanescuana;

import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class Notepad {
    
  public static void main(String[] args) throws IOException, InterruptedException {
    Runtime rs = Runtime.getRuntime();
    System.out.println("Opening notepad");
    Process process = rs.exec("notepad");
    Thread.sleep(600);
    process.destroy();
    System.out.println("Closing notepad");
  }
}