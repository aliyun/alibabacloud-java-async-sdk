// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceTunnelShareStatusResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceTunnelShareStatusResponse</p>
 */
public class GetDeviceTunnelShareStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceTunnelShareStatusResponseBody body;

    private GetDeviceTunnelShareStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceTunnelShareStatusResponse create() {
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
    public GetDeviceTunnelShareStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceTunnelShareStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceTunnelShareStatusResponseBody body);

        @Override
        GetDeviceTunnelShareStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceTunnelShareStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceTunnelShareStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceTunnelShareStatusResponse response) {
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
        public Builder body(GetDeviceTunnelShareStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceTunnelShareStatusResponse build() {
            return new GetDeviceTunnelShareStatusResponse(this);
        } 

    } 

}
