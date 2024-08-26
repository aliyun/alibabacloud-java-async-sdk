// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTransferOutInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryTransferOutInfoResponse</p>
 */
public class QueryTransferOutInfoResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryTransferOutInfoResponseBody body;

    private QueryTransferOutInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryTransferOutInfoResponse create() {
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
    public QueryTransferOutInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTransferOutInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryTransferOutInfoResponseBody body);

        @Override
        QueryTransferOutInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTransferOutInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryTransferOutInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTransferOutInfoResponse response) {
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
        public Builder body(QueryTransferOutInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTransferOutInfoResponse build() {
            return new QueryTransferOutInfoResponse(this);
        } 

    } 

}
