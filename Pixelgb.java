package com.encrypt;

import java.awt.image.BufferedImage;

import java.io.File;
import java.util.Base64;
import java.util.Base64.Encoder;

//import org.apache.commons.codec.binary.Base64;
import javax.imageio.ImageIO;

public class Pixelgb {

	public static void main(String[] args) throws Exception 
	{
		File file=new File("b.jpg");
		//File file2=new File("a1.jpg");
		BufferedImage image =ImageIO.read(file);
		BufferedImage img2=null;
		byte [][]imagebyte;		
		 
		
		
		String clr[][]=new String[image.getHeight()][image.getWidth()];
		
		for (int i=0;i<image.getHeight();i++)
		{
			for (int j=0; j<image.getWidth();j++)
			{
				int color=image.getRGB(i, j);
				
				 clr[i][j]=Integer.toHexString(color).substring(0);
				 System.out.println(color);
				//System.out.println(clr[i][j]);
			}
		}
		/*
		int a;
		for (int i=0;i<image.getHeight();i++)
		{
			for (int j=0; j<image.getWidth();j++)
			{
				//a=Integer.parseInt(clr[i][j],16);
				a=Integer.parseInt(clr[i][j],16);
				System.out.println(a);
			}
		}*/
		
		
		
	}

}