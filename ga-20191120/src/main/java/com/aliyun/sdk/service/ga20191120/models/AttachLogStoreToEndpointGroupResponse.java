// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachLogStoreToEndpointGroupResponse} extends {@link TeaModel}
 *
 * <p>AttachLogStoreToEndpointGroupResponse</p>
 */
public class AttachLogStoreToEndpointGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachLogStoreToEndpointGroupResponseBody body;

    private AttachLogStoreToEndpointGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachLogStoreToEndpointGroupResponse create() {
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
    public AttachLogStoreToEndpointGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachLogStoreToEndpointGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachLogStoreToEndpointGroupResponseBody body);

        @Override
        AttachLogStoreToEndpointGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachLogStoreToEndpointGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachLogStoreToEndpointGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachLogStoreToEndpointGroupResponse response) {
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
        public Builder body(AttachLogStoreToEndpointGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachLogStoreToEndpointGroupResponse build() {
            return new AttachLogStoreToEndpointGroupResponse(this);
        } 

    } 

}
