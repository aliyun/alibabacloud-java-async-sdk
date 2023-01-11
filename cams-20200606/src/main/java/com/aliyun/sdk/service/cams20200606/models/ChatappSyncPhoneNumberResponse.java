// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappSyncPhoneNumberResponse} extends {@link TeaModel}
 *
 * <p>ChatappSyncPhoneNumberResponse</p>
 */
public class ChatappSyncPhoneNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChatappSyncPhoneNumberResponseBody body;

    private ChatappSyncPhoneNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChatappSyncPhoneNumberResponse create() {
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
    public ChatappSyncPhoneNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatappSyncPhoneNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChatappSyncPhoneNumberResponseBody body);

        @Override
        ChatappSyncPhoneNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatappSyncPhoneNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChatappSyncPhoneNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatappSyncPhoneNumberResponse response) {
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
        public Builder body(ChatappSyncPhoneNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatappSyncPhoneNumberResponse build() {
            return new ChatappSyncPhoneNumberResponse(this);
        } 

    } 

}
