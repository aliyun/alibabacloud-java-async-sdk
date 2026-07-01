// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QueryRCSMobileCapableResponse} extends {@link TeaModel}
 *
 * <p>QueryRCSMobileCapableResponse</p>
 */
public class QueryRCSMobileCapableResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryRCSMobileCapableResponseBody body;

    private QueryRCSMobileCapableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryRCSMobileCapableResponse create() {
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
    public QueryRCSMobileCapableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRCSMobileCapableResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryRCSMobileCapableResponseBody body);

        @Override
        QueryRCSMobileCapableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRCSMobileCapableResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryRCSMobileCapableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRCSMobileCapableResponse response) {
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
        public Builder body(QueryRCSMobileCapableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRCSMobileCapableResponse build() {
            return new QueryRCSMobileCapableResponse(this);
        } 

    } 

}
