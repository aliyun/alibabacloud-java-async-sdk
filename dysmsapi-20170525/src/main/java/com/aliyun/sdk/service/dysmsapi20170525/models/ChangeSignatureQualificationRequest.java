// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link ChangeSignatureQualificationRequest} extends {@link RequestModel}
 *
 * <p>ChangeSignatureQualificationRequest</p>
 */
public class ChangeSignatureQualificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizationLetterId")
    private Long authorizationLetterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignatureName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signatureName;

    private ChangeSignatureQualificationRequest(Builder builder) {
        super(builder);
        this.authorizationLetterId = builder.authorizationLetterId;
        this.ownerId = builder.ownerId;
        this.qualificationId = builder.qualificationId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signatureName = builder.signatureName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeSignatureQualificationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationLetterId
     */
    public Long getAuthorizationLetterId() {
        return this.authorizationLetterId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
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

    /**
     * @return signatureName
     */
    public String getSignatureName() {
        return this.signatureName;
    }

    public static final class Builder extends Request.Builder<ChangeSignatureQualificationRequest, Builder> {
        private Long authorizationLetterId; 
        private Long ownerId; 
        private Long qualificationId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signatureName; 

        private Builder() {
            super();
        } 

        private Builder(ChangeSignatureQualificationRequest request) {
            super(request);
            this.authorizationLetterId = request.authorizationLetterId;
            this.ownerId = request.ownerId;
            this.qualificationId = request.qualificationId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signatureName = request.signatureName;
        } 

        /**
         * <p>授权委托书id</p>
         * 
         * <strong>example:</strong>
         * <p>1000********1234</p>
         */
        public Builder authorizationLetterId(Long authorizationLetterId) {
            this.putQueryParameter("AuthorizationLetterId", authorizationLetterId);
            this.authorizationLetterId = authorizationLetterId;
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
         * <p>资质id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1*****2</p>
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
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

        /**
         * <p>签名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder signatureName(String signatureName) {
            this.putQueryParameter("SignatureName", signatureName);
            this.signatureName = signatureName;
            return this;
        }

        @Override
        public ChangeSignatureQualificationRequest build() {
            return new ChangeSignatureQualificationRequest(this);
        } 

    } 

}
