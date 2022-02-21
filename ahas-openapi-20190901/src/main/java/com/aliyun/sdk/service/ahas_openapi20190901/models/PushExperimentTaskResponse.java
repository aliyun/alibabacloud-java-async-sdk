// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushExperimentTaskResponse} extends {@link TeaModel}
 *
 * <p>PushExperimentTaskResponse</p>
 */
public class PushExperimentTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushExperimentTaskResponseBody body;

    private PushExperimentTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushExperimentTaskResponse create() {
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
    public PushExperimentTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushExperimentTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushExperimentTaskResponseBody body);

        @Override
        PushExperimentTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushExperimentTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushExperimentTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushExperimentTaskResponse response) {
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
        public Builder body(PushExperimentTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushExperimentTaskResponse build() {
            return new PushExperimentTaskResponse(this);
        } 

    } 

}
