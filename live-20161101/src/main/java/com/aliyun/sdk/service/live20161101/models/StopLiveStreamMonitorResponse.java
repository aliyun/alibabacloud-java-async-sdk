// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLiveStreamMonitorResponse} extends {@link TeaModel}
 *
 * <p>StopLiveStreamMonitorResponse</p>
 */
public class StopLiveStreamMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopLiveStreamMonitorResponseBody body;

    private StopLiveStreamMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopLiveStreamMonitorResponse create() {
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
    public StopLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopLiveStreamMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopLiveStreamMonitorResponseBody body);

        @Override
        StopLiveStreamMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopLiveStreamMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopLiveStreamMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopLiveStreamMonitorResponse response) {
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
        public Builder body(StopLiveStreamMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopLiveStreamMonitorResponse build() {
            return new StopLiveStreamMonitorResponse(this);
        } 

    } 

}
