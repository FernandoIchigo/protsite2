package com.agencia.exception;

public class Erroescolha extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private static final String String = null;

	private String resourceName;
	private String fieldName;
	private Object fieldValue;

	public Erroescolha(String resourceName, String fieldName, Object fieldValue) {
	      super(); 
	      this.resourceName = resourceName;
	      this.fieldName = fieldName;
	      this.fieldValue = fieldValue;
	   }

	public String getResourceName() {
		return this.resourceName;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public Object getFieldValue() {
		return this.fieldValue;
	}
}
