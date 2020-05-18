package com.tchaves.api.responses;

import java.util.ArrayList;
import java.util.List;

public class Response<T> {
	
	private T data;
	private List<String> errors;
	public Response() {
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErros(List<String> errors) {
		if(this.errors == null) {
			this.errors = new ArrayList<String>();
		}
		this.errors = errors;
	}
	
	
	
	

}
