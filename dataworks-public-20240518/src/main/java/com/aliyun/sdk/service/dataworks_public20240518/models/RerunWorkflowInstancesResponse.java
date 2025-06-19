// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RerunWorkflowInstancesResponse} extends {@link TeaModel}
 *
 * <p>RerunWorkflowInstancesResponse</p>
 */
public class RerunWorkflowInstancesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RerunWorkflowInstancesResponseBody body;

    private RerunWorkflowInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RerunWorkflowInstancesResponse create() {
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
    public RerunWorkflowInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RerunWorkflowInstancesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RerunWorkflowInstancesResponseBody body);

        @Override
        RerunWorkflowInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RerunWorkflowInstancesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RerunWorkflowInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RerunWorkflowInstancesResponse response) {
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
        public Builder body(RerunWorkflowInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RerunWorkflowInstancesResponse build() {
            return new RerunWorkflowInstancesResponse(this);
        } 

    } 

}
