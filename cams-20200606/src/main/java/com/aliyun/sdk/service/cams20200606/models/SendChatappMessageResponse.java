// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendChatappMessageResponse} extends {@link TeaModel}
 *
 * <p>SendChatappMessageResponse</p>
 */
public class SendChatappMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendChatappMessageResponseBody body;

    private SendChatappMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendChatappMessageResponse create() {
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
    public SendChatappMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendChatappMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendChatappMessageResponseBody body);

        @Override
        SendChatappMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendChatappMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendChatappMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendChatappMessageResponse response) {
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
        public Builder body(SendChatappMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendChatappMessageResponse build() {
            return new SendChatappMessageResponse(this);
        } 

    } 

}
