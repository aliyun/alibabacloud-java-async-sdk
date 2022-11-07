// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkitemAllCommentResponse} extends {@link TeaModel}
 *
 * <p>DeleteWorkitemAllCommentResponse</p>
 */
public class DeleteWorkitemAllCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWorkitemAllCommentResponseBody body;

    private DeleteWorkitemAllCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWorkitemAllCommentResponse create() {
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
    public DeleteWorkitemAllCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWorkitemAllCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWorkitemAllCommentResponseBody body);

        @Override
        DeleteWorkitemAllCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWorkitemAllCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWorkitemAllCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWorkitemAllCommentResponse response) {
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
        public Builder body(DeleteWorkitemAllCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWorkitemAllCommentResponse build() {
            return new DeleteWorkitemAllCommentResponse(this);
        } 

    } 

}
