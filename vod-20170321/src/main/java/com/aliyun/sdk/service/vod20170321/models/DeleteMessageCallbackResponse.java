// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMessageCallbackResponse} extends {@link TeaModel}
 *
 * <p>DeleteMessageCallbackResponse</p>
 */
public class DeleteMessageCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMessageCallbackResponseBody body;

    private DeleteMessageCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMessageCallbackResponse create() {
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
    public DeleteMessageCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMessageCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMessageCallbackResponseBody body);

        @Override
        DeleteMessageCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMessageCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMessageCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMessageCallbackResponse response) {
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
        public Builder body(DeleteMessageCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMessageCallbackResponse build() {
            return new DeleteMessageCallbackResponse(this);
        } 

    } 

}
