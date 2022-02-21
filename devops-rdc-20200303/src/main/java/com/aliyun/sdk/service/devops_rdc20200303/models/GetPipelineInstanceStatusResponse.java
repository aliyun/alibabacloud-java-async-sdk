// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineInstanceStatusResponse</p>
 */
public class GetPipelineInstanceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineInstanceStatusResponseBody body;

    private GetPipelineInstanceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineInstanceStatusResponse create() {
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
    public GetPipelineInstanceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineInstanceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineInstanceStatusResponseBody body);

        @Override
        GetPipelineInstanceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineInstanceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineInstanceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineInstanceStatusResponse response) {
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
        public Builder body(GetPipelineInstanceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineInstanceStatusResponse build() {
            return new GetPipelineInstanceStatusResponse(this);
        } 

    } 

}
