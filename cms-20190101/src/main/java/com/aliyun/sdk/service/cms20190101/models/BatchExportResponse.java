// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchExportResponse} extends {@link TeaModel}
 *
 * <p>BatchExportResponse</p>
 */
public class BatchExportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchExportResponseBody body;

    private BatchExportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchExportResponse create() {
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
    public BatchExportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchExportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchExportResponseBody body);

        @Override
        BatchExportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchExportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchExportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchExportResponse response) {
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
        public Builder body(BatchExportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchExportResponse build() {
            return new BatchExportResponse(this);
        } 

    } 

}
