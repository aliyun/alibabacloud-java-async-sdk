// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatabaseResponse} extends {@link TeaModel}
 *
 * <p>DeleteDatabaseResponse</p>
 */
public class DeleteDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDatabaseResponseBody body;

    private DeleteDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDatabaseResponse create() {
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
    public DeleteDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDatabaseResponseBody body);

        @Override
        DeleteDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDatabaseResponse response) {
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
        public Builder body(DeleteDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDatabaseResponse build() {
            return new DeleteDatabaseResponse(this);
        } 

    } 

}
