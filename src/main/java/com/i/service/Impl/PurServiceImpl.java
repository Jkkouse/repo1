package com.i.service.Impl;

import com.i.dao.PurDao;
import com.i.service.PurService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PurServiceImpl implements PurService {

    @Resource
    private PurDao purDao;

    @Override
    public int getPurCount() {
        return purDao.getPurCount();
    }

    @Override
    public boolean addPur(Map map) {
        int num = purDao.addPurTotal(map);
        int num2 = purDao.addPurDetail((List<Map>) map.get("goodsarr"));
        System.out.println(num +" "+num2);
        return (num > 0 && num2 > 0);
    }

    @Override
    public List<Map> selAllPurOrder() {
        return purDao.selAllPurOrder();
    }
}
