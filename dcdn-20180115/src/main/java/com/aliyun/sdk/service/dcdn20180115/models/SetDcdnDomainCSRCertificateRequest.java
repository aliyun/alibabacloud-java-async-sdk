// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDcdnDomainCSRCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainCSRCertificateRequest</p>
 */
public class SetDcdnDomainCSRCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverCertificate;

    private SetDcdnDomainCSRCertificateRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.serverCertificate = builder.serverCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainCSRCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return serverCertificate
     */
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    public static final class Builder extends Request.Builder<SetDcdnDomainCSRCertificateRequest, Builder> {
        private String domainName; 
        private String serverCertificate; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainCSRCertificateRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.serverCertificate = request.serverCertificate;
        } 

        /**
         * <p>The domain name that is secured by the certificate. The domain name uses HTTPS acceleration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The content of the certificate. The certificate must match the certificate signing request (CSR) created by calling the <a href="https://help.aliyun.com/document_detail/144478.html">CreateDcdnCertificateSigningRequest</a> operation. Make sure that the certificate is in PEM format and its content is Base64-encoded and then encoded by encodeURIComponent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putQueryParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        @Override
        public SetDcdnDomainCSRCertificateRequest build() {
            return new SetDcdnDomainCSRCertificateRequest(this);
        } 

    } 

}
