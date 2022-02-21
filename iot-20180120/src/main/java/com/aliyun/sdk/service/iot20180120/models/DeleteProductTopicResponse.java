// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductTopicResponse} extends {@link TeaModel}
 *
 * <p>DeleteProductTopicResponse</p>
 */
public class DeleteProductTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProductTopicResponseBody body;

    private DeleteProductTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProductTopicResponse create() {
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
    public DeleteProductTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProductTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProductTopicResponseBody body);

        @Override
        DeleteProductTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProductTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProductTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProductTopicResponse response) {
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
        public Builder body(DeleteProductTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProductTopicResponse build() {
            return new DeleteProductTopicResponse(this);
        } 

    } 

}
