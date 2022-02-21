// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteListenerResponse} extends {@link TeaModel}
 *
 * <p>DeleteListenerResponse</p>
 */
public class DeleteListenerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteListenerResponseBody body;

    private DeleteListenerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteListenerResponse create() {
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
    public DeleteListenerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteListenerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteListenerResponseBody body);

        @Override
        DeleteListenerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteListenerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteListenerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteListenerResponse response) {
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
        public Builder body(DeleteListenerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteListenerResponse build() {
            return new DeleteListenerResponse(this);
        } 

    } 

}
