package com.xhc.test.dubboprovider.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.xhc.test.dubboclient.DubboRequest;
import com.xhc.test.dubboclient.DubboResponse;
import com.xhc.test.dubboclient.service.IDubboService;

@Service
public class DubboServiceImpl implements IDubboService {

    
    @Override
    public DubboResponse service(DubboRequest dubboRequest) {
        DubboResponse dr = new DubboResponse();
        dr.setRetcode("1000");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("products", "");
        return dr;
    }

}
