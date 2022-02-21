// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>ConfigureBackupPlanResponse</p>
 */
public class ConfigureBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureBackupPlanResponseBody body;

    private ConfigureBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureBackupPlanResponse create() {
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
    public ConfigureBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureBackupPlanResponseBody body);

        @Override
        ConfigureBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureBackupPlanResponse response) {
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
        public Builder body(ConfigureBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureBackupPlanResponse build() {
            return new ConfigureBackupPlanResponse(this);
        } 

    } 

}
