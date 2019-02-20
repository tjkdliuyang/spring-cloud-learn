package com.springcloud.springcloudcustomerregionzoneribbon10002.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDTO {
    String name;
    String orderId;
}
