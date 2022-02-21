// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteDeviceGroupRelationsResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteDeviceGroupRelationsResponse</p>
 */
public class BatchDeleteDeviceGroupRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteDeviceGroupRelationsResponseBody body;

    private BatchDeleteDeviceGroupRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteDeviceGroupRelationsResponse create() {
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
    public BatchDeleteDeviceGroupRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteDeviceGroupRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteDeviceGroupRelationsResponseBody body);

        @Override
        BatchDeleteDeviceGroupRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteDeviceGroupRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteDeviceGroupRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteDeviceGroupRelationsResponse response) {
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
        public Builder body(BatchDeleteDeviceGroupRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteDeviceGroupRelationsResponse build() {
            return new BatchDeleteDeviceGroupRelationsResponse(this);
        } 

    } 

}
