// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerTCPListenerAttributeResponse} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerTCPListenerAttributeResponse</p>
 */
public class SetLoadBalancerTCPListenerAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLoadBalancerTCPListenerAttributeResponseBody body;

    private SetLoadBalancerTCPListenerAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLoadBalancerTCPListenerAttributeResponse create() {
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
    public SetLoadBalancerTCPListenerAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLoadBalancerTCPListenerAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLoadBalancerTCPListenerAttributeResponseBody body);

        @Override
        SetLoadBalancerTCPListenerAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLoadBalancerTCPListenerAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLoadBalancerTCPListenerAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLoadBalancerTCPListenerAttributeResponse response) {
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
        public Builder body(SetLoadBalancerTCPListenerAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLoadBalancerTCPListenerAttributeResponse build() {
            return new SetLoadBalancerTCPListenerAttributeResponse(this);
        } 

    } 

}
