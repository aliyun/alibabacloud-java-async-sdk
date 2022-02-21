// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunExecutionPlanResponse} extends {@link TeaModel}
 *
 * <p>RunExecutionPlanResponse</p>
 */
public class RunExecutionPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunExecutionPlanResponseBody body;

    private RunExecutionPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunExecutionPlanResponse create() {
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
    public RunExecutionPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunExecutionPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunExecutionPlanResponseBody body);

        @Override
        RunExecutionPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunExecutionPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunExecutionPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunExecutionPlanResponse response) {
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
        public Builder body(RunExecutionPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunExecutionPlanResponse build() {
            return new RunExecutionPlanResponse(this);
        } 

    } 

}
