package cn.com.xuxiaowei.web.service.impl;

import cn.com.xuxiaowei.web.service.HelloWebService;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * WebService 测试接口 实现类
 *
 * @author 徐晓伟
 */
@Service
@WebService
public class HelloWebServiceImpl implements HelloWebService {

    /**
     * 与 卷福 打招呼
     *
     * @param username 用户名
     * @return 返回 卷福回应
     */
    @Override
    public String cumberbatch(String username) {
        return String.format("你好：%s，我是卷福", username);
    }

}
