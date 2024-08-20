// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainSSLCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetDcdnDomainSSLCertificateResponse</p>
 */
public class SetDcdnDomainSSLCertificateResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SetDcdnDomainSSLCertificateResponseBody body;

    private SetDcdnDomainSSLCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public SetDcdnDomainSSLCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDcdnDomainSSLCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetDcdnDomainSSLCertificateResponseBody body);

        @Override
        SetDcdnDomainSSLCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDcdnDomainSSLCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SetDcdnDomainSSLCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDcdnDomainSSLCertificateResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
