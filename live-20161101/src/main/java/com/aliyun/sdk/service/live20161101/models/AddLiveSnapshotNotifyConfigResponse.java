// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveSnapshotNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>AddLiveSnapshotNotifyConfigResponse</p>
 */
public class AddLiveSnapshotNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveSnapshotNotifyConfigResponseBody body;

    private AddLiveSnapshotNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveSnapshotNotifyConfigResponse create() {
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
    public AddLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveSnapshotNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveSnapshotNotifyConfigResponseBody body);

        @Override
        AddLiveSnapshotNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveSnapshotNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveSnapshotNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveSnapshotNotifyConfigResponse response) {
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
        public Builder body(AddLiveSnapshotNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveSnapshotNotifyConfigResponse build() {
            return new AddLiveSnapshotNotifyConfigResponse(this);
        } 

    } 

}
