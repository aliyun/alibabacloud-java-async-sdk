// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVsDomainCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetVsDomainCertificateResponse</p>
 */
public class SetVsDomainCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetVsDomainCertificateResponseBody body;

    private SetVsDomainCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetVsDomainCertificateResponse create() {
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
    public SetVsDomainCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetVsDomainCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetVsDomainCertificateResponseBody body);

        @Override
        SetVsDomainCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetVsDomainCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetVsDomainCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetVsDomainCertificateResponse response) {
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
        public Builder body(SetVsDomainCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetVsDomainCertificateResponse build() {
            return new SetVsDomainCertificateResponse(this);
        } 

    } 

}
