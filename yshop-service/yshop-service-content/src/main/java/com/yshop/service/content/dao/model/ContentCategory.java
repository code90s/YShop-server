package com.yshop.service.content.dao.model;

import java.util.Date;

public class ContentCategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.is_parent
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Boolean isParent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.parent_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Long parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.name
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.status
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.sort_order
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Byte sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date ctime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Date mtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_category.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    private Byte isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.id
     *
     * @return the value of content_category.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.id
     *
     * @param id the value for content_category.id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.is_parent
     *
     * @return the value of content_category.is_parent
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.is_parent
     *
     * @param isParent the value for content_category.is_parent
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.parent_id
     *
     * @return the value of content_category.parent_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.parent_id
     *
     * @param parentId the value for content_category.parent_id
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.name
     *
     * @return the value of content_category.name
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.name
     *
     * @param name the value for content_category.name
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.status
     *
     * @return the value of content_category.status
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.status
     *
     * @param status the value for content_category.status
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.sort_order
     *
     * @return the value of content_category.sort_order
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Byte getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.sort_order
     *
     * @param sortOrder the value for content_category.sort_order
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setSortOrder(Byte sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.ctime
     *
     * @return the value of content_category.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.ctime
     *
     * @param ctime the value for content_category.ctime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.mtime
     *
     * @return the value of content_category.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.mtime
     *
     * @param mtime the value for content_category.mtime
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_category.is_delete
     *
     * @return the value of content_category.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_category.is_delete
     *
     * @param isDelete the value for content_category.is_delete
     *
     * @mbggenerated Sun Apr 15 23:38:02 CST 2018
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}