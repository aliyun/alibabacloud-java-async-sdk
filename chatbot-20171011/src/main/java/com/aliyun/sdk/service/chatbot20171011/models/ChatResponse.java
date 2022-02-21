// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatResponse} extends {@link TeaModel}
 *
 * <p>ChatResponse</p>
 */
public class ChatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChatResponseBody body;

    private ChatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChatResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public ChatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChatResponseBody body);

        @Override
        ChatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ChatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatResponse build() {
            return new ChatResponse(this);
        } 

    } 

}
