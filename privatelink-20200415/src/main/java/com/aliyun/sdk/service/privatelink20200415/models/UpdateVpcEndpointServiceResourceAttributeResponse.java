// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVpcEndpointServiceResourceAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateVpcEndpointServiceResourceAttributeResponse</p>
 */
public class UpdateVpcEndpointServiceResourceAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVpcEndpointServiceResourceAttributeResponseBody body;

    private UpdateVpcEndpointServiceResourceAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVpcEndpointServiceResourceAttributeResponse create() {
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
    public UpdateVpcEndpointServiceResourceAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVpcEndpointServiceResourceAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVpcEndpointServiceResourceAttributeResponseBody body);

        @Override
        UpdateVpcEndpointServiceResourceAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVpcEndpointServiceResourceAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVpcEndpointServiceResourceAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVpcEndpointServiceResourceAttributeResponse response) {
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
        public Builder body(UpdateVpcEndpointServiceResourceAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVpcEndpointServiceResourceAttributeResponse build() {
            return new UpdateVpcEndpointServiceResourceAttributeResponse(this);
        } 

    } 

}
