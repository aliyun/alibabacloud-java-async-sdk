// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePerspectiveResponse} extends {@link TeaModel}
 *
 * <p>DeletePerspectiveResponse</p>
 */
public class DeletePerspectiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePerspectiveResponseBody body;

    private DeletePerspectiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePerspectiveResponse create() {
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
    public DeletePerspectiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePerspectiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePerspectiveResponseBody body);

        @Override
        DeletePerspectiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePerspectiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePerspectiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePerspectiveResponse response) {
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
        public Builder body(DeletePerspectiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePerspectiveResponse build() {
            return new DeletePerspectiveResponse(this);
        } 

    } 

}
