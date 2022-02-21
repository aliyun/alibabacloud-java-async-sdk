// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPlaylistResponse} extends {@link TeaModel}
 *
 * <p>StartPlaylistResponse</p>
 */
public class StartPlaylistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartPlaylistResponseBody body;

    private StartPlaylistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartPlaylistResponse create() {
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
    public StartPlaylistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartPlaylistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartPlaylistResponseBody body);

        @Override
        StartPlaylistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartPlaylistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartPlaylistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartPlaylistResponse response) {
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
        public Builder body(StartPlaylistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartPlaylistResponse build() {
            return new StartPlaylistResponse(this);
        } 

    } 

}
