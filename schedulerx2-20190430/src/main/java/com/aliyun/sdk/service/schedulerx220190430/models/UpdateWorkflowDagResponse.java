// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkflowDagResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkflowDagResponse</p>
 */
public class UpdateWorkflowDagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkflowDagResponseBody body;

    private UpdateWorkflowDagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkflowDagResponse create() {
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
    public UpdateWorkflowDagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkflowDagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkflowDagResponseBody body);

        @Override
        UpdateWorkflowDagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkflowDagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkflowDagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkflowDagResponse response) {
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
        public Builder body(UpdateWorkflowDagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkflowDagResponse build() {
            return new UpdateWorkflowDagResponse(this);
        } 

    } 

}
