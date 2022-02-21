// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPipelineResponse} extends {@link TeaModel}
 *
 * <p>RunPipelineResponse</p>
 */
public class RunPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunPipelineResponseBody body;

    private RunPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunPipelineResponse create() {
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
    public RunPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunPipelineResponseBody body);

        @Override
        RunPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunPipelineResponse response) {
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
        public Builder body(RunPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunPipelineResponse build() {
            return new RunPipelineResponse(this);
        } 

    } 

}
