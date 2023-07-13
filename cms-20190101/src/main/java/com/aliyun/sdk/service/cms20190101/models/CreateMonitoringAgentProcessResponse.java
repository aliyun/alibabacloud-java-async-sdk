// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitoringAgentProcessResponse} extends {@link TeaModel}
 *
 * <p>CreateMonitoringAgentProcessResponse</p>
 */
public class CreateMonitoringAgentProcessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMonitoringAgentProcessResponseBody body;

    private CreateMonitoringAgentProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMonitoringAgentProcessResponse create() {
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
    public CreateMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMonitoringAgentProcessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMonitoringAgentProcessResponseBody body);

        @Override
        CreateMonitoringAgentProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMonitoringAgentProcessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMonitoringAgentProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMonitoringAgentProcessResponse response) {
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
        public Builder body(CreateMonitoringAgentProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMonitoringAgentProcessResponse build() {
            return new CreateMonitoringAgentProcessResponse(this);
        } 

    } 

}
