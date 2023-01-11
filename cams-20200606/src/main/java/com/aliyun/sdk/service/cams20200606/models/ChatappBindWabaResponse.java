// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappBindWabaResponse} extends {@link TeaModel}
 *
 * <p>ChatappBindWabaResponse</p>
 */
public class ChatappBindWabaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChatappBindWabaResponseBody body;

    private ChatappBindWabaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChatappBindWabaResponse create() {
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
    public ChatappBindWabaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChatappBindWabaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChatappBindWabaResponseBody body);

        @Override
        ChatappBindWabaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChatappBindWabaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChatappBindWabaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChatappBindWabaResponse response) {
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
        public Builder body(ChatappBindWabaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChatappBindWabaResponse build() {
            return new ChatappBindWabaResponse(this);
        } 

    } 

}
