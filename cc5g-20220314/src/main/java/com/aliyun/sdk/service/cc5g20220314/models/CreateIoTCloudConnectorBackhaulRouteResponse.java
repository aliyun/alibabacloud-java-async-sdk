// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIoTCloudConnectorBackhaulRouteResponse} extends {@link TeaModel}
 *
 * <p>CreateIoTCloudConnectorBackhaulRouteResponse</p>
 */
public class CreateIoTCloudConnectorBackhaulRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateIoTCloudConnectorBackhaulRouteResponseBody body;

    private CreateIoTCloudConnectorBackhaulRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateIoTCloudConnectorBackhaulRouteResponse create() {
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
    public CreateIoTCloudConnectorBackhaulRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIoTCloudConnectorBackhaulRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateIoTCloudConnectorBackhaulRouteResponseBody body);

        @Override
        CreateIoTCloudConnectorBackhaulRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIoTCloudConnectorBackhaulRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateIoTCloudConnectorBackhaulRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIoTCloudConnectorBackhaulRouteResponse response) {
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
        public Builder body(CreateIoTCloudConnectorBackhaulRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIoTCloudConnectorBackhaulRouteResponse build() {
            return new CreateIoTCloudConnectorBackhaulRouteResponse(this);
        } 

    } 

}
