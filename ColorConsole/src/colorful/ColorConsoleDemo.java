package colorful;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

import colorful.colors.Colors;

public class ColorConsoleDemo {

	public static void main(String[] args) {
		ClassLoader cl = ClassLoader.getSystemClassLoader();

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
		
		test1();
		test2();
		test3();
        
        Scanner in = new Scanner(System.in);
        in.nextLine();
	}
	
	private static void test2(){
		StringBuilder output = new StringBuilder();
		for(int red = 0; red <=255; red += 51){
			for(int green = 0; green <= 255; green += 51){
				for(int blue = 0; blue <= 255; blue += 51){
					output.append(Colors.foreground(red, green, blue)).append("█");
				}
				output.append("\n");
			}
		}
		System.out.print(output);
		System.out.println(Colors.RESET_ALL);
	}
	
	
	private static void test1(){
		// TODO Auto-generated method stub
        StringBuilder red = new StringBuilder();
        StringBuilder blue = new StringBuilder();
        StringBuilder green = new StringBuilder();
        StringBuilder yellow = new StringBuilder();
        StringBuilder purple = new StringBuilder();
        StringBuilder cyan = new StringBuilder();
        StringBuilder grey = new StringBuilder();
        
        for(int i = 0; i < 255; i += 5){
        	red.append(Colors.foreground(i, 0, 0)).append("█");
            green.append(Colors.foreground(0, i, 0)).append("█");
            blue.append(Colors.foreground(0, 0, i)).append("█");
            yellow.append(Colors.foreground(i, i, 0)).append("█");
            purple.append(Colors.foreground(i, 0, i)).append("█");
            cyan.append(Colors.foreground(0, i, i)).append("█");
            grey.append(Colors.foreground(i, i, i)).append("█");
        }
        System.out.println(red + Colors.RESET_ALL);
        System.out.println(green + Colors.RESET_ALL);
        System.out.println(blue + Colors.RESET_ALL);
        System.out.println(yellow + Colors.RESET_ALL);
        System.out.println(purple + Colors.RESET_ALL);
        System.out.println(cyan + Colors.RESET_ALL);
        System.out.println(grey + Colors.RESET_ALL);
	}
	
	private static void test3(){
		// TODO Auto-generated method stub
        StringBuilder red = new StringBuilder();
        StringBuilder blue = new StringBuilder();
        StringBuilder green = new StringBuilder();
        StringBuilder yellow = new StringBuilder();
        StringBuilder purple = new StringBuilder();
        StringBuilder cyan = new StringBuilder();
        StringBuilder grey = new StringBuilder();
        
        for(int i = 0; i < 255; i += 5){
        	red.append(Colors.background(i, 0, 0)).append(" ");
            green.append(Colors.background(0, i, 0)).append(" ");
            blue.append(Colors.background(0, 0, i)).append(" ");
            yellow.append(Colors.background(i, i, 0)).append(" ");
            purple.append(Colors.background(i, 0, i)).append(" ");
            cyan.append(Colors.background(0, i, i)).append(" ");
            grey.append(Colors.background(i, i, i)).append(" ");
        }
        System.out.println(red + Colors.RESET_ALL);
        System.out.println(green + Colors.RESET_ALL);
        System.out.println(blue + Colors.RESET_ALL);
        System.out.println(yellow + Colors.RESET_ALL);
        System.out.println(purple + Colors.RESET_ALL);
        System.out.println(cyan + Colors.RESET_ALL);
        System.out.println(grey + Colors.RESET_ALL);
	}
}
