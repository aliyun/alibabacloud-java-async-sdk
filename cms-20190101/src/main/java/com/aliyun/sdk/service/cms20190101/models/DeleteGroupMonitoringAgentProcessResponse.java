// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGroupMonitoringAgentProcessResponse} extends {@link TeaModel}
 *
 * <p>DeleteGroupMonitoringAgentProcessResponse</p>
 */
public class DeleteGroupMonitoringAgentProcessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGroupMonitoringAgentProcessResponseBody body;

    private DeleteGroupMonitoringAgentProcessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGroupMonitoringAgentProcessResponse create() {
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
    public DeleteGroupMonitoringAgentProcessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGroupMonitoringAgentProcessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGroupMonitoringAgentProcessResponseBody body);

        @Override
        DeleteGroupMonitoringAgentProcessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGroupMonitoringAgentProcessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGroupMonitoringAgentProcessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGroupMonitoringAgentProcessResponse response) {
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
        public Builder body(DeleteGroupMonitoringAgentProcessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGroupMonitoringAgentProcessResponse build() {
            return new DeleteGroupMonitoringAgentProcessResponse(this);
        } 

    } 

}
