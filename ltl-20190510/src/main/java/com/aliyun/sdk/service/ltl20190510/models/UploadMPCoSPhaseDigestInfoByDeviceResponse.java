// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMPCoSPhaseDigestInfoByDeviceResponse} extends {@link TeaModel}
 *
 * <p>UploadMPCoSPhaseDigestInfoByDeviceResponse</p>
 */
public class UploadMPCoSPhaseDigestInfoByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadMPCoSPhaseDigestInfoByDeviceResponseBody body;

    private UploadMPCoSPhaseDigestInfoByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadMPCoSPhaseDigestInfoByDeviceResponse create() {
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
    public UploadMPCoSPhaseDigestInfoByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadMPCoSPhaseDigestInfoByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadMPCoSPhaseDigestInfoByDeviceResponseBody body);

        @Override
        UploadMPCoSPhaseDigestInfoByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadMPCoSPhaseDigestInfoByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadMPCoSPhaseDigestInfoByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadMPCoSPhaseDigestInfoByDeviceResponse response) {
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
        public Builder body(UploadMPCoSPhaseDigestInfoByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadMPCoSPhaseDigestInfoByDeviceResponse build() {
            return new UploadMPCoSPhaseDigestInfoByDeviceResponse(this);
        } 

    } 

}
