// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMessageAppResponse} extends {@link TeaModel}
 *
 * <p>DeleteMessageAppResponse</p>
 */
public class DeleteMessageAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMessageAppResponseBody body;

    private DeleteMessageAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMessageAppResponse create() {
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
    public DeleteMessageAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMessageAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMessageAppResponseBody body);

        @Override
        DeleteMessageAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMessageAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMessageAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMessageAppResponse response) {
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
        public Builder body(DeleteMessageAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMessageAppResponse build() {
            return new DeleteMessageAppResponse(this);
        } 

    } 

}
