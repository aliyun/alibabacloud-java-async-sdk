// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveStreamMonitorConfigResponse} extends {@link TeaModel}
 *
 * <p>SetLiveStreamMonitorConfigResponse</p>
 */
public class SetLiveStreamMonitorConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLiveStreamMonitorConfigResponseBody body;

    private SetLiveStreamMonitorConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLiveStreamMonitorConfigResponse create() {
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
    public SetLiveStreamMonitorConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLiveStreamMonitorConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLiveStreamMonitorConfigResponseBody body);

        @Override
        SetLiveStreamMonitorConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLiveStreamMonitorConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLiveStreamMonitorConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLiveStreamMonitorConfigResponse response) {
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
        public Builder body(SetLiveStreamMonitorConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLiveStreamMonitorConfigResponse build() {
            return new SetLiveStreamMonitorConfigResponse(this);
        } 

    } 

}
