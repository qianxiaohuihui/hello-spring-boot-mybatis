package com.funti.hello.spring.boot.mybatis.dao;

import com.funti.hello.spring.boot.mybatis.entity.Paper;
import java.util.List;

public interface PaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Fri Mar 01 15:52:33 CST 2019
     */
    int deleteByPrimaryKey(Long paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Fri Mar 01 15:52:33 CST 2019
     */
    int insert(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Fri Mar 01 15:52:33 CST 2019
     */
    Paper selectByPrimaryKey(Long paperId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Fri Mar 01 15:52:33 CST 2019
     */
    List<Paper> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Fri Mar 01 15:52:33 CST 2019
     */
    int updateByPrimaryKey(Paper record);
}