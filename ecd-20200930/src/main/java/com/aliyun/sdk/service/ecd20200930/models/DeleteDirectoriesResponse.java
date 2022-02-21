// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectoriesResponse} extends {@link TeaModel}
 *
 * <p>DeleteDirectoriesResponse</p>
 */
public class DeleteDirectoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDirectoriesResponseBody body;

    private DeleteDirectoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDirectoriesResponse create() {
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
    public DeleteDirectoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDirectoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDirectoriesResponseBody body);

        @Override
        DeleteDirectoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDirectoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDirectoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDirectoriesResponse response) {
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
        public Builder body(DeleteDirectoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDirectoriesResponse build() {
            return new DeleteDirectoriesResponse(this);
        } 

    } 

}
