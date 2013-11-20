/*
Insert this into the SF developer console to a class called Ping
*/

@RestResource(urlMapping='/Ping/*')
global with sharing class Ping {
  
    @HttpGet
    global static String getMerchandiseById() {
        // RestRequest req = RestContext.request;        
        // String merchId = req.requestURI.substring(
                                  // req.requestURI.lastIndexOf('/')+1);
        // Merchandise__c result = 
                       // [SELECT Name,Description__c,Price__c,Total_Inventory__c
                        // FROM Merchandise__c 
                        // WHERE Id = :merchId];
        // return result;
		return 'hello';
    }
  
    @HttpPost
    global static Ping__c createMerchandise(String beacons,
        String email, String ifa, String storeId, Double latitude, Double longitude) {
        
            Ping__c newping = new Ping__c(
                beacons__c=beacons,
            	email__c=email,
            	ifa__c=ifa,
            	storeId__c=storeId,
                currentLocation__Latitude__s = latitude,
                currentLocation__Longitude__s = longitude
            );
        	insert newping;
        	//return m.Id;
		return newping;
    }
}