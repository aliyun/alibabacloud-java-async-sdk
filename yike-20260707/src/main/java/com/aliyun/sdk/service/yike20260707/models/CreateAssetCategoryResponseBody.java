// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link CreateAssetCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAssetCategoryResponseBody</p>
 */
public class CreateAssetCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private Category category;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAssetCategoryResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAssetCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public Category getCategory() {
        return this.category;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Category category; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAssetCategoryResponseBody model) {
            this.category = model.category;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The media asset category information.</p>
         */
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAssetCategoryResponseBody build() {
            return new CreateAssetCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAssetCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAssetCategoryResponseBody</p>
     */
    public static class Category extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private Long level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        private Category(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.level = builder.level;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private Long categoryId; 
            private String categoryName; 
            private Long level; 
            private Long parentId; 

            private Builder() {
            } 

            private Builder(Category model) {
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.level = model.level;
                this.parentId = model.parentId;
            } 

            /**
             * <p>The ID of the created category.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The media asset category information.</p>
             * 
             * <strong>example:</strong>
             * <p>see below</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The category level. The first-level category has a level of 0, the second-level category has a level of 1, and the third-level category has a level of 2.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The parent category ID. If the ParentId parameter is set to empty or a value less than 1, the default return value is -1, which indicates that the created category is a root directory.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
}
