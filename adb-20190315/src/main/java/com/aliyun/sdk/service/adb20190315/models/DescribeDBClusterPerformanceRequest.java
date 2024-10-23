// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterPerformanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBClusterPerformanceRequest</p>
 */
public class DescribeDBClusterPerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
    private String startTime;

    private DescribeDBClusterPerformanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourcePools = builder.resourcePools;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPerformanceRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeDBClusterPerformanceRequest, Builder> {
        private String DBClusterId; 
        private String endTime; 
        private String key; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourcePools; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBClusterPerformanceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.endTime = request.endTime;
            this.key = request.key;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourcePools = request.resourcePools;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time. The maximum time range that can be specified is two days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-05-03T15:01Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The performance metrics to be queried. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li><p>CPU</p>
         * <ul>
         * <li><strong>AnalyticDB_CPU</strong>: the average CPU utilization.</li>
         * </ul>
         * </li>
         * <li><p>Connections</p>
         * <ul>
         * <li><strong>AnalyticDB_Connections</strong>: the number of connections of the cluster.</li>
         * </ul>
         * </li>
         * <li><p>Writes</p>
         * <ul>
         * <li><strong>AnalyticDB_TPS</strong>: the write transactions per second (TPS).</li>
         * <li><strong>AnalyticDB_InsertRT</strong>: the write response time.</li>
         * <li><strong>AnalyticDB_InsertBytes</strong>: the write throughput.</li>
         * </ul>
         * </li>
         * <li><p>Updates</p>
         * <ul>
         * <li><strong>AnalyticDB_UpdateRT</strong>: the update response time.</li>
         * </ul>
         * </li>
         * <li><p>Deletes</p>
         * <ul>
         * <li><strong>AnalyticDB_DeleteRT</strong>: the delete response time.</li>
         * </ul>
         * </li>
         * <li><p>Queries</p>
         * <ul>
         * <li><strong>AnalyticDB_QPS</strong>: the queries per second (QPS).</li>
         * <li><strong>AnalyticDB_QueryRT</strong>: the query response time.</li>
         * <li><strong>AnalyticDB_QueryWaitTime</strong>: the query wait time.</li>
         * </ul>
         * </li>
         * <li><p>Disks</p>
         * <ul>
         * <li><strong>AnalyticDB_IO</strong>: the disk I/O throughput.</li>
         * <li><strong>AnalyticDB_IO_UTIL</strong>: the disk I/O usage.</li>
         * <li><strong>AnalyticDB_IO_WAIT</strong>: the disk I/O wait time.</li>
         * <li><strong>AnalyticDB_IOPS</strong>: the disk IOPS.</li>
         * <li><strong>AnalyticDB_DiskUsage</strong>: the disk space that is used.</li>
         * <li><strong>AnalyticDB_HotDataDiskUsage</strong>: the disk space that is used by hot data.</li>
         * <li><strong>AnalyticDB_ColdDataDiskUsage</strong>: the disk space that is used by cold data.</li>
         * </ul>
         * </li>
         * <li><p>Other</p>
         * <ul>
         * <li><strong>AnalyticDB_BuildTaskCount</strong>: the number of BUILD jobs.</li>
         * <li><strong>AnalyticDB_ComputeMemoryUsedRatio</strong>: the compute memory usage.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, the values of all the preceding performance metrics are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_CPU</p>
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
         * <p>The region ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourcePools(String resourcePools) {
            this.putQueryParameter("ResourcePools", resourcePools);
            this.resourcePools = resourcePools;
            return this;
        }

        /**
         * <p>The start time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-03T15:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDBClusterPerformanceRequest build() {
            return new DescribeDBClusterPerformanceRequest(this);
        } 

    } 

}
