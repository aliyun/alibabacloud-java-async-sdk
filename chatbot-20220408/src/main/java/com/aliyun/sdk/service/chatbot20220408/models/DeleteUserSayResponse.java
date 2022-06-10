// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserSayResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserSayResponse</p>
 */
public class DeleteUserSayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserSayResponseBody body;

    private DeleteUserSayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserSayResponse create() {
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
    public DeleteUserSayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserSayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserSayResponseBody body);

        @Override
        DeleteUserSayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserSayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserSayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserSayResponse response) {
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
        public Builder body(DeleteUserSayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserSayResponse build() {
            return new DeleteUserSayResponse(this);
        } 

    } 

}
