// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link ModifyActiveOperationMaintainConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyActiveOperationMaintainConfigRequest</p>
 */
public class ModifyActiveOperationMaintainConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleTime")
    private String cycleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleType")
    private String cycleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private ModifyActiveOperationMaintainConfigRequest(Builder builder) {
        super(builder);
        this.cycleTime = builder.cycleTime;
        this.cycleType = builder.cycleType;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyActiveOperationMaintainConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cycleTime
     */
    public String getCycleTime() {
        return this.cycleTime;
    }

    /**
     * @return cycleType
     */
    public String getCycleType() {
        return this.cycleType;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyActiveOperationMaintainConfigRequest, Builder> {
        private String cycleTime; 
        private String cycleType; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyActiveOperationMaintainConfigRequest request) {
            super(request);
            this.cycleTime = request.cycleTime;
            this.cycleType = request.cycleType;
            this.maintainEndTime = request.maintainEndTime;
            this.maintainStartTime = request.maintainStartTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.status = request.status;
        } 

        /**
         * <p>The interval between two O&amp;M tasks.</p>
         * <ul>
         * <li>If the CycleType parameter is set to Month, the CycleTime parameter returns a string of numbers ranging from 1 to 28, which indicates the specific days of the month. The numbers are separated with commas (,). The CycleTime parameter returns 0 when the configurations do not take effect.</li>
         * <li>If the CycleType parameter is set to Week, the CycleTime parameter returns a string of numbers ranging from 1 to 7, which indicates the specific days of the week. The numbers are separated with commas (,). The CycleTime parameter returns 0 when the configurations do not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,4,5</p>
         */
        public Builder cycleTime(String cycleTime) {
            this.putQueryParameter("CycleTime", cycleTime);
            this.cycleTime = cycleTime;
            return this;
        }

        /**
         * <p>The unit of the billing cycle. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Week</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Week</p>
         */
        public Builder cycleType(String cycleType) {
            this.putQueryParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * <p>The end time of the O&amp;M window. The time follows the ISO 8601 standard in the HH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>20:00:00Z</p>
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>The start time of the O&amp;M window. The time follows the ISO 8601 standard in the <em>HH:mm:ss</em> Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>16:00:00Z</p>
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>Specifies whether the configurations take effect. Valid values:</p>
         * <ul>
         * <li>1: The configurations take effect.</li>
         * <li>2: The configurations do not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyActiveOperationMaintainConfigRequest build() {
            return new ModifyActiveOperationMaintainConfigRequest(this);
        } 

    } 

}
