// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatabasesResponse} extends {@link TeaModel}
 *
 * <p>DeleteDatabasesResponse</p>
 */
public class DeleteDatabasesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDatabasesResponseBody body;

    private DeleteDatabasesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDatabasesResponse create() {
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
    public DeleteDatabasesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDatabasesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDatabasesResponseBody body);

        @Override
        DeleteDatabasesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDatabasesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDatabasesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDatabasesResponse response) {
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
        public Builder body(DeleteDatabasesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDatabasesResponse build() {
            return new DeleteDatabasesResponse(this);
        } 

    } 

}
