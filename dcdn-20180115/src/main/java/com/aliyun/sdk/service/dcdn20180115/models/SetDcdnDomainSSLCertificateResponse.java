// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainSSLCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnDomainSSLCertificateResponse</p>
 */
public class SetDcdnDomainSSLCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDcdnDomainSSLCertificateResponseBody body;

    private SetDcdnDomainSSLCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDcdnDomainSSLCertificateResponse create() {
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
    public SetDcdnDomainSSLCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnDomainSSLCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDcdnDomainSSLCertificateResponseBody body);

        @Override
        SetDcdnDomainSSLCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnDomainSSLCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDcdnDomainSSLCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnDomainSSLCertificateResponse response) {
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
        public Builder body(SetDcdnDomainSSLCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDcdnDomainSSLCertificateResponse build() {
            return new SetDcdnDomainSSLCertificateResponse(this);
        } 

    } 

}
