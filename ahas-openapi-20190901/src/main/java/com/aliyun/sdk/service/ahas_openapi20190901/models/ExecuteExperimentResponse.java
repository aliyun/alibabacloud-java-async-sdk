// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteExperimentResponse} extends {@link TeaModel}
 *
 * <p>ExecuteExperimentResponse</p>
 */
public class ExecuteExperimentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteExperimentResponseBody body;

    private ExecuteExperimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteExperimentResponse create() {
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
    public ExecuteExperimentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteExperimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteExperimentResponseBody body);

        @Override
        ExecuteExperimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteExperimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteExperimentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteExperimentResponse response) {
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
        public Builder body(ExecuteExperimentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteExperimentResponse build() {
            return new ExecuteExperimentResponse(this);
        } 

    } 

}
