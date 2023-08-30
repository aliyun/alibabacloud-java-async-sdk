// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigureSynchronizationJobResponse} extends {@link TeaModel}
 *
 * <p>ConfigureSynchronizationJobResponse</p>
 */
public class ConfigureSynchronizationJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ConfigureSynchronizationJobResponseBody body;

    private ConfigureSynchronizationJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ConfigureSynchronizationJobResponse create() {
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
    public ConfigureSynchronizationJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ConfigureSynchronizationJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ConfigureSynchronizationJobResponseBody body);

        @Override
        ConfigureSynchronizationJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ConfigureSynchronizationJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ConfigureSynchronizationJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ConfigureSynchronizationJobResponse response) {
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
        public Builder body(ConfigureSynchronizationJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ConfigureSynchronizationJobResponse build() {
            return new ConfigureSynchronizationJobResponse(this);
        } 

    } 

}
