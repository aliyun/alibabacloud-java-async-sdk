// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchEnableJobResponse} extends {@link TeaModel}
 *
 * <p>BatchEnableJobResponse</p>
 */
public class BatchEnableJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchEnableJobResponseBody body;

    private BatchEnableJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchEnableJobResponse create() {
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
    public BatchEnableJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchEnableJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchEnableJobResponseBody body);

        @Override
        BatchEnableJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchEnableJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchEnableJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchEnableJobResponse response) {
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
        public Builder body(BatchEnableJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchEnableJobResponse build() {
            return new BatchEnableJobResponse(this);
        } 

    } 

}
