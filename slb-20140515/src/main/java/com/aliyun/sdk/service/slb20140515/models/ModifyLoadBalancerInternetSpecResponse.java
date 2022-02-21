// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLoadBalancerInternetSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyLoadBalancerInternetSpecResponse</p>
 */
public class ModifyLoadBalancerInternetSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLoadBalancerInternetSpecResponseBody body;

    private ModifyLoadBalancerInternetSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ModifyLoadBalancerInternetSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLoadBalancerInternetSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLoadBalancerInternetSpecResponseBody body);

        @Override
        ModifyLoadBalancerInternetSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLoadBalancerInternetSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLoadBalancerInternetSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLoadBalancerInternetSpecResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
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
