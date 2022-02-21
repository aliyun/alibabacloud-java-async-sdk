// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetworkRulesResponse} extends {@link TeaModel}
 *
 * <p>ConfigNetworkRulesResponse</p>
 */
public class ConfigNetworkRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigNetworkRulesResponseBody body;

    private ConfigNetworkRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigNetworkRulesResponse create() {
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
    public ConfigNetworkRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigNetworkRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigNetworkRulesResponseBody body);

        @Override
        ConfigNetworkRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigNetworkRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigNetworkRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigNetworkRulesResponse response) {
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
        public Builder body(ConfigNetworkRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigNetworkRulesResponse build() {
            return new ConfigNetworkRulesResponse(this);
        } 

    } 

}
