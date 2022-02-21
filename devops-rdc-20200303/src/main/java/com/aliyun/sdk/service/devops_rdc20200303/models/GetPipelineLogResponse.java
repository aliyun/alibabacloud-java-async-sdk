// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineLogResponse} extends {@link TeaModel}
 *
 * <p>GetPipelineLogResponse</p>
 */
public class GetPipelineLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPipelineLogResponseBody body;

    private GetPipelineLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPipelineLogResponse create() {
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
    public GetPipelineLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPipelineLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPipelineLogResponseBody body);

        @Override
        GetPipelineLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPipelineLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPipelineLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPipelineLogResponse response) {
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
        public Builder body(GetPipelineLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPipelineLogResponse build() {
            return new GetPipelineLogResponse(this);
        } 

    } 

}
