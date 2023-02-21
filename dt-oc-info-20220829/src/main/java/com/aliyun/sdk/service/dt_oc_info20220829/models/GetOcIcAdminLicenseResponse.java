// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcAdminLicenseResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcAdminLicenseResponse</p>
 */
public class GetOcIcAdminLicenseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcAdminLicenseResponseBody body;

    private GetOcIcAdminLicenseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcAdminLicenseResponse create() {
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
    public GetOcIcAdminLicenseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcAdminLicenseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcAdminLicenseResponseBody body);

        @Override
        GetOcIcAdminLicenseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcAdminLicenseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcAdminLicenseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcAdminLicenseResponse response) {
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
        public Builder body(GetOcIcAdminLicenseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcAdminLicenseResponse build() {
            return new GetOcIcAdminLicenseResponse(this);
        } 

    } 

}
