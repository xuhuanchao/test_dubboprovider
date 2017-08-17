package com.xhc.test.dubboprovider.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.xhc.test.dubboclient.Product;
import com.xhc.test.dubboclient.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{

    private Map<String, Product> products = new HashMap<String, Product>();
    
    
    public ProductServiceImpl(){
        super();
        Product p1 = new Product(1, "咖啡", 10.9f, "美国");
        Product p2 = new Product(2, "土豆", 3.6f, "阿根廷");
        Product p3 = new Product(3, "牛奶", 7.1f, "荷兰");
        products.put(p1.getName(), p1);
        products.put(p2.getName(), p2);
        products.put(p3.getName(), p3);
    }
    
    
    @Override
    public List<Product> getAll(){
        return new ArrayList(products.values());
    }
    
    @Override
    public Product getByName(String name) {
        return products.get(name);
    }

    @Override
    public void delByName(String name) {
        products.remove(name);
    }

    
}
