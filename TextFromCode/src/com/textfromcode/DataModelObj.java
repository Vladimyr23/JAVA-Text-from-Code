package com.textfromcode;

public class DataModelObj{
	 // constructor
	int id;
	String classRealName;
	String methodName;
	String [] methodDeclText;
	
	public DataModelObj (int id, String classRealName, String methodName, String [] methodDeclText) {
		this.id=id;
		this.classRealName=classRealName;
		this.methodName=methodName;
		this.methodDeclText=methodDeclText;
	}

	public int getId() {
		return id;
	}

	public String getClassRealName() {
		return classRealName;
	}

	public String getMethodName() {
		return methodName;
	}

	public String[] getMethodDeclText() {
		return methodDeclText;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o == this)
	        return true;
	    if (!(o instanceof DataModelObj))
	        return false;
	    DataModelObj other = (DataModelObj)o;
	    boolean methodNameEquals = (this.methodName == null && other.methodName == null)
	      || (this.methodName != null && this.methodName.equals(other.methodName));
	    return this.id == other.id && methodNameEquals;		
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
