// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUploadMPCoSPhaseDigestInfoResponse} extends {@link TeaModel}
 *
 * <p>BatchUploadMPCoSPhaseDigestInfoResponse</p>
 */
public class BatchUploadMPCoSPhaseDigestInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUploadMPCoSPhaseDigestInfoResponseBody body;

    private BatchUploadMPCoSPhaseDigestInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUploadMPCoSPhaseDigestInfoResponse create() {
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
    public BatchUploadMPCoSPhaseDigestInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUploadMPCoSPhaseDigestInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUploadMPCoSPhaseDigestInfoResponseBody body);

        @Override
        BatchUploadMPCoSPhaseDigestInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUploadMPCoSPhaseDigestInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUploadMPCoSPhaseDigestInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUploadMPCoSPhaseDigestInfoResponse response) {
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
        public Builder body(BatchUploadMPCoSPhaseDigestInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUploadMPCoSPhaseDigestInfoResponse build() {
            return new BatchUploadMPCoSPhaseDigestInfoResponse(this);
        } 

    } 

}
