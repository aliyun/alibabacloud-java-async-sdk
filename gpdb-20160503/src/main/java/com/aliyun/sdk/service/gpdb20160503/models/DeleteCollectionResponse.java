// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCollectionResponse} extends {@link TeaModel}
 *
 * <p>DeleteCollectionResponse</p>
 */
public class DeleteCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCollectionResponseBody body;

    private DeleteCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCollectionResponse create() {
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
    public DeleteCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCollectionResponseBody body);

        @Override
        DeleteCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCollectionResponse response) {
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
        public Builder body(DeleteCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCollectionResponse build() {
            return new DeleteCollectionResponse(this);
        } 

    } 

}
