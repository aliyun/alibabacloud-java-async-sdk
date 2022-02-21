// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainServerCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetDomainServerCertificateResponse</p>
 */
public class SetDomainServerCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDomainServerCertificateResponseBody body;

    private SetDomainServerCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDomainServerCertificateResponse create() {
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
    public SetDomainServerCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDomainServerCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDomainServerCertificateResponseBody body);

        @Override
        SetDomainServerCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDomainServerCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDomainServerCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDomainServerCertificateResponse response) {
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
        public Builder body(SetDomainServerCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDomainServerCertificateResponse build() {
            return new SetDomainServerCertificateResponse(this);
        } 

    } 

}
