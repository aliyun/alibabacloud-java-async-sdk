// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserSayResponse} extends {@link TeaModel}
 *
 * <p>CreateUserSayResponse</p>
 */
public class CreateUserSayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserSayResponseBody body;

    private CreateUserSayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserSayResponse create() {
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
    public CreateUserSayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserSayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserSayResponseBody body);

        @Override
        CreateUserSayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserSayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserSayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserSayResponse response) {
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
        public Builder body(CreateUserSayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserSayResponse build() {
            return new CreateUserSayResponse(this);
        } 

    } 

}
