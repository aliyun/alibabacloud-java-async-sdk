// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreatePipelineTemplateResponse</p>
 */
public class CreatePipelineTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PipelineTemplate body;

    private CreatePipelineTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePipelineTemplateResponse create() {
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
    public PipelineTemplate getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePipelineTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PipelineTemplate body);

        @Override
        CreatePipelineTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePipelineTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PipelineTemplate body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePipelineTemplateResponse response) {
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
        public Builder body(PipelineTemplate body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineTemplateResponse build() {
            return new CreatePipelineTemplateResponse(this);
        } 

    } 

}
