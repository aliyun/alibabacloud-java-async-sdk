// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetASMIntegrationStateResponse} extends {@link TeaModel}
 *
 * <p>GetASMIntegrationStateResponse</p>
 */
public class GetASMIntegrationStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetASMIntegrationStateResponseBody body;

    private GetASMIntegrationStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetASMIntegrationStateResponse create() {
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
    public GetASMIntegrationStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetASMIntegrationStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetASMIntegrationStateResponseBody body);

        @Override
        GetASMIntegrationStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetASMIntegrationStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetASMIntegrationStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetASMIntegrationStateResponse response) {
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
        public Builder body(GetASMIntegrationStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetASMIntegrationStateResponse build() {
            return new GetASMIntegrationStateResponse(this);
        } 

    } 

}
