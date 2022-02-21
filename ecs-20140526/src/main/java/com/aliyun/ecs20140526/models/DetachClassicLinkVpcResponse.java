// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachClassicLinkVpcResponse} extends {@link TeaModel}
 *
 * <p>DetachClassicLinkVpcResponse</p>
 */
public class DetachClassicLinkVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachClassicLinkVpcResponseBody body;

    private DetachClassicLinkVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachClassicLinkVpcResponse create() {
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
    public DetachClassicLinkVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachClassicLinkVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachClassicLinkVpcResponseBody body);

        @Override
        DetachClassicLinkVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachClassicLinkVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachClassicLinkVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachClassicLinkVpcResponse response) {
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
        public Builder body(DetachClassicLinkVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachClassicLinkVpcResponse build() {
            return new DetachClassicLinkVpcResponse(this);
        } 

    } 

}
