// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link CheckServiceLinkedRoleForProductResponse} extends {@link TeaModel}
 *
 * <p>CheckServiceLinkedRoleForProductResponse</p>
 */
public class CheckServiceLinkedRoleForProductResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CheckServiceLinkedRoleForProductResponseBody body;

    private CheckServiceLinkedRoleForProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CheckServiceLinkedRoleForProductResponse create() {
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
    public CheckServiceLinkedRoleForProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckServiceLinkedRoleForProductResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckServiceLinkedRoleForProductResponseBody body);

        @Override
        CheckServiceLinkedRoleForProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckServiceLinkedRoleForProductResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CheckServiceLinkedRoleForProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckServiceLinkedRoleForProductResponse response) {
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
        public Builder body(CheckServiceLinkedRoleForProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckServiceLinkedRoleForProductResponse build() {
            return new CheckServiceLinkedRoleForProductResponse(this);
        } 

    } 

}
