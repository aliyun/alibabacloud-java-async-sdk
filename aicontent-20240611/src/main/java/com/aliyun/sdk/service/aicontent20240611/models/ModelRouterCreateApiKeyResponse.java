// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterCreateApiKeyResponse} extends {@link TeaModel}
 *
 * <p>ModelRouterCreateApiKeyResponse</p>
 */
public class ModelRouterCreateApiKeyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModelRouterCreateApiKeyResponseBody body;

    private ModelRouterCreateApiKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModelRouterCreateApiKeyResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ModelRouterCreateApiKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModelRouterCreateApiKeyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModelRouterCreateApiKeyResponseBody body);

        @Override
        ModelRouterCreateApiKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModelRouterCreateApiKeyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModelRouterCreateApiKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModelRouterCreateApiKeyResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ModelRouterCreateApiKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModelRouterCreateApiKeyResponse build() {
            return new ModelRouterCreateApiKeyResponse(this);
        } 

    } 

}
