// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUploadMPCoSPhaseDigestInfoByDeviceResponse} extends {@link TeaModel}
 *
 * <p>BatchUploadMPCoSPhaseDigestInfoByDeviceResponse</p>
 */
public class BatchUploadMPCoSPhaseDigestInfoByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody body;

    private BatchUploadMPCoSPhaseDigestInfoByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUploadMPCoSPhaseDigestInfoByDeviceResponse create() {
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
    public BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUploadMPCoSPhaseDigestInfoByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody body);

        @Override
        BatchUploadMPCoSPhaseDigestInfoByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUploadMPCoSPhaseDigestInfoByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUploadMPCoSPhaseDigestInfoByDeviceResponse response) {
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
        public Builder body(BatchUploadMPCoSPhaseDigestInfoByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUploadMPCoSPhaseDigestInfoByDeviceResponse build() {
            return new BatchUploadMPCoSPhaseDigestInfoByDeviceResponse(this);
        } 

    } 

}
