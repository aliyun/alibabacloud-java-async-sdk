// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchJobCheckResponse} extends {@link TeaModel}
 *
 * <p>BatchJobCheckResponse</p>
 */
public class BatchJobCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchJobCheckResponseBody body;

    private BatchJobCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchJobCheckResponse create() {
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
    public BatchJobCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchJobCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchJobCheckResponseBody body);

        @Override
        BatchJobCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchJobCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchJobCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchJobCheckResponse response) {
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
        public Builder body(BatchJobCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchJobCheckResponse build() {
            return new BatchJobCheckResponse(this);
        } 

    } 

}
