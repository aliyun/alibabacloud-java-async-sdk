// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerNameResponse} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerNameResponse</p>
 */
public class SetLoadBalancerNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLoadBalancerNameResponseBody body;

    private SetLoadBalancerNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLoadBalancerNameResponse create() {
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
    public SetLoadBalancerNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLoadBalancerNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLoadBalancerNameResponseBody body);

        @Override
        SetLoadBalancerNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLoadBalancerNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLoadBalancerNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLoadBalancerNameResponse response) {
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
        public Builder body(SetLoadBalancerNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLoadBalancerNameResponse build() {
            return new SetLoadBalancerNameResponse(this);
        } 

    } 

}
