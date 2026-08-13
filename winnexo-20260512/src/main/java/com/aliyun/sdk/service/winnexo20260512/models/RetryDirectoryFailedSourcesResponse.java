// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RetryDirectoryFailedSourcesResponse} extends {@link TeaModel}
 *
 * <p>RetryDirectoryFailedSourcesResponse</p>
 */
public class RetryDirectoryFailedSourcesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RetryDirectoryFailedSourcesResponseBody body;

    private RetryDirectoryFailedSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RetryDirectoryFailedSourcesResponse create() {
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
    public RetryDirectoryFailedSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryDirectoryFailedSourcesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RetryDirectoryFailedSourcesResponseBody body);

        @Override
        RetryDirectoryFailedSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryDirectoryFailedSourcesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RetryDirectoryFailedSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryDirectoryFailedSourcesResponse response) {
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
        public Builder body(RetryDirectoryFailedSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryDirectoryFailedSourcesResponse build() {
            return new RetryDirectoryFailedSourcesResponse(this);
        } 

    } 

}
