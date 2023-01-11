// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappPhoneNumberRegisterResponse} extends {@link TeaModel}
 *
 * <p>ChatappPhoneNumberRegisterResponse</p>
 */
public class ChatappPhoneNumberRegisterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChatappPhoneNumberRegisterResponseBody body;

    private ChatappPhoneNumberRegisterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChatappPhoneNumberRegisterResponse create() {
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
    public ChatappPhoneNumberRegisterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatappPhoneNumberRegisterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChatappPhoneNumberRegisterResponseBody body);

        @Override
        ChatappPhoneNumberRegisterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatappPhoneNumberRegisterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChatappPhoneNumberRegisterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatappPhoneNumberRegisterResponse response) {
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
        public Builder body(ChatappPhoneNumberRegisterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatappPhoneNumberRegisterResponse build() {
            return new ChatappPhoneNumberRegisterResponse(this);
        } 

    } 

}
