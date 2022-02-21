// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachLoadBalancersResponse} extends {@link TeaModel}
 *
 * <p>DetachLoadBalancersResponse</p>
 */
public class DetachLoadBalancersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachLoadBalancersResponseBody body;

    private DetachLoadBalancersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachLoadBalancersResponse create() {
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
    public DetachLoadBalancersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachLoadBalancersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachLoadBalancersResponseBody body);

        @Override
        DetachLoadBalancersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachLoadBalancersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachLoadBalancersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachLoadBalancersResponse response) {
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
        public Builder body(DetachLoadBalancersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachLoadBalancersResponse build() {
            return new DetachLoadBalancersResponse(this);
        } 

    } 

}
