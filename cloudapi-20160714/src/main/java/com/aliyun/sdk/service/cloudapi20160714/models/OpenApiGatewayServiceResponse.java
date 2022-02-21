// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiGatewayServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenApiGatewayServiceResponse</p>
 */
public class OpenApiGatewayServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenApiGatewayServiceResponseBody body;

    private OpenApiGatewayServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenApiGatewayServiceResponse create() {
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
    public OpenApiGatewayServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenApiGatewayServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenApiGatewayServiceResponseBody body);

        @Override
        OpenApiGatewayServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiGatewayServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenApiGatewayServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiGatewayServiceResponse response) {
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
        public Builder body(OpenApiGatewayServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenApiGatewayServiceResponse build() {
            return new OpenApiGatewayServiceResponse(this);
        } 

    } 

}
