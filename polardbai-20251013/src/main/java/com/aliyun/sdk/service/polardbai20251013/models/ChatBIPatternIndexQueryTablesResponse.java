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
 * {@link ChatBIPatternIndexQueryTablesResponse} extends {@link TeaModel}
 *
 * <p>ChatBIPatternIndexQueryTablesResponse</p>
 */
public class ChatBIPatternIndexQueryTablesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChatBIPatternIndexQueryTablesResponseBody body;

    private ChatBIPatternIndexQueryTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChatBIPatternIndexQueryTablesResponse create() {
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
    public ChatBIPatternIndexQueryTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatBIPatternIndexQueryTablesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChatBIPatternIndexQueryTablesResponseBody body);

        @Override
        ChatBIPatternIndexQueryTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatBIPatternIndexQueryTablesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ChatBIPatternIndexQueryTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatBIPatternIndexQueryTablesResponse response) {
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
        public Builder body(ChatBIPatternIndexQueryTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatBIPatternIndexQueryTablesResponse build() {
            return new ChatBIPatternIndexQueryTablesResponse(this);
        } 

    } 

}
