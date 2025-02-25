// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link RunCompletionMessageResponse} extends {@link TeaModel}
 *
 * <p>RunCompletionMessageResponse</p>
 */
public class RunCompletionMessageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RunCompletionMessageResponseBody body;

    private RunCompletionMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RunCompletionMessageResponse create() {
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
    public RunCompletionMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunCompletionMessageResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(RunCompletionMessageResponseBody body);

        @Override
        RunCompletionMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunCompletionMessageResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private RunCompletionMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunCompletionMessageResponse response) {
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
        public Builder body(RunCompletionMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunCompletionMessageResponse build() {
            return new RunCompletionMessageResponse(this);
        } 

    } 

}
