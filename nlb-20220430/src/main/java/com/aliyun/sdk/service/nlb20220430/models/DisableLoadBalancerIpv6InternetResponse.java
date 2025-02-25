// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link DisableLoadBalancerIpv6InternetResponse} extends {@link TeaModel}
 *
 * <p>DisableLoadBalancerIpv6InternetResponse</p>
 */
public class DisableLoadBalancerIpv6InternetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DisableLoadBalancerIpv6InternetResponseBody body;

    private DisableLoadBalancerIpv6InternetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DisableLoadBalancerIpv6InternetResponse create() {
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
    public DisableLoadBalancerIpv6InternetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableLoadBalancerIpv6InternetResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DisableLoadBalancerIpv6InternetResponseBody body);

        @Override
        DisableLoadBalancerIpv6InternetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableLoadBalancerIpv6InternetResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DisableLoadBalancerIpv6InternetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableLoadBalancerIpv6InternetResponse response) {
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
        public Builder body(DisableLoadBalancerIpv6InternetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableLoadBalancerIpv6InternetResponse build() {
            return new DisableLoadBalancerIpv6InternetResponse(this);
        } 

    } 

}
