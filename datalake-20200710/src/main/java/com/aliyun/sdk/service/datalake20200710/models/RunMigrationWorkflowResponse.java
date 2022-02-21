// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunMigrationWorkflowResponse} extends {@link TeaModel}
 *
 * <p>RunMigrationWorkflowResponse</p>
 */
public class RunMigrationWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunMigrationWorkflowResponseBody body;

    private RunMigrationWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunMigrationWorkflowResponse create() {
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
    public RunMigrationWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunMigrationWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunMigrationWorkflowResponseBody body);

        @Override
        RunMigrationWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunMigrationWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunMigrationWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunMigrationWorkflowResponse response) {
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
        public Builder body(RunMigrationWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunMigrationWorkflowResponse build() {
            return new RunMigrationWorkflowResponse(this);
        } 

    } 

}
