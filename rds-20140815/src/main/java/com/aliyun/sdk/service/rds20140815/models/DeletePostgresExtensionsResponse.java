// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePostgresExtensionsResponse} extends {@link TeaModel}
 *
 * <p>DeletePostgresExtensionsResponse</p>
 */
public class DeletePostgresExtensionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePostgresExtensionsResponseBody body;

    private DeletePostgresExtensionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePostgresExtensionsResponse create() {
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
    public DeletePostgresExtensionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePostgresExtensionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePostgresExtensionsResponseBody body);

        @Override
        DeletePostgresExtensionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePostgresExtensionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePostgresExtensionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePostgresExtensionsResponse response) {
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
        public Builder body(DeletePostgresExtensionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePostgresExtensionsResponse build() {
            return new DeletePostgresExtensionsResponse(this);
        } 

    } 

}
