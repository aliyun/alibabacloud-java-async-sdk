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
 * {@link GetHttpResponseHeaderModificationRuleResponse} extends {@link TeaModel}
 *
 * <p>GetHttpResponseHeaderModificationRuleResponse</p>
 */
public class GetHttpResponseHeaderModificationRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetHttpResponseHeaderModificationRuleResponseBody body;

    private GetHttpResponseHeaderModificationRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetHttpResponseHeaderModificationRuleResponse create() {
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
    public GetHttpResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHttpResponseHeaderModificationRuleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetHttpResponseHeaderModificationRuleResponseBody body);

        @Override
        GetHttpResponseHeaderModificationRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHttpResponseHeaderModificationRuleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetHttpResponseHeaderModificationRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHttpResponseHeaderModificationRuleResponse response) {
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
        public Builder body(GetHttpResponseHeaderModificationRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHttpResponseHeaderModificationRuleResponse build() {
            return new GetHttpResponseHeaderModificationRuleResponse(this);
        } 

    } 

}
