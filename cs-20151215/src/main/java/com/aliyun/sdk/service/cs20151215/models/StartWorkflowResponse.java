// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartWorkflowResponse} extends {@link TeaModel}
 *
 * <p>StartWorkflowResponse</p>
 */
public class StartWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartWorkflowResponseBody body;

    private StartWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartWorkflowResponse create() {
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
    public StartWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartWorkflowResponseBody body);

        @Override
        StartWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartWorkflowResponse response) {
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
        public Builder body(StartWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartWorkflowResponse build() {
            return new StartWorkflowResponse(this);
        } 

    } 

}
