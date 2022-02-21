// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecutePipelineResponse} extends {@link TeaModel}
 *
 * <p>ExecutePipelineResponse</p>
 */
public class ExecutePipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecutePipelineResponseBody body;

    private ExecutePipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecutePipelineResponse create() {
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
    public ExecutePipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecutePipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecutePipelineResponseBody body);

        @Override
        ExecutePipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecutePipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecutePipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecutePipelineResponse response) {
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
        public Builder body(ExecutePipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecutePipelineResponse build() {
            return new ExecutePipelineResponse(this);
        } 

    } 

}
