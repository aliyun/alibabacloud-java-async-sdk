// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserFromWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserFromWorkspaceResponse</p>
 */
public class DeleteUserFromWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserFromWorkspaceResponseBody body;

    private DeleteUserFromWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserFromWorkspaceResponse create() {
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
    public DeleteUserFromWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserFromWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserFromWorkspaceResponseBody body);

        @Override
        DeleteUserFromWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserFromWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserFromWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserFromWorkspaceResponse response) {
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
        public Builder body(DeleteUserFromWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserFromWorkspaceResponse build() {
            return new DeleteUserFromWorkspaceResponse(this);
        } 

    } 

}
