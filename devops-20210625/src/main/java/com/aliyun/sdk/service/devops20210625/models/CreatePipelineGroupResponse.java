// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePipelineGroupResponse} extends {@link TeaModel}
 *
 * <p>CreatePipelineGroupResponse</p>
 */
public class CreatePipelineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePipelineGroupResponseBody body;

    private CreatePipelineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePipelineGroupResponse create() {
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
    public CreatePipelineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePipelineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePipelineGroupResponseBody body);

        @Override
        CreatePipelineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePipelineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePipelineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePipelineGroupResponse response) {
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
        public Builder body(CreatePipelineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePipelineGroupResponse build() {
            return new CreatePipelineGroupResponse(this);
        } 

    } 

}
