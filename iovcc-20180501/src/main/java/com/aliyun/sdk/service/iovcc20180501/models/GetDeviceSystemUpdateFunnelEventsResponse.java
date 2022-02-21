// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceSystemUpdateFunnelEventsResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceSystemUpdateFunnelEventsResponse</p>
 */
public class GetDeviceSystemUpdateFunnelEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceSystemUpdateFunnelEventsResponseBody body;

    private GetDeviceSystemUpdateFunnelEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceSystemUpdateFunnelEventsResponse create() {
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
    public GetDeviceSystemUpdateFunnelEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceSystemUpdateFunnelEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceSystemUpdateFunnelEventsResponseBody body);

        @Override
        GetDeviceSystemUpdateFunnelEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceSystemUpdateFunnelEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceSystemUpdateFunnelEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceSystemUpdateFunnelEventsResponse response) {
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
        public Builder body(GetDeviceSystemUpdateFunnelEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceSystemUpdateFunnelEventsResponse build() {
            return new GetDeviceSystemUpdateFunnelEventsResponse(this);
        } 

    } 

}
