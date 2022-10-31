// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotFilesResponse} extends {@link TeaModel}
 *
 * <p>DeleteSnapshotFilesResponse</p>
 */
public class DeleteSnapshotFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSnapshotFilesResponseBody body;

    private DeleteSnapshotFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSnapshotFilesResponse create() {
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
    public DeleteSnapshotFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSnapshotFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSnapshotFilesResponseBody body);

        @Override
        DeleteSnapshotFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSnapshotFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSnapshotFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSnapshotFilesResponse response) {
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
        public Builder body(DeleteSnapshotFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSnapshotFilesResponse build() {
            return new DeleteSnapshotFilesResponse(this);
        } 

    } 

}
