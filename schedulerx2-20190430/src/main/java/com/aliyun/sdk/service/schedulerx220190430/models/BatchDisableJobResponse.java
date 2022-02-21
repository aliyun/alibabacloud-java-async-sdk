// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDisableJobResponse} extends {@link TeaModel}
 *
 * <p>BatchDisableJobResponse</p>
 */
public class BatchDisableJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDisableJobResponseBody body;

    private BatchDisableJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDisableJobResponse create() {
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
    public BatchDisableJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDisableJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDisableJobResponseBody body);

        @Override
        BatchDisableJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDisableJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDisableJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDisableJobResponse response) {
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
        public Builder body(BatchDisableJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDisableJobResponse build() {
            return new BatchDisableJobResponse(this);
        } 

    } 

}
