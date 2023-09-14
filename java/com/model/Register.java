package com.model;

public class Register {
 private int id;
 private String name;
 private String email;
 private String selected_course;
 private String dateofBirth;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSelected_course() {
	return selected_course;
}
public void setSelected_course(String selected_course) {
	this.selected_course = selected_course;
}
public String getDateofBirth() {
	return dateofBirth;
}
public void setDateofBirth(String dateofBirth) {
	this.dateofBirth = dateofBirth;
}
public Register(String _name,String _email,String _selected_course,String _dofBirth) {
	name = _name;
	email= _email;
	selected_course = _selected_course;
	dateofBirth = _dofBirth;
}
public Register(int _id,String _name,String _email,String _selected_course,String _dofBirth) {
	id = _id;
	name = _name;
	email= _email;
	selected_course = _selected_course;
	dateofBirth = _dofBirth;
}
}
