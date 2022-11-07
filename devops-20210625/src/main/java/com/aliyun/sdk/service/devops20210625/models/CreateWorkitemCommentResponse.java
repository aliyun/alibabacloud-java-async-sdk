// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkitemCommentResponse} extends {@link TeaModel}
 *
 * <p>CreateWorkitemCommentResponse</p>
 */
public class CreateWorkitemCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWorkitemCommentResponseBody body;

    private CreateWorkitemCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWorkitemCommentResponse create() {
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
    public CreateWorkitemCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWorkitemCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWorkitemCommentResponseBody body);

        @Override
        CreateWorkitemCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWorkitemCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWorkitemCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWorkitemCommentResponse response) {
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
        public Builder body(CreateWorkitemCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWorkitemCommentResponse build() {
            return new CreateWorkitemCommentResponse(this);
        } 

    } 

}
