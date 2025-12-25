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
 * {@link OperateMarkSuccessJobExecutionResponse} extends {@link TeaModel}
 *
 * <p>OperateMarkSuccessJobExecutionResponse</p>
 */
public class OperateMarkSuccessJobExecutionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OperateMarkSuccessJobExecutionResponseBody body;

    private OperateMarkSuccessJobExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OperateMarkSuccessJobExecutionResponse create() {
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
    public OperateMarkSuccessJobExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OperateMarkSuccessJobExecutionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OperateMarkSuccessJobExecutionResponseBody body);

        @Override
        OperateMarkSuccessJobExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OperateMarkSuccessJobExecutionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OperateMarkSuccessJobExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OperateMarkSuccessJobExecutionResponse response) {
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
        public Builder body(OperateMarkSuccessJobExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OperateMarkSuccessJobExecutionResponse build() {
            return new OperateMarkSuccessJobExecutionResponse(this);
        } 

    } 

}
