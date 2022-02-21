// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationStateResponse} extends {@link TeaModel}
 *
 * <p>GetIntegrationStateResponse</p>
 */
public class GetIntegrationStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIntegrationStateResponseBody body;

    private GetIntegrationStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIntegrationStateResponse create() {
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
    public GetIntegrationStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIntegrationStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIntegrationStateResponseBody body);

        @Override
        GetIntegrationStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIntegrationStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIntegrationStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIntegrationStateResponse response) {
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
        public Builder body(GetIntegrationStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIntegrationStateResponse build() {
            return new GetIntegrationStateResponse(this);
        } 

    } 

}
