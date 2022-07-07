package com.image.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "image_table")
public class images {

	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;

	@Column(name = "picByte", length = 1000)

	private byte[] picByte;

	public images() {

		super();

	}

	public images(String name, String type, byte[] picByte) {
		this.name = name;

		this.type = type;

		this.picByte = picByte;

	}

	
	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;
	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public byte[] getPicByte() {

		return picByte;

	}

	public void setPicByte(byte[] picByte) {

		this.picByte = picByte;

	}

}