// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProtectedBranchResponse} extends {@link TeaModel}
 *
 * <p>DeleteProtectedBranchResponse</p>
 */
public class DeleteProtectedBranchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProtectedBranchResponseBody body;

    private DeleteProtectedBranchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteProtectedBranchResponse create() {
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
    public DeleteProtectedBranchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteProtectedBranchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteProtectedBranchResponseBody body);

        @Override
        DeleteProtectedBranchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteProtectedBranchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProtectedBranchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteProtectedBranchResponse response) {
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
        public Builder body(DeleteProtectedBranchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteProtectedBranchResponse build() {
            return new DeleteProtectedBranchResponse(this);
        } 

    } 

}
