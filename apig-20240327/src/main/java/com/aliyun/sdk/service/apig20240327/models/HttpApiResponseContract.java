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
 * {@link HttpApiResponseContract} extends {@link TeaModel}
 *
 * <p>HttpApiResponseContract</p>
 */
public class HttpApiResponseContract extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Items> getItems() {
        return this.items;
    }

    public static final class Builder {
        private String contentType; 
        private java.util.List<Items> items; 

        private Builder() {
        } 

        private Builder(HttpApiResponseContract model) {
            this.contentType = model.contentType;
            this.items = model.items;
        } 

        /**
         * <p>The content type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The response definition.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        public HttpApiResponseContract build() {
            return new HttpApiResponseContract(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiResponseContract} extends {@link TeaModel}
     *
     * <p>HttpApiResponseContract</p>
     */
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.code = model.code;
                this.description = model.description;
                this.example = model.example;
                this.jsonSchema = model.jsonSchema;
            } 

            /**
             * <p>The response code.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The response description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The sample value.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;result&quot;: &quot;ok&quot;}</p>
             */
            public Builder example(String example) {
                this.example = example;
                return this;
            }

            /**
             * <p>The JSON definition description of the response body.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;type&quot;: &quot;object&quot;,
             *     &quot;required&quot;: [
             *         &quot;result&quot;
             *     ],
             *     &quot;properties&quot;: {
             *         &quot;result&quot;: {
             *             &quot;type&quot;: &quot;string&quot;,
             *             &quot;description&quot;: &quot;This is a description.&quot;
             *         }
             *     }
             * }</p>
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
