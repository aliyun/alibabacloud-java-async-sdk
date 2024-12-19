// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetCategoryListResponseBody} extends {@link TeaModel}
 *
 * <p>GetCategoryListResponseBody</p>
 */
public class GetCategoryListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryList")
    private CategoryList categoryList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCategoryListResponseBody(Builder builder) {
        this.categoryList = builder.categoryList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoryListResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryList
     */
    public CategoryList getCategoryList() {
        return this.categoryList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CategoryList categoryList; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * CategoryList.
         */
        public Builder categoryList(CategoryList categoryList) {
            this.categoryList = categoryList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCategoryListResponseBody build() {
            return new GetCategoryListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCategoryListResponseBody} extends {@link TeaModel}
     *
     * <p>GetCategoryListResponseBody</p>
     */
    public static class Category extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Long categoryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Category(Builder builder) {
            this.categoryId = builder.categoryId;
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long categoryId; 
            private String name; 

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

            public Category build() {
                return new Category(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCategoryListResponseBody} extends {@link TeaModel}
     *
     * <p>GetCategoryListResponseBody</p>
     */
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private java.util.List<Category> category;

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
        public java.util.List<Category> getCategory() {
            return this.category;
        }

        public static final class Builder {
            private java.util.List<Category> category; 

            /**
             * Category.
             */
            public Builder category(java.util.List<Category> category) {
                this.category = category;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
}
