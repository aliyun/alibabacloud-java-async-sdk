// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigUdpReflectResponse} extends {@link TeaModel}
 *
 * <p>ConfigUdpReflectResponse</p>
 */
public class ConfigUdpReflectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigUdpReflectResponseBody body;

    private ConfigUdpReflectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigUdpReflectResponse create() {
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
    public ConfigUdpReflectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigUdpReflectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigUdpReflectResponseBody body);

        @Override
        ConfigUdpReflectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigUdpReflectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigUdpReflectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigUdpReflectResponse response) {
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
        public Builder body(ConfigUdpReflectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigUdpReflectResponse build() {
            return new ConfigUdpReflectResponse(this);
        } 

    } 

}
