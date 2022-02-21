// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigL7RsPolicyResponse} extends {@link TeaModel}
 *
 * <p>ConfigL7RsPolicyResponse</p>
 */
public class ConfigL7RsPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigL7RsPolicyResponseBody body;

    private ConfigL7RsPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigL7RsPolicyResponse create() {
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
    public ConfigL7RsPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigL7RsPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigL7RsPolicyResponseBody body);

        @Override
        ConfigL7RsPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigL7RsPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigL7RsPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigL7RsPolicyResponse response) {
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
        public Builder body(ConfigL7RsPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigL7RsPolicyResponse build() {
            return new ConfigL7RsPolicyResponse(this);
        } 

    } 

}
