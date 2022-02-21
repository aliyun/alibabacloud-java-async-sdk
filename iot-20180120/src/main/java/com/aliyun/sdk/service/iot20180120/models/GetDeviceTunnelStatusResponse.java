// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceTunnelStatusResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceTunnelStatusResponse</p>
 */
public class GetDeviceTunnelStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceTunnelStatusResponseBody body;

    private GetDeviceTunnelStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceTunnelStatusResponse create() {
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
    public GetDeviceTunnelStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceTunnelStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceTunnelStatusResponseBody body);

        @Override
        GetDeviceTunnelStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceTunnelStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceTunnelStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceTunnelStatusResponse response) {
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
        public Builder body(GetDeviceTunnelStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceTunnelStatusResponse build() {
            return new GetDeviceTunnelStatusResponse(this);
        } 

    } 

}
