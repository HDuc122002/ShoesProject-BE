package com.project.ShoesProject_BE.service;

import com.project.ShoesProject_BE.model.dto.OrderDetailDTO;
import com.project.ShoesProject_BE.exception.DataNotFoundException;
import com.project.ShoesProject_BE.model.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail createOrderDetail(OrderDetailDTO newOrderDetail) throws Exception;
    OrderDetail getOrderDetail(Long id) throws DataNotFoundException;
    OrderDetail updateOrderDetail(Long id, OrderDetailDTO newOrderDetailData)
            throws DataNotFoundException;
    void deleteById(Long id);
    List<OrderDetail> findByOrderId(Long orderId);
}