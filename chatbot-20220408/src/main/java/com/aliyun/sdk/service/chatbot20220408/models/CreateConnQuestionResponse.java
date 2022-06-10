// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConnQuestionResponse} extends {@link TeaModel}
 *
 * <p>CreateConnQuestionResponse</p>
 */
public class CreateConnQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConnQuestionResponseBody body;

    private CreateConnQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConnQuestionResponse create() {
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
    public CreateConnQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConnQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConnQuestionResponseBody body);

        @Override
        CreateConnQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConnQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConnQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConnQuestionResponse response) {
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
        public Builder body(CreateConnQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConnQuestionResponse build() {
            return new CreateConnQuestionResponse(this);
        } 

    } 

}
