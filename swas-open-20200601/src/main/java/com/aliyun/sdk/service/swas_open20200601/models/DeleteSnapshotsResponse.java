// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotsResponse} extends {@link TeaModel}
 *
 * <p>DeleteSnapshotsResponse</p>
 */
public class DeleteSnapshotsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSnapshotsResponseBody body;

    private DeleteSnapshotsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSnapshotsResponse create() {
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
    public DeleteSnapshotsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSnapshotsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSnapshotsResponseBody body);

        @Override
        DeleteSnapshotsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSnapshotsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSnapshotsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSnapshotsResponse response) {
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
        public Builder body(DeleteSnapshotsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSnapshotsResponse build() {
            return new DeleteSnapshotsResponse(this);
        } 

    } 

}
