// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempModifyDBNodeRequest} extends {@link RequestModel}
 *
 * <p>TempModifyDBNodeRequest</p>
 */
public class TempModifyDBNodeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBNode")
    @Validation(required = true)
    private java.util.List < DBNode> DBNode;

    @Query
    @NameInMap("ModifyType")
    @Validation(required = true)
    private String modifyType;

    @Query
    @NameInMap("OperationType")
    @Validation(required = true)
    private String operationType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreTime")
    @Validation(required = true)
    private String restoreTime;

    private TempModifyDBNodeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.DBNode = builder.DBNode;
        this.modifyType = builder.modifyType;
        this.operationType = builder.operationType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TempModifyDBNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNode
     */
    public java.util.List < DBNode> getDBNode() {
        return this.DBNode;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public static final class Builder extends Request.Builder<TempModifyDBNodeRequest, Builder> {
        private String clientToken; 
        private String DBClusterId; 
        private java.util.List < DBNode> DBNode; 
        private String modifyType; 
        private String operationType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 

        private Builder() {
            super();
        } 

        private Builder(TempModifyDBNodeRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.DBClusterId = response.DBClusterId;
            this.DBNode = response.DBNode;
            this.modifyType = response.modifyType;
            this.operationType = response.operationType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.restoreTime = response.restoreTime;
        } 

        /**
         * 幂等参数
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 实例Id
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBNode.
         */
        public Builder DBNode(java.util.List < DBNode> DBNode) {
            this.putQueryParameter("DBNode", DBNode);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * 变更类型
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * 操作类型（Add:增加节点; Modify:变配）
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
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
         * 变更还原时间(说明：还原时间不能早于当前时间推后1小时，不能晚于集群到期时间的前1天)
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        @Override
        public TempModifyDBNodeRequest build() {
            return new TempModifyDBNodeRequest(this);
        } 

    } 

    public static class DBNode extends TeaModel {
        @NameInMap("TargetClass")
        private String targetClass;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBNode(Builder builder) {
            this.targetClass = builder.targetClass;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNode create() {
            return builder().build();
        }

        /**
         * @return targetClass
         */
        public String getTargetClass() {
            return this.targetClass;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String targetClass; 
            private String zoneId; 

            /**
             * TargetClass.
             */
            public Builder targetClass(String targetClass) {
                this.targetClass = targetClass;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBNode build() {
                return new DBNode(this);
            } 

        } 

    }
}
