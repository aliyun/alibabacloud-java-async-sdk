// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReBindLicenseDeviceResponse} extends {@link TeaModel}
 *
 * <p>ReBindLicenseDeviceResponse</p>
 */
public class ReBindLicenseDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReBindLicenseDeviceResponseBody body;

    private ReBindLicenseDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReBindLicenseDeviceResponse create() {
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
    public ReBindLicenseDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReBindLicenseDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReBindLicenseDeviceResponseBody body);

        @Override
        ReBindLicenseDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReBindLicenseDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReBindLicenseDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReBindLicenseDeviceResponse response) {
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
        public Builder body(ReBindLicenseDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReBindLicenseDeviceResponse build() {
            return new ReBindLicenseDeviceResponse(this);
        } 

    } 

}
