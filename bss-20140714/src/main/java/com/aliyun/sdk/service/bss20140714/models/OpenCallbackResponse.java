// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bss20140714.models;

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
 * {@link OpenCallbackResponse} extends {@link TeaModel}
 *
 * <p>OpenCallbackResponse</p>
 */
public class OpenCallbackResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OpenCallbackResponseBody body;

    private OpenCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OpenCallbackResponse create() {
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
    public OpenCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenCallbackResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(OpenCallbackResponseBody body);

        @Override
        OpenCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenCallbackResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private OpenCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenCallbackResponse response) {
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
        public Builder body(OpenCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenCallbackResponse build() {
            return new OpenCallbackResponse(this);
        } 

    } 

}
