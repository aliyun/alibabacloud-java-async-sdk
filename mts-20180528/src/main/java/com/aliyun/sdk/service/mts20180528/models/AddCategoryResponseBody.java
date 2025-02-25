// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>AddCategoryResponseBody</p>
 */
public class AddCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private Category category;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddCategoryResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCategoryResponseBody create() {
        return builder().build();
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

        /**
         * Category.
         */
        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddCategoryResponseBody build() {
            return new AddCategoryResponseBody(this);
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
}
