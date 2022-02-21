// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointZoneConnectionResourceAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateVpcEndpointZoneConnectionResourceAttributeResponse</p>
 */
public class UpdateVpcEndpointZoneConnectionResourceAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody body;

    private UpdateVpcEndpointZoneConnectionResourceAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVpcEndpointZoneConnectionResourceAttributeResponse create() {
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
    public UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVpcEndpointZoneConnectionResourceAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody body);

        @Override
        UpdateVpcEndpointZoneConnectionResourceAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVpcEndpointZoneConnectionResourceAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVpcEndpointZoneConnectionResourceAttributeResponse response) {
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
        public Builder body(UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVpcEndpointZoneConnectionResourceAttributeResponse build() {
            return new UpdateVpcEndpointZoneConnectionResourceAttributeResponse(this);
        } 

    } 

}
