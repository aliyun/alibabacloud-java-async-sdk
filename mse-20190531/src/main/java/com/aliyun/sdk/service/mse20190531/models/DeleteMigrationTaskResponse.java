// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMigrationTaskResponse} extends {@link TeaModel}
 *
 * <p>DeleteMigrationTaskResponse</p>
 */
public class DeleteMigrationTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMigrationTaskResponseBody body;

    private DeleteMigrationTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMigrationTaskResponse create() {
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
    public DeleteMigrationTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMigrationTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMigrationTaskResponseBody body);

        @Override
        DeleteMigrationTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMigrationTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMigrationTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMigrationTaskResponse response) {
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
        public Builder body(DeleteMigrationTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMigrationTaskResponse build() {
            return new DeleteMigrationTaskResponse(this);
        } 

    } 

}
