// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEndpointGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateEndpointGroupResponse</p>
 */
public class UpdateEndpointGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEndpointGroupResponseBody body;

    private UpdateEndpointGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEndpointGroupResponse create() {
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
    public UpdateEndpointGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEndpointGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEndpointGroupResponseBody body);

        @Override
        UpdateEndpointGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEndpointGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEndpointGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEndpointGroupResponse response) {
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
        public Builder body(UpdateEndpointGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEndpointGroupResponse build() {
            return new UpdateEndpointGroupResponse(this);
        } 

    } 

}
