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
 * {@link CompanyTwoElementsVerificationRequest} extends {@link RequestModel}
 *
 * <p>CompanyTwoElementsVerificationRequest</p>
 */
public class CompanyTwoElementsVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpCertName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String epCertName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EpCertNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String epCertNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CompanyTwoElementsVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.epCertName = builder.epCertName;
        this.epCertNo = builder.epCertNo;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompanyTwoElementsVerificationRequest create() {
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

    public static final class Builder extends Request.Builder<CompanyTwoElementsVerificationRequest, Builder> {
        private String authCode; 
        private String epCertName; 
        private String epCertNo; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CompanyTwoElementsVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.epCertName = request.epCertName;
            this.epCertNo = request.epCertNo;
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
         * <p>This parameter is required.</p>
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
        public CompanyTwoElementsVerificationRequest build() {
            return new CompanyTwoElementsVerificationRequest(this);
        } 

    } 

}
