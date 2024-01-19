package com.example.mqtt.controller;

import com.example.mqtt.mapper.RegisterMapper;
import com.example.mqtt.pojo.entity.Register;
import com.example.mqtt.pojo.vo.RegisterVO;
import com.example.mqtt.service.IRegisterService;
import com.example.mqtt.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author: zhangxu
 * @date: 2023/8/4
 */
@Api(value = "register表管理")
@RestController
@RequestMapping("/register")
public class RegisterController {



    @Autowired
    private IRegisterService registerService;

    @Autowired
    RegisterMapper registerMapper;

    @ApiOperation(value = "按id查询register表")
    @GetMapping("/getRegisterInfoById")
    public R getRegisterInfoById(@RequestParam int id) {
        Register register = registerService.getById(id);

        if (ObjectUtils.isEmpty(register)) {
            return R.error().message("根据该id：" + register + "查询不到！");
        }

        RegisterVO registerVO = new RegisterVO();
        BeanUtils.copyProperties(register, registerVO);
        return R.ok().data("根据id查询结果:", registerVO);
    }


    @ApiOperation(value = "查询register表数量")
    @GetMapping("/getNumberOfRegisters")
    public R getNumberOfRegisters(){

        int size = registerMapper.getNumOfRegister();
        return R.ok().data("register表数量为", size);
    }


    @ApiOperation(value = "添加register表")
    @PostMapping("/insertRegister")
    public R insertRegister(@RequestBody RegisterVO registerVO){

        System.out.println("正在添加Register表......");
        Register newRegister = new Register();
        BeanUtils.copyProperties(registerVO, newRegister);

        //设置数据项创建时间
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        newRegister.setGmtCreate(date);

        boolean res = registerMapper.insertRegister(newRegister);

        if (res){
            return R.ok().data("register表添加成功！", newRegister);
        }
        return R.error().message("register表添加失败！");

    }

    @ApiOperation(value = "获取最后一条数据")
    @GetMapping("/getLastData")
    public R getLastData(){
        if(registerMapper.getNumOfRegister() == 0){
            return R.error().message("数据库为空！");
        }

        Register lastData = registerMapper.getLastData();

        return R.ok().data("最后一条数据:", lastData);

    }





}
