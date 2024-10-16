// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryTraceM3u8JobResponse} extends {@link TeaModel}
 *
 * <p>QueryTraceM3u8JobResponse</p>
 */
public class QueryTraceM3u8JobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryTraceM3u8JobResponseBody body;

    private QueryTraceM3u8JobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryTraceM3u8JobResponse create() {
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
    public QueryTraceM3u8JobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTraceM3u8JobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryTraceM3u8JobResponseBody body);

        @Override
        QueryTraceM3u8JobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTraceM3u8JobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryTraceM3u8JobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTraceM3u8JobResponse response) {
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
        public Builder body(QueryTraceM3u8JobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTraceM3u8JobResponse build() {
            return new QueryTraceM3u8JobResponse(this);
        } 

    } 

}
