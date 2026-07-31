// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link QuerySelectOptionsResponse} extends {@link TeaModel}
 *
 * <p>QuerySelectOptionsResponse</p>
 */
public class QuerySelectOptionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QuerySelectOptionsResponseBody body;

    private QuerySelectOptionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QuerySelectOptionsResponse create() {
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
    public QuerySelectOptionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySelectOptionsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QuerySelectOptionsResponseBody body);

        @Override
        QuerySelectOptionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySelectOptionsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QuerySelectOptionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySelectOptionsResponse response) {
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
        public Builder body(QuerySelectOptionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySelectOptionsResponse build() {
            return new QuerySelectOptionsResponse(this);
        } 

    } 

}
