// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link QueryTrafficControlTaskDeployResultResponse} extends {@link TeaModel}
 *
 * <p>QueryTrafficControlTaskDeployResultResponse</p>
 */
public class QueryTrafficControlTaskDeployResultResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryTrafficControlTaskDeployResultResponseBody body;

    private QueryTrafficControlTaskDeployResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryTrafficControlTaskDeployResultResponse create() {
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
    public QueryTrafficControlTaskDeployResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTrafficControlTaskDeployResultResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryTrafficControlTaskDeployResultResponseBody body);

        @Override
        QueryTrafficControlTaskDeployResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTrafficControlTaskDeployResultResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryTrafficControlTaskDeployResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTrafficControlTaskDeployResultResponse response) {
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
        public Builder body(QueryTrafficControlTaskDeployResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTrafficControlTaskDeployResultResponse build() {
            return new QueryTrafficControlTaskDeployResultResponse(this);
        } 

    } 

}
