// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosdiversion20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigNetStatusResponse} extends {@link TeaModel}
 *
 * <p>ConfigNetStatusResponse</p>
 */
public class ConfigNetStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigNetStatusResponseBody body;

    private ConfigNetStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigNetStatusResponse create() {
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
    public ConfigNetStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigNetStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigNetStatusResponseBody body);

        @Override
        ConfigNetStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigNetStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigNetStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigNetStatusResponse response) {
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
        public Builder body(ConfigNetStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigNetStatusResponse build() {
            return new ConfigNetStatusResponse(this);
        } 

    } 

}
