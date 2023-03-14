// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigHealthCheckResponse} extends {@link TeaModel}
 *
 * <p>ConfigHealthCheckResponse</p>
 */
public class ConfigHealthCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigHealthCheckResponseBody body;

    private ConfigHealthCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigHealthCheckResponse create() {
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
    public ConfigHealthCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigHealthCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigHealthCheckResponseBody body);

        @Override
        ConfigHealthCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigHealthCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigHealthCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigHealthCheckResponse response) {
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
        public Builder body(ConfigHealthCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigHealthCheckResponse build() {
            return new ConfigHealthCheckResponse(this);
        } 

    } 

}
