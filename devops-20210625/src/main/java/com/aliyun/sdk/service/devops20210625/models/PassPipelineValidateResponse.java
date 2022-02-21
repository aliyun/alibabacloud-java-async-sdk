// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PassPipelineValidateResponse} extends {@link TeaModel}
 *
 * <p>PassPipelineValidateResponse</p>
 */
public class PassPipelineValidateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PassPipelineValidateResponseBody body;

    private PassPipelineValidateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PassPipelineValidateResponse create() {
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
    public PassPipelineValidateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PassPipelineValidateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PassPipelineValidateResponseBody body);

        @Override
        PassPipelineValidateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PassPipelineValidateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PassPipelineValidateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PassPipelineValidateResponse response) {
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
        public Builder body(PassPipelineValidateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PassPipelineValidateResponse build() {
            return new PassPipelineValidateResponse(this);
        } 

    } 

}
