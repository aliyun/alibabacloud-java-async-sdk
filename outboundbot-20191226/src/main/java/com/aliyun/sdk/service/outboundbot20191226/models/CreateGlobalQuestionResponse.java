// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGlobalQuestionResponse} extends {@link TeaModel}
 *
 * <p>CreateGlobalQuestionResponse</p>
 */
public class CreateGlobalQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGlobalQuestionResponseBody body;

    private CreateGlobalQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGlobalQuestionResponse create() {
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
    public CreateGlobalQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGlobalQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGlobalQuestionResponseBody body);

        @Override
        CreateGlobalQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGlobalQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGlobalQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGlobalQuestionResponse response) {
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
        public Builder body(CreateGlobalQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGlobalQuestionResponse build() {
            return new CreateGlobalQuestionResponse(this);
        } 

    } 

}
