// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBotResponse} extends {@link TeaModel}
 *
 * <p>DeleteBotResponse</p>
 */
public class DeleteBotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBotResponseBody body;

    private DeleteBotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBotResponse create() {
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
    public DeleteBotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBotResponseBody body);

        @Override
        DeleteBotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBotResponse response) {
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
        public Builder body(DeleteBotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBotResponse build() {
            return new DeleteBotResponse(this);
        } 

    } 

}
