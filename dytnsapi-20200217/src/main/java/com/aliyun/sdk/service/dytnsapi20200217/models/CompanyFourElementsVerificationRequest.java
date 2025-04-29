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
 * {@link CompanyFourElementsVerificationRequest} extends {@link RequestModel}
 *
 * <p>CompanyFourElementsVerificationRequest</p>
 */
public class CompanyFourElementsVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpCertName")
    private String epCertName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpCertNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String epCertNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonCertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonCertName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LegalPersonCertNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String legalPersonCertNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CompanyFourElementsVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.epCertName = builder.epCertName;
        this.epCertNo = builder.epCertNo;
        this.legalPersonCertName = builder.legalPersonCertName;
        this.legalPersonCertNo = builder.legalPersonCertNo;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompanyFourElementsVerificationRequest create() {
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
     * @return epCertName
     */
    public String getEpCertName() {
        return this.epCertName;
    }

    /**
     * @return epCertNo
     */
    public String getEpCertNo() {
        return this.epCertNo;
    }

    /**
     * @return legalPersonCertName
     */
    public String getLegalPersonCertName() {
        return this.legalPersonCertName;
    }

    /**
     * @return legalPersonCertNo
     */
    public String getLegalPersonCertNo() {
        return this.legalPersonCertNo;
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

    public static final class Builder extends Request.Builder<CompanyFourElementsVerificationRequest, Builder> {
        private String authCode; 
        private String epCertName; 
        private String epCertNo; 
        private String legalPersonCertName; 
        private String legalPersonCertNo; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CompanyFourElementsVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.epCertName = request.epCertName;
            this.epCertNo = request.epCertNo;
            this.legalPersonCertName = request.legalPersonCertName;
            this.legalPersonCertNo = request.legalPersonCertNo;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The authorization code.</p>
         * <blockquote>
         * <p> On the <a href="https://dytns.console.aliyun.com/analysis/apply">My Applications</a> page in the <a href="https://dytns.console.aliyun.com/overview?spm=a2c4g.608385.0.0.79847f8b3awqUC">Cell Phone Number Service console</a>, you can obtain the authorization code (also known as authorization ID).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dd1r***4id</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>The enterprise name.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder epCertName(String epCertName) {
            this.putQueryParameter("EpCertName", epCertName);
            this.epCertName = epCertName;
            return this;
        }

        /**
         * <p>The business license number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9242032*******J627</p>
         */
        public Builder epCertNo(String epCertNo) {
            this.putQueryParameter("EpCertNo", epCertNo);
            this.epCertNo = epCertNo;
            return this;
        }

        /**
         * <p>The name of the legal representative.</p>
         * <blockquote>
         * <p> If an enterprise has multiple legal representatives, separate them with commas (,).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder legalPersonCertName(String legalPersonCertName) {
            this.putQueryParameter("LegalPersonCertName", legalPersonCertName);
            this.legalPersonCertName = legalPersonCertName;
            return this;
        }

        /**
         * <p>The ID card number of the legal representative.</p>
         * <blockquote>
         * <p> If an enterprise has multiple legal representatives, separate the ID card numbers with commas (,).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>331021********0011</p>
         */
        public Builder legalPersonCertNo(String legalPersonCertNo) {
            this.putQueryParameter("LegalPersonCertNo", legalPersonCertNo);
            this.legalPersonCertNo = legalPersonCertNo;
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
        public CompanyFourElementsVerificationRequest build() {
            return new CompanyFourElementsVerificationRequest(this);
        } 

    } 

}
