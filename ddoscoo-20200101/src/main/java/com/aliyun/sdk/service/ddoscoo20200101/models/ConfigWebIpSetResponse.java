// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigWebIpSetResponse} extends {@link TeaModel}
 *
 * <p>ConfigWebIpSetResponse</p>
 */
public class ConfigWebIpSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigWebIpSetResponseBody body;

    private ConfigWebIpSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigWebIpSetResponse create() {
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
    public ConfigWebIpSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigWebIpSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigWebIpSetResponseBody body);

        @Override
        ConfigWebIpSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigWebIpSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigWebIpSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigWebIpSetResponse response) {
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
        public Builder body(ConfigWebIpSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigWebIpSetResponse build() {
            return new ConfigWebIpSetResponse(this);
        } 

    } 

}
