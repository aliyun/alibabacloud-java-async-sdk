// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteASMIntegrationResponse} extends {@link TeaModel}
 *
 * <p>DeleteASMIntegrationResponse</p>
 */
public class DeleteASMIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteASMIntegrationResponseBody body;

    private DeleteASMIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteASMIntegrationResponse create() {
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
    public DeleteASMIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteASMIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteASMIntegrationResponseBody body);

        @Override
        DeleteASMIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteASMIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteASMIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteASMIntegrationResponse response) {
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
        public Builder body(DeleteASMIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteASMIntegrationResponse build() {
            return new DeleteASMIntegrationResponse(this);
        } 

    } 

}
