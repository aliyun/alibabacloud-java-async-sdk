// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBNodeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBNodeRequest</p>
 */
public class ModifyDBNodeRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DBInstanceStorage")
    private String DBInstanceStorage;

    @Query
    @NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @Query
    @NameInMap("DBNode")
    private java.util.List < DBNode> DBNode;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EffectiveTime")
    private String effectiveTime;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProduceAsync")
    private Boolean produceAsync;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBNodeRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.DBNode = builder.DBNode;
        this.dryRun = builder.dryRun;
        this.effectiveTime = builder.effectiveTime;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.produceAsync = builder.produceAsync;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceStorage
     */
    public String getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    /**
     * @return DBNode
     */
    public java.util.List < DBNode> getDBNode() {
        return this.DBNode;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
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
     * @return produceAsync
     */
    public Boolean getProduceAsync() {
        return this.produceAsync;
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

    public static final class Builder extends Request.Builder<ModifyDBNodeRequest, Builder> {
        private Boolean autoPay; 
        private String clientToken; 
        private String DBInstanceId; 
        private String DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private java.util.List < DBNode> DBNode; 
        private Boolean dryRun; 
        private String effectiveTime; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean produceAsync; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBNodeRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.DBNode = request.DBNode;
            this.dryRun = request.dryRun;
            this.effectiveTime = request.effectiveTime;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.produceAsync = request.produceAsync;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * Specifies whether to automatically complete the payment. Valid values:
         * <p>
         * 
         * 1.  **true**: automatically completes the payment. Make sure that your account balance is sufficient.
         * 2.  **false**: does not automatically complete the payment. An unpaid order is generated.
         * 
         * >  The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to pay for the order.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The new storage capacity of the instance. Unit: GB For more information, see [Instance types](~~26312~~).
         */
        public Builder DBInstanceStorage(String DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **cloud_essd**: performance level 1 (PL1) enhanced SSD (ESSD)
         * *   **cloud_essd2**: PL2 ESSD
         * *   **cloud_essd3**: PL3 ESSD
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * The information about the node.
         * <p>
         * 
         * >  This parameter is supported for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.
         */
        public Builder DBNode(java.util.List < DBNode> DBNode) {
            String DBNodeShrink = shrink(DBNode, "DBNode", "json");
            this.putQueryParameter("DBNode", DBNodeShrink);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values: Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run and does not perform the actual request. The system checks items such as the request parameters, request format, service limits, and available resources.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Effective time, value:
         * <p>
         * - Immediate (default value): takes effect immediately.
         * - MaintainTime: Effective within the operational time period, please refer to ModifyDBInstanceMaintainTime.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
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
         * Specifies whether to asynchronously perform the operation. Valid values:
         * <p>
         * 
         * *   **true** (default): sends only the order. The operation is asynchronously performed.
         * *   **false**: sends the request. After the request passes the check, the operation is directly performed.
         * 
         * >  The default value is true, which indicates that the change operation is asynchronously performed. If you set this parameter to false, the change operation is simultaneously performed. This prolongs the response time of the operation.
         */
        public Builder produceAsync(Boolean produceAsync) {
            this.putQueryParameter("ProduceAsync", produceAsync);
            this.produceAsync = produceAsync;
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
        public ModifyDBNodeRequest build() {
            return new ModifyDBNodeRequest(this);
        } 

    } 

    public static class DBNode extends TeaModel {
        @NameInMap("classCode")
        private String classCode;

        @NameInMap("nodeId")
        private String nodeId;

        private DBNode(Builder builder) {
            this.classCode = builder.classCode;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNode create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String classCode; 
            private String nodeId; 

            /**
             * The instance type of the node.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public DBNode build() {
                return new DBNode(this);
            } 

        } 

    }
}
