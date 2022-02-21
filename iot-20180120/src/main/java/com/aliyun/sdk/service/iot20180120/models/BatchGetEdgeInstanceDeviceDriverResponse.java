// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDeviceDriverResponse} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceDriverResponse</p>
 */
public class BatchGetEdgeInstanceDeviceDriverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetEdgeInstanceDeviceDriverResponseBody body;

    private BatchGetEdgeInstanceDeviceDriverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetEdgeInstanceDeviceDriverResponse create() {
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
    public BatchGetEdgeInstanceDeviceDriverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetEdgeInstanceDeviceDriverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetEdgeInstanceDeviceDriverResponseBody body);

        @Override
        BatchGetEdgeInstanceDeviceDriverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetEdgeInstanceDeviceDriverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetEdgeInstanceDeviceDriverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetEdgeInstanceDeviceDriverResponse response) {
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
        public Builder body(BatchGetEdgeInstanceDeviceDriverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetEdgeInstanceDeviceDriverResponse build() {
            return new BatchGetEdgeInstanceDeviceDriverResponse(this);
        } 

    } 

}
