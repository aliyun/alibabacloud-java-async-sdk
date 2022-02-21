// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQueueResponse} extends {@link TeaModel}
 *
 * <p>DeleteQueueResponse</p>
 */
public class DeleteQueueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteQueueResponseBody body;

    private DeleteQueueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteQueueResponse create() {
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
    public DeleteQueueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteQueueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteQueueResponseBody body);

        @Override
        DeleteQueueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteQueueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteQueueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteQueueResponse response) {
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
        public Builder body(DeleteQueueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteQueueResponse build() {
            return new DeleteQueueResponse(this);
        } 

    } 

}
