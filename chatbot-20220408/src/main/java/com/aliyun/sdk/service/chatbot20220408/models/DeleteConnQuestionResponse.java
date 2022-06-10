// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConnQuestionResponse} extends {@link TeaModel}
 *
 * <p>DeleteConnQuestionResponse</p>
 */
public class DeleteConnQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteConnQuestionResponseBody body;

    private DeleteConnQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteConnQuestionResponse create() {
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
    public DeleteConnQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteConnQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteConnQuestionResponseBody body);

        @Override
        DeleteConnQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteConnQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteConnQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteConnQuestionResponse response) {
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
        public Builder body(DeleteConnQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteConnQuestionResponse build() {
            return new DeleteConnQuestionResponse(this);
        } 

    } 

}
