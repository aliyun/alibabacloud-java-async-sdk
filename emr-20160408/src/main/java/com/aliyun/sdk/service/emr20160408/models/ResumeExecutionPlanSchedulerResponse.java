// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeExecutionPlanSchedulerResponse} extends {@link TeaModel}
 *
 * <p>ResumeExecutionPlanSchedulerResponse</p>
 */
public class ResumeExecutionPlanSchedulerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeExecutionPlanSchedulerResponseBody body;

    private ResumeExecutionPlanSchedulerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeExecutionPlanSchedulerResponse create() {
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
    public ResumeExecutionPlanSchedulerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeExecutionPlanSchedulerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeExecutionPlanSchedulerResponseBody body);

        @Override
        ResumeExecutionPlanSchedulerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeExecutionPlanSchedulerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeExecutionPlanSchedulerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeExecutionPlanSchedulerResponse response) {
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
        public Builder body(ResumeExecutionPlanSchedulerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeExecutionPlanSchedulerResponse build() {
            return new ResumeExecutionPlanSchedulerResponse(this);
        } 

    } 

}
