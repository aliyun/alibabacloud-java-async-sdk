// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutPipelineTemplateResponse} extends {@link TeaModel}
 *
 * <p>PutPipelineTemplateResponse</p>
 */
public class PutPipelineTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PipelineTemplate body;

    private PutPipelineTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutPipelineTemplateResponse create() {
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

    public interface Builder extends Response.Builder<PutPipelineTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PipelineTemplate body);

        @Override
        PutPipelineTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutPipelineTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PipelineTemplate body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutPipelineTemplateResponse response) {
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
        public PutPipelineTemplateResponse build() {
            return new PutPipelineTemplateResponse(this);
        } 

    } 

}
