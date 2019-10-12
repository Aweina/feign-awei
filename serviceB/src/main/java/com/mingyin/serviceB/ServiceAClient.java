package com.mingyin.serviceB;

import com.mingyin.api.ServiceAInterface;
import com.mingyin.sevice.Iservicea;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "ServiceA")
public interface ServiceAClient extends Iservicea {

}
