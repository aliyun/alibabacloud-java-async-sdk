// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableLoadBalancerAccessLogResponse} extends {@link TeaModel}
 *
 * <p>DisableLoadBalancerAccessLogResponse</p>
 */
public class DisableLoadBalancerAccessLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableLoadBalancerAccessLogResponseBody body;

    private DisableLoadBalancerAccessLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableLoadBalancerAccessLogResponse create() {
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
    public DisableLoadBalancerAccessLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableLoadBalancerAccessLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableLoadBalancerAccessLogResponseBody body);

        @Override
        DisableLoadBalancerAccessLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableLoadBalancerAccessLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableLoadBalancerAccessLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableLoadBalancerAccessLogResponse response) {
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
        public Builder body(DisableLoadBalancerAccessLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableLoadBalancerAccessLogResponse build() {
            return new DisableLoadBalancerAccessLogResponse(this);
        } 

    } 

}
