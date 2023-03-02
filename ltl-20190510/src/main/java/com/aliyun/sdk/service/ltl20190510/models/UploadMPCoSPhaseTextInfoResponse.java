// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMPCoSPhaseTextInfoResponse} extends {@link TeaModel}
 *
 * <p>UploadMPCoSPhaseTextInfoResponse</p>
 */
public class UploadMPCoSPhaseTextInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadMPCoSPhaseTextInfoResponseBody body;

    private UploadMPCoSPhaseTextInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadMPCoSPhaseTextInfoResponse create() {
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
    public UploadMPCoSPhaseTextInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadMPCoSPhaseTextInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadMPCoSPhaseTextInfoResponseBody body);

        @Override
        UploadMPCoSPhaseTextInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadMPCoSPhaseTextInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadMPCoSPhaseTextInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadMPCoSPhaseTextInfoResponse response) {
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
        public Builder body(UploadMPCoSPhaseTextInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadMPCoSPhaseTextInfoResponse build() {
            return new UploadMPCoSPhaseTextInfoResponse(this);
        } 

    } 

}
