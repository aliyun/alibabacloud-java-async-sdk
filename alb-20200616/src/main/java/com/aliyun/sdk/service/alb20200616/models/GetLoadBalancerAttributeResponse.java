// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoadBalancerAttributeResponse} extends {@link TeaModel}
 *
 * <p>GetLoadBalancerAttributeResponse</p>
 */
public class GetLoadBalancerAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLoadBalancerAttributeResponseBody body;

    private GetLoadBalancerAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLoadBalancerAttributeResponse create() {
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
    public GetLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLoadBalancerAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLoadBalancerAttributeResponseBody body);

        @Override
        GetLoadBalancerAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLoadBalancerAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLoadBalancerAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLoadBalancerAttributeResponse response) {
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
        public Builder body(GetLoadBalancerAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLoadBalancerAttributeResponse build() {
            return new GetLoadBalancerAttributeResponse(this);
        } 

    } 

}
