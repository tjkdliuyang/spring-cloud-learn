package com.springcloud.springcloudcustomerregionzoneribbon10002.controller;

import com.springcloud.springcloudcustomerregionzoneribbon10002.entity.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api/v1/selectOrder")
    public List<OrderDTO> selectOrder(){
        return restTemplate.getForObject("http://operation/selectOrder", List.class);
    }
}
