// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceTunnelResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceTunnelResponse</p>
 */
public class CreateDeviceTunnelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceTunnelResponseBody body;

    private CreateDeviceTunnelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceTunnelResponse create() {
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
    public CreateDeviceTunnelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceTunnelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceTunnelResponseBody body);

        @Override
        CreateDeviceTunnelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceTunnelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceTunnelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceTunnelResponse response) {
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
        public Builder body(CreateDeviceTunnelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceTunnelResponse build() {
            return new CreateDeviceTunnelResponse(this);
        } 

    } 

}
