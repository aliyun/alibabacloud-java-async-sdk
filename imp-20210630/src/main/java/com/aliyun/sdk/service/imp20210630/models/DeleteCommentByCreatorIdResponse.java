// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommentByCreatorIdResponse} extends {@link TeaModel}
 *
 * <p>DeleteCommentByCreatorIdResponse</p>
 */
public class DeleteCommentByCreatorIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCommentByCreatorIdResponseBody body;

    private DeleteCommentByCreatorIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCommentByCreatorIdResponse create() {
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
    public DeleteCommentByCreatorIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCommentByCreatorIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCommentByCreatorIdResponseBody body);

        @Override
        DeleteCommentByCreatorIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCommentByCreatorIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCommentByCreatorIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCommentByCreatorIdResponse response) {
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
        public Builder body(DeleteCommentByCreatorIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCommentByCreatorIdResponse build() {
            return new DeleteCommentByCreatorIdResponse(this);
        } 

    } 

}
