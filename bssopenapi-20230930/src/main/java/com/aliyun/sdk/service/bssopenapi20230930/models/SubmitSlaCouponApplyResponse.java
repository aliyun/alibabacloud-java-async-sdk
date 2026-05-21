// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link SubmitSlaCouponApplyResponse} extends {@link TeaModel}
 *
 * <p>SubmitSlaCouponApplyResponse</p>
 */
public class SubmitSlaCouponApplyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SubmitSlaCouponApplyResponseBody body;

    private SubmitSlaCouponApplyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SubmitSlaCouponApplyResponse create() {
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
    public SubmitSlaCouponApplyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSlaCouponApplyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SubmitSlaCouponApplyResponseBody body);

        @Override
        SubmitSlaCouponApplyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSlaCouponApplyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SubmitSlaCouponApplyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSlaCouponApplyResponse response) {
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
        public Builder body(SubmitSlaCouponApplyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSlaCouponApplyResponse build() {
            return new SubmitSlaCouponApplyResponse(this);
        } 

    } 

}
