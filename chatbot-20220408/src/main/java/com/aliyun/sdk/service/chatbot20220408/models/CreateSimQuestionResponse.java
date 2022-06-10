// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimQuestionResponse} extends {@link TeaModel}
 *
 * <p>CreateSimQuestionResponse</p>
 */
public class CreateSimQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSimQuestionResponseBody body;

    private CreateSimQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSimQuestionResponse create() {
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
    public CreateSimQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSimQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSimQuestionResponseBody body);

        @Override
        CreateSimQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSimQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSimQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSimQuestionResponse response) {
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
        public Builder body(CreateSimQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSimQuestionResponse build() {
            return new CreateSimQuestionResponse(this);
        } 

    } 

}
