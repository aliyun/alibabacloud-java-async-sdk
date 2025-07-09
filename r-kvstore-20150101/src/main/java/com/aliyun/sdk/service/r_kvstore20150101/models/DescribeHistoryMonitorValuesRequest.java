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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

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
        this.type = builder.type;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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
        private String type; 

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
            this.type = request.type;
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
         * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p> You can query the monitoring data of the previous month. The maximum time range that you can specify for a query is seven days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-06T00:30:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is deprecated. Set the value to <code>01m</code>.</p>
         * <p>The <strong>interval at which a query is performed</strong> is automatically determined based on the start time and end time of the query. For example, if the query time range is less than or equal to 10 minutes, data is aggregated at a frequency of every 5 seconds and the results are returned at 5-second intervals.</p>
         * <blockquote>
         * <ul>
         * <li>The query result is aligned with the data aggregation frequency. If the specified StartTime value does not coincide with a point in time for data aggregation, the system returns the latest point in time for data aggregation as the first point in time. For example, if you set the StartTime parameter to 2022-01-20T12:01:48Z, the first point in time returned is 2022-01-20T12:01:45Z.</li>
         * <li>If the number of data shards is greater than or equal to 32, the minimum data aggregation frequency is 1 minute.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01m</p>
         */
        public Builder intervalForHistory(String intervalForHistory) {
            this.putQueryParameter("IntervalForHistory", intervalForHistory);
            this.intervalForHistory = intervalForHistory;
            return this;
        }

        /**
         * <p>The monitoring metrics. Separate the metrics with commas (,). Take CpuUsage as an example:</p>
         * <ul>
         * <li><p>Cluster or read/write splitting instances</p>
         * <ul>
         * <li>To query the overall CPU utilization of all data nodes, specify <strong>CpuUsage$db</strong>.</li>
         * <li>To query the CPU utilization of a single data node, specify <strong>CpuUsage</strong> and NodeId.</li>
         * </ul>
         * </li>
         * <li><p>Standard master-replica instances: Specify only <strong>CpuUsage</strong>.</p>
         * </li>
         * </ul>
         * <p>For more information about monitoring metrics and their descriptions, see <a href="https://www.alibabacloud.com/help/zh/redis/developer-reference/api-r-kvstore-2015-01-01-describehistorymonitorvalues-redis#monitorKeys-note">Additional description of MonitorKeys</a>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is empty by default, which indicates that the UsedMemory and quotaMemory metrics are returned.</li>
         * <li>To ensure query efficiency, we recommend that you specify no more than five metrics for a single node at a time, and specify only a single metric when you query aggregate metrics.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>memoryUsage</p>
         */
        public Builder monitorKeys(String monitorKeys) {
            this.putQueryParameter("MonitorKeys", monitorKeys);
            this.monitorKeys = monitorKeys;
            return this;
        }

        /**
         * <p>The ID of the node in the instance. You can set this parameter to query the data of a specified node.</p>
         * <ul>
         * <li><p>This parameter is available only for read/write splitting or cluster instances of Tair.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/473786.html">DescribeLogicInstanceTopology</a> operation to query node IDs.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>r-bp1zxszhcgatnx****-db-0#1679****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>If you want to query the metrics of the read replicas in a cloud-native read/write splitting instance, you must set this parameter to <strong>READONLY</strong> and specify <strong>NodeId</strong>.</p>
         * <blockquote>
         * <p>In other cases, you do not need to specify this parameter or you can set this parameter to <strong>MASTER</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>READONLY</p>
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
         * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-06T00:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeHistoryMonitorValuesRequest build() {
            return new DescribeHistoryMonitorValuesRequest(this);
        } 

    } 

}
