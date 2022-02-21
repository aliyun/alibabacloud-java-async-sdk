// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepoTagResponse} extends {@link TeaModel}
 *
 * <p>DeleteRepoTagResponse</p>
 */
public class DeleteRepoTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRepoTagResponseBody body;

    private DeleteRepoTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRepoTagResponse create() {
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
    public DeleteRepoTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRepoTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRepoTagResponseBody body);

        @Override
        DeleteRepoTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRepoTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRepoTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRepoTagResponse response) {
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
        public Builder body(DeleteRepoTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRepoTagResponse build() {
            return new DeleteRepoTagResponse(this);
        } 

    } 

}
