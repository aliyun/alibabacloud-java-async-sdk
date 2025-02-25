// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainByCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnDomainByCertificateRequest</p>
 */
public class DescribeDcdnDomainByCertificateRequest extends Request {
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
         * <p>Specifies whether the domain name list to return matches the SSL certificate.</p>
         * <ul>
         * <li><strong>true</strong>: The domain name list matches the SSL certificate.</li>
         * <li><strong>false</strong>: The domain name list does not match the SSL certificate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exact(Boolean exact) {
            this.putQueryParameter("Exact", exact);
            this.exact = exact;
            return this;
        }

        /**
         * <p>The public key of the certificate.</p>
         * <p>You must use Base64 encoding schemes and then the encodeURIComponent method to encode the public key. PEM files are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder SSLPub(String SSLPub) {
            this.putQueryParameter("SSLPub", SSLPub);
            this.SSLPub = SSLPub;
            return this;
        }

        /**
         * <p>Specifies whether the domain name list to return contains only domain names with HTTPS enabled or disabled.</p>
         * <ul>
         * <li>true: The list contains only domain names with HTTPS enabled.</li>
         * <li>false: The list contains only domain names with HTTPS disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
