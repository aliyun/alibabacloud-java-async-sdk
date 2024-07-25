// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HttpApiResponseContract} extends {@link TeaModel}
 *
 * <p>HttpApiResponseContract</p>
 */
public class HttpApiResponseContract extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < Items> items;

    private HttpApiResponseContract(Builder builder) {
        this.contentType = builder.contentType;
        this.items = builder.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiResponseContract create() {
        return builder().build();
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    public static final class Builder {
        private String contentType; 
        private java.util.List < Items> items; 

        /**
         * contentType.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        public HttpApiResponseContract build() {
            return new HttpApiResponseContract(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("example")
        private String example;

        @com.aliyun.core.annotation.NameInMap("jsonSchema")
        private String jsonSchema;

        private Items(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.example = builder.example;
            this.jsonSchema = builder.jsonSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return example
         */
        public String getExample() {
            return this.example;
        }

        /**
         * @return jsonSchema
         */
        public String getJsonSchema() {
            return this.jsonSchema;
        }

        public static final class Builder {
            private Integer code; 
            private String description; 
            private String example; 
            private String jsonSchema; 

            /**
             * code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * example.
             */
            public Builder example(String example) {
                this.example = example;
                return this;
            }

            /**
             * jsonSchema.
             */
            public Builder jsonSchema(String jsonSchema) {
                this.jsonSchema = jsonSchema;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
