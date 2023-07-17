// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationTokenResponse} extends {@link TeaModel}
 *
 * <p>GetIntegrationTokenResponse</p>
 */
public class GetIntegrationTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIntegrationTokenResponseBody body;

    private GetIntegrationTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIntegrationTokenResponse create() {
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
    public GetIntegrationTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIntegrationTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIntegrationTokenResponseBody body);

        @Override
        GetIntegrationTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIntegrationTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIntegrationTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIntegrationTokenResponse response) {
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
        public Builder body(GetIntegrationTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIntegrationTokenResponse build() {
            return new GetIntegrationTokenResponse(this);
        } 

    } 

}
