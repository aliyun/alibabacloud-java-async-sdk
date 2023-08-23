// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainByCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDomainByCertificateRequest</p>
 */
public class DescribeCdnDomainByCertificateRequest extends Request {
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
         * Exact.
         */
        public Builder exact(Boolean exact) {
            this.putQueryParameter("Exact", exact);
            this.exact = exact;
            return this;
        }

        /**
         * The public key of the SSL certificate. You must encode the public key in Base64 before you invoke the encodeURIComponent function to encode a URI component.
         * <p>
         * 
         * A public key in the Privacy Enhanced Mail (PEM) format is supported.
         */
        public Builder SSLPub(String SSLPub) {
            this.putQueryParameter("SSLPub", SSLPub);
            this.SSLPub = SSLPub;
            return this;
        }

        /**
         * Specifies whether to return only domain names with HTTPS enabled or disabled.
         * <p>
         * 
         * *   true: returns only domain names with HTTPS enabled.
         * *   false: returns only domain names with HTTPS disabled.
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
