// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUploadMPCoSPhaseTextInfoByDeviceResponse} extends {@link TeaModel}
 *
 * <p>BatchUploadMPCoSPhaseTextInfoByDeviceResponse</p>
 */
public class BatchUploadMPCoSPhaseTextInfoByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody body;

    private BatchUploadMPCoSPhaseTextInfoByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUploadMPCoSPhaseTextInfoByDeviceResponse create() {
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
    public BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUploadMPCoSPhaseTextInfoByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody body);

        @Override
        BatchUploadMPCoSPhaseTextInfoByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUploadMPCoSPhaseTextInfoByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUploadMPCoSPhaseTextInfoByDeviceResponse response) {
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
        public Builder body(BatchUploadMPCoSPhaseTextInfoByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUploadMPCoSPhaseTextInfoByDeviceResponse build() {
            return new BatchUploadMPCoSPhaseTextInfoByDeviceResponse(this);
        } 

    } 

}
