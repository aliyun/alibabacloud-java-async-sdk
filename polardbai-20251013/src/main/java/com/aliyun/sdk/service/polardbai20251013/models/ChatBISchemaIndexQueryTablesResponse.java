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
 * {@link ChatBISchemaIndexQueryTablesResponse} extends {@link TeaModel}
 *
 * <p>ChatBISchemaIndexQueryTablesResponse</p>
 */
public class ChatBISchemaIndexQueryTablesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ChatBISchemaIndexQueryTablesResponseBody body;

    private ChatBISchemaIndexQueryTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ChatBISchemaIndexQueryTablesResponse create() {
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
    public ChatBISchemaIndexQueryTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatBISchemaIndexQueryTablesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ChatBISchemaIndexQueryTablesResponseBody body);

        @Override
        ChatBISchemaIndexQueryTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatBISchemaIndexQueryTablesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ChatBISchemaIndexQueryTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatBISchemaIndexQueryTablesResponse response) {
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
        public Builder body(ChatBISchemaIndexQueryTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatBISchemaIndexQueryTablesResponse build() {
            return new ChatBISchemaIndexQueryTablesResponse(this);
        } 

    } 

}
