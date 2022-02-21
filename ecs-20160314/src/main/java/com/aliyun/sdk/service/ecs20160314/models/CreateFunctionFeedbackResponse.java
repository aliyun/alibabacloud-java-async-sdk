// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFunctionFeedbackResponse} extends {@link TeaModel}
 *
 * <p>CreateFunctionFeedbackResponse</p>
 */
public class CreateFunctionFeedbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFunctionFeedbackResponseBody body;

    private CreateFunctionFeedbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFunctionFeedbackResponse create() {
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
    public CreateFunctionFeedbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFunctionFeedbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFunctionFeedbackResponseBody body);

        @Override
        CreateFunctionFeedbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFunctionFeedbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFunctionFeedbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFunctionFeedbackResponse response) {
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
        public Builder body(CreateFunctionFeedbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFunctionFeedbackResponse build() {
            return new CreateFunctionFeedbackResponse(this);
        } 

    } 

}
