// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerModificationProtectionResponse} extends {@link TeaModel}
 *
 * <p>SetLoadBalancerModificationProtectionResponse</p>
 */
public class SetLoadBalancerModificationProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLoadBalancerModificationProtectionResponseBody body;

    private SetLoadBalancerModificationProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLoadBalancerModificationProtectionResponse create() {
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
    public SetLoadBalancerModificationProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLoadBalancerModificationProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLoadBalancerModificationProtectionResponseBody body);

        @Override
        SetLoadBalancerModificationProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLoadBalancerModificationProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLoadBalancerModificationProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLoadBalancerModificationProtectionResponse response) {
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
        public Builder body(SetLoadBalancerModificationProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLoadBalancerModificationProtectionResponse build() {
            return new SetLoadBalancerModificationProtectionResponse(this);
        } 

    } 

}
