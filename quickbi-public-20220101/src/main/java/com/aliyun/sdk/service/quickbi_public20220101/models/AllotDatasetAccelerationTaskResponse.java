// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllotDatasetAccelerationTaskResponse} extends {@link TeaModel}
 *
 * <p>AllotDatasetAccelerationTaskResponse</p>
 */
public class AllotDatasetAccelerationTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllotDatasetAccelerationTaskResponseBody body;

    private AllotDatasetAccelerationTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllotDatasetAccelerationTaskResponse create() {
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
    public AllotDatasetAccelerationTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllotDatasetAccelerationTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllotDatasetAccelerationTaskResponseBody body);

        @Override
        AllotDatasetAccelerationTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllotDatasetAccelerationTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllotDatasetAccelerationTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllotDatasetAccelerationTaskResponse response) {
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
        public Builder body(AllotDatasetAccelerationTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllotDatasetAccelerationTaskResponse build() {
            return new AllotDatasetAccelerationTaskResponse(this);
        } 

    } 

}
