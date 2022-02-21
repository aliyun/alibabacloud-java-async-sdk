// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSubscriptionResponse} extends {@link TeaModel}
 *
 * <p>ConfigureSubscriptionResponse</p>
 */
public class ConfigureSubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureSubscriptionResponseBody body;

    private ConfigureSubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureSubscriptionResponse create() {
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
    public ConfigureSubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureSubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureSubscriptionResponseBody body);

        @Override
        ConfigureSubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureSubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureSubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureSubscriptionResponse response) {
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
        public Builder body(ConfigureSubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureSubscriptionResponse build() {
            return new ConfigureSubscriptionResponse(this);
        } 

    } 

}
