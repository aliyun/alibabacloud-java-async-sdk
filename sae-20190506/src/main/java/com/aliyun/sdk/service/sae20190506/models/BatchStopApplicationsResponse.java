// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchStopApplicationsResponse} extends {@link TeaModel}
 *
 * <p>BatchStopApplicationsResponse</p>
 */
public class BatchStopApplicationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchStopApplicationsResponseBody body;

    private BatchStopApplicationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchStopApplicationsResponse create() {
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
    public BatchStopApplicationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchStopApplicationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchStopApplicationsResponseBody body);

        @Override
        BatchStopApplicationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchStopApplicationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchStopApplicationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchStopApplicationsResponse response) {
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
        public Builder body(BatchStopApplicationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchStopApplicationsResponse build() {
            return new BatchStopApplicationsResponse(this);
        } 

    } 

}
