// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceGroupStatusResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineInstanceGroupStatusResponse</p>
 */
public class GetPipelineInstanceGroupStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineInstanceGroupStatusResponseBody body;

    private GetPipelineInstanceGroupStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineInstanceGroupStatusResponse create() {
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
    public GetPipelineInstanceGroupStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineInstanceGroupStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineInstanceGroupStatusResponseBody body);

        @Override
        GetPipelineInstanceGroupStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineInstanceGroupStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineInstanceGroupStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineInstanceGroupStatusResponse response) {
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
        public Builder body(GetPipelineInstanceGroupStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineInstanceGroupStatusResponse build() {
            return new GetPipelineInstanceGroupStatusResponse(this);
        } 

    } 

}
