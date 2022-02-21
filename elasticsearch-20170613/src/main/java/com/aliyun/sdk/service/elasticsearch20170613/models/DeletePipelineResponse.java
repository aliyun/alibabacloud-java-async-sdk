// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineResponse} extends {@link TeaModel}
 *
 * <p>DeletePipelineResponse</p>
 */
public class DeletePipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePipelineResponseBody body;

    private DeletePipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePipelineResponse create() {
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
    public DeletePipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePipelineResponseBody body);

        @Override
        DeletePipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePipelineResponse response) {
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
        public Builder body(DeletePipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePipelineResponse build() {
            return new DeletePipelineResponse(this);
        } 

    } 

}
