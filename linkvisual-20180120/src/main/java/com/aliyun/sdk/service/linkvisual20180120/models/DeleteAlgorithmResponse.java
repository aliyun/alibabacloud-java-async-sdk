// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlgorithmResponse} extends {@link TeaModel}
 *
 * <p>DeleteAlgorithmResponse</p>
 */
public class DeleteAlgorithmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAlgorithmResponseBody body;

    private DeleteAlgorithmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAlgorithmResponse create() {
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
    public DeleteAlgorithmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAlgorithmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAlgorithmResponseBody body);

        @Override
        DeleteAlgorithmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAlgorithmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAlgorithmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAlgorithmResponse response) {
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
        public Builder body(DeleteAlgorithmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAlgorithmResponse build() {
            return new DeleteAlgorithmResponse(this);
        } 

    } 

}
