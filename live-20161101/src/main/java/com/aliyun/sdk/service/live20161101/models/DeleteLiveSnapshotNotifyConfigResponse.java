// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveSnapshotNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveSnapshotNotifyConfigResponse</p>
 */
public class DeleteLiveSnapshotNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveSnapshotNotifyConfigResponseBody body;

    private DeleteLiveSnapshotNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveSnapshotNotifyConfigResponse create() {
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
    public DeleteLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveSnapshotNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveSnapshotNotifyConfigResponseBody body);

        @Override
        DeleteLiveSnapshotNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveSnapshotNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveSnapshotNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveSnapshotNotifyConfigResponse response) {
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
        public Builder body(DeleteLiveSnapshotNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveSnapshotNotifyConfigResponse build() {
            return new DeleteLiveSnapshotNotifyConfigResponse(this);
        } 

    } 

}
