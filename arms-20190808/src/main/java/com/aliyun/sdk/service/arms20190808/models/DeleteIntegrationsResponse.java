// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIntegrationsResponse} extends {@link TeaModel}
 *
 * <p>DeleteIntegrationsResponse</p>
 */
public class DeleteIntegrationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIntegrationsResponseBody body;

    private DeleteIntegrationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIntegrationsResponse create() {
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
    public DeleteIntegrationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIntegrationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIntegrationsResponseBody body);

        @Override
        DeleteIntegrationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIntegrationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIntegrationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIntegrationsResponse response) {
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
        public Builder body(DeleteIntegrationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIntegrationsResponse build() {
            return new DeleteIntegrationsResponse(this);
        } 

    } 

}
