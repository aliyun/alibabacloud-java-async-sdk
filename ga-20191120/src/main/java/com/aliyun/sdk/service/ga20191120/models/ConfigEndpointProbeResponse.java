// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigEndpointProbeResponse} extends {@link TeaModel}
 *
 * <p>ConfigEndpointProbeResponse</p>
 */
public class ConfigEndpointProbeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigEndpointProbeResponseBody body;

    private ConfigEndpointProbeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigEndpointProbeResponse create() {
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
    public ConfigEndpointProbeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigEndpointProbeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigEndpointProbeResponseBody body);

        @Override
        ConfigEndpointProbeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigEndpointProbeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigEndpointProbeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigEndpointProbeResponse response) {
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
        public Builder body(ConfigEndpointProbeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigEndpointProbeResponse build() {
            return new ConfigEndpointProbeResponse(this);
        } 

    } 

}
