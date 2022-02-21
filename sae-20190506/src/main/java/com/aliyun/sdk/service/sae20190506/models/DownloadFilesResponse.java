// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadFilesResponse} extends {@link TeaModel}
 *
 * <p>DownloadFilesResponse</p>
 */
public class DownloadFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DownloadFilesResponseBody body;

    private DownloadFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DownloadFilesResponse create() {
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
    public DownloadFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DownloadFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DownloadFilesResponseBody body);

        @Override
        DownloadFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DownloadFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DownloadFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DownloadFilesResponse response) {
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
        public Builder body(DownloadFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DownloadFilesResponse build() {
            return new DownloadFilesResponse(this);
        } 

    } 

}
