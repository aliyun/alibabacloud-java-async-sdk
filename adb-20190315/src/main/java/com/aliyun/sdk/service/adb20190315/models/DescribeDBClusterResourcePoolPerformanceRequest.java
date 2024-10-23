// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterResourcePoolPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterResourcePoolPerformanceRequest</p>
 */
public class DescribeDBClusterResourcePoolPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

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
    @com.aliyun.core.annotation.NameInMap("ResourcePools")
    private String resourcePools;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeDBClusterResourcePoolPerformanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePools = builder.resourcePools;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterResourcePoolPerformanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
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
     * @return resourcePools
     */
    public String getResourcePools() {
        return this.resourcePools;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDBClusterResourcePoolPerformanceRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String key; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePools; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterResourcePoolPerformanceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.key = request.key;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePools = request.resourcePools;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end of the time range to monitor the resource group. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-10T07:01Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The metrics of the resource group. You can enter multiple metrics at the same time to query the monitoring information. Separate multiple metrics with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>AnalyticDB_RP_CPU</strong>: the average CPU utilization. Unit: %.</li>
         * <li><strong>AnalyticDB_RP_RT</strong>: the query response time (RT). Unit: milliseconds.</li>
         * <li><strong>AnalyticDB_RP_QPS</strong>: the queries per second (QPS). The value of this parameter must be a numeric value.</li>
         * <li><strong>AnalyticDB_RP_WaitTime</strong>: the query waiting time. Unit: milliseconds.</li>
         * <li><strong>AnalyticDB_RP_OriginalNode</strong>: the number of basic nodes in the resource group.</li>
         * <li><strong>AnalyticDB_RP_ActualNode</strong>: the number of scheduled nodes that are scaled out in the resource group.</li>
         * <li><strong>AnalyticDB_RP_PlanNode</strong>: the number of scheduled nodes to be scaled out in the resource group.</li>
         * <li><strong>AnalyticDB_RP_TotalNode</strong>: the total number of nodes in the resource group. Total number of nodes = Number of basic nodes + Number of scheduled nodes that are scaled out.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you leave this parameter empty, the monitoring information about all metrics is returned.</p>
         * </li>
         * <li><p>For more information about scaling plans, see <a href="https://help.aliyun.com/document_detail/189507.html">Create a resource scaling plan</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_RP_CPU</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
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
         * <p>The names of the resource groups that you want to query. You can enter multiple names of resource groups. Separate multiple names with commas (,).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The value of this parameter is case-insensitive. For example, <code>USER_DEFAULT</code> and <code>user_default</code> specify the same resource group.</p>
         * </li>
         * <li><p>If you leave this parameter empty, the monitoring information about the <code>USER_DEFAULT</code> resource group is returned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEST_POOL</p>
         */
        public Builder resourcePools(String resourcePools) {
            this.putQueryParameter("ResourcePools", resourcePools);
            this.resourcePools = resourcePools;
            return this;
        }

        /**
         * <p>The beginning of the time range to monitor the resource group. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
         * <blockquote>
         * <p>You can view only the monitoring information about the resource groups within the last two days.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-10T07:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBClusterResourcePoolPerformanceRequest build() {
            return new DescribeDBClusterResourcePoolPerformanceRequest(this);
        } 

    } 

}
