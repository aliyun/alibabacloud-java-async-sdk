// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineFromTemplateResponse} extends {@link TeaModel}
 *
 * <p>CreatePipelineFromTemplateResponse</p>
 */
public class CreatePipelineFromTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePipelineFromTemplateResponseBody body;

    private CreatePipelineFromTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePipelineFromTemplateResponse create() {
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
    public CreatePipelineFromTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePipelineFromTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePipelineFromTemplateResponseBody body);

        @Override
        CreatePipelineFromTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePipelineFromTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePipelineFromTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePipelineFromTemplateResponse response) {
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
        public Builder body(CreatePipelineFromTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineFromTemplateResponse build() {
            return new CreatePipelineFromTemplateResponse(this);
        } 

    } 

}
