// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadRecordingResponse} extends {@link TeaModel}
 *
 * <p>DownloadRecordingResponse</p>
 */
public class DownloadRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DownloadRecordingResponseBody body;

    private DownloadRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DownloadRecordingResponse create() {
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
    public DownloadRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DownloadRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DownloadRecordingResponseBody body);

        @Override
        DownloadRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DownloadRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DownloadRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DownloadRecordingResponse response) {
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
        public Builder body(DownloadRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DownloadRecordingResponse build() {
            return new DownloadRecordingResponse(this);
        } 

    } 

}
