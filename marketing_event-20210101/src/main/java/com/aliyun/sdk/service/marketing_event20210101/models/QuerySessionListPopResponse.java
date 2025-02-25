// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySessionListPopResponse} extends {@link TeaModel}
 *
 * <p>QuerySessionListPopResponse</p>
 */
public class QuerySessionListPopResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QuerySessionListPopResponseBody body;

    private QuerySessionListPopResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QuerySessionListPopResponse create() {
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
    public QuerySessionListPopResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySessionListPopResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QuerySessionListPopResponseBody body);

        @Override
        QuerySessionListPopResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySessionListPopResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QuerySessionListPopResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySessionListPopResponse response) {
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
        public Builder body(QuerySessionListPopResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySessionListPopResponse build() {
            return new QuerySessionListPopResponse(this);
        } 

    } 

}
