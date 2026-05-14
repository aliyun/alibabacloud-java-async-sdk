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
 * {@link CloudCreateQueueSkillRequest} extends {@link RequestModel}
 *
 * <p>CloudCreateQueueSkillRequest</p>
 */
public class CloudCreateQueueSkillRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qno")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long skillId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long skillLevel;

    private CloudCreateQueueSkillRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.ownerId = builder.ownerId;
        this.qno = builder.qno;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.skillId = builder.skillId;
        this.skillLevel = builder.skillLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateQueueSkillRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qno
     */
    public String getQno() {
        return this.qno;
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
     * @return skillId
     */
    public Long getSkillId() {
        return this.skillId;
    }

    /**
     * @return skillLevel
     */
    public Long getSkillLevel() {
        return this.skillLevel;
    }

    public static final class Builder extends Request.Builder<CloudCreateQueueSkillRequest, Builder> {
        private Long enterpriseId; 
        private Long ownerId; 
        private String qno; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long skillId; 
        private Long skillLevel; 

        private Builder() {
            super();
        } 

        private Builder(CloudCreateQueueSkillRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.ownerId = request.ownerId;
            this.qno = request.qno;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.skillId = request.skillId;
            this.skillLevel = request.skillLevel;
        } 

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
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
         * <p>队列号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder qno(String qno) {
            this.putQueryParameter("Qno", qno);
            this.qno = qno;
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
         * <p>skill的id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        public Builder skillId(Long skillId) {
            this.putQueryParameter("SkillId", skillId);
            this.skillId = skillId;
            return this;
        }

        /**
         * <p>技能值</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder skillLevel(Long skillLevel) {
            this.putQueryParameter("SkillLevel", skillLevel);
            this.skillLevel = skillLevel;
            return this;
        }

        @Override
        public CloudCreateQueueSkillRequest build() {
            return new CloudCreateQueueSkillRequest(this);
        } 

    } 

}
