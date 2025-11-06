// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link QueryMessageByMessageIdResponse} extends {@link TeaModel}
 *
 * <p>QueryMessageByMessageIdResponse</p>
 */
public class QueryMessageByMessageIdResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryMessageByMessageIdResponseBody body;

    private QueryMessageByMessageIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryMessageByMessageIdResponse create() {
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
    public QueryMessageByMessageIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMessageByMessageIdResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryMessageByMessageIdResponseBody body);

        @Override
        QueryMessageByMessageIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMessageByMessageIdResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryMessageByMessageIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMessageByMessageIdResponse response) {
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
        public Builder body(QueryMessageByMessageIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMessageByMessageIdResponse build() {
            return new QueryMessageByMessageIdResponse(this);
        } 

    } 

}
