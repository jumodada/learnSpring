package com.jirengu.springboot.mapper;

import com.jirengu.springboot.pojo.AccountPO;
import com.jirengu.springboot.pojo.AccountPOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
@Mapper
public interface AccountPOMapper {
    long countByExample(AccountPOExample example);

    int deleteByExample(AccountPOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountPO row);

    int insertSelective(AccountPO row);

    List<AccountPO> selectByExampleWithRowbounds(AccountPOExample example, RowBounds rowBounds);

    List<AccountPO> selectByExample(AccountPOExample example);

    AccountPO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") AccountPO row, @Param("example") AccountPOExample example);

    int updateByExample(@Param("row") AccountPO row, @Param("example") AccountPOExample example);

    int updateByPrimaryKeySelective(AccountPO row);

    int updateByPrimaryKey(AccountPO row);
}