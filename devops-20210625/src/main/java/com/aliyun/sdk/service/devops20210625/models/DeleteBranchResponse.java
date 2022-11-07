// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBranchResponse} extends {@link TeaModel}
 *
 * <p>DeleteBranchResponse</p>
 */
public class DeleteBranchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBranchResponseBody body;

    private DeleteBranchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBranchResponse create() {
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
    public DeleteBranchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBranchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBranchResponseBody body);

        @Override
        DeleteBranchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBranchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBranchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBranchResponse response) {
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
        public Builder body(DeleteBranchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBranchResponse build() {
            return new DeleteBranchResponse(this);
        } 

    } 

}
