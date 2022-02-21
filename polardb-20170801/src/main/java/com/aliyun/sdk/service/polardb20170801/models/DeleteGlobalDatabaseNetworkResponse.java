// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGlobalDatabaseNetworkResponse} extends {@link TeaModel}
 *
 * <p>DeleteGlobalDatabaseNetworkResponse</p>
 */
public class DeleteGlobalDatabaseNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGlobalDatabaseNetworkResponseBody body;

    private DeleteGlobalDatabaseNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGlobalDatabaseNetworkResponse create() {
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
    public DeleteGlobalDatabaseNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGlobalDatabaseNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGlobalDatabaseNetworkResponseBody body);

        @Override
        DeleteGlobalDatabaseNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGlobalDatabaseNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGlobalDatabaseNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGlobalDatabaseNetworkResponse response) {
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
        public Builder body(DeleteGlobalDatabaseNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGlobalDatabaseNetworkResponse build() {
            return new DeleteGlobalDatabaseNetworkResponse(this);
        } 

    } 

}
