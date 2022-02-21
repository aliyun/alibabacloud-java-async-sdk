// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelinesResponse} extends {@link TeaModel}
 *
 * <p>DeletePipelinesResponse</p>
 */
public class DeletePipelinesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePipelinesResponseBody body;

    private DeletePipelinesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePipelinesResponse create() {
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
    public DeletePipelinesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePipelinesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePipelinesResponseBody body);

        @Override
        DeletePipelinesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePipelinesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePipelinesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePipelinesResponse response) {
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
        public Builder body(DeletePipelinesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePipelinesResponse build() {
            return new DeletePipelinesResponse(this);
        } 

    } 

}
