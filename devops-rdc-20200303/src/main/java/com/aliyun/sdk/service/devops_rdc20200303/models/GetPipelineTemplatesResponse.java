// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineTemplatesResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineTemplatesResponse</p>
 */
public class GetPipelineTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineTemplatesResponseBody body;

    private GetPipelineTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineTemplatesResponse create() {
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
    public GetPipelineTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineTemplatesResponseBody body);

        @Override
        GetPipelineTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineTemplatesResponse response) {
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
        public Builder body(GetPipelineTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineTemplatesResponse build() {
            return new GetPipelineTemplatesResponse(this);
        } 

    } 

}
