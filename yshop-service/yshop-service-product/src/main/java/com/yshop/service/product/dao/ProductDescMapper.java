package com.yshop.service.product.dao;

import com.yshop.service.product.dao.model.ProductDesc;
import com.yshop.service.product.dao.model.ProductDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDescMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int countByExample(ProductDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int deleteByExample(ProductDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int insert(ProductDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int insertSelective(ProductDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    List<ProductDesc> selectByExampleWithBLOBs(ProductDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    List<ProductDesc> selectByExample(ProductDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    ProductDesc selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByExample(@Param("record") ProductDesc record, @Param("example") ProductDescExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByPrimaryKeySelective(ProductDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductDesc record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    int updateByPrimaryKey(ProductDesc record);
}