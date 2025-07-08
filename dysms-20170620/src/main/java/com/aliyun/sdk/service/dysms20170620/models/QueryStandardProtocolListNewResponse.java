// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryStandardProtocolListNewResponse} extends {@link TeaModel}
 *
 * <p>QueryStandardProtocolListNewResponse</p>
 */
public class QueryStandardProtocolListNewResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryStandardProtocolListNewResponseBody body;

    private QueryStandardProtocolListNewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryStandardProtocolListNewResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public QueryStandardProtocolListNewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryStandardProtocolListNewResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryStandardProtocolListNewResponseBody body);

        @Override
        QueryStandardProtocolListNewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryStandardProtocolListNewResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryStandardProtocolListNewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryStandardProtocolListNewResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(QueryStandardProtocolListNewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryStandardProtocolListNewResponse build() {
            return new QueryStandardProtocolListNewResponse(this);
        } 

    } 

}
