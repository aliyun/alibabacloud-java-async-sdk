// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveSnapshotDetectPornConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveSnapshotDetectPornConfigResponse</p>
 */
public class DeleteLiveSnapshotDetectPornConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveSnapshotDetectPornConfigResponseBody body;

    private DeleteLiveSnapshotDetectPornConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveSnapshotDetectPornConfigResponse create() {
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
    public DeleteLiveSnapshotDetectPornConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveSnapshotDetectPornConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveSnapshotDetectPornConfigResponseBody body);

        @Override
        DeleteLiveSnapshotDetectPornConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveSnapshotDetectPornConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveSnapshotDetectPornConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveSnapshotDetectPornConfigResponse response) {
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
        public Builder body(DeleteLiveSnapshotDetectPornConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveSnapshotDetectPornConfigResponse build() {
            return new DeleteLiveSnapshotDetectPornConfigResponse(this);
        } 

    } 

}
