// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateProductCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProductCategoryResponseBody</p>
 */
public class CreateProductCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateProductCategoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProductCategoryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProductCategoryResponseBody build() {
            return new CreateProductCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProductCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProductCategoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("categoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Data(Builder builder) {
            this.categoryId = builder.categoryId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String categoryId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categoryId = model.categoryId;
                this.name = model.name;
            } 

            /**
             * <p>The ID of the newly created product category. It can be used as the categoryId path parameter in GetProductCategory, UpdateProductCategory, and DeleteProductCategory, or as an element in the category ID array for SetProductCategories.</p>
             * 
             * <strong>example:</strong>
             * <p>category-xxxxxxxx</p>
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * <p>The name of the product category.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-capabilities</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
