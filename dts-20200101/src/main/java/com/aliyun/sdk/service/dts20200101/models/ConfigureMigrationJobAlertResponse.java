// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureMigrationJobAlertResponse} extends {@link TeaModel}
 *
 * <p>ConfigureMigrationJobAlertResponse</p>
 */
public class ConfigureMigrationJobAlertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureMigrationJobAlertResponseBody body;

    private ConfigureMigrationJobAlertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureMigrationJobAlertResponse create() {
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
    public ConfigureMigrationJobAlertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureMigrationJobAlertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureMigrationJobAlertResponseBody body);

        @Override
        ConfigureMigrationJobAlertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureMigrationJobAlertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureMigrationJobAlertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureMigrationJobAlertResponse response) {
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
        public Builder body(ConfigureMigrationJobAlertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureMigrationJobAlertResponse build() {
            return new ConfigureMigrationJobAlertResponse(this);
        } 

    } 

}
