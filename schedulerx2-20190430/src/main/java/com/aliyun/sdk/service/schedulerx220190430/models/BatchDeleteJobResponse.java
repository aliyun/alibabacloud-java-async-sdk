// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteJobResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteJobResponse</p>
 */
public class BatchDeleteJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteJobResponseBody body;

    private BatchDeleteJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteJobResponse create() {
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
    public BatchDeleteJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteJobResponseBody body);

        @Override
        BatchDeleteJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteJobResponse response) {
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
        public Builder body(BatchDeleteJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteJobResponse build() {
            return new BatchDeleteJobResponse(this);
        } 

    } 

}
