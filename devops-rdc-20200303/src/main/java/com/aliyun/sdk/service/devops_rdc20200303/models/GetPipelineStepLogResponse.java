// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineStepLogResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineStepLogResponse</p>
 */
public class GetPipelineStepLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineStepLogResponseBody body;

    private GetPipelineStepLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineStepLogResponse create() {
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
    public GetPipelineStepLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineStepLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineStepLogResponseBody body);

        @Override
        GetPipelineStepLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineStepLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineStepLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineStepLogResponse response) {
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
        public Builder body(GetPipelineStepLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineStepLogResponse build() {
            return new GetPipelineStepLogResponse(this);
        } 

    } 

}
