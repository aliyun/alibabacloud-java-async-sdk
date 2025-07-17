// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MetaCategory} extends {@link TeaModel}
 *
 * <p>MetaCategory</p>
 */
public class MetaCategory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Depth")
    private Integer depth;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
    private Long parentCategoryId;

    private MetaCategory(Builder builder) {
        this.categoryId = builder.categoryId;
        this.createTime = builder.createTime;
        this.depth = builder.depth;
        this.name = builder.name;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MetaCategory create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return depth
     */
    public Integer getDepth() {
        return this.depth;
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
        private Long categoryId; 
        private String createTime; 
        private Integer depth; 
        private String name; 
        private Long parentCategoryId; 

        private Builder() {
        } 

        private Builder(MetaCategory model) {
            this.categoryId = model.categoryId;
            this.createTime = model.createTime;
            this.depth = model.depth;
            this.name = model.name;
            this.parentCategoryId = model.parentCategoryId;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Depth.
         */
        public Builder depth(Integer depth) {
            this.depth = depth;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParentCategoryId.
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        public MetaCategory build() {
            return new MetaCategory(this);
        } 

    } 

}
