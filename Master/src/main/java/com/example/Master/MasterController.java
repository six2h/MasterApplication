package com.example.Master;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
@RestController
public class MasterController {
    @RequestMapping("/master")
    public void masterService() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        // LocalHost should be changed to ec2 instance Public IPV4 DNS Eg:http://ec2-3-83-177-8.compute-1.amazonaws.com:8081/get
        String fooResourceUrl
                = "http://localhost:8081/get";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);
        ObjectMapper mapper = new ObjectMapper();
        ResourceData resourceData = mapper.readValue(response.getBody(), ResourceData.class);
        System.out.println("preethi" + resourceData.AvailableMemory);
    }
}
