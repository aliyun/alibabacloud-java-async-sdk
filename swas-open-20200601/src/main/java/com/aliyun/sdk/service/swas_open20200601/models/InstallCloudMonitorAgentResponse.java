// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallCloudMonitorAgentResponse} extends {@link TeaModel}
 *
 * <p>InstallCloudMonitorAgentResponse</p>
 */
public class InstallCloudMonitorAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallCloudMonitorAgentResponseBody body;

    private InstallCloudMonitorAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallCloudMonitorAgentResponse create() {
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
    public InstallCloudMonitorAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallCloudMonitorAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallCloudMonitorAgentResponseBody body);

        @Override
        InstallCloudMonitorAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallCloudMonitorAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallCloudMonitorAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallCloudMonitorAgentResponse response) {
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
        public Builder body(InstallCloudMonitorAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallCloudMonitorAgentResponse build() {
            return new InstallCloudMonitorAgentResponse(this);
        } 

    } 

}
