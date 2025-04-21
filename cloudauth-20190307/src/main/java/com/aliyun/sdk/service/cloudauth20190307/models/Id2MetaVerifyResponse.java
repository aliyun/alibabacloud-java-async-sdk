// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link Id2MetaVerifyResponse} extends {@link TeaModel}
 *
 * <p>Id2MetaVerifyResponse</p>
 */
public class Id2MetaVerifyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private Id2MetaVerifyResponseBody body;

    private Id2MetaVerifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static Id2MetaVerifyResponse create() {
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
    public Id2MetaVerifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<Id2MetaVerifyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(Id2MetaVerifyResponseBody body);

        @Override
        Id2MetaVerifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<Id2MetaVerifyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private Id2MetaVerifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(Id2MetaVerifyResponse response) {
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
        public Builder body(Id2MetaVerifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public Id2MetaVerifyResponse build() {
            return new Id2MetaVerifyResponse(this);
        } 

    } 

}
