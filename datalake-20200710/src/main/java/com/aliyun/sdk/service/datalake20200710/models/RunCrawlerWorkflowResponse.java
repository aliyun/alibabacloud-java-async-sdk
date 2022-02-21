// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCrawlerWorkflowResponse} extends {@link TeaModel}
 *
 * <p>RunCrawlerWorkflowResponse</p>
 */
public class RunCrawlerWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunCrawlerWorkflowResponseBody body;

    private RunCrawlerWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunCrawlerWorkflowResponse create() {
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
    public RunCrawlerWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunCrawlerWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunCrawlerWorkflowResponseBody body);

        @Override
        RunCrawlerWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunCrawlerWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunCrawlerWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunCrawlerWorkflowResponse response) {
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
        public Builder body(RunCrawlerWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunCrawlerWorkflowResponse build() {
            return new RunCrawlerWorkflowResponse(this);
        } 

    } 

}
