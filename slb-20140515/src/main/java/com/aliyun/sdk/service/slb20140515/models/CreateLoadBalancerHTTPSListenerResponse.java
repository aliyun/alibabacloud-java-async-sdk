// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerHTTPSListenerResponse} extends {@link TeaModel}
 *
 * <p>CreateLoadBalancerHTTPSListenerResponse</p>
 */
public class CreateLoadBalancerHTTPSListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLoadBalancerHTTPSListenerResponseBody body;

    private CreateLoadBalancerHTTPSListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLoadBalancerHTTPSListenerResponse create() {
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
    public CreateLoadBalancerHTTPSListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLoadBalancerHTTPSListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLoadBalancerHTTPSListenerResponseBody body);

        @Override
        CreateLoadBalancerHTTPSListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLoadBalancerHTTPSListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLoadBalancerHTTPSListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLoadBalancerHTTPSListenerResponse response) {
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
        public Builder body(CreateLoadBalancerHTTPSListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLoadBalancerHTTPSListenerResponse build() {
            return new CreateLoadBalancerHTTPSListenerResponse(this);
        } 

    } 

}
