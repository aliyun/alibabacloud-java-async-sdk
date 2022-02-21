// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefusePipelineValidateResponse} extends {@link TeaModel}
 *
 * <p>RefusePipelineValidateResponse</p>
 */
public class RefusePipelineValidateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefusePipelineValidateResponseBody body;

    private RefusePipelineValidateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefusePipelineValidateResponse create() {
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
    public RefusePipelineValidateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefusePipelineValidateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefusePipelineValidateResponseBody body);

        @Override
        RefusePipelineValidateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefusePipelineValidateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefusePipelineValidateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefusePipelineValidateResponse response) {
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
        public Builder body(RefusePipelineValidateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefusePipelineValidateResponse build() {
            return new RefusePipelineValidateResponse(this);
        } 

    } 

}
