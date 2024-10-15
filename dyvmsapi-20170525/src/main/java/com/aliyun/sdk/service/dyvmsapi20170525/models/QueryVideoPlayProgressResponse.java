// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryVideoPlayProgressResponse} extends {@link TeaModel}
 *
 * <p>QueryVideoPlayProgressResponse</p>
 */
public class QueryVideoPlayProgressResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryVideoPlayProgressResponseBody body;

    private QueryVideoPlayProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryVideoPlayProgressResponse create() {
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
    public QueryVideoPlayProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryVideoPlayProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryVideoPlayProgressResponseBody body);

        @Override
        QueryVideoPlayProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryVideoPlayProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryVideoPlayProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryVideoPlayProgressResponse response) {
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
        public Builder body(QueryVideoPlayProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryVideoPlayProgressResponse build() {
            return new QueryVideoPlayProgressResponse(this);
        } 

    } 

}
