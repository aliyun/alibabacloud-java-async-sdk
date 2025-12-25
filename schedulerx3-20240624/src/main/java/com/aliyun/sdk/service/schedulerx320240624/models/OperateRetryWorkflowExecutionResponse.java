// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link OperateRetryWorkflowExecutionResponse} extends {@link TeaModel}
 *
 * <p>OperateRetryWorkflowExecutionResponse</p>
 */
public class OperateRetryWorkflowExecutionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OperateRetryWorkflowExecutionResponseBody body;

    private OperateRetryWorkflowExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OperateRetryWorkflowExecutionResponse create() {
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
    public OperateRetryWorkflowExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateRetryWorkflowExecutionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OperateRetryWorkflowExecutionResponseBody body);

        @Override
        OperateRetryWorkflowExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateRetryWorkflowExecutionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OperateRetryWorkflowExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateRetryWorkflowExecutionResponse response) {
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
        public Builder body(OperateRetryWorkflowExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateRetryWorkflowExecutionResponse build() {
            return new OperateRetryWorkflowExecutionResponse(this);
        } 

    } 

}
