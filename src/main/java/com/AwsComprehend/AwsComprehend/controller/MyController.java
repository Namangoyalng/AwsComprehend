package com.AwsComprehend.AwsComprehend.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.AwsComprehend.AwsComprehend.Entities.Entity;
import com.AwsComprehend.AwsComprehend.Entities.KeyModal;

import com.AwsComprehend.AwsComprehend.services.AwsServices;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.comprehend.ComprehendClient;
import software.amazon.awssdk.services.comprehend.model.ComprehendException;
import software.amazon.awssdk.services.comprehend.model.DetectEntitiesRequest;
import software.amazon.awssdk.services.comprehend.model.DetectEntitiesResponse;
import software.amazon.awssdk.services.comprehend.model.DetectKeyPhrasesRequest;
import software.amazon.awssdk.services.comprehend.model.DetectKeyPhrasesResponse;
import software.amazon.awssdk.services.comprehend.model.KeyPhrase;

@RestController
public class MyController {
	
	@Autowired	
	private AwsServices aws;
	


	@PostMapping("/entities")
	public KeyModal addEntity(@RequestBody Entity entity) {
		KeyModal km = new KeyModal();
		 Region region = Region.AP_SOUTH_1;
	        
	        ComprehendClient comClient = ComprehendClient.builder()
	                .region(region)
	                .credentialsProvider(ProfileCredentialsProvider.create())
	                .build();

        try {
            DetectEntitiesRequest detectEntitiesRequest = DetectEntitiesRequest.builder()
                    .text(entity.getText())
                    .languageCode(entity.getLanguageCode())
                    .build();

            DetectEntitiesResponse detectEntitiesResult = comClient.detectEntities(detectEntitiesRequest);
            List<software.amazon.awssdk.services.comprehend.model.Entity> entList = detectEntitiesResult.entities();
            Iterator<software.amazon.awssdk.services.comprehend.model.Entity> lanIterator = entList.iterator();
           
            
            
            
            
            DetectKeyPhrasesRequest detectKeyPhrasesRequest = DetectKeyPhrasesRequest.builder()
                    .text(entity.getText())
                    .languageCode(entity.getLanguageCode())
                    .build();

        	   DetectKeyPhrasesResponse detectKeyPhrasesResult = comClient.detectKeyPhrases(detectKeyPhrasesRequest);
        	   List<KeyPhrase> phraseList = detectKeyPhrasesResult.keyPhrases();
            
           
            while (lanIterator.hasNext()) {
                software.amazon.awssdk.services.comprehend.model.Entity entity1 = lanIterator.next();
                
               
               km = this.aws.addtype(entity1.typeAsString(),entity1.text(),String.valueOf(entity1.score()),km);
            }
            
            
            for (KeyPhrase keyPhrase : phraseList) {
           
                km = this.aws.addtype("KEYPHRASES",keyPhrase.text(),String.valueOf(keyPhrase.score()),km);
                                   
               }
              
        } catch (ComprehendException e) {
            System.err.println(e.awsErrorDetails().errorMessage());
            System.exit(1);
       }
    
		return km;
	}
	
	
 
}
