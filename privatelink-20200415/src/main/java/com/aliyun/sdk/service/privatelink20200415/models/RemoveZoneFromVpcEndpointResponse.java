// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveZoneFromVpcEndpointResponse} extends {@link TeaModel}
 *
 * <p>RemoveZoneFromVpcEndpointResponse</p>
 */
public class RemoveZoneFromVpcEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveZoneFromVpcEndpointResponseBody body;

    private RemoveZoneFromVpcEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveZoneFromVpcEndpointResponse create() {
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
    public RemoveZoneFromVpcEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveZoneFromVpcEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveZoneFromVpcEndpointResponseBody body);

        @Override
        RemoveZoneFromVpcEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveZoneFromVpcEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveZoneFromVpcEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveZoneFromVpcEndpointResponse response) {
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
        public Builder body(RemoveZoneFromVpcEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveZoneFromVpcEndpointResponse build() {
            return new RemoveZoneFromVpcEndpointResponse(this);
        } 

    } 

}
