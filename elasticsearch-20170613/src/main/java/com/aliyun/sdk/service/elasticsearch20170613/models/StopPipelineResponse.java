// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPipelineResponse} extends {@link TeaModel}
 *
 * <p>StopPipelineResponse</p>
 */
public class StopPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopPipelineResponseBody body;

    private StopPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopPipelineResponse create() {
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
    public StopPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopPipelineResponseBody body);

        @Override
        StopPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopPipelineResponse response) {
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
        public Builder body(StopPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopPipelineResponse build() {
            return new StopPipelineResponse(this);
        } 

    } 

}
