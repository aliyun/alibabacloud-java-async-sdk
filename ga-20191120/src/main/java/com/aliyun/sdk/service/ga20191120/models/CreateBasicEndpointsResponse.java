// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicEndpointsResponse} extends {@link TeaModel}
 *
 * <p>CreateBasicEndpointsResponse</p>
 */
public class CreateBasicEndpointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBasicEndpointsResponseBody body;

    private CreateBasicEndpointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBasicEndpointsResponse create() {
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
    public CreateBasicEndpointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBasicEndpointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBasicEndpointsResponseBody body);

        @Override
        CreateBasicEndpointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBasicEndpointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBasicEndpointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBasicEndpointsResponse response) {
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
        public Builder body(CreateBasicEndpointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBasicEndpointsResponse build() {
            return new CreateBasicEndpointsResponse(this);
        } 

    } 

}
