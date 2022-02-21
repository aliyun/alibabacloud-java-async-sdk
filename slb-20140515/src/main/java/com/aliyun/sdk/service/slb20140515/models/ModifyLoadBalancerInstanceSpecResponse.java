// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLoadBalancerInstanceSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyLoadBalancerInstanceSpecResponse</p>
 */
public class ModifyLoadBalancerInstanceSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLoadBalancerInstanceSpecResponseBody body;

    private ModifyLoadBalancerInstanceSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyLoadBalancerInstanceSpecResponse create() {
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
    public ModifyLoadBalancerInstanceSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLoadBalancerInstanceSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLoadBalancerInstanceSpecResponseBody body);

        @Override
        ModifyLoadBalancerInstanceSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLoadBalancerInstanceSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLoadBalancerInstanceSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLoadBalancerInstanceSpecResponse response) {
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
        public Builder body(ModifyLoadBalancerInstanceSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLoadBalancerInstanceSpecResponse build() {
            return new ModifyLoadBalancerInstanceSpecResponse(this);
        } 

    } 

}
