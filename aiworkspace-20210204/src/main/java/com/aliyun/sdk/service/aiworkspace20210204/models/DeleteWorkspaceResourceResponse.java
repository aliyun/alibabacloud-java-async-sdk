// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkspaceResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteWorkspaceResourceResponse</p>
 */
public class DeleteWorkspaceResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWorkspaceResourceResponseBody body;

    private DeleteWorkspaceResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWorkspaceResourceResponse create() {
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
    public DeleteWorkspaceResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWorkspaceResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWorkspaceResourceResponseBody body);

        @Override
        DeleteWorkspaceResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWorkspaceResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWorkspaceResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWorkspaceResourceResponse response) {
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
        public Builder body(DeleteWorkspaceResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWorkspaceResourceResponse build() {
            return new DeleteWorkspaceResourceResponse(this);
        } 

    } 

}
