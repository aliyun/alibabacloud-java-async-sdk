// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkflowExecuteInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkflowExecuteInfoResponse</p>
 */
public class UpdateWorkflowExecuteInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkflowExecuteInfoResponseBody body;

    private UpdateWorkflowExecuteInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkflowExecuteInfoResponse create() {
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
    public UpdateWorkflowExecuteInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkflowExecuteInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkflowExecuteInfoResponseBody body);

        @Override
        UpdateWorkflowExecuteInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkflowExecuteInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkflowExecuteInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkflowExecuteInfoResponse response) {
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
        public Builder body(UpdateWorkflowExecuteInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkflowExecuteInfoResponse build() {
            return new UpdateWorkflowExecuteInfoResponse(this);
        } 

    } 

}
