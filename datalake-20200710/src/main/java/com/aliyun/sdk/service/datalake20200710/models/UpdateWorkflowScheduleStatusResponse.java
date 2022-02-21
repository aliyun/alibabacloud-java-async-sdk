// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkflowScheduleStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkflowScheduleStatusResponse</p>
 */
public class UpdateWorkflowScheduleStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkflowScheduleStatusResponseBody body;

    private UpdateWorkflowScheduleStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkflowScheduleStatusResponse create() {
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
    public UpdateWorkflowScheduleStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkflowScheduleStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkflowScheduleStatusResponseBody body);

        @Override
        UpdateWorkflowScheduleStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkflowScheduleStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkflowScheduleStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkflowScheduleStatusResponse response) {
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
        public Builder body(UpdateWorkflowScheduleStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkflowScheduleStatusResponse build() {
            return new UpdateWorkflowScheduleStatusResponse(this);
        } 

    } 

}
