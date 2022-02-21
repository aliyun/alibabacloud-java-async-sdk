// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Children} extends {@link TeaModel}
 *
 * <p>Children</p>
 */
public class Children extends TeaModel {
    @NameInMap("AreaCode")
    private String areaCode;

    @NameInMap("CategoryId")
    private Long categoryId;

    @NameInMap("Childrens")
    private java.util.List < Children > childrens;

    @NameInMap("Name")
    private String name;

    @NameInMap("ParentCategoryId")
    private Long parentCategoryId;

    private Children(Builder builder) {
        this.areaCode = builder.areaCode;
        this.categoryId = builder.categoryId;
        this.childrens = builder.childrens;
        this.name = builder.name;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Children create() {
        return builder().build();
    }

    /**
     * @return areaCode
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return childrens
     */
    public java.util.List < Children > getChildrens() {
        return this.childrens;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public static final class Builder {
        private String areaCode; 
        private Long categoryId; 
        private java.util.List < Children > childrens; 
        private String name; 
        private Long parentCategoryId; 

        /**
         * 地区代号
         */
        public Builder areaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }

        /**
         * 分类Id
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * 子元素
         */
        public Builder childrens(java.util.List < Children > childrens) {
            this.childrens = childrens;
            return this;
        }

        /**
         * 名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 父分类Id
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        public Children build() {
            return new Children(this);
        } 

    } 

}
