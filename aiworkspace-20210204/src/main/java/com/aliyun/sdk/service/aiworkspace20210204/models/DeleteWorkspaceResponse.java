// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>DeleteWorkspaceResponse</p>
 */
public class DeleteWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWorkspaceResponseBody body;

    private DeleteWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWorkspaceResponse create() {
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
    public DeleteWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWorkspaceResponseBody body);

        @Override
        DeleteWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWorkspaceResponse response) {
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
        public Builder body(DeleteWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWorkspaceResponse build() {
            return new DeleteWorkspaceResponse(this);
        } 

    } 

}
