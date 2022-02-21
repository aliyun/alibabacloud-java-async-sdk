// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBotResponse} extends {@link TeaModel}
 *
 * <p>CreateBotResponse</p>
 */
public class CreateBotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBotResponseBody body;

    private CreateBotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBotResponse create() {
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
    public CreateBotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBotResponseBody body);

        @Override
        CreateBotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBotResponse response) {
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
        public Builder body(CreateBotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBotResponse build() {
            return new CreateBotResponse(this);
        } 

    } 

}
