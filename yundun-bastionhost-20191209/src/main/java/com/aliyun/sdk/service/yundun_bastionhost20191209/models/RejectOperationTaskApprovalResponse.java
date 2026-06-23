// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link RejectOperationTaskApprovalResponse} extends {@link TeaModel}
 *
 * <p>RejectOperationTaskApprovalResponse</p>
 */
public class RejectOperationTaskApprovalResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RejectOperationTaskApprovalResponseBody body;

    private RejectOperationTaskApprovalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RejectOperationTaskApprovalResponse create() {
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
    public RejectOperationTaskApprovalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RejectOperationTaskApprovalResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RejectOperationTaskApprovalResponseBody body);

        @Override
        RejectOperationTaskApprovalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RejectOperationTaskApprovalResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RejectOperationTaskApprovalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RejectOperationTaskApprovalResponse response) {
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
        public Builder body(RejectOperationTaskApprovalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RejectOperationTaskApprovalResponse build() {
            return new RejectOperationTaskApprovalResponse(this);
        } 

    } 

}
