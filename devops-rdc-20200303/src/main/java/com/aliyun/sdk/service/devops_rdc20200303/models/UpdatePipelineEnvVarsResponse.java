// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineEnvVarsResponse} extends {@link TeaModel}
 *
 * <p>UpdatePipelineEnvVarsResponse</p>
 */
public class UpdatePipelineEnvVarsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePipelineEnvVarsResponseBody body;

    private UpdatePipelineEnvVarsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePipelineEnvVarsResponse create() {
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
    public UpdatePipelineEnvVarsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePipelineEnvVarsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePipelineEnvVarsResponseBody body);

        @Override
        UpdatePipelineEnvVarsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePipelineEnvVarsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePipelineEnvVarsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePipelineEnvVarsResponse response) {
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
        public Builder body(UpdatePipelineEnvVarsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePipelineEnvVarsResponse build() {
            return new UpdatePipelineEnvVarsResponse(this);
        } 

    } 

}
