// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLoadBalancerListenerResponse} extends {@link TeaModel}
 *
 * <p>DeleteLoadBalancerListenerResponse</p>
 */
public class DeleteLoadBalancerListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLoadBalancerListenerResponseBody body;

    private DeleteLoadBalancerListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLoadBalancerListenerResponse create() {
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
    public DeleteLoadBalancerListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLoadBalancerListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLoadBalancerListenerResponseBody body);

        @Override
        DeleteLoadBalancerListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLoadBalancerListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLoadBalancerListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLoadBalancerListenerResponse response) {
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
        public Builder body(DeleteLoadBalancerListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLoadBalancerListenerResponse build() {
            return new DeleteLoadBalancerListenerResponse(this);
        } 

    } 

}
