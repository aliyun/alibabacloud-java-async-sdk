// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAccelerateIpEndpointRelationsResponse} extends {@link TeaModel}
 *
 * <p>CreateBasicAccelerateIpEndpointRelationsResponse</p>
 */
public class CreateBasicAccelerateIpEndpointRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBasicAccelerateIpEndpointRelationsResponseBody body;

    private CreateBasicAccelerateIpEndpointRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBasicAccelerateIpEndpointRelationsResponse create() {
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
    public CreateBasicAccelerateIpEndpointRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBasicAccelerateIpEndpointRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBasicAccelerateIpEndpointRelationsResponseBody body);

        @Override
        CreateBasicAccelerateIpEndpointRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBasicAccelerateIpEndpointRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBasicAccelerateIpEndpointRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBasicAccelerateIpEndpointRelationsResponse response) {
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
        public Builder body(CreateBasicAccelerateIpEndpointRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBasicAccelerateIpEndpointRelationsResponse build() {
            return new CreateBasicAccelerateIpEndpointRelationsResponse(this);
        } 

    } 

}
