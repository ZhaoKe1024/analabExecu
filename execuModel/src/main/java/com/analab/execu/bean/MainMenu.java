package com.analab.execu.bean;

import java.util.List;

public class MainMenu {

	private int id;
	private String title;
	private String path;
	private List<SubMenu> sList;
	
	public MainMenu() {
		// TODO Auto-generated constructor stub
	}

	public MainMenu(String title, String path, List<SubMenu> sList) {
		super();
		this.title = title;
		this.path = path;
		this.sList = sList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<SubMenu> getsList() {
		return sList;
	}

	public void setsList(List<SubMenu> sList) {
		this.sList = sList;
	}

	@Override
	public String toString() {
		return "MainMenu [id=" + id + ", title=" + title + ", path=" + path + ", sList=" + sList + "]";
	}

	
}
