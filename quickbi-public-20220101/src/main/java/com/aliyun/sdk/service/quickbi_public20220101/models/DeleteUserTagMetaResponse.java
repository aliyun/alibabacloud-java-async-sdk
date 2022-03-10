// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserTagMetaResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserTagMetaResponse</p>
 */
public class DeleteUserTagMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserTagMetaResponseBody body;

    private DeleteUserTagMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserTagMetaResponse create() {
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
    public DeleteUserTagMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserTagMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserTagMetaResponseBody body);

        @Override
        DeleteUserTagMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserTagMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserTagMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserTagMetaResponse response) {
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
        public Builder body(DeleteUserTagMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserTagMetaResponse build() {
            return new DeleteUserTagMetaResponse(this);
        } 

    } 

}
