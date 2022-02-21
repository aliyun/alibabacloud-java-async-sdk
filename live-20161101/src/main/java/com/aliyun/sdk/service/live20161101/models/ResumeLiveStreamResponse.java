// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeLiveStreamResponse} extends {@link TeaModel}
 *
 * <p>ResumeLiveStreamResponse</p>
 */
public class ResumeLiveStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeLiveStreamResponseBody body;

    private ResumeLiveStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeLiveStreamResponse create() {
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
    public ResumeLiveStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeLiveStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeLiveStreamResponseBody body);

        @Override
        ResumeLiveStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeLiveStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeLiveStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeLiveStreamResponse response) {
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
        public Builder body(ResumeLiveStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeLiveStreamResponse build() {
            return new ResumeLiveStreamResponse(this);
        } 

    } 

}
