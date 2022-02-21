// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerDeleteProtectionResponse} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerDeleteProtectionResponse</p>
 */
public class SetLoadBalancerDeleteProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLoadBalancerDeleteProtectionResponseBody body;

    private SetLoadBalancerDeleteProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLoadBalancerDeleteProtectionResponse create() {
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
    public SetLoadBalancerDeleteProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLoadBalancerDeleteProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLoadBalancerDeleteProtectionResponseBody body);

        @Override
        SetLoadBalancerDeleteProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLoadBalancerDeleteProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLoadBalancerDeleteProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLoadBalancerDeleteProtectionResponse response) {
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
        public Builder body(SetLoadBalancerDeleteProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLoadBalancerDeleteProtectionResponse build() {
            return new SetLoadBalancerDeleteProtectionResponse(this);
        } 

    } 

}
