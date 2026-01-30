// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link ListTier2CouponApprovalResponse} extends {@link TeaModel}
 *
 * <p>ListTier2CouponApprovalResponse</p>
 */
public class ListTier2CouponApprovalResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListTier2CouponApprovalResponseBody body;

    private ListTier2CouponApprovalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTier2CouponApprovalResponse create() {
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
    public ListTier2CouponApprovalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTier2CouponApprovalResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTier2CouponApprovalResponseBody body);

        @Override
        ListTier2CouponApprovalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTier2CouponApprovalResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListTier2CouponApprovalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTier2CouponApprovalResponse response) {
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
        public Builder body(ListTier2CouponApprovalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTier2CouponApprovalResponse build() {
            return new ListTier2CouponApprovalResponse(this);
        } 

    } 

}
