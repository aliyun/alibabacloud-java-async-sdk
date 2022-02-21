// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicEndpointGroupResponse} extends {@link TeaModel}
 *
 * <p>GetBasicEndpointGroupResponse</p>
 */
public class GetBasicEndpointGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBasicEndpointGroupResponseBody body;

    private GetBasicEndpointGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBasicEndpointGroupResponse create() {
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
    public GetBasicEndpointGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBasicEndpointGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBasicEndpointGroupResponseBody body);

        @Override
        GetBasicEndpointGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBasicEndpointGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBasicEndpointGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBasicEndpointGroupResponse response) {
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
        public Builder body(GetBasicEndpointGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBasicEndpointGroupResponse build() {
            return new GetBasicEndpointGroupResponse(this);
        } 

    } 

}
