// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSimQuestionResponse} extends {@link TeaModel}
 *
 * <p>DeleteSimQuestionResponse</p>
 */
public class DeleteSimQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSimQuestionResponseBody body;

    private DeleteSimQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSimQuestionResponse create() {
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
    public DeleteSimQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSimQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSimQuestionResponseBody body);

        @Override
        DeleteSimQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSimQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSimQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSimQuestionResponse response) {
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
        public Builder body(DeleteSimQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSimQuestionResponse build() {
            return new DeleteSimQuestionResponse(this);
        } 

    } 

}
