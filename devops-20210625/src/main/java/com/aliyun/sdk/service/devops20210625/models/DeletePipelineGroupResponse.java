// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineGroupResponse} extends {@link TeaModel}
 *
 * <p>DeletePipelineGroupResponse</p>
 */
public class DeletePipelineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePipelineGroupResponseBody body;

    private DeletePipelineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePipelineGroupResponse create() {
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
    public DeletePipelineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePipelineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePipelineGroupResponseBody body);

        @Override
        DeletePipelineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePipelineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePipelineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePipelineGroupResponse response) {
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
        public Builder body(DeletePipelineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePipelineGroupResponse build() {
            return new DeletePipelineGroupResponse(this);
        } 

    } 

}
