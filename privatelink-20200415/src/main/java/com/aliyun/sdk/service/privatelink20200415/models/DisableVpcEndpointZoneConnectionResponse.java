// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableVpcEndpointZoneConnectionResponse} extends {@link TeaModel}
 *
 * <p>DisableVpcEndpointZoneConnectionResponse</p>
 */
public class DisableVpcEndpointZoneConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableVpcEndpointZoneConnectionResponseBody body;

    private DisableVpcEndpointZoneConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableVpcEndpointZoneConnectionResponse create() {
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
    public DisableVpcEndpointZoneConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableVpcEndpointZoneConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableVpcEndpointZoneConnectionResponseBody body);

        @Override
        DisableVpcEndpointZoneConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableVpcEndpointZoneConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableVpcEndpointZoneConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableVpcEndpointZoneConnectionResponse response) {
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
        public Builder body(DisableVpcEndpointZoneConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableVpcEndpointZoneConnectionResponse build() {
            return new DisableVpcEndpointZoneConnectionResponse(this);
        } 

    } 

}
