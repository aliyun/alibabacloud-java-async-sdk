// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link RetryLifecycleRetrieveJobResponse} extends {@link TeaModel}
 *
 * <p>RetryLifecycleRetrieveJobResponse</p>
 */
public class RetryLifecycleRetrieveJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RetryLifecycleRetrieveJobResponseBody body;

    private RetryLifecycleRetrieveJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RetryLifecycleRetrieveJobResponse create() {
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
    public RetryLifecycleRetrieveJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryLifecycleRetrieveJobResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RetryLifecycleRetrieveJobResponseBody body);

        @Override
        RetryLifecycleRetrieveJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryLifecycleRetrieveJobResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RetryLifecycleRetrieveJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryLifecycleRetrieveJobResponse response) {
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
        public Builder body(RetryLifecycleRetrieveJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryLifecycleRetrieveJobResponse build() {
            return new RetryLifecycleRetrieveJobResponse(this);
        } 

    } 

}
