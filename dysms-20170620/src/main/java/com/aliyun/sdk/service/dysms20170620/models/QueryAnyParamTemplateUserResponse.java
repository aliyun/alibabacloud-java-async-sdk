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
 * {@link QueryAnyParamTemplateUserResponse} extends {@link TeaModel}
 *
 * <p>QueryAnyParamTemplateUserResponse</p>
 */
public class QueryAnyParamTemplateUserResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private QueryAnyParamTemplateUserResponseBody body;

    private QueryAnyParamTemplateUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static QueryAnyParamTemplateUserResponse create() {
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
    public QueryAnyParamTemplateUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAnyParamTemplateUserResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(QueryAnyParamTemplateUserResponseBody body);

        @Override
        QueryAnyParamTemplateUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAnyParamTemplateUserResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private QueryAnyParamTemplateUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAnyParamTemplateUserResponse response) {
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
        public Builder body(QueryAnyParamTemplateUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAnyParamTemplateUserResponse build() {
            return new QueryAnyParamTemplateUserResponse(this);
        } 

    } 

}
