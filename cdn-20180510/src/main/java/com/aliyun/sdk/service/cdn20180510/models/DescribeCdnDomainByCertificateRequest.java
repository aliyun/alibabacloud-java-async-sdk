// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainByCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDomainByCertificateRequest</p>
 */
public class DescribeCdnDomainByCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Exact")
    private Boolean exact;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLPub")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SSLPub;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLStatus")
    private Boolean SSLStatus;

    private DescribeCdnDomainByCertificateRequest(Builder builder) {
        super(builder);
        this.exact = builder.exact;
        this.SSLPub = builder.SSLPub;
        this.SSLStatus = builder.SSLStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainByCertificateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exact
     */
    public Boolean getExact() {
        return this.exact;
    }

    /**
     * @return SSLPub
     */
    public String getSSLPub() {
        return this.SSLPub;
    }

    /**
     * @return SSLStatus
     */
    public Boolean getSSLStatus() {
        return this.SSLStatus;
    }

    public static final class Builder extends Request.Builder<DescribeCdnDomainByCertificateRequest, Builder> {
        private Boolean exact; 
        private String SSLPub; 
        private Boolean SSLStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnDomainByCertificateRequest request) {
            super(request);
            this.exact = request.exact;
            this.SSLPub = request.SSLPub;
            this.SSLStatus = request.SSLStatus;
        } 

        /**
         * Specifies whether the domain name list to return match the SSL certificate.
         * <p>
         * 
         * *   true: The domain name list match the SSL certificate.
         * *   false: The domain name list do not match the SSL certificate.
         */
        public Builder exact(Boolean exact) {
            this.putQueryParameter("Exact", exact);
            this.exact = exact;
            return this;
        }

        /**
         * The public key of the SSL certificate. You must encode the public key in Base64 and then call the encodeURIComponent function to encode the public key again.
         * <p>
         * 
         * The public key must be in the PEM format.
         */
        public Builder SSLPub(String SSLPub) {
            this.putQueryParameter("SSLPub", SSLPub);
            this.SSLPub = SSLPub;
            return this;
        }

        /**
         * Specifies whether the domain name list to return contains only domain names with HTTPS enabled or disabled.
         * <p>
         * 
         * *   true: The domain name list contains only domain names with HTTPS enabled.
         * *   false: The domain name list contains only domain names with HTTPS disabled.
         */
        public Builder SSLStatus(Boolean SSLStatus) {
            this.putQueryParameter("SSLStatus", SSLStatus);
            this.SSLStatus = SSLStatus;
            return this;
        }

        @Override
        public DescribeCdnDomainByCertificateRequest build() {
            return new DescribeCdnDomainByCertificateRequest(this);
        } 

    } 

}
