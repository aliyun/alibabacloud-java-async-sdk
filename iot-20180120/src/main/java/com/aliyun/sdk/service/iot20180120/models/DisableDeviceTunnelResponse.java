// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDeviceTunnelResponse} extends {@link TeaModel}
 *
 * <p>DisableDeviceTunnelResponse</p>
 */
public class DisableDeviceTunnelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableDeviceTunnelResponseBody body;

    private DisableDeviceTunnelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableDeviceTunnelResponse create() {
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
    public DisableDeviceTunnelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableDeviceTunnelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableDeviceTunnelResponseBody body);

        @Override
        DisableDeviceTunnelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableDeviceTunnelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableDeviceTunnelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableDeviceTunnelResponse response) {
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
        public Builder body(DisableDeviceTunnelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableDeviceTunnelResponse build() {
            return new DisableDeviceTunnelResponse(this);
        } 

    } 

}
