// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordFileDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>QueryRecordFileDownloadUrlResponse</p>
 */
public class QueryRecordFileDownloadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRecordFileDownloadUrlResponseBody body;

    private QueryRecordFileDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRecordFileDownloadUrlResponse create() {
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
    public QueryRecordFileDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecordFileDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRecordFileDownloadUrlResponseBody body);

        @Override
        QueryRecordFileDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecordFileDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRecordFileDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecordFileDownloadUrlResponse response) {
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
        public Builder body(QueryRecordFileDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecordFileDownloadUrlResponse build() {
            return new QueryRecordFileDownloadUrlResponse(this);
        } 

    } 

}
