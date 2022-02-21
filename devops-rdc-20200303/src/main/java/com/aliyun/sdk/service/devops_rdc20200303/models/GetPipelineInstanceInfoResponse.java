// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineInstanceInfoResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineInstanceInfoResponse</p>
 */
public class GetPipelineInstanceInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineInstanceInfoResponseBody body;

    private GetPipelineInstanceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineInstanceInfoResponse create() {
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
    public GetPipelineInstanceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineInstanceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineInstanceInfoResponseBody body);

        @Override
        GetPipelineInstanceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineInstanceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineInstanceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineInstanceInfoResponse response) {
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
        public Builder body(GetPipelineInstanceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineInstanceInfoResponse build() {
            return new GetPipelineInstanceInfoResponse(this);
        } 

    } 

}
