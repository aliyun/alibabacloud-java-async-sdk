// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApiGatewayAppStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateApiGatewayAppStatusResponse</p>
 */
public class UpdateApiGatewayAppStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateApiGatewayAppStatusResponseBody body;

    private UpdateApiGatewayAppStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateApiGatewayAppStatusResponse create() {
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
    public UpdateApiGatewayAppStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateApiGatewayAppStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateApiGatewayAppStatusResponseBody body);

        @Override
        UpdateApiGatewayAppStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateApiGatewayAppStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateApiGatewayAppStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateApiGatewayAppStatusResponse response) {
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
        public Builder body(UpdateApiGatewayAppStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateApiGatewayAppStatusResponse build() {
            return new UpdateApiGatewayAppStatusResponse(this);
        } 

    } 

}
