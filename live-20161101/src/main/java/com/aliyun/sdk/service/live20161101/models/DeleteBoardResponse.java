// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBoardResponse} extends {@link TeaModel}
 *
 * <p>DeleteBoardResponse</p>
 */
public class DeleteBoardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBoardResponseBody body;

    private DeleteBoardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBoardResponse create() {
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
    public DeleteBoardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBoardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBoardResponseBody body);

        @Override
        DeleteBoardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBoardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBoardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBoardResponse response) {
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
        public Builder body(DeleteBoardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBoardResponse build() {
            return new DeleteBoardResponse(this);
        } 

    } 

}
