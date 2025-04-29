// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CertNoThreeElementVerificationRequest} extends {@link RequestModel}
 *
 * <p>CertNoThreeElementVerificationRequest</p>
 */
public class CertNoThreeElementVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertPicture")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certPicture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CertNoThreeElementVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.certName = builder.certName;
        this.certNo = builder.certNo;
        this.certPicture = builder.certPicture;
        this.mask = builder.mask;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CertNoThreeElementVerificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return certNo
     */
    public String getCertNo() {
        return this.certNo;
    }

    /**
     * @return certPicture
     */
    public String getCertPicture() {
        return this.certPicture;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CertNoThreeElementVerificationRequest, Builder> {
        private String authCode; 
        private String certName; 
        private String certNo; 
        private String certPicture; 
        private String mask; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CertNoThreeElementVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.certName = request.certName;
            this.certNo = request.certNo;
            this.certPicture = request.certPicture;
            this.mask = request.mask;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>QASDW@#**</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3***************0</p>
         */
        public Builder certNo(String certNo) {
            this.putQueryParameter("CertNo", certNo);
            this.certNo = certNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iVBOFMKODOFNDFP123DFSMOO...</p>
         */
        public Builder certPicture(String certPicture) {
            this.putQueryParameter("CertPicture", certPicture);
            this.certPicture = certPicture;
            return this;
        }

        /**
         * Mask.
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CertNoThreeElementVerificationRequest build() {
            return new CertNoThreeElementVerificationRequest(this);
        } 

    } 

}
