// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryMonitorValuesRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryMonitorValuesRequest</p>
 */
public class DescribeHistoryMonitorValuesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntervalForHistory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String intervalForHistory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorKeys")
    private String monitorKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeRole")
    private String nodeRole;

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
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeHistoryMonitorValuesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.intervalForHistory = builder.intervalForHistory;
        this.monitorKeys = builder.monitorKeys;
        this.nodeId = builder.nodeId;
        this.nodeRole = builder.nodeRole;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryMonitorValuesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intervalForHistory
     */
    public String getIntervalForHistory() {
        return this.intervalForHistory;
    }

    /**
     * @return monitorKeys
     */
    public String getMonitorKeys() {
        return this.monitorKeys;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeRole
     */
    public String getNodeRole() {
        return this.nodeRole;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeHistoryMonitorValuesRequest, Builder> {
        private String regionId; 
        private String endTime; 
        private String instanceId; 
        private String intervalForHistory; 
        private String monitorKeys; 
        private String nodeId; 
        private String nodeRole; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHistoryMonitorValuesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.intervalForHistory = request.intervalForHistory;
            this.monitorKeys = request.monitorKeys;
            this.nodeId = request.nodeId;
            this.nodeRole = request.nodeRole;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.startTime = request.startTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The end of the time range to query. The end time must be later than the start time. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         * <p>
         * 
         * *   You can query the monitoring data of the last month. The maximum time range that you can specify for a query is seven days.
         * *   If the number of data nodes in the instance is greater than 32, the time range to query for the Data Node Aggregation and Proxy Node Aggregation metrics cannot exceed 1 hour.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The interval at which to collect monitoring data. Unit: minutes. Set the value to `01m`.
         */
        public Builder intervalForHistory(String intervalForHistory) {
            this.putQueryParameter("IntervalForHistory", intervalForHistory);
            this.intervalForHistory = intervalForHistory;
            return this;
        }

        /**
         * The monitoring metrics. Separate the metrics with commas (,). Take CpuUsage as an example:
         * <p>
         * 
         * *   To query the overall CPU utilization of all data nodes, specify **CpuUsage$db**.
         * *   To query the CPU utilization of a single data node, specify **CpuUsage** and NodeId.
         * 
         * For more information about the monitoring metrics, see **Additional description of MonitorKeys**.
         * 
         * > 
         * 
         * *   This parameter is empty by default, which indicates that the UsedMemory and quotaMemory metrics are returned.
         * 
         * *   To ensure query efficiency, we recommend that you specify no more than five metrics for a single node at a time, and specify only a single metric when you query aggregate metrics.
         * 
         * [Additional description of MonitorKeys](https://help.aliyun.com/zh/redis/developer-reference/api-r-kvstore-2015-01-01-describehistorymonitorvalues-redis)
         */
        public Builder monitorKeys(String monitorKeys) {
            this.putQueryParameter("MonitorKeys", monitorKeys);
            this.monitorKeys = monitorKeys;
            return this;
        }

        /**
         * The ID of the node in the instance. You can set this parameter to query the data of a specified node.
         * <p>
         * 
         * *   This parameter is available only for read/write splitting or cluster instances of ApsaraDB for Redis.
         * 
         * *   You can call the [DescribeLogicInstanceTopology](~~94665~~) operation to query node IDs.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * If you want to query the metrics of the read replicas in a cloud-native read/write splitting instance, you must set this parameter to **READONLY** and specify **NodeId**.
         * <p>
         * 
         * > In other cases, you do not need to specify this parameter or you can set this parameter to **MASTER**.
         */
        public Builder nodeRole(String nodeRole) {
            this.putQueryParameter("NodeRole", nodeRole);
            this.nodeRole = nodeRole;
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
         * The beginning of the time range to query. Specify the time in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeHistoryMonitorValuesRequest build() {
            return new DescribeHistoryMonitorValuesRequest(this);
        } 

    } 

}
