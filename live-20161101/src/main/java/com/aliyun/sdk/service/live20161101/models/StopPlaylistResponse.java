// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPlaylistResponse} extends {@link TeaModel}
 *
 * <p>StopPlaylistResponse</p>
 */
public class StopPlaylistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopPlaylistResponseBody body;

    private StopPlaylistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopPlaylistResponse create() {
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
    public StopPlaylistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopPlaylistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopPlaylistResponseBody body);

        @Override
        StopPlaylistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopPlaylistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopPlaylistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopPlaylistResponse response) {
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
        public Builder body(StopPlaylistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopPlaylistResponse build() {
            return new StopPlaylistResponse(this);
        } 

    } 

}
