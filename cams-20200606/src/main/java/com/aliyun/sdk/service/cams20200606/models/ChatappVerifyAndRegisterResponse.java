// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappVerifyAndRegisterResponse} extends {@link TeaModel}
 *
 * <p>ChatappVerifyAndRegisterResponse</p>
 */
public class ChatappVerifyAndRegisterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChatappVerifyAndRegisterResponseBody body;

    private ChatappVerifyAndRegisterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChatappVerifyAndRegisterResponse create() {
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
    public ChatappVerifyAndRegisterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatappVerifyAndRegisterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChatappVerifyAndRegisterResponseBody body);

        @Override
        ChatappVerifyAndRegisterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatappVerifyAndRegisterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChatappVerifyAndRegisterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatappVerifyAndRegisterResponse response) {
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
        public Builder body(ChatappVerifyAndRegisterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatappVerifyAndRegisterResponse build() {
            return new ChatappVerifyAndRegisterResponse(this);
        } 

    } 

}
