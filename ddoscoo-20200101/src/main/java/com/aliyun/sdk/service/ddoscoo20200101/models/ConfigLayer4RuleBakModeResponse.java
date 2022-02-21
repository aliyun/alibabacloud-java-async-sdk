// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RuleBakModeResponse} extends {@link TeaModel}
 *
 * <p>ConfigLayer4RuleBakModeResponse</p>
 */
public class ConfigLayer4RuleBakModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigLayer4RuleBakModeResponseBody body;

    private ConfigLayer4RuleBakModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigLayer4RuleBakModeResponse create() {
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
    public ConfigLayer4RuleBakModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigLayer4RuleBakModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigLayer4RuleBakModeResponseBody body);

        @Override
        ConfigLayer4RuleBakModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigLayer4RuleBakModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigLayer4RuleBakModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigLayer4RuleBakModeResponse response) {
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
        public Builder body(ConfigLayer4RuleBakModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigLayer4RuleBakModeResponse build() {
            return new ConfigLayer4RuleBakModeResponse(this);
        } 

    } 

}
