// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceEdgeInstanceGatewayResponse} extends {@link TeaModel}
 *
 * <p>ReplaceEdgeInstanceGatewayResponse</p>
 */
public class ReplaceEdgeInstanceGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReplaceEdgeInstanceGatewayResponseBody body;

    private ReplaceEdgeInstanceGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReplaceEdgeInstanceGatewayResponse create() {
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
    public ReplaceEdgeInstanceGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplaceEdgeInstanceGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReplaceEdgeInstanceGatewayResponseBody body);

        @Override
        ReplaceEdgeInstanceGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplaceEdgeInstanceGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReplaceEdgeInstanceGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplaceEdgeInstanceGatewayResponse response) {
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
        public Builder body(ReplaceEdgeInstanceGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplaceEdgeInstanceGatewayResponse build() {
            return new ReplaceEdgeInstanceGatewayResponse(this);
        } 

    } 

}
