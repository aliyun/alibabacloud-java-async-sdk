// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainByCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainByCertificateRequest</p>
 */
public class DescribeDcdnDomainByCertificateRequest extends Request {
    @Query
    @NameInMap("Exact")
    private Boolean exact;

    @Query
    @NameInMap("SSLPub")
    @Validation(required = true)
    private String SSLPub;

    @Query
    @NameInMap("SSLStatus")
    private Boolean SSLStatus;

    private DescribeDcdnDomainByCertificateRequest(Builder builder) {
        super(builder);
        this.exact = builder.exact;
        this.SSLPub = builder.SSLPub;
        this.SSLStatus = builder.SSLStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainByCertificateRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnDomainByCertificateRequest, Builder> {
        private Boolean exact; 
        private String SSLPub; 
        private Boolean SSLStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnDomainByCertificateRequest request) {
            super(request);
            this.exact = request.exact;
            this.SSLPub = request.SSLPub;
            this.SSLStatus = request.SSLStatus;
        } 

        /**
         * Specifies whether the domain name list to return match the SSL certificate.
         * <p>
         * 
         * - **true**: The domain name list match the SSL certificate.
         * - **false**: The domain name list do not match the SSL certificate.
         */
        public Builder exact(Boolean exact) {
            this.putQueryParameter("Exact", exact);
            this.exact = exact;
            return this;
        }

        /**
         * The public key of the certificate.
         * <p>
         * 
         * You must use Base64 encoding schemes and then the encodeURIComponent method to encode the public key. PEM files are supported.
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
         * *   true: The list contains only domain names with HTTPS enabled.
         * *   false: The list contains only domain names with HTTPS disabled.
         */
        public Builder SSLStatus(Boolean SSLStatus) {
            this.putQueryParameter("SSLStatus", SSLStatus);
            this.SSLStatus = SSLStatus;
            return this;
        }

        @Override
        public DescribeDcdnDomainByCertificateRequest build() {
            return new DescribeDcdnDomainByCertificateRequest(this);
        } 

    } 

}
