// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link CreateProxyBrandUserResponse} extends {@link TeaModel}
 *
 * <p>CreateProxyBrandUserResponse</p>
 */
public class CreateProxyBrandUserResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateProxyBrandUserResponseBody body;

    private CreateProxyBrandUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateProxyBrandUserResponse create() {
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
    public CreateProxyBrandUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProxyBrandUserResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateProxyBrandUserResponseBody body);

        @Override
        CreateProxyBrandUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProxyBrandUserResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateProxyBrandUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProxyBrandUserResponse response) {
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
        public Builder body(CreateProxyBrandUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProxyBrandUserResponse build() {
            return new CreateProxyBrandUserResponse(this);
        } 

    } 

}
