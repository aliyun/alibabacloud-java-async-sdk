// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFileSystemResponse} extends {@link TeaModel}
 *
 * <p>DeleteFileSystemResponse</p>
 */
public class DeleteFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFileSystemResponseBody body;

    private DeleteFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFileSystemResponse create() {
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
    public DeleteFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFileSystemResponseBody body);

        @Override
        DeleteFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFileSystemResponse response) {
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
        public Builder body(DeleteFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFileSystemResponse build() {
            return new DeleteFileSystemResponse(this);
        } 

    } 

}
