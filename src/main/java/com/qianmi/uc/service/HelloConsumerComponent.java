package com.qianmi.uc.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qianmi.uc.dubbo.HelloProvider;
import org.springframework.stereotype.Component;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.uc.service.HelloService</p>
 * <p>Date: 2017-08-14 15:09.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@Component
public class HelloConsumerComponent {

    @Reference(version = "1.0.0")
    HelloProvider helloProvider;

    public void findMyName(){
        String cnName = "李龙龙";
        String enName = helloProvider.findMyName(cnName);
        System.out.println(enName);
    }
}
