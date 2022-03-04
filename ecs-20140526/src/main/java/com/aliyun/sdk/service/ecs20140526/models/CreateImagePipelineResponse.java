// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImagePipelineResponse} extends {@link TeaModel}
 *
 * <p>CreateImagePipelineResponse</p>
 */
public class CreateImagePipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateImagePipelineResponseBody body;

    private CreateImagePipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateImagePipelineResponse create() {
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
    public CreateImagePipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateImagePipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateImagePipelineResponseBody body);

        @Override
        CreateImagePipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateImagePipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateImagePipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateImagePipelineResponse response) {
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
        public Builder body(CreateImagePipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateImagePipelineResponse build() {
            return new CreateImagePipelineResponse(this);
        } 

    } 

}
