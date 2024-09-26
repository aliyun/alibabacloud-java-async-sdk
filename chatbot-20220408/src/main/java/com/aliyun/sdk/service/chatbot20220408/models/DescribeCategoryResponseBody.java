// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCategoryResponseBody</p>
 */
public class DescribeCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private Category category;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCategoryResponseBody(Builder builder) {
        this.category = builder.category;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoryResponseBody create() {
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

        public DescribeCategoryResponseBody build() {
            return new DescribeCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCategoryResponseBody</p>
     */
    public static class Category extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
        private Long parentCategoryId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Category(Builder builder) {
            this.bizCode = builder.bizCode;
            this.categoryId = builder.categoryId;
            this.name = builder.name;
            this.parentCategoryId = builder.parentCategoryId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Category create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
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

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizCode; 
            private Long categoryId; 
            private String name; 
            private Long parentCategoryId; 
            private Integer status; 

            /**
             * BizCode.
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
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

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Category build() {
                return new Category(this);
            } 

        } 

    }
}
