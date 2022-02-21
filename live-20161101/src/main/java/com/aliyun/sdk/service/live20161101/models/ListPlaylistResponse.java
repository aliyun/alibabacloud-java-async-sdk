// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPlaylistResponse} extends {@link TeaModel}
 *
 * <p>ListPlaylistResponse</p>
 */
public class ListPlaylistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPlaylistResponseBody body;

    private ListPlaylistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPlaylistResponse create() {
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
    public ListPlaylistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPlaylistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPlaylistResponseBody body);

        @Override
        ListPlaylistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPlaylistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPlaylistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPlaylistResponse response) {
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
        public Builder body(ListPlaylistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPlaylistResponse build() {
            return new ListPlaylistResponse(this);
        } 

    } 

}
