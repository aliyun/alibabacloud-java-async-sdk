// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPlaylistItemsResponse} extends {@link TeaModel}
 *
 * <p>ListPlaylistItemsResponse</p>
 */
public class ListPlaylistItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPlaylistItemsResponseBody body;

    private ListPlaylistItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPlaylistItemsResponse create() {
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
    public ListPlaylistItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPlaylistItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPlaylistItemsResponseBody body);

        @Override
        ListPlaylistItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPlaylistItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPlaylistItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPlaylistItemsResponse response) {
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
        public Builder body(ListPlaylistItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPlaylistItemsResponse build() {
            return new ListPlaylistItemsResponse(this);
        } 

    } 

}
