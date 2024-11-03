// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnCertificateDetailByIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnCertificateDetailByIdRequest</p>
 */
public class DescribeCdnCertificateDetailByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertRegion")
    private String certRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
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
         * <p>The ID of the certificate.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder certId(String certId) {
            this.putQueryParameter("CertId", certId);
            this.certId = certId;
            return this;
        }

        /**
         * <p>The region of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
         * </ul>
         * <p>Default value: <strong>cn-hangzhou</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
