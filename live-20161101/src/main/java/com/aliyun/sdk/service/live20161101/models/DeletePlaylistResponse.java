// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePlaylistResponse} extends {@link TeaModel}
 *
 * <p>DeletePlaylistResponse</p>
 */
public class DeletePlaylistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePlaylistResponseBody body;

    private DeletePlaylistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePlaylistResponse create() {
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
    public DeletePlaylistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePlaylistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePlaylistResponseBody body);

        @Override
        DeletePlaylistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePlaylistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePlaylistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePlaylistResponse response) {
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
        public Builder body(DeletePlaylistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePlaylistResponse build() {
            return new DeletePlaylistResponse(this);
        } 

    } 

}
