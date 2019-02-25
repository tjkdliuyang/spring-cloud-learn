package com.springcloud.springcloudcustomerregionzoneribbon10002.controller;

import com.springcloud.springcloudcustomerregionzoneribbon10002.entity.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/product")
@PropertySource("classpath:/application.yml")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Value("${eureka.instance.metadata-map.zone}")
    private String zone;
    @GetMapping("/api/v1/selectProduct/{orderType}")
    public List<ProductDTO> selectProduct(@PathVariable("orderType")String orderType){
        log.debug("地区为【】,端口号为：【】,的selectProduct方法被调用了,参数为【】",zone,port,orderType);
        List<ProductDTO> dtos= new ArrayList<>();
        dtos.add(ProductDTO.builder().name(orderType+"金银花").productId("zone"+zone+"port"+port).build());
        return dtos;
    }
}
