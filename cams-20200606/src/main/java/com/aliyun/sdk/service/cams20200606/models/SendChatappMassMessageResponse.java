// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendChatappMassMessageResponse} extends {@link TeaModel}
 *
 * <p>SendChatappMassMessageResponse</p>
 */
public class SendChatappMassMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendChatappMassMessageResponseBody body;

    private SendChatappMassMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendChatappMassMessageResponse create() {
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
    public SendChatappMassMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendChatappMassMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendChatappMassMessageResponseBody body);

        @Override
        SendChatappMassMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendChatappMassMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendChatappMassMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendChatappMassMessageResponse response) {
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
        public Builder body(SendChatappMassMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendChatappMassMessageResponse build() {
            return new SendChatappMassMessageResponse(this);
        } 

    } 

}
