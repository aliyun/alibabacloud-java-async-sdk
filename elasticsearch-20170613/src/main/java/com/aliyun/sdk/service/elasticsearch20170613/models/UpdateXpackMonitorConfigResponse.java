// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateXpackMonitorConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateXpackMonitorConfigResponse</p>
 */
public class UpdateXpackMonitorConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateXpackMonitorConfigResponseBody body;

    private UpdateXpackMonitorConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateXpackMonitorConfigResponse create() {
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
    public UpdateXpackMonitorConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateXpackMonitorConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateXpackMonitorConfigResponseBody body);

        @Override
        UpdateXpackMonitorConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateXpackMonitorConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateXpackMonitorConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateXpackMonitorConfigResponse response) {
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
        public Builder body(UpdateXpackMonitorConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateXpackMonitorConfigResponse build() {
            return new UpdateXpackMonitorConfigResponse(this);
        } 

    } 

}
