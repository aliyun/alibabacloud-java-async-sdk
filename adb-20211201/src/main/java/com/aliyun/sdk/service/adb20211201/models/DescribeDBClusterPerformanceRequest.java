// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
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
            this.regionId = request.regionId;
            this.resourcePools = request.resourcePools;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~~612397~~~) operation to query the IDs of all AnalyticDB for MySQL Data Lakehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.
         * <p>
         * 
         * > The end time must be later than the start time. The maximum time range that can be specified is two days.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The performance metrics to be queried. Separate multiple values with commas (,). Valid values:
         * <p>
         * 
         * *   CPU
         * 
         *     *   **AnalyticDB_CPU_Usage_Percentage**: the average CPU utilization.
         * 
         * *   Connections
         * 
         *     *   **AnalyticDB_Instance_Connection_Count**: the number of database connections.
         * 
         * *   Writes
         * 
         *     *   **AnalyticDB_TPS**: the write transactions per second (TPS).
         *     *   **AnalyticDB_InsertRT**: the write response time.
         *     *   **AnalyticDB_InsertBytes**: the write throughput.
         * 
         * *   Queries
         * 
         *     *   **AnalyticDB_QPS**: the queries per second (QPS).
         *     *   **AnalyticDB_QueryRT**: the query response time.
         *     *   **AnalyticDB_QueryWaitTime**: the query wait time.
         * 
         * *   Disks
         * 
         *     *   **AnalyticDB_Disk_IO_Avg_Usage_Percentage**: the average I/O utilization.
         *     *   **AnalyticDB_Disk_IO_Avg_Waiting_Time**: the average I/O wait time.
         *     *   **AnalyticDB_IO_Throughput**: the disk throughput.
         *     *   **AnalyticDB_IOPS**: the disk IOPS.
         *     *   **AnalyticDB_Disk_Usage**: the disk space that is used.
         *     *   **AnalyticDB_Disk_Usage_Percentage**: the disk usage.
         *     *   **AnalyticDB_Hot_Data_Usage**: the disk space that is used by hot data.
         *     *   **AnalyticDB_Cold_Data_Usage**: the disk space that is used by code data.
         * 
         * >  This parameter must be specified.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The region ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeRegions](~~612393~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourcePools(String resourcePools) {
            this.putQueryParameter("ResourcePools", resourcePools);
            this.resourcePools = resourcePools;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-ddTHH:mmZ* format. The time must be in UTC.
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
