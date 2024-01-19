// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChannelItemBillDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>QueryChannelItemBillDownloadUrlResponse</p>
 */
public class QueryChannelItemBillDownloadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private QueryChannelItemBillDownloadUrlResponseBody body;

    private QueryChannelItemBillDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryChannelItemBillDownloadUrlResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public QueryChannelItemBillDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryChannelItemBillDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryChannelItemBillDownloadUrlResponseBody body);

        @Override
        QueryChannelItemBillDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryChannelItemBillDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryChannelItemBillDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryChannelItemBillDownloadUrlResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(QueryChannelItemBillDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryChannelItemBillDownloadUrlResponse build() {
            return new QueryChannelItemBillDownloadUrlResponse(this);
        } 

    } 

}
