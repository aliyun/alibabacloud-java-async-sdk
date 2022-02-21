// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableWorkflowResponse} extends {@link TeaModel}
 *
 * <p>EnableWorkflowResponse</p>
 */
public class EnableWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableWorkflowResponseBody body;

    private EnableWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableWorkflowResponse create() {
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
    public EnableWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableWorkflowResponseBody body);

        @Override
        EnableWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableWorkflowResponse response) {
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
        public Builder body(EnableWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableWorkflowResponse build() {
            return new EnableWorkflowResponse(this);
        } 

    } 

}
