package com.AwsComprehend.AwsComprehend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.AwsComprehend.AwsComprehend.Entities.KeyDataModal;
import com.AwsComprehend.AwsComprehend.Entities.KeyModal;


@Service
public class AwsServiceImpl implements AwsServices{
	
	
	@Override
	public KeyModal addtype(String type, String data, String score,KeyModal km) {
		
		if(type.equals("ORGANIZATION")) {
			KeyDataModal kdm = new KeyDataModal();
			kdm.setData(data);
			kdm.setScore(score);
				List<KeyDataModal> list1 = km.getOraganization();
				list1.add(kdm);
		}
		else if(type.equals("PERSON")) {
						
			List<KeyDataModal> list2 = km.getPerson();
			KeyDataModal kdm0 = new KeyDataModal();
			kdm0.setData(data);
			kdm0.setScore(score);
			list2.add(kdm0);
			}
		else if(type.equals("COMMERCIALITEM")) {
				KeyDataModal kdm1 = new KeyDataModal();
				kdm1.setData(data);
				kdm1.setScore(score);
				List<KeyDataModal> list3 = km.getCommercialItem();
					list3.add(kdm1);
			}
		else if(type.equals("DATE")) {
				KeyDataModal kdm2 = new KeyDataModal();
				kdm2.setData(data);
				kdm2.setScore(score);
				List<KeyDataModal> list4 = km.getDate();
				list4.add(kdm2);
				}
		else if(type.equals("EVENT")) {
					KeyDataModal kdm3 = new KeyDataModal();
					kdm3.setData(data);
					kdm3.setScore(score);
					List<KeyDataModal> list5 = km.getEvent();
					list5.add(kdm3);
				}
		else if(type.equals("LOCATION")) {
					KeyDataModal kdm4 = new KeyDataModal();
					kdm4.setData(data);
					kdm4.setScore(score);
					List<KeyDataModal> list6 = km.getLocation();
					list6.add(kdm4);
					}
		else if(type.equals("QUANTITY")) {
					KeyDataModal kdm5 = new KeyDataModal();
					kdm5.setData(data);
					kdm5.setScore(score);
					List<KeyDataModal> list7 = km.getQuantity();
					list7.add(kdm5);
					}
		else if(type.equals("TITLE")) {
					KeyDataModal kdm6 = new KeyDataModal();
					kdm6.setData(data);
					kdm6.setScore(score);
					List<KeyDataModal> list8 = km.getTitle();
					list8.add(kdm6);
					}
		else if(type.equals("OTHER")) {
					KeyDataModal kdm7 = new KeyDataModal();
					kdm7.setData(data);
					kdm7.setScore(score);
					List<KeyDataModal> list8 = km.getOther();
					list8.add(kdm7);
					}
		else  if(type.equals("KEYPHRASES")) {
			KeyDataModal kdm7 = new KeyDataModal();
			kdm7.setData(data);
			kdm7.setScore(score);
			List<KeyDataModal> list8 = km.getKeyphrase();
			list8.add(kdm7);
			}
		return km;
		
	}

}
