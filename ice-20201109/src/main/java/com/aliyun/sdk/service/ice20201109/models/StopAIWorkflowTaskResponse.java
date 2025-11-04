// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link StopAIWorkflowTaskResponse} extends {@link TeaModel}
 *
 * <p>StopAIWorkflowTaskResponse</p>
 */
public class StopAIWorkflowTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StopAIWorkflowTaskResponseBody body;

    private StopAIWorkflowTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StopAIWorkflowTaskResponse create() {
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
    public StopAIWorkflowTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopAIWorkflowTaskResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(StopAIWorkflowTaskResponseBody body);

        @Override
        StopAIWorkflowTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopAIWorkflowTaskResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private StopAIWorkflowTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopAIWorkflowTaskResponse response) {
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
        public Builder body(StopAIWorkflowTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopAIWorkflowTaskResponse build() {
            return new StopAIWorkflowTaskResponse(this);
        } 

    } 

}
