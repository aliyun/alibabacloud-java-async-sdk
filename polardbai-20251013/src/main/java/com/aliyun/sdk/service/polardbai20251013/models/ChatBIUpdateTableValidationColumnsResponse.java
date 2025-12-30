// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link ChatBIUpdateTableValidationColumnsResponse} extends {@link TeaModel}
 *
 * <p>ChatBIUpdateTableValidationColumnsResponse</p>
 */
public class ChatBIUpdateTableValidationColumnsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChatBIUpdateTableValidationColumnsResponseBody body;

    private ChatBIUpdateTableValidationColumnsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChatBIUpdateTableValidationColumnsResponse create() {
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
    public ChatBIUpdateTableValidationColumnsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatBIUpdateTableValidationColumnsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChatBIUpdateTableValidationColumnsResponseBody body);

        @Override
        ChatBIUpdateTableValidationColumnsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatBIUpdateTableValidationColumnsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ChatBIUpdateTableValidationColumnsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatBIUpdateTableValidationColumnsResponse response) {
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
        public Builder body(ChatBIUpdateTableValidationColumnsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatBIUpdateTableValidationColumnsResponse build() {
            return new ChatBIUpdateTableValidationColumnsResponse(this);
        } 

    } 

}
