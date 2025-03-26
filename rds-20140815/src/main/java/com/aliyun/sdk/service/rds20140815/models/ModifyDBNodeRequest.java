// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBNodeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBNodeRequest</p>
 */
public class ModifyDBNodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    private String DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNode")
    private java.util.List<DBNode> DBNode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProduceAsync")
    private Boolean produceAsync;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
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
    public java.util.List<DBNode> getDBNode() {
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
        private java.util.List<DBNode> DBNode; 
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
         * <p>Specifies whether to automatically complete the payment. Valid values:</p>
         * <ol>
         * <li><strong>true</strong>: automatically completes the payment. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: does not automatically complete the payment. An unpaid order is generated.</li>
         * </ol>
         * <blockquote>
         * <p> The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to pay for the order.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1k8s41l2o52****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The new storage capacity of the instance. Unit: GB For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder DBInstanceStorage(String DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd</strong>: performance level 1 (PL1) enhanced SSD (ESSD)</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>The information about the node.</p>
         * <blockquote>
         * <p> This parameter is used for ApsaraDB RDS for MySQL instances that run RDS Cluster Edition.</p>
         * </blockquote>
         */
        public Builder DBNode(java.util.List<DBNode> DBNode) {
            String DBNodeShrink = shrink(DBNode, "DBNode", "json");
            this.putQueryParameter("DBNode", DBNodeShrink);
            this.DBNode = DBNode;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run and does not perform the actual request. The system checks items such as the request parameters, request format, service limits, and available resources.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The time when you want the change to take effect. Valid values:</p>
         * <ul>
         * <li><strong>Immediate</strong> (default): The change immediately takes effect.</li>
         * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Immediate</p>
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
         * <p>Specifies whether to asynchronously perform the operation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): sends only the order. The operation is asynchronously performed.</li>
         * <li><strong>false</strong>: sends the request. After the request passes the check, the operation is directly performed.</li>
         * </ul>
         * <blockquote>
         * <p> The default value is true, which indicates that the change operation is asynchronously performed. If you set this parameter to false, the change operation is simultaneously performed. This prolongs the response time of the operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

    /**
     * 
     * {@link ModifyDBNodeRequest} extends {@link TeaModel}
     *
     * <p>ModifyDBNodeRequest</p>
     */
    public static class DBNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("classCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("nodeId")
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

            private Builder() {
            } 

            private Builder(DBNode model) {
                this.classCode = model.classCode;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>The specification information about the node.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n2.medium.xc</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rn-6256r4a87xvv7he5p</p>
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
