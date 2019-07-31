package com.i.service;

import java.util.List;
import java.util.Map;

public interface GoodsService {
    /**
     * 查询所有商品信息(包含类型表)
     * @return
     */
    public List<Map> selAllGoods();
}
