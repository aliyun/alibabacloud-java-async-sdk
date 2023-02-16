// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkflowResponse} extends {@link TeaModel}
 *
 * <p>CreateWorkflowResponse</p>
 */
public class CreateWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWorkflowResponseBody body;

    private CreateWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWorkflowResponse create() {
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
    public CreateWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWorkflowResponseBody body);

        @Override
        CreateWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWorkflowResponse response) {
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
        public Builder body(CreateWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWorkflowResponse build() {
            return new CreateWorkflowResponse(this);
        } 

    } 

}
