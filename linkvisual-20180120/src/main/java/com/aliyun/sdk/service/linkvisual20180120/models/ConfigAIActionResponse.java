// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigAIActionResponse} extends {@link TeaModel}
 *
 * <p>ConfigAIActionResponse</p>
 */
public class ConfigAIActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigAIActionResponseBody body;

    private ConfigAIActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigAIActionResponse create() {
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
    public ConfigAIActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigAIActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigAIActionResponseBody body);

        @Override
        ConfigAIActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigAIActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigAIActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigAIActionResponse response) {
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
        public Builder body(ConfigAIActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigAIActionResponse build() {
            return new ConfigAIActionResponse(this);
        } 

    } 

}
