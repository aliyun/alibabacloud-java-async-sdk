// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLicenseKeyResponse} extends {@link TeaModel}
 *
 * <p>GetLicenseKeyResponse</p>
 */
public class GetLicenseKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLicenseKeyResponseBody body;

    private GetLicenseKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLicenseKeyResponse create() {
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
    public GetLicenseKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLicenseKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLicenseKeyResponseBody body);

        @Override
        GetLicenseKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLicenseKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLicenseKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLicenseKeyResponse response) {
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
        public Builder body(GetLicenseKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLicenseKeyResponse build() {
            return new GetLicenseKeyResponse(this);
        } 

    } 

}
