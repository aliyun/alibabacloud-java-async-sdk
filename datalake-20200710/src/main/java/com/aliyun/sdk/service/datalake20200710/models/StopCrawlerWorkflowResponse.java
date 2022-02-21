// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCrawlerWorkflowResponse} extends {@link TeaModel}
 *
 * <p>StopCrawlerWorkflowResponse</p>
 */
public class StopCrawlerWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopCrawlerWorkflowResponseBody body;

    private StopCrawlerWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopCrawlerWorkflowResponse create() {
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
    public StopCrawlerWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopCrawlerWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopCrawlerWorkflowResponseBody body);

        @Override
        StopCrawlerWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopCrawlerWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopCrawlerWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopCrawlerWorkflowResponse response) {
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
        public Builder body(StopCrawlerWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopCrawlerWorkflowResponse build() {
            return new StopCrawlerWorkflowResponse(this);
        } 

    } 

}
