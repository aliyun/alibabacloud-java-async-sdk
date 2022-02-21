// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLiveStreamMonitorResponse} extends {@link TeaModel}
 *
 * <p>StartLiveStreamMonitorResponse</p>
 */
public class StartLiveStreamMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartLiveStreamMonitorResponseBody body;

    private StartLiveStreamMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartLiveStreamMonitorResponse create() {
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
    public StartLiveStreamMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartLiveStreamMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartLiveStreamMonitorResponseBody body);

        @Override
        StartLiveStreamMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartLiveStreamMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartLiveStreamMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartLiveStreamMonitorResponse response) {
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
        public Builder body(StartLiveStreamMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartLiveStreamMonitorResponse build() {
            return new StartLiveStreamMonitorResponse(this);
        } 

    } 

}
