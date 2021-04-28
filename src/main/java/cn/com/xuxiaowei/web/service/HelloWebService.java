package cn.com.xuxiaowei.web.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * WebService 测试接口
 *
 * @author 徐晓伟
 */
@WebService
public interface HelloWebService {

    /**
     * 与 卷福 打招呼
     *
     * @param username 用户名
     * @return 返回 卷福回应
     */
    @WebMethod
    String cumberbatch(String username);

}
