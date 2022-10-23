package com.entity;

import java.util.Objects;


public class StringResponse {

	private String ResponseMessage;

	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return ResponseMessage;
	}

	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		ResponseMessage = responseMessage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ResponseMessage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringResponse other = (StringResponse) obj;
		return Objects.equals(ResponseMessage, other.ResponseMessage);
	}

	@Override
	public String toString() {
		return "StringResponse [ResponseMessage=" + ResponseMessage + "]";
	}
	
	
}
