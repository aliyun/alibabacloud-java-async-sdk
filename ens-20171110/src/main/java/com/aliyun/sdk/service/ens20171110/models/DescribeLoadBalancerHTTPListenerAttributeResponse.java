// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeLoadBalancerHTTPListenerAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerHTTPListenerAttributeResponse</p>
 */
public class DescribeLoadBalancerHTTPListenerAttributeResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeLoadBalancerHTTPListenerAttributeResponseBody body;

    private DescribeLoadBalancerHTTPListenerAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeLoadBalancerHTTPListenerAttributeResponse create() {
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
    public DescribeLoadBalancerHTTPListenerAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLoadBalancerHTTPListenerAttributeResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeLoadBalancerHTTPListenerAttributeResponseBody body);

        @Override
        DescribeLoadBalancerHTTPListenerAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLoadBalancerHTTPListenerAttributeResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeLoadBalancerHTTPListenerAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLoadBalancerHTTPListenerAttributeResponse response) {
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
        public Builder body(DescribeLoadBalancerHTTPListenerAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLoadBalancerHTTPListenerAttributeResponse build() {
            return new DescribeLoadBalancerHTTPListenerAttributeResponse(this);
        } 

    } 

}
