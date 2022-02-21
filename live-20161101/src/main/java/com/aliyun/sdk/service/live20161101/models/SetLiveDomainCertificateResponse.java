// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLiveDomainCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetLiveDomainCertificateResponse</p>
 */
public class SetLiveDomainCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetLiveDomainCertificateResponseBody body;

    private SetLiveDomainCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetLiveDomainCertificateResponse create() {
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
    public SetLiveDomainCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetLiveDomainCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetLiveDomainCertificateResponseBody body);

        @Override
        SetLiveDomainCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetLiveDomainCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetLiveDomainCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetLiveDomainCertificateResponse response) {
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
        public Builder body(SetLiveDomainCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetLiveDomainCertificateResponse build() {
            return new SetLiveDomainCertificateResponse(this);
        } 

    } 

}
