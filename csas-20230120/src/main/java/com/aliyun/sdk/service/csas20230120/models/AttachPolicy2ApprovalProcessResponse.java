// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link AttachPolicy2ApprovalProcessResponse} extends {@link TeaModel}
 *
 * <p>AttachPolicy2ApprovalProcessResponse</p>
 */
public class AttachPolicy2ApprovalProcessResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AttachPolicy2ApprovalProcessResponseBody body;

    private AttachPolicy2ApprovalProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AttachPolicy2ApprovalProcessResponse create() {
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
    public AttachPolicy2ApprovalProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachPolicy2ApprovalProcessResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(AttachPolicy2ApprovalProcessResponseBody body);

        @Override
        AttachPolicy2ApprovalProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachPolicy2ApprovalProcessResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private AttachPolicy2ApprovalProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachPolicy2ApprovalProcessResponse response) {
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
        public Builder body(AttachPolicy2ApprovalProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachPolicy2ApprovalProcessResponse build() {
            return new AttachPolicy2ApprovalProcessResponse(this);
        } 

    } 

}
