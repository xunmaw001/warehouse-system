package com.entity.model;

import com.entity.GoodsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 物资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-15
 */
public class GoodsModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 物品名字
     */
    private String goodsName;


    /**
     * 物品种类
     */
    private Integer goodsTypes;


    /**
     * 物资数量
     */
    private Integer goodsNumber;


    /**
     * 物品图片
     */
    private String goodsPhoto;


    /**
     * 单位
     */
    private String danwei;


    /**
     * 单价
     */
    private Double danjia;


    /**
     * 物资详情
     */
    private String goodsContent;


    /**
     * 是否删除
     */
    private Integer flag;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：物品名字
	 */
    public String getGoodsName() {
        return goodsName;
    }


    /**
	 * 设置：物品名字
	 */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    /**
	 * 获取：物品种类
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }


    /**
	 * 设置：物品种类
	 */
    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 获取：物资数量
	 */
    public Integer getGoodsNumber() {
        return goodsNumber;
    }


    /**
	 * 设置：物资数量
	 */
    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }
    /**
	 * 获取：物品图片
	 */
    public String getGoodsPhoto() {
        return goodsPhoto;
    }


    /**
	 * 设置：物品图片
	 */
    public void setGoodsPhoto(String goodsPhoto) {
        this.goodsPhoto = goodsPhoto;
    }
    /**
	 * 获取：单位
	 */
    public String getDanwei() {
        return danwei;
    }


    /**
	 * 设置：单位
	 */
    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }
    /**
	 * 获取：单价
	 */
    public Double getDanjia() {
        return danjia;
    }


    /**
	 * 设置：单价
	 */
    public void setDanjia(Double danjia) {
        this.danjia = danjia;
    }
    /**
	 * 获取：物资详情
	 */
    public String getGoodsContent() {
        return goodsContent;
    }


    /**
	 * 设置：物资详情
	 */
    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }
    /**
	 * 获取：是否删除
	 */
    public Integer getFlag() {
        return flag;
    }


    /**
	 * 设置：是否删除
	 */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
