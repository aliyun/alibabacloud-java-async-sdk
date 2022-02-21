// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerHTTPSListenerAttributeResponse} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerHTTPSListenerAttributeResponse</p>
 */
public class SetLoadBalancerHTTPSListenerAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLoadBalancerHTTPSListenerAttributeResponseBody body;

    private SetLoadBalancerHTTPSListenerAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLoadBalancerHTTPSListenerAttributeResponse create() {
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
    public SetLoadBalancerHTTPSListenerAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLoadBalancerHTTPSListenerAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLoadBalancerHTTPSListenerAttributeResponseBody body);

        @Override
        SetLoadBalancerHTTPSListenerAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLoadBalancerHTTPSListenerAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLoadBalancerHTTPSListenerAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLoadBalancerHTTPSListenerAttributeResponse response) {
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
        public Builder body(SetLoadBalancerHTTPSListenerAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLoadBalancerHTTPSListenerAttributeResponse build() {
            return new SetLoadBalancerHTTPSListenerAttributeResponse(this);
        } 

    } 

}
