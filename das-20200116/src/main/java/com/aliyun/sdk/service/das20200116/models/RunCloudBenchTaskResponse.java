// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCloudBenchTaskResponse} extends {@link TeaModel}
 *
 * <p>RunCloudBenchTaskResponse</p>
 */
public class RunCloudBenchTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunCloudBenchTaskResponseBody body;

    private RunCloudBenchTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunCloudBenchTaskResponse create() {
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
    public RunCloudBenchTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunCloudBenchTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunCloudBenchTaskResponseBody body);

        @Override
        RunCloudBenchTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunCloudBenchTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunCloudBenchTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunCloudBenchTaskResponse response) {
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
        public Builder body(RunCloudBenchTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunCloudBenchTaskResponse build() {
            return new RunCloudBenchTaskResponse(this);
        } 

    } 

}
