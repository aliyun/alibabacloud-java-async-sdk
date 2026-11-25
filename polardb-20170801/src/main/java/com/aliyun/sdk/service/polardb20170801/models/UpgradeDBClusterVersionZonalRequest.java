// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UpgradeDBClusterVersionZonalRequest} extends {@link RequestModel}
 *
 * <p>UpgradeDBClusterVersionZonalRequest</p>
 */
public class UpgradeDBClusterVersionZonalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromTimeService")
    private Boolean fromTimeService;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedEndTime")
    private String plannedEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlannedStartTime")
    private String plannedStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBRevisionVersionCode")
    private String targetDBRevisionVersionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProxyRevisionVersionCode")
    private String targetProxyRevisionVersionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeLabel")
    private String upgradeLabel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradePolicy")
    private String upgradePolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    private String upgradeType;

    private UpgradeDBClusterVersionZonalRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.fromTimeService = builder.fromTimeService;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.plannedEndTime = builder.plannedEndTime;
        this.plannedStartTime = builder.plannedStartTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetDBRevisionVersionCode = builder.targetDBRevisionVersionCode;
        this.targetProxyRevisionVersionCode = builder.targetProxyRevisionVersionCode;
        this.upgradeLabel = builder.upgradeLabel;
        this.upgradePolicy = builder.upgradePolicy;
        this.upgradeType = builder.upgradeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeDBClusterVersionZonalRequest create() {
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
     * @return fromTimeService
     */
    public Boolean getFromTimeService() {
        return this.fromTimeService;
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
     * @return plannedEndTime
     */
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    /**
     * @return plannedStartTime
     */
    public String getPlannedStartTime() {
        return this.plannedStartTime;
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
     * @return targetDBRevisionVersionCode
     */
    public String getTargetDBRevisionVersionCode() {
        return this.targetDBRevisionVersionCode;
    }

    /**
     * @return targetProxyRevisionVersionCode
     */
    public String getTargetProxyRevisionVersionCode() {
        return this.targetProxyRevisionVersionCode;
    }

    /**
     * @return upgradeLabel
     */
    public String getUpgradeLabel() {
        return this.upgradeLabel;
    }

    /**
     * @return upgradePolicy
     */
    public String getUpgradePolicy() {
        return this.upgradePolicy;
    }

    /**
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public static final class Builder extends Request.Builder<UpgradeDBClusterVersionZonalRequest, Builder> {
        private String clientToken; 
        private String DBClusterId; 
        private Boolean fromTimeService; 
        private String ownerAccount; 
        private Long ownerId; 
        private String plannedEndTime; 
        private String plannedStartTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String targetDBRevisionVersionCode; 
        private String targetProxyRevisionVersionCode; 
        private String upgradeLabel; 
        private String upgradePolicy; 
        private String upgradeType; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeDBClusterVersionZonalRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.fromTimeService = request.fromTimeService;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.plannedEndTime = request.plannedEndTime;
            this.plannedStartTime = request.plannedStartTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.targetDBRevisionVersionCode = request.targetDBRevisionVersionCode;
            this.targetProxyRevisionVersionCode = request.targetProxyRevisionVersionCode;
            this.upgradeLabel = request.upgradeLabel;
            this.upgradePolicy = request.upgradePolicy;
            this.upgradeType = request.upgradeType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value on the client side. The value must be unique across different requests and is case-sensitive. It can contain up to 64 ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the PolarDB on ENS cluster. Only cluster IDs returned by the DescribeDBClustersZonal operation are supported. Before you call this operation, you must create an edge cluster by using ENS infrastructure. Standard PolarDB cluster IDs are not supported. Note: Only edge cluster IDs returned by DescribeDBClustersZonal are accepted, and the edge cluster must be created based on ENS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-a************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to immediately execute or schedule the kernel version upgrade. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): Scheduled execution.</p>
         * </li>
         * <li><p><strong>true</strong>: Immediate execution.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You do not need to specify this parameter when you invoke this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fromTimeService(Boolean fromTimeService) {
            this.putQueryParameter("FromTimeService", fromTimeService);
            this.fromTimeService = fromTimeService;
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
         * <p>The latest time to start the scheduled task. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>The latest time must be at least 30 minutes later than the start time.</li>
         * <li>If you specify <code>PlannedStartTime</code> but do not specify this parameter, the latest time to start the task defaults to 30 minutes after the start time. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task starts at <code>2021-01-14T09:30:00Z</code> at the latest.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-01-14T09:30:00Z</p>
         */
        public Builder plannedEndTime(String plannedEndTime) {
            this.putQueryParameter("PlannedEndTime", plannedEndTime);
            this.plannedEndTime = plannedEndTime;
            return this;
        }

        /**
         * <p>The earliest time to start the scheduled Milvus version upgrade task. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the allowed start time ranges from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
         * <li>If you leave this parameter empty, the Milvus version upgrade task is immediately executed by default.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-04-28T14:00:00Z</p>
         */
        public Builder plannedStartTime(String plannedStartTime) {
            this.putQueryParameter("PlannedStartTime", plannedStartTime);
            this.plannedStartTime = plannedStartTime;
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
         * <p>The version code of the target database engine version. You can obtain the value from the <a href="https://help.aliyun.com/document_detail/2319145.html">DescribeDBClusterVersion</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>20230707</p>
         */
        public Builder targetDBRevisionVersionCode(String targetDBRevisionVersionCode) {
            this.putQueryParameter("TargetDBRevisionVersionCode", targetDBRevisionVersionCode);
            this.targetDBRevisionVersionCode = targetDBRevisionVersionCode;
            return this;
        }

        /**
         * <p>The version code of the target PolarProxy version. You can obtain the value from the <a href="https://help.aliyun.com/document_detail/2319145.html">DescribeDBClusterVersion</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>20240702</p>
         */
        public Builder targetProxyRevisionVersionCode(String targetProxyRevisionVersionCode) {
            this.putQueryParameter("TargetProxyRevisionVersionCode", targetProxyRevisionVersionCode);
            this.targetProxyRevisionVersionCode = targetProxyRevisionVersionCode;
            return this;
        }

        /**
         * <p>The kernel version upgrade label. Set the value to <strong>INNOVATE</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter applies only to upgrades from PolarDB for MySQL 8.0.1 to PolarDB for MySQL 8.0.2.</li>
         * <li>If you specify this parameter, you must set <code>UpgradePolicy</code> to <strong>COLD</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>INNOVATE</p>
         */
        public Builder upgradeLabel(String upgradeLabel) {
            this.putQueryParameter("UpgradeLabel", upgradeLabel);
            this.upgradeLabel = upgradeLabel;
            return this;
        }

        /**
         * <p>The kernel version upgrade policy. Valid values:</p>
         * <ul>
         * <li><p><strong>HOT</strong>: Hot upgrade.</p>
         * </li>
         * <li><p><strong>COLD</strong>: Cold upgrade. Only PolarDB for MySQL 8.0 Cluster Edition supports this upgrade method.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HOT</p>
         */
        public Builder upgradePolicy(String upgradePolicy) {
            this.putQueryParameter("UpgradePolicy", upgradePolicy);
            this.upgradePolicy = upgradePolicy;
            return this;
        }

        /**
         * <p>The upgrade type. Valid values:</p>
         * <ul>
         * <li><p><strong>PROXY</strong>: Upgrades only PolarProxy.</p>
         * </li>
         * <li><p><strong>DB</strong>: Upgrades only the database engine.</p>
         * </li>
         * <li><p><strong>ALL</strong> (default): Upgrades both PolarProxy and the database engine.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROXY</p>
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        @Override
        public UpgradeDBClusterVersionZonalRequest build() {
            return new UpgradeDBClusterVersionZonalRequest(this);
        } 

    } 

}
