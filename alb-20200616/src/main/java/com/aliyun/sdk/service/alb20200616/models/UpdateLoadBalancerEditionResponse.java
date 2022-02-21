// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLoadBalancerEditionResponse} extends {@link TeaModel}
 *
 * <p>UpdateLoadBalancerEditionResponse</p>
 */
public class UpdateLoadBalancerEditionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLoadBalancerEditionResponseBody body;

    private UpdateLoadBalancerEditionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLoadBalancerEditionResponse create() {
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
    public UpdateLoadBalancerEditionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLoadBalancerEditionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLoadBalancerEditionResponseBody body);

        @Override
        UpdateLoadBalancerEditionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLoadBalancerEditionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLoadBalancerEditionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLoadBalancerEditionResponse response) {
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
        public Builder body(UpdateLoadBalancerEditionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLoadBalancerEditionResponse build() {
            return new UpdateLoadBalancerEditionResponse(this);
        } 

    } 

}
