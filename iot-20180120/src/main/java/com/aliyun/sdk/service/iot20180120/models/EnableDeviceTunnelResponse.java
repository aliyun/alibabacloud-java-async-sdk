// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDeviceTunnelResponse} extends {@link TeaModel}
 *
 * <p>EnableDeviceTunnelResponse</p>
 */
public class EnableDeviceTunnelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableDeviceTunnelResponseBody body;

    private EnableDeviceTunnelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableDeviceTunnelResponse create() {
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
    public EnableDeviceTunnelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableDeviceTunnelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableDeviceTunnelResponseBody body);

        @Override
        EnableDeviceTunnelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableDeviceTunnelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableDeviceTunnelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableDeviceTunnelResponse response) {
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
        public Builder body(EnableDeviceTunnelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableDeviceTunnelResponse build() {
            return new EnableDeviceTunnelResponse(this);
        } 

    } 

}
