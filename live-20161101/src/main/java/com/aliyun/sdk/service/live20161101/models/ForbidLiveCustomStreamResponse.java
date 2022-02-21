// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForbidLiveCustomStreamResponse} extends {@link TeaModel}
 *
 * <p>ForbidLiveCustomStreamResponse</p>
 */
public class ForbidLiveCustomStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ForbidLiveCustomStreamResponseBody body;

    private ForbidLiveCustomStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ForbidLiveCustomStreamResponse create() {
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
    public ForbidLiveCustomStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ForbidLiveCustomStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ForbidLiveCustomStreamResponseBody body);

        @Override
        ForbidLiveCustomStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ForbidLiveCustomStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ForbidLiveCustomStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ForbidLiveCustomStreamResponse response) {
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
        public Builder body(ForbidLiveCustomStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ForbidLiveCustomStreamResponse build() {
            return new ForbidLiveCustomStreamResponse(this);
        } 

    } 

}
