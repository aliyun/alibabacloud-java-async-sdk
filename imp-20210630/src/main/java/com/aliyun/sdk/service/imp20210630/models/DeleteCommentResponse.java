// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommentResponse} extends {@link TeaModel}
 *
 * <p>DeleteCommentResponse</p>
 */
public class DeleteCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCommentResponseBody body;

    private DeleteCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCommentResponse create() {
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
    public DeleteCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCommentResponseBody body);

        @Override
        DeleteCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCommentResponse response) {
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
        public Builder body(DeleteCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCommentResponse build() {
            return new DeleteCommentResponse(this);
        } 

    } 

}
