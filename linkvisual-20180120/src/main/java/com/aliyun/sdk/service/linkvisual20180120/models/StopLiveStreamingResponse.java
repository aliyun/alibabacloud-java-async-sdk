// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLiveStreamingResponse} extends {@link TeaModel}
 *
 * <p>StopLiveStreamingResponse</p>
 */
public class StopLiveStreamingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopLiveStreamingResponseBody body;

    private StopLiveStreamingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopLiveStreamingResponse create() {
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
    public StopLiveStreamingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopLiveStreamingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopLiveStreamingResponseBody body);

        @Override
        StopLiveStreamingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopLiveStreamingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopLiveStreamingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopLiveStreamingResponse response) {
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
        public Builder body(StopLiveStreamingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopLiveStreamingResponse build() {
            return new StopLiveStreamingResponse(this);
        } 

    } 

}
