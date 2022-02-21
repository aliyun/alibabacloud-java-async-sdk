// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteWorkflowResponse} extends {@link TeaModel}
 *
 * <p>ExecuteWorkflowResponse</p>
 */
public class ExecuteWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteWorkflowResponseBody body;

    private ExecuteWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteWorkflowResponse create() {
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
    public ExecuteWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteWorkflowResponseBody body);

        @Override
        ExecuteWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteWorkflowResponse response) {
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
        public Builder body(ExecuteWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteWorkflowResponse build() {
            return new ExecuteWorkflowResponse(this);
        } 

    } 

}
