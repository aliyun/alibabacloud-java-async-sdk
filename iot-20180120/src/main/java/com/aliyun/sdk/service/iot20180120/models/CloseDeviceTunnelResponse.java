// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDeviceTunnelResponse} extends {@link TeaModel}
 *
 * <p>CloseDeviceTunnelResponse</p>
 */
public class CloseDeviceTunnelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseDeviceTunnelResponseBody body;

    private CloseDeviceTunnelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseDeviceTunnelResponse create() {
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
    public CloseDeviceTunnelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseDeviceTunnelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseDeviceTunnelResponseBody body);

        @Override
        CloseDeviceTunnelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseDeviceTunnelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseDeviceTunnelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseDeviceTunnelResponse response) {
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
        public Builder body(CloseDeviceTunnelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseDeviceTunnelResponse build() {
            return new CloseDeviceTunnelResponse(this);
        } 

    } 

}
