// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLoadBalancerListenerResponse} extends {@link TeaModel}
 *
 * <p>StopLoadBalancerListenerResponse</p>
 */
public class StopLoadBalancerListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopLoadBalancerListenerResponseBody body;

    private StopLoadBalancerListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopLoadBalancerListenerResponse create() {
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
    public StopLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopLoadBalancerListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopLoadBalancerListenerResponseBody body);

        @Override
        StopLoadBalancerListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopLoadBalancerListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopLoadBalancerListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopLoadBalancerListenerResponse response) {
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
        public Builder body(StopLoadBalancerListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopLoadBalancerListenerResponse build() {
            return new StopLoadBalancerListenerResponse(this);
        } 

    } 

}
