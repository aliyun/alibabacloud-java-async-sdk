// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachLoadBalancersResponse} extends {@link TeaModel}
 *
 * <p>AttachLoadBalancersResponse</p>
 */
public class AttachLoadBalancersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachLoadBalancersResponseBody body;

    private AttachLoadBalancersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachLoadBalancersResponse create() {
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
    public AttachLoadBalancersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachLoadBalancersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachLoadBalancersResponseBody body);

        @Override
        AttachLoadBalancersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachLoadBalancersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachLoadBalancersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachLoadBalancersResponse response) {
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
        public Builder body(AttachLoadBalancersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachLoadBalancersResponse build() {
            return new AttachLoadBalancersResponse(this);
        } 

    } 

}
