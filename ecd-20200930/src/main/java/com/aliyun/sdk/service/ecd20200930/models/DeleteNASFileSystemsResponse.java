// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNASFileSystemsResponse} extends {@link TeaModel}
 *
 * <p>DeleteNASFileSystemsResponse</p>
 */
public class DeleteNASFileSystemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteNASFileSystemsResponseBody body;

    private DeleteNASFileSystemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteNASFileSystemsResponse create() {
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
    public DeleteNASFileSystemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteNASFileSystemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteNASFileSystemsResponseBody body);

        @Override
        DeleteNASFileSystemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteNASFileSystemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteNASFileSystemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteNASFileSystemsResponse response) {
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
        public Builder body(DeleteNASFileSystemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteNASFileSystemsResponse build() {
            return new DeleteNASFileSystemsResponse(this);
        } 

    } 

}
