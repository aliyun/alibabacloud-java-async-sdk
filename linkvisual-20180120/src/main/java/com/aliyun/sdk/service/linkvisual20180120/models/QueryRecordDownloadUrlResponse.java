// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>QueryRecordDownloadUrlResponse</p>
 */
public class QueryRecordDownloadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRecordDownloadUrlResponseBody body;

    private QueryRecordDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRecordDownloadUrlResponse create() {
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
    public QueryRecordDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecordDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRecordDownloadUrlResponseBody body);

        @Override
        QueryRecordDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecordDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRecordDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecordDownloadUrlResponse response) {
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
        public Builder body(QueryRecordDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecordDownloadUrlResponse build() {
            return new QueryRecordDownloadUrlResponse(this);
        } 

    } 

}
