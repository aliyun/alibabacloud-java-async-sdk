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
 * {@link ListAssetCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssetCategoriesResponseBody</p>
 */
public class ListAssetCategoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Categories")
    private java.util.List<Categories> categories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListAssetCategoriesResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssetCategoriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categories
     */
    public java.util.List<Categories> getCategories() {
        return this.categories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<Categories> categories; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAssetCategoriesResponseBody model) {
            this.categories = model.categories;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The list of categories on the current page.</p>
         */
        public Builder categories(java.util.List<Categories> categories) {
            this.categories = categories;
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

        /**
         * <p>The total number of categories.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAssetCategoriesResponseBody build() {
            return new ListAssetCategoriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssetCategoriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssetCategoriesResponseBody</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        private Categories(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.level = builder.level;
            this.parentId = builder.parentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
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
        public String getLevel() {
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
            private String level; 
            private Long parentId; 

            private Builder() {
            } 

            private Builder(Categories model) {
                this.categoryId = model.categoryId;
                this.categoryName = model.categoryName;
                this.level = model.level;
                this.parentId = model.parentId;
            } 

            /**
             * <p>The category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The category name.</p>
             * 
             * <strong>example:</strong>
             * <p>scenery</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The category level. A level-1 category has a value of 0, a level-2 category has a value of 1, and a level-3 category has a value of 2.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The parent category ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
}
