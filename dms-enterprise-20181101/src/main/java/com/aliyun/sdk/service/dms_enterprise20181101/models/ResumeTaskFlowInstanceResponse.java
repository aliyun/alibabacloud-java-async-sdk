// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ResumeTaskFlowInstanceResponse} extends {@link TeaModel}
 *
 * <p>ResumeTaskFlowInstanceResponse</p>
 */
public class ResumeTaskFlowInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ResumeTaskFlowInstanceResponseBody body;

    private ResumeTaskFlowInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ResumeTaskFlowInstanceResponse create() {
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
    public ResumeTaskFlowInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeTaskFlowInstanceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ResumeTaskFlowInstanceResponseBody body);

        @Override
        ResumeTaskFlowInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeTaskFlowInstanceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ResumeTaskFlowInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeTaskFlowInstanceResponse response) {
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
        public Builder body(ResumeTaskFlowInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeTaskFlowInstanceResponse build() {
            return new ResumeTaskFlowInstanceResponse(this);
        } 

    } 

}
