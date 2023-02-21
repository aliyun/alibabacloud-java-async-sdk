// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpCertificateResponse} extends {@link TeaModel}
 *
 * <p>GetOcIpCertificateResponse</p>
 */
public class GetOcIpCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIpCertificateResponseBody body;

    private GetOcIpCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIpCertificateResponse create() {
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
    public GetOcIpCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIpCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIpCertificateResponseBody body);

        @Override
        GetOcIpCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIpCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIpCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIpCertificateResponse response) {
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
        public Builder body(GetOcIpCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIpCertificateResponse build() {
            return new GetOcIpCertificateResponse(this);
        } 

    } 

}
