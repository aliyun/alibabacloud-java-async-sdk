// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushAnalysisCoreIndexResponse} extends {@link TeaModel}
 *
 * <p>QueryPushAnalysisCoreIndexResponse</p>
 */
public class QueryPushAnalysisCoreIndexResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryPushAnalysisCoreIndexResponseBody body;

    private QueryPushAnalysisCoreIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryPushAnalysisCoreIndexResponse create() {
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
    public QueryPushAnalysisCoreIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPushAnalysisCoreIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryPushAnalysisCoreIndexResponseBody body);

        @Override
        QueryPushAnalysisCoreIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPushAnalysisCoreIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryPushAnalysisCoreIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPushAnalysisCoreIndexResponse response) {
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
        public Builder body(QueryPushAnalysisCoreIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPushAnalysisCoreIndexResponse build() {
            return new QueryPushAnalysisCoreIndexResponse(this);
        } 

    } 

}
