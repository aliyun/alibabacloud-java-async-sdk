// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddDeviceGroupRelationsResponse} extends {@link TeaModel}
 *
 * <p>BatchAddDeviceGroupRelationsResponse</p>
 */
public class BatchAddDeviceGroupRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchAddDeviceGroupRelationsResponseBody body;

    private BatchAddDeviceGroupRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchAddDeviceGroupRelationsResponse create() {
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
    public BatchAddDeviceGroupRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchAddDeviceGroupRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchAddDeviceGroupRelationsResponseBody body);

        @Override
        BatchAddDeviceGroupRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchAddDeviceGroupRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchAddDeviceGroupRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchAddDeviceGroupRelationsResponse response) {
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
        public Builder body(BatchAddDeviceGroupRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchAddDeviceGroupRelationsResponse build() {
            return new BatchAddDeviceGroupRelationsResponse(this);
        } 

    } 

}
