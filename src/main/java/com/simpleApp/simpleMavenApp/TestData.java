package com.simpleApp.simpleMavenApp;

public class TestData {
	private String Id;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "TestData [Id=" + Id + "]";
	}
}
