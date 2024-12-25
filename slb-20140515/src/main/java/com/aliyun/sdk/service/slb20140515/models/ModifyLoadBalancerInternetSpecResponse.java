// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link ModifyLoadBalancerInternetSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyLoadBalancerInternetSpecResponse</p>
 */
public class ModifyLoadBalancerInternetSpecResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyLoadBalancerInternetSpecResponseBody body;

    private ModifyLoadBalancerInternetSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ModifyLoadBalancerInternetSpecResponse create() {
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
    public ModifyLoadBalancerInternetSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLoadBalancerInternetSpecResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyLoadBalancerInternetSpecResponseBody body);

        @Override
        ModifyLoadBalancerInternetSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLoadBalancerInternetSpecResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ModifyLoadBalancerInternetSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLoadBalancerInternetSpecResponse response) {
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
        public Builder body(ModifyLoadBalancerInternetSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLoadBalancerInternetSpecResponse build() {
            return new ModifyLoadBalancerInternetSpecResponse(this);
        } 

    } 

}
