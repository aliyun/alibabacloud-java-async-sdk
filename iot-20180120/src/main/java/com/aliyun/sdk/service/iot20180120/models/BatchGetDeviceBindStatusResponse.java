// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetDeviceBindStatusResponse} extends {@link TeaModel}
 *
 * <p>BatchGetDeviceBindStatusResponse</p>
 */
public class BatchGetDeviceBindStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetDeviceBindStatusResponseBody body;

    private BatchGetDeviceBindStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetDeviceBindStatusResponse create() {
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
    public BatchGetDeviceBindStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetDeviceBindStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetDeviceBindStatusResponseBody body);

        @Override
        BatchGetDeviceBindStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetDeviceBindStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetDeviceBindStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetDeviceBindStatusResponse response) {
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
        public Builder body(BatchGetDeviceBindStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetDeviceBindStatusResponse build() {
            return new BatchGetDeviceBindStatusResponse(this);
        } 

    } 

}
