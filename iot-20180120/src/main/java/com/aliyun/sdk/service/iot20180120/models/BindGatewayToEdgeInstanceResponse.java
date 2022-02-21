// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindGatewayToEdgeInstanceResponse} extends {@link TeaModel}
 *
 * <p>BindGatewayToEdgeInstanceResponse</p>
 */
public class BindGatewayToEdgeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindGatewayToEdgeInstanceResponseBody body;

    private BindGatewayToEdgeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindGatewayToEdgeInstanceResponse create() {
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
    public BindGatewayToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindGatewayToEdgeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindGatewayToEdgeInstanceResponseBody body);

        @Override
        BindGatewayToEdgeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindGatewayToEdgeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindGatewayToEdgeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindGatewayToEdgeInstanceResponse response) {
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
        public Builder body(BindGatewayToEdgeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindGatewayToEdgeInstanceResponse build() {
            return new BindGatewayToEdgeInstanceResponse(this);
        } 

    } 

}
