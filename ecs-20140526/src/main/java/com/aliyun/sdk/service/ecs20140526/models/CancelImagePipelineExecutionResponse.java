// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelImagePipelineExecutionResponse} extends {@link TeaModel}
 *
 * <p>CancelImagePipelineExecutionResponse</p>
 */
public class CancelImagePipelineExecutionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelImagePipelineExecutionResponseBody body;

    private CancelImagePipelineExecutionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelImagePipelineExecutionResponse create() {
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
    public CancelImagePipelineExecutionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelImagePipelineExecutionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelImagePipelineExecutionResponseBody body);

        @Override
        CancelImagePipelineExecutionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelImagePipelineExecutionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelImagePipelineExecutionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelImagePipelineExecutionResponse response) {
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
        public Builder body(CancelImagePipelineExecutionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelImagePipelineExecutionResponse build() {
            return new CancelImagePipelineExecutionResponse(this);
        } 

    } 

}
