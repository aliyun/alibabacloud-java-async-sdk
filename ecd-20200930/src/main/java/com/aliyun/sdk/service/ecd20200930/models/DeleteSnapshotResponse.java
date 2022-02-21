// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotResponse} extends {@link TeaModel}
 *
 * <p>DeleteSnapshotResponse</p>
 */
public class DeleteSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSnapshotResponseBody body;

    private DeleteSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSnapshotResponse create() {
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
    public DeleteSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSnapshotResponseBody body);

        @Override
        DeleteSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSnapshotResponse response) {
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
        public Builder body(DeleteSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSnapshotResponse build() {
            return new DeleteSnapshotResponse(this);
        } 

    } 

}
