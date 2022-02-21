// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnCertificateDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnCertificateDetailRequest</p>
 */
public class DescribeCdnCertificateDetailRequest extends Request {
    @Query
    @NameInMap("CertName")
    @Validation(required = true)
    private String certName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeCdnCertificateDetailRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnCertificateDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
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

    public static final class Builder extends Request.Builder<DescribeCdnCertificateDetailRequest, Builder> {
        private String certName; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnCertificateDetailRequest response) {
            super(response);
            this.certName = response.certName;
            this.ownerId = response.ownerId;
            this.securityToken = response.securityToken;
        } 

        /**
         * CertName.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
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
        public DescribeCdnCertificateDetailRequest build() {
            return new DescribeCdnCertificateDetailRequest(this);
        } 

    } 

}
