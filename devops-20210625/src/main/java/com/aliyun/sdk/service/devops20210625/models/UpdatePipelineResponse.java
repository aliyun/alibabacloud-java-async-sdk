// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineResponse} extends {@link TeaModel}
 *
 * <p>UpdatePipelineResponse</p>
 */
public class UpdatePipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePipelineResponseBody body;

    private UpdatePipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePipelineResponse create() {
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
    public UpdatePipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePipelineResponseBody body);

        @Override
        UpdatePipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePipelineResponse response) {
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
        public Builder body(UpdatePipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePipelineResponse build() {
            return new UpdatePipelineResponse(this);
        } 

    } 

}
