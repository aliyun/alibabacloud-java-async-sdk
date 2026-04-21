// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link SubYikeUserCreditResponse} extends {@link TeaModel}
 *
 * <p>SubYikeUserCreditResponse</p>
 */
public class SubYikeUserCreditResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SubYikeUserCreditResponseBody body;

    private SubYikeUserCreditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubYikeUserCreditResponse create() {
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
    public SubYikeUserCreditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubYikeUserCreditResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubYikeUserCreditResponseBody body);

        @Override
        SubYikeUserCreditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubYikeUserCreditResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SubYikeUserCreditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubYikeUserCreditResponse response) {
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
        public Builder body(SubYikeUserCreditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubYikeUserCreditResponse build() {
            return new SubYikeUserCreditResponse(this);
        } 

    } 

}
