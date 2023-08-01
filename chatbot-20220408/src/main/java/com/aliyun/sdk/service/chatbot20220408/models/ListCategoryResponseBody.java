// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListCategoryResponseBody</p>
 */
public class ListCategoryResponseBody extends TeaModel {
    @NameInMap("Categories")
    private java.util.List < Categories> categories;

    @NameInMap("RequestId")
    private String requestId;

    private ListCategoryResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public java.util.List < Categories> getCategories() {
        return this.categories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Categories> categories; 
        private String requestId; 

        /**
         * Categories.
         */
        public Builder categories(java.util.List < Categories> categories) {
            this.categories = categories;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCategoryResponseBody build() {
            return new ListCategoryResponseBody(this);
        } 

    } 

    public static class Categories extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentCategoryId")
        private Long parentCategoryId;

        @NameInMap("Status")
        private Integer status;

        private Categories(Builder builder) {
            this.categoryId = builder.categoryId;
            this.name = builder.name;
            this.parentCategoryId = builder.parentCategoryId;
            this.status = builder.status;
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
            private Long categoryId; 
            private String name; 
            private Long parentCategoryId; 
            private Integer status; 

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

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
}
