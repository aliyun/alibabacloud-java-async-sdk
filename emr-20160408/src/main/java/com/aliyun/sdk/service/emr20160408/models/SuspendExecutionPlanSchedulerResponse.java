// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendExecutionPlanSchedulerResponse} extends {@link TeaModel}
 *
 * <p>SuspendExecutionPlanSchedulerResponse</p>
 */
public class SuspendExecutionPlanSchedulerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendExecutionPlanSchedulerResponseBody body;

    private SuspendExecutionPlanSchedulerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendExecutionPlanSchedulerResponse create() {
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
    public SuspendExecutionPlanSchedulerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendExecutionPlanSchedulerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendExecutionPlanSchedulerResponseBody body);

        @Override
        SuspendExecutionPlanSchedulerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendExecutionPlanSchedulerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendExecutionPlanSchedulerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendExecutionPlanSchedulerResponse response) {
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
        public Builder body(SuspendExecutionPlanSchedulerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendExecutionPlanSchedulerResponse build() {
            return new SuspendExecutionPlanSchedulerResponse(this);
        } 

    } 

}
