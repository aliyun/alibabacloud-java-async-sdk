// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMigrationTaskResponse} extends {@link TeaModel}
 *
 * <p>ListMigrationTaskResponse</p>
 */
public class ListMigrationTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMigrationTaskResponseBody body;

    private ListMigrationTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMigrationTaskResponse create() {
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
    public ListMigrationTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMigrationTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMigrationTaskResponseBody body);

        @Override
        ListMigrationTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMigrationTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMigrationTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMigrationTaskResponse response) {
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
        public Builder body(ListMigrationTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMigrationTaskResponse build() {
            return new ListMigrationTaskResponse(this);
        } 

    } 

}
