package com.yshop.service.product.dao.model;

import java.util.Date;

public class ProductDesc {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_desc.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_desc.product_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_desc.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_desc.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date mtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_desc.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_desc.product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String productDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.id
     *
     * @return the value of product_desc.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.id
     *
     * @param id the value for product_desc.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.product_id
     *
     * @return the value of product_desc.product_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.product_id
     *
     * @param productId the value for product_desc.product_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.ctime
     *
     * @return the value of product_desc.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.ctime
     *
     * @param ctime the value for product_desc.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.mtime
     *
     * @return the value of product_desc.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.mtime
     *
     * @param mtime the value for product_desc.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.is_delete
     *
     * @return the value of product_desc.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.is_delete
     *
     * @param isDelete the value for product_desc.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_desc.product_desc
     *
     * @return the value of product_desc.product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_desc.product_desc
     *
     * @param productDesc the value for product_desc.product_desc
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }
}