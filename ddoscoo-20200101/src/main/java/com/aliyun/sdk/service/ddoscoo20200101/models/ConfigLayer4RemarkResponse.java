// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RemarkResponse} extends {@link TeaModel}
 *
 * <p>ConfigLayer4RemarkResponse</p>
 */
public class ConfigLayer4RemarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigLayer4RemarkResponseBody body;

    private ConfigLayer4RemarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigLayer4RemarkResponse create() {
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
    public ConfigLayer4RemarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigLayer4RemarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigLayer4RemarkResponseBody body);

        @Override
        ConfigLayer4RemarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigLayer4RemarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigLayer4RemarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigLayer4RemarkResponse response) {
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
        public Builder body(ConfigLayer4RemarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigLayer4RemarkResponse build() {
            return new ConfigLayer4RemarkResponse(this);
        } 

    } 

}
