// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="~~~612397~~~">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp1hx5n1o8f61****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time. The maximum time range that can be specified is two days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-03-11T15:01Z</p>
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
         * <li><strong>AnalyticDB_CPU_Usage_Percentage</strong>: the average CPU utilization.</li>
         * </ul>
         * </li>
         * <li><p>Connections</p>
         * <ul>
         * <li><strong>AnalyticDB_Instance_Connection_Count</strong>: the number of database connections.</li>
         * </ul>
         * </li>
         * <li><p>Writes</p>
         * <ul>
         * <li><strong>AnalyticDB_TPS</strong>: the write transactions per second (TPS).</li>
         * <li><strong>AnalyticDB_InsertRT</strong>: the write response time.</li>
         * <li><strong>AnalyticDB_InsertBytes</strong>: the write throughput.</li>
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
         * <li><strong>AnalyticDB_Disk_IO_Avg_Usage_Percentage</strong>: the average I/O utilization.</li>
         * <li><strong>AnalyticDB_Disk_IO_Avg_Waiting_Time</strong>: the average I/O wait time.</li>
         * <li><strong>AnalyticDB_IO_Throughput</strong>: the disk throughput.</li>
         * <li><strong>AnalyticDB_IOPS</strong>: the disk IOPS.</li>
         * <li><strong>AnalyticDB_Disk_Usage</strong>: the disk space that is used.</li>
         * <li><strong>AnalyticDB_Disk_Usage_Percentage</strong>: the disk usage.</li>
         * <li><strong>AnalyticDB_Hot_Data_Usage</strong>: the disk space that is used by hot data.</li>
         * <li><strong>AnalyticDB_Cold_Data_Usage</strong>: the disk space that is used by code data.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> This parameter must be specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AnalyticDB_CPU_Usage_Percentage</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/612393.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder resourcePools(String resourcePools) {
            this.putQueryParameter("ResourcePools", resourcePools);
            this.resourcePools = resourcePools;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mmZ</em> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-10T23:56Z</p>
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
