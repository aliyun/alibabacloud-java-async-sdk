// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineRunResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineRunResponse</p>
 */
public class GetPipelineRunResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineRunResponseBody body;

    private GetPipelineRunResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineRunResponse create() {
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
    public GetPipelineRunResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineRunResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineRunResponseBody body);

        @Override
        GetPipelineRunResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineRunResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineRunResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineRunResponse response) {
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
        public Builder body(GetPipelineRunResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineRunResponse build() {
            return new GetPipelineRunResponse(this);
        } 

    } 

}
