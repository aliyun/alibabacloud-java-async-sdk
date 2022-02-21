// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIntegrationResponse} extends {@link TeaModel}
 *
 * <p>DeleteIntegrationResponse</p>
 */
public class DeleteIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIntegrationResponseBody body;

    private DeleteIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIntegrationResponse create() {
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
    public DeleteIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIntegrationResponseBody body);

        @Override
        DeleteIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIntegrationResponse response) {
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
        public Builder body(DeleteIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIntegrationResponse build() {
            return new DeleteIntegrationResponse(this);
        } 

    } 

}
