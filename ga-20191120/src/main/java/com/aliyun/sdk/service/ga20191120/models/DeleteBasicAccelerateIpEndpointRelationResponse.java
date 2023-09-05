// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicAccelerateIpEndpointRelationResponse} extends {@link TeaModel}
 *
 * <p>DeleteBasicAccelerateIpEndpointRelationResponse</p>
 */
public class DeleteBasicAccelerateIpEndpointRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBasicAccelerateIpEndpointRelationResponseBody body;

    private DeleteBasicAccelerateIpEndpointRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBasicAccelerateIpEndpointRelationResponse create() {
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
    public DeleteBasicAccelerateIpEndpointRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBasicAccelerateIpEndpointRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBasicAccelerateIpEndpointRelationResponseBody body);

        @Override
        DeleteBasicAccelerateIpEndpointRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBasicAccelerateIpEndpointRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBasicAccelerateIpEndpointRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBasicAccelerateIpEndpointRelationResponse response) {
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
        public Builder body(DeleteBasicAccelerateIpEndpointRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBasicAccelerateIpEndpointRelationResponse build() {
            return new DeleteBasicAccelerateIpEndpointRelationResponse(this);
        } 

    } 

}
