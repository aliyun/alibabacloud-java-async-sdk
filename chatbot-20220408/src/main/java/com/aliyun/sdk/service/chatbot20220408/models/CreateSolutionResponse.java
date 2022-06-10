// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSolutionResponse} extends {@link TeaModel}
 *
 * <p>CreateSolutionResponse</p>
 */
public class CreateSolutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSolutionResponseBody body;

    private CreateSolutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSolutionResponse create() {
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
    public CreateSolutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSolutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSolutionResponseBody body);

        @Override
        CreateSolutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSolutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSolutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSolutionResponse response) {
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
        public Builder body(CreateSolutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSolutionResponse build() {
            return new CreateSolutionResponse(this);
        } 

    } 

}
