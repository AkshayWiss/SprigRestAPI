package com.example.Get;

import java.util.ArrayList;
import java.util.List;

public class Books {

	public int  BookId;
	public  String BookName;
	public String Auther;
	static List lst;

	Books(int id, String BookName, String Auther)
	{
		lst=new ArrayList<>();
		this.BookId=id;
		this.BookName=BookName;
		this.Auther=Auther;	
	}
	public static  List<Books> Getdata()	{
		lst.add(new Books(01, "PQR", "NAYAR"));
		lst.add(new Books(67, "XYZ", "Pawar"));
		return lst;
	}
}