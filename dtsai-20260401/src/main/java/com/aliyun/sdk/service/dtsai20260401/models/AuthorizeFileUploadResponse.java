// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401.models;

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
 * {@link AuthorizeFileUploadResponse} extends {@link TeaModel}
 *
 * <p>AuthorizeFileUploadResponse</p>
 */
public class AuthorizeFileUploadResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AuthorizeFileUploadResponseBody body;

    private AuthorizeFileUploadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AuthorizeFileUploadResponse create() {
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
    public AuthorizeFileUploadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuthorizeFileUploadResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AuthorizeFileUploadResponseBody body);

        @Override
        AuthorizeFileUploadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuthorizeFileUploadResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AuthorizeFileUploadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuthorizeFileUploadResponse response) {
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
        public Builder body(AuthorizeFileUploadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeFileUploadResponse build() {
            return new AuthorizeFileUploadResponse(this);
        } 

    } 

}
