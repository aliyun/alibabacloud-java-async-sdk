// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDhcpOptionsSetFromVpcResponse} extends {@link TeaModel}
 *
 * <p>DetachDhcpOptionsSetFromVpcResponse</p>
 */
public class DetachDhcpOptionsSetFromVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachDhcpOptionsSetFromVpcResponseBody body;

    private DetachDhcpOptionsSetFromVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachDhcpOptionsSetFromVpcResponse create() {
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
    public DetachDhcpOptionsSetFromVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachDhcpOptionsSetFromVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachDhcpOptionsSetFromVpcResponseBody body);

        @Override
        DetachDhcpOptionsSetFromVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachDhcpOptionsSetFromVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachDhcpOptionsSetFromVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachDhcpOptionsSetFromVpcResponse response) {
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
        public Builder body(DetachDhcpOptionsSetFromVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachDhcpOptionsSetFromVpcResponse build() {
            return new DetachDhcpOptionsSetFromVpcResponse(this);
        } 

    } 

}
