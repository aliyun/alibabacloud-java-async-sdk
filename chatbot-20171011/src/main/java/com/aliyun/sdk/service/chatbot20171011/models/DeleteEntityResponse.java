// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEntityResponse} extends {@link TeaModel}
 *
 * <p>DeleteEntityResponse</p>
 */
public class DeleteEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEntityResponseBody body;

    private DeleteEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEntityResponse create() {
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
    public DeleteEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEntityResponseBody body);

        @Override
        DeleteEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEntityResponse response) {
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
        public Builder body(DeleteEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEntityResponse build() {
            return new DeleteEntityResponse(this);
        } 

    } 

}
