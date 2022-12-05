// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveSnapshotNotifyConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotNotifyConfigResponse</p>
 */
public class DescribeLiveSnapshotNotifyConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveSnapshotNotifyConfigResponseBody body;

    private DescribeLiveSnapshotNotifyConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveSnapshotNotifyConfigResponse create() {
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
    public DescribeLiveSnapshotNotifyConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveSnapshotNotifyConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveSnapshotNotifyConfigResponseBody body);

        @Override
        DescribeLiveSnapshotNotifyConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveSnapshotNotifyConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveSnapshotNotifyConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveSnapshotNotifyConfigResponse response) {
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
        public Builder body(DescribeLiveSnapshotNotifyConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveSnapshotNotifyConfigResponse build() {
            return new DescribeLiveSnapshotNotifyConfigResponse(this);
        } 

    } 

}
