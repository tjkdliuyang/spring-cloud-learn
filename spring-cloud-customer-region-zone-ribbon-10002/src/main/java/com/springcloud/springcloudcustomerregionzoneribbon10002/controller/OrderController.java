package com.springcloud.springcloudcustomerregionzoneribbon10002.controller;

import com.springcloud.springcloudcustomerregionzoneribbon10002.entity.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/api/v1/selectProductByOrderType")
    public List<OrderDTO> selectProductByOrderType(@RequestParam("orderType")String orderType){
        log.debug("测试开始了orderType[]",orderType);
        ServiceInstance instance=loadBalancerClient.choose("productOperation");
        String url=String.format("http://%s:%s/product/api/v1/selectProduct/"+orderType,instance.getHost(),instance.getPort());

        //return restTemplate.getForObject(url, List.class);
        return restTemplate.getForObject("http://productOperation/product/api/v1/selectProduct/"+orderType, List.class);


    }
}
