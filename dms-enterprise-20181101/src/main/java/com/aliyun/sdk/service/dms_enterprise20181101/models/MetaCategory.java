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

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OwnerIds")
    private java.util.List<Long> ownerIds;

    @com.aliyun.core.annotation.NameInMap("OwnerNickNames")
    private java.util.List<String> ownerNickNames;

    @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
    private Long parentCategoryId;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private MetaCategory(Builder builder) {
        this.categoryId = builder.categoryId;
        this.createTime = builder.createTime;
        this.depth = builder.depth;
        this.description = builder.description;
        this.name = builder.name;
        this.ownerIds = builder.ownerIds;
        this.ownerNickNames = builder.ownerNickNames;
        this.parentCategoryId = builder.parentCategoryId;
        this.remark = builder.remark;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerIds
     */
    public java.util.List<Long> getOwnerIds() {
        return this.ownerIds;
    }

    /**
     * @return ownerNickNames
     */
    public java.util.List<String> getOwnerNickNames() {
        return this.ownerNickNames;
    }

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder {
        private Long categoryId; 
        private String createTime; 
        private Integer depth; 
        private String description; 
        private String name; 
        private java.util.List<Long> ownerIds; 
        private java.util.List<String> ownerNickNames; 
        private Long parentCategoryId; 
        private String remark; 

        private Builder() {
        } 

        private Builder(MetaCategory model) {
            this.categoryId = model.categoryId;
            this.createTime = model.createTime;
            this.depth = model.depth;
            this.description = model.description;
            this.name = model.name;
            this.ownerIds = model.ownerIds;
            this.ownerNickNames = model.ownerNickNames;
            this.parentCategoryId = model.parentCategoryId;
            this.remark = model.remark;
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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * OwnerIds.
         */
        public Builder ownerIds(java.util.List<Long> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }

        /**
         * OwnerNickNames.
         */
        public Builder ownerNickNames(java.util.List<String> ownerNickNames) {
            this.ownerNickNames = ownerNickNames;
            return this;
        }

        /**
         * ParentCategoryId.
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public MetaCategory build() {
            return new MetaCategory(this);
        } 

    } 

}
