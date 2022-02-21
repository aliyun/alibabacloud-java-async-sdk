// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadAllTypeRecordingResponse} extends {@link TeaModel}
 *
 * <p>DownloadAllTypeRecordingResponse</p>
 */
public class DownloadAllTypeRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DownloadAllTypeRecordingResponseBody body;

    private DownloadAllTypeRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DownloadAllTypeRecordingResponse create() {
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
    public DownloadAllTypeRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DownloadAllTypeRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DownloadAllTypeRecordingResponseBody body);

        @Override
        DownloadAllTypeRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DownloadAllTypeRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DownloadAllTypeRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DownloadAllTypeRecordingResponse response) {
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
        public Builder body(DownloadAllTypeRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DownloadAllTypeRecordingResponse build() {
            return new DownloadAllTypeRecordingResponse(this);
        } 

    } 

}
