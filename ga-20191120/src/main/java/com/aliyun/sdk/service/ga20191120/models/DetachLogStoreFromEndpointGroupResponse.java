// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachLogStoreFromEndpointGroupResponse} extends {@link TeaModel}
 *
 * <p>DetachLogStoreFromEndpointGroupResponse</p>
 */
public class DetachLogStoreFromEndpointGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachLogStoreFromEndpointGroupResponseBody body;

    private DetachLogStoreFromEndpointGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachLogStoreFromEndpointGroupResponse create() {
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
    public DetachLogStoreFromEndpointGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachLogStoreFromEndpointGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachLogStoreFromEndpointGroupResponseBody body);

        @Override
        DetachLogStoreFromEndpointGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachLogStoreFromEndpointGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachLogStoreFromEndpointGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachLogStoreFromEndpointGroupResponse response) {
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
        public Builder body(DetachLogStoreFromEndpointGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachLogStoreFromEndpointGroupResponse build() {
            return new DetachLogStoreFromEndpointGroupResponse(this);
        } 

    } 

}
