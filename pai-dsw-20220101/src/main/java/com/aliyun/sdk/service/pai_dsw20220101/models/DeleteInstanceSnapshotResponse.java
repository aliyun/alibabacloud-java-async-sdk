// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceSnapshotResponse} extends {@link TeaModel}
 *
 * <p>DeleteInstanceSnapshotResponse</p>
 */
public class DeleteInstanceSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInstanceSnapshotResponseBody body;

    private DeleteInstanceSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInstanceSnapshotResponse create() {
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
    public DeleteInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInstanceSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInstanceSnapshotResponseBody body);

        @Override
        DeleteInstanceSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInstanceSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInstanceSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInstanceSnapshotResponse response) {
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
        public Builder body(DeleteInstanceSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInstanceSnapshotResponse build() {
            return new DeleteInstanceSnapshotResponse(this);
        } 

    } 

}
