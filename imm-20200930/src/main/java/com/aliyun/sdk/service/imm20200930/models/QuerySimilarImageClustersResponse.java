// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySimilarImageClustersResponse} extends {@link TeaModel}
 *
 * <p>QuerySimilarImageClustersResponse</p>
 */
public class QuerySimilarImageClustersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QuerySimilarImageClustersResponseBody body;

    private QuerySimilarImageClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QuerySimilarImageClustersResponse create() {
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
    public QuerySimilarImageClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySimilarImageClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QuerySimilarImageClustersResponseBody body);

        @Override
        QuerySimilarImageClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySimilarImageClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QuerySimilarImageClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySimilarImageClustersResponse response) {
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
        public Builder body(QuerySimilarImageClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySimilarImageClustersResponse build() {
            return new QuerySimilarImageClustersResponse(this);
        } 

    } 

}
