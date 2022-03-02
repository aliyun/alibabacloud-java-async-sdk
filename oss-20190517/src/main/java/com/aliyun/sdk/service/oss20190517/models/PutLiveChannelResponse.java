// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link PutLiveChannelResponse} extends {@link TeaModel}
 *
 * <p>PutLiveChannelResponse</p>
 */
public class PutLiveChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutLiveChannelResponseBody body;

    private PutLiveChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutLiveChannelResponse create() {
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
    public PutLiveChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutLiveChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutLiveChannelResponseBody body);

        @Override
        PutLiveChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutLiveChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutLiveChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutLiveChannelResponse response) {
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
        public Builder body(PutLiveChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutLiveChannelResponse build() {
            return new PutLiveChannelResponse(this);
        } 

    } 

}
