// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEndpointGroupsResponse} extends {@link TeaModel}
 *
 * <p>UpdateEndpointGroupsResponse</p>
 */
public class UpdateEndpointGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEndpointGroupsResponseBody body;

    private UpdateEndpointGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEndpointGroupsResponse create() {
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
    public UpdateEndpointGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEndpointGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEndpointGroupsResponseBody body);

        @Override
        UpdateEndpointGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEndpointGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEndpointGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEndpointGroupsResponse response) {
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
        public Builder body(UpdateEndpointGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEndpointGroupsResponse build() {
            return new UpdateEndpointGroupsResponse(this);
        } 

    } 

}
