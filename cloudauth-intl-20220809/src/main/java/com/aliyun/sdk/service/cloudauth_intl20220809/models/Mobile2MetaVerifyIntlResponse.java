// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link Mobile2MetaVerifyIntlResponse} extends {@link TeaModel}
 *
 * <p>Mobile2MetaVerifyIntlResponse</p>
 */
public class Mobile2MetaVerifyIntlResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private Mobile2MetaVerifyIntlResponseBody body;

    private Mobile2MetaVerifyIntlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static Mobile2MetaVerifyIntlResponse create() {
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
    public Mobile2MetaVerifyIntlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<Mobile2MetaVerifyIntlResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(Mobile2MetaVerifyIntlResponseBody body);

        @Override
        Mobile2MetaVerifyIntlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<Mobile2MetaVerifyIntlResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private Mobile2MetaVerifyIntlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(Mobile2MetaVerifyIntlResponse response) {
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
        public Builder body(Mobile2MetaVerifyIntlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public Mobile2MetaVerifyIntlResponse build() {
            return new Mobile2MetaVerifyIntlResponse(this);
        } 

    } 

}
