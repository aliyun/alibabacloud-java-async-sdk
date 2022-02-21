// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineConfigurationResponse} extends {@link TeaModel}
 *
 * <p>CreatePipelineConfigurationResponse</p>
 */
public class CreatePipelineConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePipelineConfigurationResponseBody body;

    private CreatePipelineConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePipelineConfigurationResponse create() {
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
    public CreatePipelineConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePipelineConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePipelineConfigurationResponseBody body);

        @Override
        CreatePipelineConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePipelineConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePipelineConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePipelineConfigurationResponse response) {
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
        public Builder body(CreatePipelineConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineConfigurationResponse build() {
            return new CreatePipelineConfigurationResponse(this);
        } 

    } 

}
