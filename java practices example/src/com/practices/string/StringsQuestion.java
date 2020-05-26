package com.practices.string;

public class StringsQuestion {
	public static void main(String args[]) {
		int vowals=0;
		int consonents=0;
String a = "aaabbbccc";
int temp=0;
int length = a.length();
int chars = length/3;
String[] equalstr = new String[5];

for(int i = 0;i<length;i=i+chars) {
	String part = a.substring(i,i+chars);
	equalstr[temp]=part;
	temp++;
	
}
for(int j =0;j<equalstr.length;j++) {
	System.out.println(equalstr[j]);
}
}
}

