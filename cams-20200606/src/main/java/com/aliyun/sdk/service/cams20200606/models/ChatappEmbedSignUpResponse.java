// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappEmbedSignUpResponse} extends {@link TeaModel}
 *
 * <p>ChatappEmbedSignUpResponse</p>
 */
public class ChatappEmbedSignUpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChatappEmbedSignUpResponseBody body;

    private ChatappEmbedSignUpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChatappEmbedSignUpResponse create() {
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
    public ChatappEmbedSignUpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatappEmbedSignUpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChatappEmbedSignUpResponseBody body);

        @Override
        ChatappEmbedSignUpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatappEmbedSignUpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChatappEmbedSignUpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatappEmbedSignUpResponse response) {
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
        public Builder body(ChatappEmbedSignUpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatappEmbedSignUpResponse build() {
            return new ChatappEmbedSignUpResponse(this);
        } 

    } 

}
