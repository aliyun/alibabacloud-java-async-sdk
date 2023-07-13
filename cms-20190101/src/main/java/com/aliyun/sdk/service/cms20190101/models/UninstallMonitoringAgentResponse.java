// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallMonitoringAgentResponse} extends {@link TeaModel}
 *
 * <p>UninstallMonitoringAgentResponse</p>
 */
public class UninstallMonitoringAgentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallMonitoringAgentResponseBody body;

    private UninstallMonitoringAgentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallMonitoringAgentResponse create() {
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
    public UninstallMonitoringAgentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallMonitoringAgentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallMonitoringAgentResponseBody body);

        @Override
        UninstallMonitoringAgentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallMonitoringAgentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallMonitoringAgentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallMonitoringAgentResponse response) {
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
        public Builder body(UninstallMonitoringAgentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallMonitoringAgentResponse build() {
            return new UninstallMonitoringAgentResponse(this);
        } 

    } 

}
