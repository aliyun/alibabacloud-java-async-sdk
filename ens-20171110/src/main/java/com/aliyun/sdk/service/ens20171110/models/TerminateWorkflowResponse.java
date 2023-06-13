// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateWorkflowResponse} extends {@link TeaModel}
 *
 * <p>TerminateWorkflowResponse</p>
 */
public class TerminateWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TerminateWorkflowResponseBody body;

    private TerminateWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TerminateWorkflowResponse create() {
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
    public TerminateWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TerminateWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TerminateWorkflowResponseBody body);

        @Override
        TerminateWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TerminateWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TerminateWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TerminateWorkflowResponse response) {
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
        public Builder body(TerminateWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TerminateWorkflowResponse build() {
            return new TerminateWorkflowResponse(this);
        } 

    } 

}
