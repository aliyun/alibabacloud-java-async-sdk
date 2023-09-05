// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAccelerateIpEndpointRelationResponse} extends {@link TeaModel}
 *
 * <p>CreateBasicAccelerateIpEndpointRelationResponse</p>
 */
public class CreateBasicAccelerateIpEndpointRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBasicAccelerateIpEndpointRelationResponseBody body;

    private CreateBasicAccelerateIpEndpointRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBasicAccelerateIpEndpointRelationResponse create() {
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
    public CreateBasicAccelerateIpEndpointRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBasicAccelerateIpEndpointRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBasicAccelerateIpEndpointRelationResponseBody body);

        @Override
        CreateBasicAccelerateIpEndpointRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBasicAccelerateIpEndpointRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBasicAccelerateIpEndpointRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBasicAccelerateIpEndpointRelationResponse response) {
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
        public Builder body(CreateBasicAccelerateIpEndpointRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBasicAccelerateIpEndpointRelationResponse build() {
            return new CreateBasicAccelerateIpEndpointRelationResponse(this);
        } 

    } 

}
