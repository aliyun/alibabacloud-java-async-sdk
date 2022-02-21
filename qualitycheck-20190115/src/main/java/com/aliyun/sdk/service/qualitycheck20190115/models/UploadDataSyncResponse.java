// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadDataSyncResponse} extends {@link TeaModel}
 *
 * <p>UploadDataSyncResponse</p>
 */
public class UploadDataSyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadDataSyncResponseBody body;

    private UploadDataSyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadDataSyncResponse create() {
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
    public UploadDataSyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadDataSyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadDataSyncResponseBody body);

        @Override
        UploadDataSyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadDataSyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadDataSyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadDataSyncResponse response) {
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
        public Builder body(UploadDataSyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadDataSyncResponse build() {
            return new UploadDataSyncResponse(this);
        } 

    } 

}
