// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCensorPipelineResponse} extends {@link TeaModel}
 *
 * <p>UpdateCensorPipelineResponse</p>
 */
public class UpdateCensorPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCensorPipelineResponseBody body;

    private UpdateCensorPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCensorPipelineResponse create() {
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
    public UpdateCensorPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCensorPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCensorPipelineResponseBody body);

        @Override
        UpdateCensorPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCensorPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCensorPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCensorPipelineResponse response) {
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
        public Builder body(UpdateCensorPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCensorPipelineResponse build() {
            return new UpdateCensorPipelineResponse(this);
        } 

    } 

}
