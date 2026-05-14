// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkCreateEnterprisePauseRequest} extends {@link RequestModel}
 *
 * <p>ClinkCreateEnterprisePauseRequest</p>
 */
public class ClinkCreateEnterprisePauseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRest")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isRest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PauseStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pauseStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ClinkCreateEnterprisePauseRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.isDefault = builder.isDefault;
        this.isRest = builder.isRest;
        this.ownerId = builder.ownerId;
        this.pauseStatus = builder.pauseStatus;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkCreateEnterprisePauseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return isDefault
     */
    public Long getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return isRest
     */
    public String getIsRest() {
        return this.isRest;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pauseStatus
     */
    public String getPauseStatus() {
        return this.pauseStatus;
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

    public static final class Builder extends Request.Builder<ClinkCreateEnterprisePauseRequest, Builder> {
        private Long enterpriseId; 
        private Long isDefault; 
        private String isRest; 
        private Long ownerId; 
        private String pauseStatus; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ClinkCreateEnterprisePauseRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.isDefault = request.isDefault;
            this.isRest = request.isRest;
            this.ownerId = request.ownerId;
            this.pauseStatus = request.pauseStatus;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>默认状态，0：不是；1：是</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDefault(Long isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>休息状态，0：不是；1：是</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isRest(String isRest) {
            this.putQueryParameter("IsRest", isRest);
            this.isRest = isRest;
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
         * <p>置忙状态描述（不超4个字符）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder pauseStatus(String pauseStatus) {
            this.putQueryParameter("PauseStatus", pauseStatus);
            this.pauseStatus = pauseStatus;
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
        public ClinkCreateEnterprisePauseRequest build() {
            return new ClinkCreateEnterprisePauseRequest(this);
        } 

    } 

}
