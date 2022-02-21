// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStorageSetResponse} extends {@link TeaModel}
 *
 * <p>DeleteStorageSetResponse</p>
 */
public class DeleteStorageSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteStorageSetResponseBody body;

    private DeleteStorageSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteStorageSetResponse create() {
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
    public DeleteStorageSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteStorageSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteStorageSetResponseBody body);

        @Override
        DeleteStorageSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteStorageSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteStorageSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteStorageSetResponse response) {
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
        public Builder body(DeleteStorageSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteStorageSetResponse build() {
            return new DeleteStorageSetResponse(this);
        } 

    } 

}
