// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteWebHostingFilesResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteWebHostingFilesResponse</p>
 */
public class BatchDeleteWebHostingFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteWebHostingFilesResponseBody body;

    private BatchDeleteWebHostingFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteWebHostingFilesResponse create() {
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
    public BatchDeleteWebHostingFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteWebHostingFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteWebHostingFilesResponseBody body);

        @Override
        BatchDeleteWebHostingFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteWebHostingFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteWebHostingFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteWebHostingFilesResponse response) {
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
        public Builder body(BatchDeleteWebHostingFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteWebHostingFilesResponse build() {
            return new BatchDeleteWebHostingFilesResponse(this);
        } 

    } 

}
