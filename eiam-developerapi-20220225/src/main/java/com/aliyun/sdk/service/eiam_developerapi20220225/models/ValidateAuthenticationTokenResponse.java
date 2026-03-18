// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link ValidateAuthenticationTokenResponse} extends {@link TeaModel}
 *
 * <p>ValidateAuthenticationTokenResponse</p>
 */
public class ValidateAuthenticationTokenResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ValidateAuthenticationTokenResponseBody body;

    private ValidateAuthenticationTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ValidateAuthenticationTokenResponse create() {
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
    public ValidateAuthenticationTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateAuthenticationTokenResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ValidateAuthenticationTokenResponseBody body);

        @Override
        ValidateAuthenticationTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateAuthenticationTokenResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ValidateAuthenticationTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateAuthenticationTokenResponse response) {
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
        public Builder body(ValidateAuthenticationTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateAuthenticationTokenResponse build() {
            return new ValidateAuthenticationTokenResponse(this);
        } 

    } 

}
