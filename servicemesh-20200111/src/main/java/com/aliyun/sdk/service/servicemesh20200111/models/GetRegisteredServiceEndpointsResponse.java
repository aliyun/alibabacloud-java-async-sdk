// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegisteredServiceEndpointsResponse} extends {@link TeaModel}
 *
 * <p>GetRegisteredServiceEndpointsResponse</p>
 */
public class GetRegisteredServiceEndpointsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRegisteredServiceEndpointsResponseBody body;

    private GetRegisteredServiceEndpointsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRegisteredServiceEndpointsResponse create() {
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
    public GetRegisteredServiceEndpointsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRegisteredServiceEndpointsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRegisteredServiceEndpointsResponseBody body);

        @Override
        GetRegisteredServiceEndpointsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRegisteredServiceEndpointsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRegisteredServiceEndpointsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRegisteredServiceEndpointsResponse response) {
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
        public Builder body(GetRegisteredServiceEndpointsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRegisteredServiceEndpointsResponse build() {
            return new GetRegisteredServiceEndpointsResponse(this);
        } 

    } 

}
