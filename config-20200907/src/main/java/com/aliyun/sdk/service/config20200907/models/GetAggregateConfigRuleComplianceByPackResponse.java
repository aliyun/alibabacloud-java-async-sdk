// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateConfigRuleComplianceByPackResponse} extends {@link TeaModel}
 *
 * <p>GetAggregateConfigRuleComplianceByPackResponse</p>
 */
public class GetAggregateConfigRuleComplianceByPackResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAggregateConfigRuleComplianceByPackResponseBody body;

    private GetAggregateConfigRuleComplianceByPackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAggregateConfigRuleComplianceByPackResponse create() {
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
    public GetAggregateConfigRuleComplianceByPackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAggregateConfigRuleComplianceByPackResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAggregateConfigRuleComplianceByPackResponseBody body);

        @Override
        GetAggregateConfigRuleComplianceByPackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAggregateConfigRuleComplianceByPackResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private GetAggregateConfigRuleComplianceByPackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAggregateConfigRuleComplianceByPackResponse response) {
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
        public Builder body(GetAggregateConfigRuleComplianceByPackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAggregateConfigRuleComplianceByPackResponse build() {
            return new GetAggregateConfigRuleComplianceByPackResponse(this);
        } 

    } 

}
