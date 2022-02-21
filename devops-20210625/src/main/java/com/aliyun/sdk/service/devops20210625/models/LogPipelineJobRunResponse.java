// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogPipelineJobRunResponse} extends {@link TeaModel}
 *
 * <p>LogPipelineJobRunResponse</p>
 */
public class LogPipelineJobRunResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LogPipelineJobRunResponseBody body;

    private LogPipelineJobRunResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LogPipelineJobRunResponse create() {
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
    public LogPipelineJobRunResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LogPipelineJobRunResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LogPipelineJobRunResponseBody body);

        @Override
        LogPipelineJobRunResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LogPipelineJobRunResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LogPipelineJobRunResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LogPipelineJobRunResponse response) {
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
        public Builder body(LogPipelineJobRunResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LogPipelineJobRunResponse build() {
            return new LogPipelineJobRunResponse(this);
        } 

    } 

}
