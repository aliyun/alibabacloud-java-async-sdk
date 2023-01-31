// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBatchJobsResponse} extends {@link TeaModel}
 *
 * <p>CreateBatchJobsResponse</p>
 */
public class CreateBatchJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBatchJobsResponseBody body;

    private CreateBatchJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBatchJobsResponse create() {
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
    public CreateBatchJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBatchJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBatchJobsResponseBody body);

        @Override
        CreateBatchJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBatchJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBatchJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBatchJobsResponse response) {
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
        public Builder body(CreateBatchJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBatchJobsResponse build() {
            return new CreateBatchJobsResponse(this);
        } 

    } 

}
