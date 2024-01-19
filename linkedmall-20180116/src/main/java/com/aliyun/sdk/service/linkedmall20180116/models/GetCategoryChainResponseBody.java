// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCategoryChainResponseBody} extends {@link TeaModel}
 *
 * <p>GetCategoryChainResponseBody</p>
 */
public class GetCategoryChainResponseBody extends TeaModel {
    @NameInMap("CategoryList")
    private java.util.List < CategoryList> categoryList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetCategoryChainResponseBody(Builder builder) {
        this.categoryList = builder.categoryList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoryChainResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryList
     */
    public java.util.List < CategoryList> getCategoryList() {
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
        private java.util.List < CategoryList> categoryList; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * CategoryList.
         */
        public Builder categoryList(java.util.List < CategoryList> categoryList) {
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

        public GetCategoryChainResponseBody build() {
            return new GetCategoryChainResponseBody(this);
        } 

    } 

    public static class CategoryList extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("Name")
        private String name;

        private CategoryList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
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

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
}
