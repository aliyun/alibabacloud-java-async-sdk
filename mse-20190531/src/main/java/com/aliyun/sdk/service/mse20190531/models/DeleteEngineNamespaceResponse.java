// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEngineNamespaceResponse} extends {@link TeaModel}
 *
 * <p>DeleteEngineNamespaceResponse</p>
 */
public class DeleteEngineNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEngineNamespaceResponseBody body;

    private DeleteEngineNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEngineNamespaceResponse create() {
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
    public DeleteEngineNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEngineNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEngineNamespaceResponseBody body);

        @Override
        DeleteEngineNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEngineNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEngineNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEngineNamespaceResponse response) {
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
        public Builder body(DeleteEngineNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEngineNamespaceResponse build() {
            return new DeleteEngineNamespaceResponse(this);
        } 

    } 

}
