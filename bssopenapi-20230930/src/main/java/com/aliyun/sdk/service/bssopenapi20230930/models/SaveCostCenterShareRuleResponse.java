// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link SaveCostCenterShareRuleResponse} extends {@link TeaModel}
 *
 * <p>SaveCostCenterShareRuleResponse</p>
 */
public class SaveCostCenterShareRuleResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveCostCenterShareRuleResponseBody body;

    private SaveCostCenterShareRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveCostCenterShareRuleResponse create() {
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
    public SaveCostCenterShareRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveCostCenterShareRuleResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveCostCenterShareRuleResponseBody body);

        @Override
        SaveCostCenterShareRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveCostCenterShareRuleResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private SaveCostCenterShareRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveCostCenterShareRuleResponse response) {
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
        public Builder body(SaveCostCenterShareRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveCostCenterShareRuleResponse build() {
            return new SaveCostCenterShareRuleResponse(this);
        } 

    } 

}
