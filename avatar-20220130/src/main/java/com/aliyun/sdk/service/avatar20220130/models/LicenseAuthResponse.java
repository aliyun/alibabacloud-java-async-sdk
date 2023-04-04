// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LicenseAuthResponse} extends {@link TeaModel}
 *
 * <p>LicenseAuthResponse</p>
 */
public class LicenseAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LicenseAuthResponseBody body;

    private LicenseAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LicenseAuthResponse create() {
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
    public LicenseAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LicenseAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LicenseAuthResponseBody body);

        @Override
        LicenseAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LicenseAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LicenseAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LicenseAuthResponse response) {
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
        public Builder body(LicenseAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LicenseAuthResponse build() {
            return new LicenseAuthResponse(this);
        } 

    } 

}
