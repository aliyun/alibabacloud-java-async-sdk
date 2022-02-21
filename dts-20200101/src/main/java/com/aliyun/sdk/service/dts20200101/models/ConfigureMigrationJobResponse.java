// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureMigrationJobResponse} extends {@link TeaModel}
 *
 * <p>ConfigureMigrationJobResponse</p>
 */
public class ConfigureMigrationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureMigrationJobResponseBody body;

    private ConfigureMigrationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureMigrationJobResponse create() {
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
    public ConfigureMigrationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureMigrationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureMigrationJobResponseBody body);

        @Override
        ConfigureMigrationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureMigrationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureMigrationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureMigrationJobResponse response) {
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
        public Builder body(ConfigureMigrationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureMigrationJobResponse build() {
            return new ConfigureMigrationJobResponse(this);
        } 

    } 

}
