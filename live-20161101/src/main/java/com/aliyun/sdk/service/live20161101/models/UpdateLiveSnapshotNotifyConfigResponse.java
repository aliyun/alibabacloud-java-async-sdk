// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveSnapshotNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateLiveSnapshotNotifyConfigResponse</p>
 */
public class UpdateLiveSnapshotNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLiveSnapshotNotifyConfigResponseBody body;

    private UpdateLiveSnapshotNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLiveSnapshotNotifyConfigResponse create() {
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
    public UpdateLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLiveSnapshotNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLiveSnapshotNotifyConfigResponseBody body);

        @Override
        UpdateLiveSnapshotNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLiveSnapshotNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLiveSnapshotNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLiveSnapshotNotifyConfigResponse response) {
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
        public Builder body(UpdateLiveSnapshotNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLiveSnapshotNotifyConfigResponse build() {
            return new UpdateLiveSnapshotNotifyConfigResponse(this);
        } 

    } 

}
