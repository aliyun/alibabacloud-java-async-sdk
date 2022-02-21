// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSynchronizationJobAlertResponse} extends {@link TeaModel}
 *
 * <p>ConfigureSynchronizationJobAlertResponse</p>
 */
public class ConfigureSynchronizationJobAlertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureSynchronizationJobAlertResponseBody body;

    private ConfigureSynchronizationJobAlertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureSynchronizationJobAlertResponse create() {
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
    public ConfigureSynchronizationJobAlertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureSynchronizationJobAlertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureSynchronizationJobAlertResponseBody body);

        @Override
        ConfigureSynchronizationJobAlertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureSynchronizationJobAlertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureSynchronizationJobAlertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureSynchronizationJobAlertResponse response) {
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
        public Builder body(ConfigureSynchronizationJobAlertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureSynchronizationJobAlertResponse build() {
            return new ConfigureSynchronizationJobAlertResponse(this);
        } 

    } 

}
