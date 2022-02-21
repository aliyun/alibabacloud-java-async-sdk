// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceVpcDhcpOptionsSetResponse} extends {@link TeaModel}
 *
 * <p>ReplaceVpcDhcpOptionsSetResponse</p>
 */
public class ReplaceVpcDhcpOptionsSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReplaceVpcDhcpOptionsSetResponseBody body;

    private ReplaceVpcDhcpOptionsSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReplaceVpcDhcpOptionsSetResponse create() {
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
    public ReplaceVpcDhcpOptionsSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplaceVpcDhcpOptionsSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReplaceVpcDhcpOptionsSetResponseBody body);

        @Override
        ReplaceVpcDhcpOptionsSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplaceVpcDhcpOptionsSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReplaceVpcDhcpOptionsSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplaceVpcDhcpOptionsSetResponse response) {
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
        public Builder body(ReplaceVpcDhcpOptionsSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplaceVpcDhcpOptionsSetResponse build() {
            return new ReplaceVpcDhcpOptionsSetResponse(this);
        } 

    } 

}
