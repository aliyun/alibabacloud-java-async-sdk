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
 * {@link HttpApiRequestContract} extends {@link TeaModel}
 *
 * <p>HttpApiRequestContract</p>
 */
public class HttpApiRequestContract extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("body")
    private HttpApiRequestContractBody body;

    @com.aliyun.core.annotation.NameInMap("headerParameters")
    private java.util.List<HttpApiParameter> headerParameters;

    @com.aliyun.core.annotation.NameInMap("pathParameters")
    private java.util.List<HttpApiParameter> pathParameters;

    @com.aliyun.core.annotation.NameInMap("queryParameters")
    private java.util.List<HttpApiParameter> queryParameters;

    private HttpApiRequestContract(Builder builder) {
        this.body = builder.body;
        this.headerParameters = builder.headerParameters;
        this.pathParameters = builder.pathParameters;
        this.queryParameters = builder.queryParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiRequestContract create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public HttpApiRequestContractBody getBody() {
        return this.body;
    }

    /**
     * @return headerParameters
     */
    public java.util.List<HttpApiParameter> getHeaderParameters() {
        return this.headerParameters;
    }

    /**
     * @return pathParameters
     */
    public java.util.List<HttpApiParameter> getPathParameters() {
        return this.pathParameters;
    }

    /**
     * @return queryParameters
     */
    public java.util.List<HttpApiParameter> getQueryParameters() {
        return this.queryParameters;
    }

    public static final class Builder {
        private HttpApiRequestContractBody body; 
        private java.util.List<HttpApiParameter> headerParameters; 
        private java.util.List<HttpApiParameter> pathParameters; 
        private java.util.List<HttpApiParameter> queryParameters; 

        private Builder() {
        } 

        private Builder(HttpApiRequestContract model) {
            this.body = model.body;
            this.headerParameters = model.headerParameters;
            this.pathParameters = model.pathParameters;
            this.queryParameters = model.queryParameters;
        } 

        /**
         * body.
         */
        public Builder body(HttpApiRequestContractBody body) {
            this.body = body;
            return this;
        }

        /**
         * headerParameters.
         */
        public Builder headerParameters(java.util.List<HttpApiParameter> headerParameters) {
            this.headerParameters = headerParameters;
            return this;
        }

        /**
         * pathParameters.
         */
        public Builder pathParameters(java.util.List<HttpApiParameter> pathParameters) {
            this.pathParameters = pathParameters;
            return this;
        }

        /**
         * queryParameters.
         */
        public Builder queryParameters(java.util.List<HttpApiParameter> queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public HttpApiRequestContract build() {
            return new HttpApiRequestContract(this);
        } 

    } 

    /**
     * 
     * {@link HttpApiRequestContract} extends {@link TeaModel}
     *
     * <p>HttpApiRequestContract</p>
     */
    public static class HttpApiRequestContractBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("example")
        private String example;

        @com.aliyun.core.annotation.NameInMap("jsonSchema")
        private String jsonSchema;

        private HttpApiRequestContractBody(Builder builder) {
            this.contentType = builder.contentType;
            this.description = builder.description;
            this.example = builder.example;
            this.jsonSchema = builder.jsonSchema;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpApiRequestContractBody create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
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
            private String contentType; 
            private String description; 
            private String example; 
            private String jsonSchema; 

            private Builder() {
            } 

            private Builder(HttpApiRequestContractBody model) {
                this.contentType = model.contentType;
                this.description = model.description;
                this.example = model.example;
                this.jsonSchema = model.jsonSchema;
            } 

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
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

            public HttpApiRequestContractBody build() {
                return new HttpApiRequestContractBody(this);
            } 

        } 

    }
}
