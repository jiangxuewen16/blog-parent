package com.judream.blog.model.elasticsearch;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author jiangxuewen
 */
@Data
@Document(indexName = "article")
public class Article implements Serializable {
    private static final long serialVersionUID = 6320548148250372657L;

    @Id
    private String id;

    /**
     * 类型
     */
    @Field(type = FieldType.Keyword)
    private Integer type;
    /**
     * 分类ID
     */
    @Field(type = FieldType.Keyword)
    private String catId;
    /**
     * 标题
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String title;
    /**
     * 简介
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String description;
    /**
     *作者
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String author;
    /**
     * 标签
     */
    private List<String> labelList;
    /**
     * 内容
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word")
    private String content;
    /**
     * 点赞
     */
    private Integer agreeNum;
    /**
     * 点踩
     */
    private Integer disagreeNum;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 置顶
     */
    private Integer isTop;
    /**
     * 背景图
     */
    private String bgImg;
    /**
     * 评论
     */
    private Long commentId;

    /**
     * 审核状态
     */
    private Integer examineStatus;

    private Integer isDeleted;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateAt;
}
