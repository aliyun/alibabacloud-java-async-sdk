// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartWorkflowResponse} extends {@link TeaModel}
 *
 * <p>RestartWorkflowResponse</p>
 */
public class RestartWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartWorkflowResponseBody body;

    private RestartWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartWorkflowResponse create() {
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
    public RestartWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartWorkflowResponseBody body);

        @Override
        RestartWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartWorkflowResponse response) {
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
        public Builder body(RestartWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartWorkflowResponse build() {
            return new RestartWorkflowResponse(this);
        } 

    } 

}
