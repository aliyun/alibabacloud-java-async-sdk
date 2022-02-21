// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEndpointGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateEndpointGroupResponse</p>
 */
public class CreateEndpointGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEndpointGroupResponseBody body;

    private CreateEndpointGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEndpointGroupResponse create() {
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
    public CreateEndpointGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEndpointGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEndpointGroupResponseBody body);

        @Override
        CreateEndpointGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEndpointGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEndpointGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEndpointGroupResponse response) {
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
        public Builder body(CreateEndpointGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEndpointGroupResponse build() {
            return new CreateEndpointGroupResponse(this);
        } 

    } 

}
