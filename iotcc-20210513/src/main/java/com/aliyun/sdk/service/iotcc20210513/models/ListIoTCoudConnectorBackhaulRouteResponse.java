// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIoTCoudConnectorBackhaulRouteResponse} extends {@link TeaModel}
 *
 * <p>ListIoTCoudConnectorBackhaulRouteResponse</p>
 */
public class ListIoTCoudConnectorBackhaulRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIoTCoudConnectorBackhaulRouteResponseBody body;

    private ListIoTCoudConnectorBackhaulRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIoTCoudConnectorBackhaulRouteResponse create() {
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
    public ListIoTCoudConnectorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIoTCoudConnectorBackhaulRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIoTCoudConnectorBackhaulRouteResponseBody body);

        @Override
        ListIoTCoudConnectorBackhaulRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIoTCoudConnectorBackhaulRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIoTCoudConnectorBackhaulRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIoTCoudConnectorBackhaulRouteResponse response) {
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
        public Builder body(ListIoTCoudConnectorBackhaulRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIoTCoudConnectorBackhaulRouteResponse build() {
            return new ListIoTCoudConnectorBackhaulRouteResponse(this);
        } 

    } 

}
