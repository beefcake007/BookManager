package com.fanye.model;

/**
 * Õº È µÃÂ
 * @author fanye
 *
 */
public class Book {
	private String Id;
	private String author;
	private String bookName;
	private String bookDesc;
	private float price;
	private Integer bookTypeId;
	private String sex;
	private String bookTypeName;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String bookName,String author, String sex, float price, String bookDesc,
			Integer bookTypeId ) {
		super();
		this.author = author;
		this.bookName = bookName;
		this.bookDesc = bookDesc;
		this.price = price;
		this.bookTypeId = bookTypeId;
		this.sex = sex;
	}

	
	public Book(String id, String bookName , String author,String sex,float price,Integer bookTypeId, String bookDesc
			 ) {
		super();
		this.Id = id;
		this.author = author;
		this.bookName = bookName;
		this.bookDesc = bookDesc;
		this.price = price;
		this.bookTypeId = bookTypeId;
		this.sex = sex;
	}


	public Book(String bookName, String author, Integer bookTypeId) {
		super();
		this.author = author;
		this.bookName = bookName;
		this.bookTypeId = bookTypeId;
	}


	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getBookTypeId() {
		return bookTypeId;
	}
	public void setBookTypeId(Integer bookTypeId) {
		this.bookTypeId = bookTypeId;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBookTypeName() {
		return bookTypeName;
	}
	public void setBookTypeName(String bookTypeName) {
		this.bookTypeName = bookTypeName;
	}

	
}
