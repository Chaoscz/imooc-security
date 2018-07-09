package com.imooc.web.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MockQueue {
    private String placeOrder;
    private String completeOrder;

    public String getPlaceOrder() {
        return placeOrder;
    }
    private Logger logger = LoggerFactory.getLogger(MockQueue.class);

    public void setPlaceOrder(String placeOrder) {
        new Thread(()->{
            logger.info("接到下单请求");
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            this.completeOrder = placeOrder;
            logger.info("下单请求处理完毕:"+placeOrder);
        }).start();

    }

    public String getCompleteOrder() {
        return completeOrder;
    }

    public void setCompleteOrder(String completeOrder) {
        this.completeOrder = completeOrder;
    }
}
