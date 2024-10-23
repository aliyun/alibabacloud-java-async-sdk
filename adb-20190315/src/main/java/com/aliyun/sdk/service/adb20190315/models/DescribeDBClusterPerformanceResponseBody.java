// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterPerformanceResponseBody</p>
 */
public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Performances")
    private java.util.List < Performances> performances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeDBClusterPerformanceResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.performances = builder.performances;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterPerformanceResponseBody create() {
        return builder().build();
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
     * @return performances
     */
    public java.util.List < Performances> getPerformances() {
        return this.performances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String endTime; 
        private java.util.List < Performances> performances; 
        private String requestId; 
        private String startTime; 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>am-************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The end time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-03T15:01:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The queried performance metrics.</p>
         */
        public Builder performances(java.util.List < Performances> performances) {
            this.performances = performances;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25B56BC7-4978-40B3-9E48-4B7067******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start time of the query. The time follows the ISO 8601 standard in the <em>yyyy-MM-ddTHH:mm:ssZ</em> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-03T15:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBClusterPerformanceResponseBody build() {
            return new DescribeDBClusterPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPerformanceResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < String > values;

        private Series(Builder builder) {
            this.name = builder.name;
            this.tags = builder.tags;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private String tags; 
            private java.util.List < String > values; 

            /**
             * <ul>
             * <li><p>CPU</p>
             * <ul>
             * <li><p><strong>AnalyticDB_CPU</strong>: the average CPU utilization.</p>
             * <ul>
             * <li>worker_avg_cpu_used: the average CPU utilization across storage nodes.</li>
             * <li>worker_max_cpu_used: the maximum CPU utilization across storage nodes.</li>
             * <li>executor_avg_cpu_used: the average CPU utilization across compute nodes.</li>
             * <li>executor_max_cpu_used: the maximum CPU utilization across compute nodes.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>Connections</p>
             * <ul>
             * <li><p><strong>AnalyticDB_Connections</strong>: the number of connections of the cluster.</p>
             * <ul>
             * <li>connections: the number of connections of the cluster.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>Writes</p>
             * <ul>
             * <li><p><strong>AnalyticDB_TPS</strong>: the write TPS.</p>
             * <ul>
             * <li>tps: the sum of the insert_tps, update_tps, delete_tps, and load_tps values.</li>
             * <li>insert_tps: the number of successful INSERT INTO VALUES operations per second.</li>
             * <li>update_tps: the number of successful UPDATE operations per second.</li>
             * <li>delete_tps: the number of successful DELETE operations per second.</li>
             * <li>load_tps: the number of successful INSERT OVERWRITE operations per second.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_InsertRT</strong>: the write response time.</p>
             * <ul>
             * <li>insert_avg_rt: the average amount of time consumed by writes.</li>
             * <li>insert_max_rt: the maximum amount of time consumed by a single write.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_InsertBytes</strong>: the write throughput.</p>
             * <ul>
             * <li>insert_in_bytes: the amount of written data.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>Updates</p>
             * <ul>
             * <li><p><strong>AnalyticDB_UpdateRT</strong>: the update response time.</p>
             * <ul>
             * <li>updateinto_avg_rt: the average amount of time consumed by updates.</li>
             * <li>updateinto_max_rt: the maximum amount of time consumed by a single update.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>Deletes</p>
             * <ul>
             * <li><p><strong>AnalyticDB_DeleteRT</strong>: the delete response time.</p>
             * <ul>
             * <li>delete_avg_rt: the average amount of time consumed by deletes.</li>
             * <li>delete_max_rt: the maximum amount of time consumed by a single delete.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>Queries</p>
             * <ul>
             * <li><p><strong>AnalyticDB_QPS</strong>: the QPS.</p>
             * <ul>
             * <li>qps: the number of SELECT operations completed per second.</li>
             * <li>etl_qps: the number of INSERT OVERWRITE operations completed per second.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_QueryRT</strong>: the query response time.</p>
             * <ul>
             * <li>query_avg_rt: the average amount of time consumed by queries.</li>
             * <li>query_max_rt: the maximum amount of time consumed by a single query.</li>
             * <li>etl_avg_rt: the average amount of time consumed by extract-transform-load (ETL) operations.</li>
             * <li>etl_max_rt: the maximum amount of time consumed by a single ETL operation.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_QueryWaitTime</strong>: the query wait time.</p>
             * <ul>
             * <li>query_avg_wait_time: the average wait time for SELECT and ETL operations.</li>
             * <li>query_max_wait_time: the maximum wait time for SELECT and ETL operations.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_QueryFailedRatio: the query failure rate.</p>
             * <ul>
             * <li>query_failed_ratio: the failure rate of SELECT and ETL operations.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>Disks</p>
             * <ul>
             * <li><p><strong>AnalyticDB_IO</strong>: the disk I/O throughput.</p>
             * <ul>
             * <li>worker_avg_read_bytes_ratio: the average read throughput across storage nodes.</li>
             * <li>worker_avg_write_bytes_ratio: the average write throughput across storage nodes.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_IO_UTIL</strong>: the disk I/O usage.</p>
             * <ul>
             * <li>worker_avg_io_util: the disk I/O usage across storage nodes.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_IO_WAIT</strong>: the disk I/O wait time.</p>
             * <ul>
             * <li>worker_avg_io_await: the average I/O wait time of storage nodes.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_IOPS</strong>: the disk IOPS.</p>
             * <ul>
             * <li>worker_avg_read_ratio: the average read IOPS of storage nodes.</li>
             * <li>worker_avg_write_ratio: the average write IOPS of storage nodes.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_DiskUsage</strong>: the disk space that is used.</p>
             * <ul>
             * <li>disk_used_ratio: the average disk space usage across nodes.</li>
             * <li>worker_max_node_disk_used_ratio: the maximum disk space usage across nodes.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_HotDataDiskUsage</strong>: the disk space that is used by hot data.</p>
             * <ul>
             * <li>local_disk_used: the disk space that is used by hot data.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_ColdDataDiskUsage</strong>: the disk space that is used by cold data.</p>
             * <ul>
             * <li>remote_disk_used: the disk space that is used by cold data.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_DiskUsedRatio: the node disk usage.</p>
             * <ul>
             * <li>disk_used_ratio: the average disk usage across nodes.</li>
             * <li>worker_max_node_disk_used_ratio: the maximum disk usage across nodes.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_DiskUsedSize: the total data size of the cluster.</p>
             * <ul>
             * <li>disk_no_log_used: the total data size of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster in reserved mode.</li>
             * <li>disk_no_log_used_max: the maximum data size of nodes of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster in reserved mode.</li>
             * <li>disk_no_log_used_avg: the average data size of nodes of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster in reserved mode.</li>
             * <li>user_used_disk_max: the maximum hot data size of nodes of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster in elastic mode for Cluster Edition.</li>
             * <li>user_used_disk_avg: the average hot data size of nodes of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster in elastic mode for Cluster Edition.</li>
             * <li>hot_disk_used: the hot data size of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster in elastic mode for Cluster Edition.</li>
             * <li>cold_disk_used: the cold data size of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster in elastic mode for Cluster Edition.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>Other</p>
             * <ul>
             * <li><p><strong>AnalyticDB_BuildTaskCount</strong>: the number of BUILD jobs.</p>
             * <ul>
             * <li>max_build_task_count: the maximum number of running BUILD jobs across nodes.</li>
             * <li>avg_build_task_count: the average number of running BUILD jobs across nodes.</li>
             * </ul>
             * </li>
             * <li><p><strong>AnalyticDB_ComputeMemoryUsedRatio</strong>: the compute memory usage.</p>
             * <ul>
             * <li>max_worker_compute_memory_used_ratio: the maximum compute memory usage across storage nodes.</li>
             * <li>avg_worker_compute_memory_used_ratio: the average compute memory usage across storage nodes.</li>
             * <li>max_executor_compute_memory_used_ratio: the maximum compute memory usage across compute nodes.</li>
             * <li>avg_executor_compute_memory_used_ratio: the average compute memory usage across compute nodes.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_UnavailableNodeCount: the number of unavailable nodes.</p>
             * <ul>
             * <li>worker_unavailable_node_count: the number of unavailable storage nodes.</li>
             * <li>executor_unavailable_node_count: the number of unavailable compute nodes.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>WLM</p>
             * <ul>
             * <li><p>AnalyticDB_WLM_ResubmitQueries_Count: the number of resubmitted WLM queries.</p>
             * <ul>
             * <li>AnalyticDB_WLM_ResubmitQueries_Count: the number of resubmitted WLM queries.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_WLM_SQA_AvgRt_MS: the average amount of time consumed by accelerated short WLM queries.</p>
             * <ul>
             * <li>AnalyticDB_WLM_SQA_AvgRt_MS: the average amount of time consumed by accelerated short WLM queries.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_WLM_SQA_Queries_Count: the number of accelerated short WLM queries.</p>
             * <ul>
             * <li>AnalyticDB_WLM_SQA_Queries_Count: the number of accelerated short WLM queries.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_WLM_TotalQueries_Count: the total number of WLM queries.</p>
             * <ul>
             * <li>AnalyticDB_WLM_TotalQueries_Count: the total number of WLM queries.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB Pipeline Service (APS)</p>
             * <ul>
             * <li><p>AnalyticDB_APS_BPS: the bytes per second (BPS) of APS provided by the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
             * <ul>
             * <li>APS_Read_BPS: the read BPS of APS.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_APS_CPU: the CPU utilization of APS provided by the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
             * <ul>
             * <li>APS_CPU_Avg_Usage_Percentage: the average CPU utilization of APS.</li>
             * <li>APS_CPU_Max_Usage_Percentage: the maximum CPU utilization of APS.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_APS_Memory: the memory usage of APS provided by the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
             * <ul>
             * <li>APS_Memory_Avg_Usage_Percentage: the average memory usage of APS.</li>
             * <li>APS_Memory_Max_Usage_Percentage: the maximum memory usage of APS.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_APS_RPS: the number of records per second of APS provided by the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
             * <ul>
             * <li>APS_Read_RPS: the number of read records per second of APS.</li>
             * </ul>
             * </li>
             * <li><p>AnalyticDB_APS_RT: the response time of APS provided by the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
             * <ul>
             * <li>AnalyticDB_APS_RT: the average response time of APS.</li>
             * <li>APS_Read_Max_RT: the maximum response time of APS.</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>worker_avg_cpu_used</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The tags that are added to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>instance_name: &quot;amv-8vbf80pjcz*****&quot;</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The values of the queried performance metric.</p>
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterPerformanceResponseBody</p>
     */
    public static class Performances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Series")
        private java.util.List < Series> series;

        @com.aliyun.core.annotation.NameInMap("Unit")
        private String unit;

        private Performances(Builder builder) {
            this.key = builder.key;
            this.series = builder.series;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Performances create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return series
         */
        public java.util.List < Series> getSeries() {
            return this.series;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < Series> series; 
            private String unit; 

            /**
             * <p>The name of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB_CPU</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The queried performance metric data.</p>
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>The unit of the performance metric.</p>
             * 
             * <strong>example:</strong>
             * <p>%</p>
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Performances build() {
                return new Performances(this);
            } 

        } 

    }
}
