// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitBatchJobsResponse} extends {@link TeaModel}
 *
 * <p>SubmitBatchJobsResponse</p>
 */
public class SubmitBatchJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitBatchJobsResponseBody body;

    private SubmitBatchJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitBatchJobsResponse create() {
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
    public SubmitBatchJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitBatchJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitBatchJobsResponseBody body);

        @Override
        SubmitBatchJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitBatchJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitBatchJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitBatchJobsResponse response) {
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
        public Builder body(SubmitBatchJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitBatchJobsResponse build() {
            return new SubmitBatchJobsResponse(this);
        } 

    } 

}
