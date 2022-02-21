// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PlayInfoResponse} extends {@link TeaModel}
 *
 * <p>PlayInfoResponse</p>
 */
public class PlayInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PlayInfoResponseBody body;

    private PlayInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PlayInfoResponse create() {
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
    public PlayInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PlayInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PlayInfoResponseBody body);

        @Override
        PlayInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PlayInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PlayInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PlayInfoResponse response) {
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
        public Builder body(PlayInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PlayInfoResponse build() {
            return new PlayInfoResponse(this);
        } 

    } 

}
