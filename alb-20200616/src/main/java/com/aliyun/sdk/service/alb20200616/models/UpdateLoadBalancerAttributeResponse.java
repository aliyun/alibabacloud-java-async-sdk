// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoadBalancerAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateLoadBalancerAttributeResponse</p>
 */
public class UpdateLoadBalancerAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLoadBalancerAttributeResponseBody body;

    private UpdateLoadBalancerAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLoadBalancerAttributeResponse create() {
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
    public UpdateLoadBalancerAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLoadBalancerAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLoadBalancerAttributeResponseBody body);

        @Override
        UpdateLoadBalancerAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLoadBalancerAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLoadBalancerAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLoadBalancerAttributeResponse response) {
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
        public Builder body(UpdateLoadBalancerAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLoadBalancerAttributeResponse build() {
            return new UpdateLoadBalancerAttributeResponse(this);
        } 

    } 

}
