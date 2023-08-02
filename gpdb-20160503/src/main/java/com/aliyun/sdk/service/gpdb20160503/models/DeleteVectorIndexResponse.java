// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVectorIndexResponse} extends {@link TeaModel}
 *
 * <p>DeleteVectorIndexResponse</p>
 */
public class DeleteVectorIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVectorIndexResponseBody body;

    private DeleteVectorIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVectorIndexResponse create() {
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
    public DeleteVectorIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVectorIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVectorIndexResponseBody body);

        @Override
        DeleteVectorIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVectorIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVectorIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVectorIndexResponse response) {
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
        public Builder body(DeleteVectorIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVectorIndexResponse build() {
            return new DeleteVectorIndexResponse(this);
        } 

    } 

}
