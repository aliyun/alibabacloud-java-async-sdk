// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPipelineRunResponse} extends {@link TeaModel}
 *
 * <p>StartPipelineRunResponse</p>
 */
public class StartPipelineRunResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartPipelineRunResponseBody body;

    private StartPipelineRunResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartPipelineRunResponse create() {
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
    public StartPipelineRunResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartPipelineRunResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartPipelineRunResponseBody body);

        @Override
        StartPipelineRunResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartPipelineRunResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartPipelineRunResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartPipelineRunResponse response) {
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
        public Builder body(StartPipelineRunResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartPipelineRunResponse build() {
            return new StartPipelineRunResponse(this);
        } 

    } 

}
