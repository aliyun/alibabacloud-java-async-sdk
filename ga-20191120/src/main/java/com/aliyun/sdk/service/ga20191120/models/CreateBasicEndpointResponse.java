// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicEndpointResponse} extends {@link TeaModel}
 *
 * <p>CreateBasicEndpointResponse</p>
 */
public class CreateBasicEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBasicEndpointResponseBody body;

    private CreateBasicEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBasicEndpointResponse create() {
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
    public CreateBasicEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBasicEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBasicEndpointResponseBody body);

        @Override
        CreateBasicEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBasicEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBasicEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBasicEndpointResponse response) {
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
        public Builder body(CreateBasicEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBasicEndpointResponse build() {
            return new CreateBasicEndpointResponse(this);
        } 

    } 

}
