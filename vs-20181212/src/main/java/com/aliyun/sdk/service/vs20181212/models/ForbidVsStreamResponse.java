// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForbidVsStreamResponse} extends {@link TeaModel}
 *
 * <p>ForbidVsStreamResponse</p>
 */
public class ForbidVsStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ForbidVsStreamResponseBody body;

    private ForbidVsStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ForbidVsStreamResponse create() {
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
    public ForbidVsStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ForbidVsStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ForbidVsStreamResponseBody body);

        @Override
        ForbidVsStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ForbidVsStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ForbidVsStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ForbidVsStreamResponse response) {
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
        public Builder body(ForbidVsStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ForbidVsStreamResponse build() {
            return new ForbidVsStreamResponse(this);
        } 

    } 

}
