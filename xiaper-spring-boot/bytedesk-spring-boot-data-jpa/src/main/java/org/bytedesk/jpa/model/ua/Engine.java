package org.bytedesk.jpa.model.ua;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Engine{

	@JsonProperty("name")
	private String name;

	@JsonProperty("version")
	private String version;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setVersion(String version){
		this.version = version;
	}

	public String getVersion(){
		return version;
	}

	@Override
 	public String toString(){
		return 
			"Engine{" + 
			"name = '" + name + '\'' + 
			",version = '" + version + '\'' + 
			"}";
		}
}