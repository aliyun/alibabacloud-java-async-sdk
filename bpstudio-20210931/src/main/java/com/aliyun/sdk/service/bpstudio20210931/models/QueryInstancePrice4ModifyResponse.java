// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

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
 * {@link QueryInstancePrice4ModifyResponse} extends {@link TeaModel}
 *
 * <p>QueryInstancePrice4ModifyResponse</p>
 */
public class QueryInstancePrice4ModifyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryInstancePrice4ModifyResponseBody body;

    private QueryInstancePrice4ModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryInstancePrice4ModifyResponse create() {
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
    public QueryInstancePrice4ModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInstancePrice4ModifyResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryInstancePrice4ModifyResponseBody body);

        @Override
        QueryInstancePrice4ModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInstancePrice4ModifyResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryInstancePrice4ModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInstancePrice4ModifyResponse response) {
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
        public Builder body(QueryInstancePrice4ModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInstancePrice4ModifyResponse build() {
            return new QueryInstancePrice4ModifyResponse(this);
        } 

    } 

}
