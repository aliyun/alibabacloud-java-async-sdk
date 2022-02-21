// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVodDomainCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetVodDomainCertificateResponse</p>
 */
public class SetVodDomainCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetVodDomainCertificateResponseBody body;

    private SetVodDomainCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetVodDomainCertificateResponse create() {
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
    public SetVodDomainCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetVodDomainCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetVodDomainCertificateResponseBody body);

        @Override
        SetVodDomainCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetVodDomainCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetVodDomainCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetVodDomainCertificateResponse response) {
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
        public Builder body(SetVodDomainCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetVodDomainCertificateResponse build() {
            return new SetVodDomainCertificateResponse(this);
        } 

    } 

}
