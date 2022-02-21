// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceBuildNumberStatusResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineInstanceBuildNumberStatusResponse</p>
 */
public class GetPipelineInstanceBuildNumberStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineInstanceBuildNumberStatusResponseBody body;

    private GetPipelineInstanceBuildNumberStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineInstanceBuildNumberStatusResponse create() {
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
    public GetPipelineInstanceBuildNumberStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineInstanceBuildNumberStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineInstanceBuildNumberStatusResponseBody body);

        @Override
        GetPipelineInstanceBuildNumberStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineInstanceBuildNumberStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineInstanceBuildNumberStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineInstanceBuildNumberStatusResponse response) {
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
        public Builder body(GetPipelineInstanceBuildNumberStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineInstanceBuildNumberStatusResponse build() {
            return new GetPipelineInstanceBuildNumberStatusResponse(this);
        } 

    } 

}
