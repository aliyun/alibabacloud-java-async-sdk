// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMPCoSPhaseTextInfoByDeviceResponse} extends {@link TeaModel}
 *
 * <p>UploadMPCoSPhaseTextInfoByDeviceResponse</p>
 */
public class UploadMPCoSPhaseTextInfoByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadMPCoSPhaseTextInfoByDeviceResponseBody body;

    private UploadMPCoSPhaseTextInfoByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadMPCoSPhaseTextInfoByDeviceResponse create() {
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
    public UploadMPCoSPhaseTextInfoByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadMPCoSPhaseTextInfoByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadMPCoSPhaseTextInfoByDeviceResponseBody body);

        @Override
        UploadMPCoSPhaseTextInfoByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadMPCoSPhaseTextInfoByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadMPCoSPhaseTextInfoByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadMPCoSPhaseTextInfoByDeviceResponse response) {
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
        public Builder body(UploadMPCoSPhaseTextInfoByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadMPCoSPhaseTextInfoByDeviceResponse build() {
            return new UploadMPCoSPhaseTextInfoByDeviceResponse(this);
        } 

    } 

}
