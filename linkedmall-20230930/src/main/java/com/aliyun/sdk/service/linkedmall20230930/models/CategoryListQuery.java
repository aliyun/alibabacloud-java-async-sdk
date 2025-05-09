// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link CategoryListQuery} extends {@link TeaModel}
 *
 * <p>CategoryListQuery</p>
 */
public class CategoryListQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("categoryIds")
    private java.util.List<Long> categoryIds;

    @com.aliyun.core.annotation.NameInMap("parentCategoryId")
    private Long parentCategoryId;

    private CategoryListQuery(Builder builder) {
        this.categoryIds = builder.categoryIds;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CategoryListQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryIds
     */
    public java.util.List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    public static final class Builder {
        private java.util.List<Long> categoryIds; 
        private Long parentCategoryId; 

        private Builder() {
        } 

        private Builder(CategoryListQuery model) {
            this.categoryIds = model.categoryIds;
            this.parentCategoryId = model.parentCategoryId;
        } 

        /**
         * categoryIds.
         */
        public Builder categoryIds(java.util.List<Long> categoryIds) {
            this.categoryIds = categoryIds;
            return this;
        }

        /**
         * parentCategoryId.
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        public CategoryListQuery build() {
            return new CategoryListQuery(this);
        } 

    } 

}
