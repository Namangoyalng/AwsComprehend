package com.AwsComprehend.AwsComprehend.services;


import com.AwsComprehend.AwsComprehend.Entities.KeyModal;



public interface AwsServices {
	
	public KeyModal addtype(String type,String data,String score,KeyModal km);

}
