package org.gw.shoping.fegin;

import org.fresh.gd.commons.consts.api.management.ManageService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @DATA 2019-04-21 17:12
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@FeignClient("management-service")
public interface ManageFeginService  extends ManageService {
}
