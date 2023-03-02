// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUploadMPCoSPhaseTextInfoResponse} extends {@link TeaModel}
 *
 * <p>BatchUploadMPCoSPhaseTextInfoResponse</p>
 */
public class BatchUploadMPCoSPhaseTextInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUploadMPCoSPhaseTextInfoResponseBody body;

    private BatchUploadMPCoSPhaseTextInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUploadMPCoSPhaseTextInfoResponse create() {
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
    public BatchUploadMPCoSPhaseTextInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUploadMPCoSPhaseTextInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUploadMPCoSPhaseTextInfoResponseBody body);

        @Override
        BatchUploadMPCoSPhaseTextInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUploadMPCoSPhaseTextInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUploadMPCoSPhaseTextInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUploadMPCoSPhaseTextInfoResponse response) {
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
        public Builder body(BatchUploadMPCoSPhaseTextInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUploadMPCoSPhaseTextInfoResponse build() {
            return new BatchUploadMPCoSPhaseTextInfoResponse(this);
        } 

    } 

}
