// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentTaskResponse} extends {@link TeaModel}
 *
 * <p>GetExperimentTaskResponse</p>
 */
public class GetExperimentTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExperimentTaskResponseBody body;

    private GetExperimentTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExperimentTaskResponse create() {
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
    public GetExperimentTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExperimentTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExperimentTaskResponseBody body);

        @Override
        GetExperimentTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExperimentTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExperimentTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExperimentTaskResponse response) {
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
        public Builder body(GetExperimentTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExperimentTaskResponse build() {
            return new GetExperimentTaskResponse(this);
        } 

    } 

}
