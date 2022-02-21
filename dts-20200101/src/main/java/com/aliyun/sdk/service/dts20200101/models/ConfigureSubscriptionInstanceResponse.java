// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSubscriptionInstanceResponse} extends {@link TeaModel}
 *
 * <p>ConfigureSubscriptionInstanceResponse</p>
 */
public class ConfigureSubscriptionInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureSubscriptionInstanceResponseBody body;

    private ConfigureSubscriptionInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureSubscriptionInstanceResponse create() {
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
    public ConfigureSubscriptionInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureSubscriptionInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureSubscriptionInstanceResponseBody body);

        @Override
        ConfigureSubscriptionInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureSubscriptionInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureSubscriptionInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureSubscriptionInstanceResponse response) {
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
        public Builder body(ConfigureSubscriptionInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureSubscriptionInstanceResponse build() {
            return new ConfigureSubscriptionInstanceResponse(this);
        } 

    } 

}
