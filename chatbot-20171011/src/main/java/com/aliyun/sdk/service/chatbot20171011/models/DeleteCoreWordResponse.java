// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCoreWordResponse} extends {@link TeaModel}
 *
 * <p>DeleteCoreWordResponse</p>
 */
public class DeleteCoreWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCoreWordResponseBody body;

    private DeleteCoreWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCoreWordResponse create() {
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
    public DeleteCoreWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCoreWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCoreWordResponseBody body);

        @Override
        DeleteCoreWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCoreWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCoreWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCoreWordResponse response) {
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
        public Builder body(DeleteCoreWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCoreWordResponse build() {
            return new DeleteCoreWordResponse(this);
        } 

    } 

}
