// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIoTCloudConnectorBackhaulRouteResponse} extends {@link TeaModel}
 *
 * <p>DeleteIoTCloudConnectorBackhaulRouteResponse</p>
 */
public class DeleteIoTCloudConnectorBackhaulRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIoTCloudConnectorBackhaulRouteResponseBody body;

    private DeleteIoTCloudConnectorBackhaulRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIoTCloudConnectorBackhaulRouteResponse create() {
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
    public DeleteIoTCloudConnectorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIoTCloudConnectorBackhaulRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIoTCloudConnectorBackhaulRouteResponseBody body);

        @Override
        DeleteIoTCloudConnectorBackhaulRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIoTCloudConnectorBackhaulRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIoTCloudConnectorBackhaulRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIoTCloudConnectorBackhaulRouteResponse response) {
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
        public Builder body(DeleteIoTCloudConnectorBackhaulRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIoTCloudConnectorBackhaulRouteResponse build() {
            return new DeleteIoTCloudConnectorBackhaulRouteResponse(this);
        } 

    } 

}
