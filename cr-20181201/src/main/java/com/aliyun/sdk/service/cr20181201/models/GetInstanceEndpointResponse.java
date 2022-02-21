// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceEndpointResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceEndpointResponse</p>
 */
public class GetInstanceEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceEndpointResponseBody body;

    private GetInstanceEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceEndpointResponse create() {
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
    public GetInstanceEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceEndpointResponseBody body);

        @Override
        GetInstanceEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceEndpointResponse response) {
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
        public Builder body(GetInstanceEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceEndpointResponse build() {
            return new GetInstanceEndpointResponse(this);
        } 

    } 

}
