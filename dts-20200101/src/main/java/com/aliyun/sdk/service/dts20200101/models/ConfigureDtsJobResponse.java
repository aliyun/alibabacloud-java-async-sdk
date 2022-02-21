// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureDtsJobResponse} extends {@link TeaModel}
 *
 * <p>ConfigureDtsJobResponse</p>
 */
public class ConfigureDtsJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureDtsJobResponseBody body;

    private ConfigureDtsJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureDtsJobResponse create() {
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
    public ConfigureDtsJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureDtsJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureDtsJobResponseBody body);

        @Override
        ConfigureDtsJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureDtsJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureDtsJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureDtsJobResponse response) {
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
        public Builder body(ConfigureDtsJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureDtsJobResponse build() {
            return new ConfigureDtsJobResponse(this);
        } 

    } 

}
