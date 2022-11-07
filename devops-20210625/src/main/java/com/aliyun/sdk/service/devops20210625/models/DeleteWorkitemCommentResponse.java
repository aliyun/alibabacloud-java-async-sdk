// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkitemCommentResponse} extends {@link TeaModel}
 *
 * <p>DeleteWorkitemCommentResponse</p>
 */
public class DeleteWorkitemCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWorkitemCommentResponseBody body;

    private DeleteWorkitemCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWorkitemCommentResponse create() {
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
    public DeleteWorkitemCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWorkitemCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWorkitemCommentResponseBody body);

        @Override
        DeleteWorkitemCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWorkitemCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWorkitemCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWorkitemCommentResponse response) {
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
        public Builder body(DeleteWorkitemCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWorkitemCommentResponse build() {
            return new DeleteWorkitemCommentResponse(this);
        } 

    } 

}
