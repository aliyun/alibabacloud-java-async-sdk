// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetworkRulesTfResponse} extends {@link TeaModel}
 *
 * <p>ConfigNetworkRulesTfResponse</p>
 */
public class ConfigNetworkRulesTfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigNetworkRulesTfResponseBody body;

    private ConfigNetworkRulesTfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigNetworkRulesTfResponse create() {
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
    public ConfigNetworkRulesTfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigNetworkRulesTfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigNetworkRulesTfResponseBody body);

        @Override
        ConfigNetworkRulesTfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigNetworkRulesTfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigNetworkRulesTfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigNetworkRulesTfResponse response) {
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
        public Builder body(ConfigNetworkRulesTfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigNetworkRulesTfResponse build() {
            return new ConfigNetworkRulesTfResponse(this);
        } 

    } 

}
