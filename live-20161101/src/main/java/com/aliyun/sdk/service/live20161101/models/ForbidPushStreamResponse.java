// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForbidPushStreamResponse} extends {@link TeaModel}
 *
 * <p>ForbidPushStreamResponse</p>
 */
public class ForbidPushStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ForbidPushStreamResponseBody body;

    private ForbidPushStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ForbidPushStreamResponse create() {
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
    public ForbidPushStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ForbidPushStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ForbidPushStreamResponseBody body);

        @Override
        ForbidPushStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ForbidPushStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ForbidPushStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ForbidPushStreamResponse response) {
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
        public Builder body(ForbidPushStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ForbidPushStreamResponse build() {
            return new ForbidPushStreamResponse(this);
        } 

    } 

}
