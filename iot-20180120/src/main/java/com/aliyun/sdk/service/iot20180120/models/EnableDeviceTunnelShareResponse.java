// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDeviceTunnelShareResponse} extends {@link TeaModel}
 *
 * <p>EnableDeviceTunnelShareResponse</p>
 */
public class EnableDeviceTunnelShareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableDeviceTunnelShareResponseBody body;

    private EnableDeviceTunnelShareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableDeviceTunnelShareResponse create() {
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
    public EnableDeviceTunnelShareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableDeviceTunnelShareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableDeviceTunnelShareResponseBody body);

        @Override
        EnableDeviceTunnelShareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableDeviceTunnelShareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableDeviceTunnelShareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableDeviceTunnelShareResponse response) {
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
        public Builder body(EnableDeviceTunnelShareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableDeviceTunnelShareResponse build() {
            return new EnableDeviceTunnelShareResponse(this);
        } 

    } 

}
