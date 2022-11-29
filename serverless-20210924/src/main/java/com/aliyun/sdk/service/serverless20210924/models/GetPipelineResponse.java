// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineResponse</p>
 */
public class GetPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Pipeline body;

    private GetPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineResponse create() {
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
    public Pipeline getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Pipeline body);

        @Override
        GetPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Pipeline body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineResponse response) {
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
        public Builder body(Pipeline body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineResponse build() {
            return new GetPipelineResponse(this);
        } 

    } 

}
