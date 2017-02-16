/*
This module is for extracting the color of different pixels. 
This will be helpful further recreating the image after encryption and decryption.

*/
package com.encrypt;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class Imagep {
	
   BufferedImage image;
   int width;
   int height;
   
   public Imagep() {
      try {
	      //Here i take an image named a.jpg
         File input = new File("a.jpg");
         image = ImageIO.read(input);
         width = image.getWidth();//this will give the width of the image.
         height = image.getHeight();//This will give the hight of the image.
         
         int count = 0;
         
         for(int i=0; i<height; i++){
         
            for(int j=0; j<width; j++){
            
               count++;
               Color c = new Color(image.getRGB(j, i));//this will generate the color of the each pixel.
            
			 java.lang.String pix = c.toString();//this will convert color into the string.
		    //Next line will print the RGB value of the pixels present in the image 
               System.out.println("S.No: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
               System.out.println(pix);
            }
         }
         
      } catch (Exception e) {}
   }
   
   static public void main(String args[]) throws Exception 
   {
     Imagep obj = new Imagep();
   }
}
