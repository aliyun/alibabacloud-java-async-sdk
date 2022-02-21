// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePlaylistItemsResponse} extends {@link TeaModel}
 *
 * <p>DeletePlaylistItemsResponse</p>
 */
public class DeletePlaylistItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePlaylistItemsResponseBody body;

    private DeletePlaylistItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePlaylistItemsResponse create() {
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
    public DeletePlaylistItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePlaylistItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePlaylistItemsResponseBody body);

        @Override
        DeletePlaylistItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePlaylistItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePlaylistItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePlaylistItemsResponse response) {
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
        public Builder body(DeletePlaylistItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePlaylistItemsResponse build() {
            return new DeletePlaylistItemsResponse(this);
        } 

    } 

}
