// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserFeedbackResponse} extends {@link TeaModel}
 *
 * <p>CreateUserFeedbackResponse</p>
 */
public class CreateUserFeedbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserFeedbackResponseBody body;

    private CreateUserFeedbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserFeedbackResponse create() {
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
    public CreateUserFeedbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserFeedbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserFeedbackResponseBody body);

        @Override
        CreateUserFeedbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserFeedbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserFeedbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserFeedbackResponse response) {
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
        public Builder body(CreateUserFeedbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserFeedbackResponse build() {
            return new CreateUserFeedbackResponse(this);
        } 

    } 

}
