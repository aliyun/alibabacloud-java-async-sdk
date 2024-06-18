// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMinutesSummaryResponse} extends {@link TeaModel}
 *
 * <p>QueryMinutesSummaryResponse</p>
 */
public class QueryMinutesSummaryResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryMinutesSummaryResponseBody body;

    private QueryMinutesSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryMinutesSummaryResponse create() {
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
    public QueryMinutesSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMinutesSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryMinutesSummaryResponseBody body);

        @Override
        QueryMinutesSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMinutesSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private QueryMinutesSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMinutesSummaryResponse response) {
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
        public Builder body(QueryMinutesSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMinutesSummaryResponse build() {
            return new QueryMinutesSummaryResponse(this);
        } 

    } 

}
