// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetCustomResponseCodeRuleResponse} extends {@link TeaModel}
 *
 * <p>GetCustomResponseCodeRuleResponse</p>
 */
public class GetCustomResponseCodeRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetCustomResponseCodeRuleResponseBody body;

    private GetCustomResponseCodeRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetCustomResponseCodeRuleResponse create() {
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
    public GetCustomResponseCodeRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCustomResponseCodeRuleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetCustomResponseCodeRuleResponseBody body);

        @Override
        GetCustomResponseCodeRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCustomResponseCodeRuleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetCustomResponseCodeRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCustomResponseCodeRuleResponse response) {
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
        public Builder body(GetCustomResponseCodeRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCustomResponseCodeRuleResponse build() {
            return new GetCustomResponseCodeRuleResponse(this);
        } 

    } 

}
