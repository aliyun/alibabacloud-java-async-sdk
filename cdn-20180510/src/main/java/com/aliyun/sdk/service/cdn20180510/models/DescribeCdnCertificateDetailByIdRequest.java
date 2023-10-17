// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnCertificateDetailByIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnCertificateDetailByIdRequest</p>
 */
public class DescribeCdnCertificateDetailByIdRequest extends Request {
    @Query
    @NameInMap("CertId")
    @Validation(required = true)
    private String certId;

    @Query
    @NameInMap("CertRegion")
    private String certRegion;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeCdnCertificateDetailByIdRequest(Builder builder) {
        super(builder);
        this.certId = builder.certId;
        this.certRegion = builder.certRegion;
        this.ownerId = builder.ownerId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnCertificateDetailByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certId
     */
    public String getCertId() {
        return this.certId;
    }

    /**
     * @return certRegion
     */
    public String getCertRegion() {
        return this.certRegion;
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

    public static final class Builder extends Request.Builder<DescribeCdnCertificateDetailByIdRequest, Builder> {
        private String certId; 
        private String certRegion; 
        private Long ownerId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnCertificateDetailByIdRequest request) {
            super(request);
            this.certId = request.certId;
            this.certRegion = request.certRegion;
            this.ownerId = request.ownerId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the certificate.
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * The region of the certificate. Valid values:
         * <p>
         * 
         * *   **ap-southeast-1**: Singapore
         * *   **cn-hangzhou**: China (Hangzhou)
         * 
         * Default value: **cn-hangzhou**
         */
        public Builder certRegion(String certRegion) {
            this.putQueryParameter("CertRegion", certRegion);
            this.certRegion = certRegion;
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
        public DescribeCdnCertificateDetailByIdRequest build() {
            return new DescribeCdnCertificateDetailByIdRequest(this);
        } 

    } 

}
