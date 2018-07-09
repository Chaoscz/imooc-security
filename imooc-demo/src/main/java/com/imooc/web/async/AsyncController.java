package com.imooc.web.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.UUID;
import java.util.concurrent.Callable;

@RestController
public class AsyncController {
    private Logger logger = LoggerFactory.getLogger(AsyncController.class);
    @Autowired
    private MockQueue mockQueue;
    @Autowired
    private DeferredResultHolder deferredResultHolder;
    @GetMapping("/order")
    public DeferredResult<String> order() throws Exception{
        logger.info("主线程开始");
          String orderNumber =   UUID.randomUUID().toString().replaceAll("-","");
          mockQueue.setPlaceOrder(orderNumber);
        DeferredResult<String> result = new DeferredResult<>();
        deferredResultHolder.getMap().put(orderNumber,result);
//        Callable<String> result = new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                logger.info("副线程开始");
//                logger.info("副线程结束");
//                return "success";
//            }
//        };
        logger.info("主线程返回");
         return result;
    }
}
