// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunBlueprintInstanceWorkflowResponse} extends {@link TeaModel}
 *
 * <p>RunBlueprintInstanceWorkflowResponse</p>
 */
public class RunBlueprintInstanceWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunBlueprintInstanceWorkflowResponseBody body;

    private RunBlueprintInstanceWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunBlueprintInstanceWorkflowResponse create() {
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
    public RunBlueprintInstanceWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunBlueprintInstanceWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunBlueprintInstanceWorkflowResponseBody body);

        @Override
        RunBlueprintInstanceWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunBlueprintInstanceWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunBlueprintInstanceWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunBlueprintInstanceWorkflowResponse response) {
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
        public Builder body(RunBlueprintInstanceWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunBlueprintInstanceWorkflowResponse build() {
            return new RunBlueprintInstanceWorkflowResponse(this);
        } 

    } 

}
