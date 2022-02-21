// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLoadBalancerPayTypeResponse} extends {@link TeaModel}
 *
 * <p>ModifyLoadBalancerPayTypeResponse</p>
 */
public class ModifyLoadBalancerPayTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLoadBalancerPayTypeResponseBody body;

    private ModifyLoadBalancerPayTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyLoadBalancerPayTypeResponse create() {
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
    public ModifyLoadBalancerPayTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLoadBalancerPayTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLoadBalancerPayTypeResponseBody body);

        @Override
        ModifyLoadBalancerPayTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLoadBalancerPayTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLoadBalancerPayTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLoadBalancerPayTypeResponse response) {
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
        public Builder body(ModifyLoadBalancerPayTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLoadBalancerPayTypeResponse build() {
            return new ModifyLoadBalancerPayTypeResponse(this);
        } 

    } 

}
