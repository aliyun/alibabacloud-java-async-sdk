// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceAppUpdateFunnelEventsResponse} extends {@link TeaModel}
 *
 * <p>GetDeviceAppUpdateFunnelEventsResponse</p>
 */
public class GetDeviceAppUpdateFunnelEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeviceAppUpdateFunnelEventsResponseBody body;

    private GetDeviceAppUpdateFunnelEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeviceAppUpdateFunnelEventsResponse create() {
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
    public GetDeviceAppUpdateFunnelEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeviceAppUpdateFunnelEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeviceAppUpdateFunnelEventsResponseBody body);

        @Override
        GetDeviceAppUpdateFunnelEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeviceAppUpdateFunnelEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeviceAppUpdateFunnelEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeviceAppUpdateFunnelEventsResponse response) {
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
        public Builder body(GetDeviceAppUpdateFunnelEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeviceAppUpdateFunnelEventsResponse build() {
            return new GetDeviceAppUpdateFunnelEventsResponse(this);
        } 

    } 

}
