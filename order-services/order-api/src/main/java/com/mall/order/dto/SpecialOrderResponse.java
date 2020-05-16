package com.mall.order.dto;/**
 * Created by ciggar on 2019/7/30.
 */

import com.mall.commons.result.AbstractResponse;
import lombok.Data;

import java.util.List;

/**
 * ciggar
 * create-date: 2019/7/30-上午9:49
 */
@Data
public class SpecialOrderResponse extends AbstractResponse {

    private String userName;
    private Double orderTotal;
    private Long   userId;
    private String tel;
    private String StreetName;
    List<OrderItemDto> goodsList;
}
