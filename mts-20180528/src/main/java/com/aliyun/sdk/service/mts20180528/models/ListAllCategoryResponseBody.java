// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllCategoryResponseBody</p>
 */
public class ListAllCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryList")
    private CategoryList categoryList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAllCategoryResponseBody(Builder builder) {
        this.categoryList = builder.categoryList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryList
     */
    public CategoryList getCategoryList() {
        return this.categoryList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CategoryList categoryList; 
        private String requestId; 

        /**
         * CategoryList.
         */
        public Builder categoryList(CategoryList categoryList) {
            this.categoryList = categoryList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAllCategoryResponseBody build() {
            return new ListAllCategoryResponseBody(this);
        } 

    } 

    public static class Category extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CateId")
        private String cateId;

        @com.aliyun.core.annotation.NameInMap("CateName")
        private String cateName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        private Category(Builder builder) {
            this.cateId = builder.cateId;
            this.cateName = builder.cateName;
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
         * @return cateId
         */
        public String getCateId() {
            return this.cateId;
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
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
        public String getParentId() {
            return this.parentId;
        }

        public static final class Builder {
            private String cateId; 
            private String cateName; 
            private String level; 
            private String parentId; 

            /**
             * CateId.
             */
            public Builder cateId(String cateId) {
                this.cateId = cateId;
                return this;
            }

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private java.util.List < Category> category;

        private CategoryList(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public java.util.List < Category> getCategory() {
            return this.category;
        }

        public static final class Builder {
            private java.util.List < Category> category; 

            /**
             * Category.
             */
            public Builder category(java.util.List < Category> category) {
                this.category = category;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
}
