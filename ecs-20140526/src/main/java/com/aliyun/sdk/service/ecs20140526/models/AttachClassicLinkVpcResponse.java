// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachClassicLinkVpcResponse} extends {@link TeaModel}
 *
 * <p>AttachClassicLinkVpcResponse</p>
 */
public class AttachClassicLinkVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachClassicLinkVpcResponseBody body;

    private AttachClassicLinkVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachClassicLinkVpcResponse create() {
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
    public AttachClassicLinkVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachClassicLinkVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachClassicLinkVpcResponseBody body);

        @Override
        AttachClassicLinkVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachClassicLinkVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachClassicLinkVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachClassicLinkVpcResponse response) {
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
        public Builder body(AttachClassicLinkVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachClassicLinkVpcResponse build() {
            return new AttachClassicLinkVpcResponse(this);
        } 

    } 

}
