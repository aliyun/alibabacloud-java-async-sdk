// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainCSRCertificateRequest} extends {@link RequestModel}
 *
 * <p>SetCdnDomainCSRCertificateRequest</p>
 */
public class SetCdnDomainCSRCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serverCertificate;

    private SetCdnDomainCSRCertificateRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.serverCertificate = builder.serverCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainCSRCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<SetCdnDomainCSRCertificateRequest, Builder> {
        private String domainName; 
        private String serverCertificate; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnDomainCSRCertificateRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.serverCertificate = request.serverCertificate;
        } 

        /**
         * The accelerated domain name for which you want to configure an SSL certificate. The domain name must have HTTPS secure acceleration enabled.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The content of the certificate. The certificate must match the certificate signing request (CSR) created by calling the [CreateCdnCertificateSigningRequest](~~144478~~) operation. Make sure that the content of the certificate is encoded in Base64 and then encoded by encodeURIComponent.
         */
        public Builder serverCertificate(String serverCertificate) {
            this.putQueryParameter("ServerCertificate", serverCertificate);
            this.serverCertificate = serverCertificate;
            return this;
        }

        @Override
        public SetCdnDomainCSRCertificateRequest build() {
            return new SetCdnDomainCSRCertificateRequest(this);
        } 

    } 

}
