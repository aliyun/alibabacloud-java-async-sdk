// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventBridgeIntegrationResponse} extends {@link TeaModel}
 *
 * <p>DeleteEventBridgeIntegrationResponse</p>
 */
public class DeleteEventBridgeIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEventBridgeIntegrationResponseBody body;

    private DeleteEventBridgeIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEventBridgeIntegrationResponse create() {
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
    public DeleteEventBridgeIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEventBridgeIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEventBridgeIntegrationResponseBody body);

        @Override
        DeleteEventBridgeIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEventBridgeIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEventBridgeIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEventBridgeIntegrationResponse response) {
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
        public Builder body(DeleteEventBridgeIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventBridgeIntegrationResponse build() {
            return new DeleteEventBridgeIntegrationResponse(this);
        } 

    } 

}
