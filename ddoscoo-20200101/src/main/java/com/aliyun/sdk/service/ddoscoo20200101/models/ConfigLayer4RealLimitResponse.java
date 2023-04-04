// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RealLimitResponse} extends {@link TeaModel}
 *
 * <p>ConfigLayer4RealLimitResponse</p>
 */
public class ConfigLayer4RealLimitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigLayer4RealLimitResponseBody body;

    private ConfigLayer4RealLimitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigLayer4RealLimitResponse create() {
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
    public ConfigLayer4RealLimitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigLayer4RealLimitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigLayer4RealLimitResponseBody body);

        @Override
        ConfigLayer4RealLimitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigLayer4RealLimitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigLayer4RealLimitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigLayer4RealLimitResponse response) {
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
        public Builder body(ConfigLayer4RealLimitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigLayer4RealLimitResponse build() {
            return new ConfigLayer4RealLimitResponse(this);
        } 

    } 

}
