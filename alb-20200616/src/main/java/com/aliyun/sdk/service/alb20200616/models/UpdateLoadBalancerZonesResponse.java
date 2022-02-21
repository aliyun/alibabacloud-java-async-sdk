// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoadBalancerZonesResponse} extends {@link TeaModel}
 *
 * <p>UpdateLoadBalancerZonesResponse</p>
 */
public class UpdateLoadBalancerZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLoadBalancerZonesResponseBody body;

    private UpdateLoadBalancerZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLoadBalancerZonesResponse create() {
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
    public UpdateLoadBalancerZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLoadBalancerZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLoadBalancerZonesResponseBody body);

        @Override
        UpdateLoadBalancerZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLoadBalancerZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLoadBalancerZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLoadBalancerZonesResponse response) {
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
        public Builder body(UpdateLoadBalancerZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLoadBalancerZonesResponse build() {
            return new UpdateLoadBalancerZonesResponse(this);
        } 

    } 

}
