package com.example.mqtt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mqtt.pojo.entity.Register;
import com.example.mqtt.pojo.vo.RegisterVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: zhangxu
 * @date: 2023/8/4
 */
@Mapper
public interface RegisterMapper extends BaseMapper<Register> {

    @Select("select * from register where id = #{id}")
    Register selectById(int id);

    @Select("select count(*) from register")
    int getNumOfRegister();

    @Insert("insert into register values(#{id},#{gmtCreate},#{msgId},#{sn},#{method},#{YG},#{YGA},#{YGB},#{YGC},#{GLYS},#{GLYSA},#{GLYSB},#{GLYSC},#{PL},#{ZYG},#{FYG},#{ZHYG},#{DSZHYG},#{FSZHYG},#{PSZHYG},#{GSZHYG},#{DLA},#{DLB},#{DLC},#{DYA},#{DYB},#{DYC})")
    boolean insertRegister(Register register);

    @Select("select * from register where id = (select max(id) from register)")
    Register getLastData();
}
