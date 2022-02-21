// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopMigrationWorkflowResponse} extends {@link TeaModel}
 *
 * <p>StopMigrationWorkflowResponse</p>
 */
public class StopMigrationWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopMigrationWorkflowResponseBody body;

    private StopMigrationWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopMigrationWorkflowResponse create() {
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
    public StopMigrationWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopMigrationWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopMigrationWorkflowResponseBody body);

        @Override
        StopMigrationWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopMigrationWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopMigrationWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopMigrationWorkflowResponse response) {
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
        public Builder body(StopMigrationWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopMigrationWorkflowResponse build() {
            return new StopMigrationWorkflowResponse(this);
        } 

    } 

}
