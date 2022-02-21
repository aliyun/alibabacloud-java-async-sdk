// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainSMCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnDomainSMCertificateResponse</p>
 */
public class SetDcdnDomainSMCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDcdnDomainSMCertificateResponseBody body;

    private SetDcdnDomainSMCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDcdnDomainSMCertificateResponse create() {
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
    public SetDcdnDomainSMCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnDomainSMCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDcdnDomainSMCertificateResponseBody body);

        @Override
        SetDcdnDomainSMCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnDomainSMCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDcdnDomainSMCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnDomainSMCertificateResponse response) {
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
        public Builder body(SetDcdnDomainSMCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDcdnDomainSMCertificateResponse build() {
            return new SetDcdnDomainSMCertificateResponse(this);
        } 

    } 

}
