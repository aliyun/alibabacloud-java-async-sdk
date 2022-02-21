// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnSMCertificateDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnSMCertificateDetailRequest</p>
 */
public class DescribeCdnSMCertificateDetailRequest extends Request {
    @Query
    @NameInMap("CertIdentifier")
    @Validation(required = true)
    private String certIdentifier;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeCdnSMCertificateDetailRequest(Builder builder) {
        super(builder);
        this.certIdentifier = builder.certIdentifier;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSMCertificateDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certIdentifier
     */
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeCdnSMCertificateDetailRequest, Builder> {
        private String certIdentifier; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnSMCertificateDetailRequest response) {
            super(response);
            this.certIdentifier = response.certIdentifier;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
        } 

        /**
         * CertIdentifier.
         */
        public Builder certIdentifier(String certIdentifier) {
            this.putQueryParameter("CertIdentifier", certIdentifier);
            this.certIdentifier = certIdentifier;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeCdnSMCertificateDetailRequest build() {
            return new DescribeCdnSMCertificateDetailRequest(this);
        } 

    } 

}
