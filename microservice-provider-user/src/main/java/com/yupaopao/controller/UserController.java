package com.yupaopao.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.yupaopao.domain.User;
import com.yupaopao.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liubao on 2018/5/20.
 *
 * @author liubao
 * @date 2018/5/20
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/instance-info")
    public String serviceUrl(){
        InstanceInfo instanceInfo=this.eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER",false);
        return instanceInfo.getHomePageUrl();
    }

    @GetMapping("/serviceInstance-info")
    public ServiceInstance serviceInsance(){
        ServiceInstance serviceInstance=this.discoveryClient.getLocalServiceInstance();
        return serviceInstance;
    }
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.userRepository.findOne(id);
    }
}
