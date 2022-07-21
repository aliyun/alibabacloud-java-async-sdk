// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindLicenseDeviceResponse} extends {@link TeaModel}
 *
 * <p>BindLicenseDeviceResponse</p>
 */
public class BindLicenseDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindLicenseDeviceResponseBody body;

    private BindLicenseDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindLicenseDeviceResponse create() {
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
    public BindLicenseDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindLicenseDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindLicenseDeviceResponseBody body);

        @Override
        BindLicenseDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindLicenseDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindLicenseDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindLicenseDeviceResponse response) {
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
        public Builder body(BindLicenseDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindLicenseDeviceResponse build() {
            return new BindLicenseDeviceResponse(this);
        } 

    } 

}
