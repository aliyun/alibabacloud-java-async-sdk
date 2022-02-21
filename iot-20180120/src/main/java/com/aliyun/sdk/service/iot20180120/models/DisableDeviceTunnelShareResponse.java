// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableDeviceTunnelShareResponse} extends {@link TeaModel}
 *
 * <p>DisableDeviceTunnelShareResponse</p>
 */
public class DisableDeviceTunnelShareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableDeviceTunnelShareResponseBody body;

    private DisableDeviceTunnelShareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableDeviceTunnelShareResponse create() {
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
    public DisableDeviceTunnelShareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableDeviceTunnelShareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableDeviceTunnelShareResponseBody body);

        @Override
        DisableDeviceTunnelShareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableDeviceTunnelShareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableDeviceTunnelShareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableDeviceTunnelShareResponse response) {
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
        public Builder body(DisableDeviceTunnelShareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableDeviceTunnelShareResponse build() {
            return new DisableDeviceTunnelShareResponse(this);
        } 

    } 

}
