// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitoringAgentProcessResponse} extends {@link TeaModel}
 *
 * <p>DeleteMonitoringAgentProcessResponse</p>
 */
public class DeleteMonitoringAgentProcessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMonitoringAgentProcessResponseBody body;

    private DeleteMonitoringAgentProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMonitoringAgentProcessResponse create() {
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
    public DeleteMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMonitoringAgentProcessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMonitoringAgentProcessResponseBody body);

        @Override
        DeleteMonitoringAgentProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMonitoringAgentProcessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMonitoringAgentProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMonitoringAgentProcessResponse response) {
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
        public Builder body(DeleteMonitoringAgentProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMonitoringAgentProcessResponse build() {
            return new DeleteMonitoringAgentProcessResponse(this);
        } 

    } 

}
