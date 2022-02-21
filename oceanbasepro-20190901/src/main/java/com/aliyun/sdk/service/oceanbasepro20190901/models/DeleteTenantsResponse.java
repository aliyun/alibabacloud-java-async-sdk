// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTenantsResponse} extends {@link TeaModel}
 *
 * <p>DeleteTenantsResponse</p>
 */
public class DeleteTenantsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTenantsResponseBody body;

    private DeleteTenantsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTenantsResponse create() {
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
    public DeleteTenantsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTenantsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTenantsResponseBody body);

        @Override
        DeleteTenantsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTenantsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTenantsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTenantsResponse response) {
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
        public Builder body(DeleteTenantsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTenantsResponse build() {
            return new DeleteTenantsResponse(this);
        } 

    } 

}
