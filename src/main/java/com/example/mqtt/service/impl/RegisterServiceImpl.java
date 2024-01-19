package com.example.mqtt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mqtt.mapper.RegisterMapper;
import com.example.mqtt.pojo.entity.Register;
import com.example.mqtt.service.IRegisterService;
import org.springframework.stereotype.Service;

/**
 * @author: zhangxu
 * @date: 2023/8/4
 */
@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, Register> implements IRegisterService {
}
