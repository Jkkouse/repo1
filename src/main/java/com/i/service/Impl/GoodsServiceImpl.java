package com.i.service.Impl;

import com.i.dao.GoodsDao;
import com.i.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsDao goodsDao;

    @Override
    public List<Map> selAllGoods() {
        return goodsDao.selAllGoods();
    }
}
