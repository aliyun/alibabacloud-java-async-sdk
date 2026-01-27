// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeAutoRepairPolicyResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoRepairPolicyResponse</p>
 */
public class DescribeAutoRepairPolicyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAutoRepairPolicyResponseBody body;

    private DescribeAutoRepairPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAutoRepairPolicyResponse create() {
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
    public DescribeAutoRepairPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoRepairPolicyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAutoRepairPolicyResponseBody body);

        @Override
        DescribeAutoRepairPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoRepairPolicyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeAutoRepairPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoRepairPolicyResponse response) {
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
        public Builder body(DescribeAutoRepairPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoRepairPolicyResponse build() {
            return new DescribeAutoRepairPolicyResponse(this);
        } 

    } 

}
