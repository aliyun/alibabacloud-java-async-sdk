// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCodeSourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteCodeSourceResponse</p>
 */
public class DeleteCodeSourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCodeSourceResponseBody body;

    private DeleteCodeSourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCodeSourceResponse create() {
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
    public DeleteCodeSourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCodeSourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCodeSourceResponseBody body);

        @Override
        DeleteCodeSourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCodeSourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCodeSourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCodeSourceResponse response) {
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
        public Builder body(DeleteCodeSourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCodeSourceResponse build() {
            return new DeleteCodeSourceResponse(this);
        } 

    } 

}
