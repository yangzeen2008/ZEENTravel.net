package com.travel.service;

import com.travel.service.domain.Orders;

import java.util.List;

public interface IOrdersService {
    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
