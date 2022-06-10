// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLgfResponse} extends {@link TeaModel}
 *
 * <p>DeleteLgfResponse</p>
 */
public class DeleteLgfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLgfResponseBody body;

    private DeleteLgfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLgfResponse create() {
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
    public DeleteLgfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLgfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLgfResponseBody body);

        @Override
        DeleteLgfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLgfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLgfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLgfResponse response) {
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
        public Builder body(DeleteLgfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLgfResponse build() {
            return new DeleteLgfResponse(this);
        } 

    } 

}
