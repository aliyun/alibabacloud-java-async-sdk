// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepoSourceCodeRepoResponse} extends {@link TeaModel}
 *
 * <p>DeleteRepoSourceCodeRepoResponse</p>
 */
public class DeleteRepoSourceCodeRepoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRepoSourceCodeRepoResponseBody body;

    private DeleteRepoSourceCodeRepoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRepoSourceCodeRepoResponse create() {
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
    public DeleteRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRepoSourceCodeRepoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRepoSourceCodeRepoResponseBody body);

        @Override
        DeleteRepoSourceCodeRepoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRepoSourceCodeRepoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRepoSourceCodeRepoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRepoSourceCodeRepoResponse response) {
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
        public Builder body(DeleteRepoSourceCodeRepoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRepoSourceCodeRepoResponse build() {
            return new DeleteRepoSourceCodeRepoResponse(this);
        } 

    } 

}
