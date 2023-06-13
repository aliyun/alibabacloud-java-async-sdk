// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryWorkflowResponse} extends {@link TeaModel}
 *
 * <p>RetryWorkflowResponse</p>
 */
public class RetryWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetryWorkflowResponseBody body;

    private RetryWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetryWorkflowResponse create() {
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
    public RetryWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetryWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetryWorkflowResponseBody body);

        @Override
        RetryWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetryWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetryWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetryWorkflowResponse response) {
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
        public Builder body(RetryWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetryWorkflowResponse build() {
            return new RetryWorkflowResponse(this);
        } 

    } 

}
