// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveSnapshotDetectPornConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeLiveSnapshotDetectPornConfigResponse</p>
 */
public class DescribeLiveSnapshotDetectPornConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLiveSnapshotDetectPornConfigResponseBody body;

    private DescribeLiveSnapshotDetectPornConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLiveSnapshotDetectPornConfigResponse create() {
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
    public DescribeLiveSnapshotDetectPornConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLiveSnapshotDetectPornConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLiveSnapshotDetectPornConfigResponseBody body);

        @Override
        DescribeLiveSnapshotDetectPornConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLiveSnapshotDetectPornConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLiveSnapshotDetectPornConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLiveSnapshotDetectPornConfigResponse response) {
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
        public Builder body(DescribeLiveSnapshotDetectPornConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLiveSnapshotDetectPornConfigResponse build() {
            return new DescribeLiveSnapshotDetectPornConfigResponse(this);
        } 

    } 

}
