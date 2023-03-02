// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMPCoSPhaseDigestInfoResponse} extends {@link TeaModel}
 *
 * <p>UploadMPCoSPhaseDigestInfoResponse</p>
 */
public class UploadMPCoSPhaseDigestInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadMPCoSPhaseDigestInfoResponseBody body;

    private UploadMPCoSPhaseDigestInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadMPCoSPhaseDigestInfoResponse create() {
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
    public UploadMPCoSPhaseDigestInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadMPCoSPhaseDigestInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadMPCoSPhaseDigestInfoResponseBody body);

        @Override
        UploadMPCoSPhaseDigestInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadMPCoSPhaseDigestInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadMPCoSPhaseDigestInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadMPCoSPhaseDigestInfoResponse response) {
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
        public Builder body(UploadMPCoSPhaseDigestInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadMPCoSPhaseDigestInfoResponse build() {
            return new UploadMPCoSPhaseDigestInfoResponse(this);
        } 

    } 

}
