// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link CreateOIDCProviderResponse} extends {@link TeaModel}
 *
 * <p>CreateOIDCProviderResponse</p>
 */
public class CreateOIDCProviderResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateOIDCProviderResponseBody body;

    private CreateOIDCProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateOIDCProviderResponse create() {
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
    public CreateOIDCProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOIDCProviderResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateOIDCProviderResponseBody body);

        @Override
        CreateOIDCProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOIDCProviderResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateOIDCProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOIDCProviderResponse response) {
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
        public Builder body(CreateOIDCProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOIDCProviderResponse build() {
            return new CreateOIDCProviderResponse(this);
        } 

    } 

}
