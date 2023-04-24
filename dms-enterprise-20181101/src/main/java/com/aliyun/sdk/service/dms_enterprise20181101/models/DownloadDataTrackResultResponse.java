// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadDataTrackResultResponse} extends {@link TeaModel}
 *
 * <p>DownloadDataTrackResultResponse</p>
 */
public class DownloadDataTrackResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DownloadDataTrackResultResponseBody body;

    private DownloadDataTrackResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DownloadDataTrackResultResponse create() {
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
    public DownloadDataTrackResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DownloadDataTrackResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DownloadDataTrackResultResponseBody body);

        @Override
        DownloadDataTrackResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DownloadDataTrackResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DownloadDataTrackResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DownloadDataTrackResultResponse response) {
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
        public Builder body(DownloadDataTrackResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DownloadDataTrackResultResponse build() {
            return new DownloadDataTrackResultResponse(this);
        } 

    } 

}
