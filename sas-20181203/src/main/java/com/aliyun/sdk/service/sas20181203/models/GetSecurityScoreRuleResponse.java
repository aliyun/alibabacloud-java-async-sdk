// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetSecurityScoreRuleResponse} extends {@link TeaModel}
 *
 * <p>GetSecurityScoreRuleResponse</p>
 */
public class GetSecurityScoreRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetSecurityScoreRuleResponseBody body;

    private GetSecurityScoreRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetSecurityScoreRuleResponse create() {
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
    public GetSecurityScoreRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecurityScoreRuleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetSecurityScoreRuleResponseBody body);

        @Override
        GetSecurityScoreRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecurityScoreRuleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetSecurityScoreRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecurityScoreRuleResponse response) {
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
        public Builder body(GetSecurityScoreRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecurityScoreRuleResponse build() {
            return new GetSecurityScoreRuleResponse(this);
        } 

    } 

}
