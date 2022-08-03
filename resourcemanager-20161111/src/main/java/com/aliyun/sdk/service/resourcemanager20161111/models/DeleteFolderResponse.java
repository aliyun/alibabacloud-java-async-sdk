// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFolderResponse} extends {@link TeaModel}
 *
 * <p>DeleteFolderResponse</p>
 */
public class DeleteFolderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFolderResponseBody body;

    private DeleteFolderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFolderResponse create() {
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
    public DeleteFolderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFolderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFolderResponseBody body);

        @Override
        DeleteFolderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFolderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFolderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFolderResponse response) {
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
        public Builder body(DeleteFolderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFolderResponse build() {
            return new DeleteFolderResponse(this);
        } 

    } 

}
