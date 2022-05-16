// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageResponse} extends {@link TeaModel}
 *
 * <p>SendMessageResponse</p>
 */
public class SendMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SendMessageResponseBody body;

    private SendMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SendMessageResponse create() {
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
    public SendMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SendMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SendMessageResponseBody body);

        @Override
        SendMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SendMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SendMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SendMessageResponse response) {
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
        public Builder body(SendMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SendMessageResponse build() {
            return new SendMessageResponse(this);
        } 

    } 

}
