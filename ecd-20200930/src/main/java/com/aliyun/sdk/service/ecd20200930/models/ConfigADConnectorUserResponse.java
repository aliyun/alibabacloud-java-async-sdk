// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigADConnectorUserResponse} extends {@link TeaModel}
 *
 * <p>ConfigADConnectorUserResponse</p>
 */
public class ConfigADConnectorUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigADConnectorUserResponseBody body;

    private ConfigADConnectorUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigADConnectorUserResponse create() {
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
    public ConfigADConnectorUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigADConnectorUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigADConnectorUserResponseBody body);

        @Override
        ConfigADConnectorUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigADConnectorUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigADConnectorUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigADConnectorUserResponse response) {
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
        public Builder body(ConfigADConnectorUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigADConnectorUserResponse build() {
            return new ConfigADConnectorUserResponse(this);
        } 

    } 

}
