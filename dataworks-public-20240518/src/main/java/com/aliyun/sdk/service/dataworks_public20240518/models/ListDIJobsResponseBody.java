// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDIJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIJobsResponseBody</p>
 */
public class ListDIJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDIJobsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDIJobsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The paging information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7263E4AC-9D2E-5B29-B8AF-7C5012E92A41</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIJobsResponseBody build() {
            return new ListDIJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDIJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobsResponseBody</p>
     */
    public static class DIJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIJobId")
        @Deprecated
        private Long DIJobId;

        @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
        private String destinationDataSourceType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("MigrationType")
        private String migrationType;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
        private String sourceDataSourceType;

        private DIJobs(Builder builder) {
            this.DIJobId = builder.DIJobId;
            this.destinationDataSourceType = builder.destinationDataSourceType;
            this.id = builder.id;
            this.jobName = builder.jobName;
            this.jobStatus = builder.jobStatus;
            this.migrationType = builder.migrationType;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.sourceDataSourceType = builder.sourceDataSourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIJobs create() {
            return builder().build();
        }

        /**
         * @return DIJobId
         */
        public Long getDIJobId() {
            return this.DIJobId;
        }

        /**
         * @return destinationDataSourceType
         */
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return migrationType
         */
        public String getMigrationType() {
            return this.migrationType;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return sourceDataSourceType
         */
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

        public static final class Builder {
            private Long DIJobId; 
            private String destinationDataSourceType; 
            private Long id; 
            private String jobName; 
            private String jobStatus; 
            private String migrationType; 
            private String owner; 
            private Long projectId; 
            private String sourceDataSourceType; 

            private Builder() {
            } 

            private Builder(DIJobs model) {
                this.DIJobId = model.DIJobId;
                this.destinationDataSourceType = model.destinationDataSourceType;
                this.id = model.id;
                this.jobName = model.jobName;
                this.jobStatus = model.jobStatus;
                this.migrationType = model.migrationType;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.sourceDataSourceType = model.sourceDataSourceType;
            } 

            /**
             * <p>This parameter is deprecated. Use the <code>Id</code> parameter instead.</p>
             * 
             * <strong>example:</strong>
             * <p>32599</p>
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * <p>The type of the destination data source. Valid values: <code>Hologres</code>, <code>OSS-HDFS</code>, <code>OSS</code>, <code>MaxCompute</code>, <code>LogHub</code>, <code>StarRocks</code>, <code>DataHub</code>, <code>AnalyticDB_For_MySQL</code>, <code>Kafka</code>, and <code>Hive</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Hologres</p>
             */
            public Builder destinationDataSourceType(String destinationDataSourceType) {
                this.destinationDataSourceType = destinationDataSourceType;
                return this;
            }

            /**
             * <p>The ID of the Data Integration job.</p>
             * 
             * <strong>example:</strong>
             * <p>32599</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_to_holo_sync_35197</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The job status. Valid values:</p>
             * <ul>
             * <li><p><code>Finished</code>: The job completed successfully.</p>
             * </li>
             * <li><p><code>Initialized</code>: The job is initialized.</p>
             * </li>
             * <li><p><code>Stopped</code>: The job is stopped.</p>
             * </li>
             * <li><p><code>Failed</code>: The job failed.</p>
             * </li>
             * <li><p><code>Running</code>: The job is running.</p>
             * </li>
             * <li><p><code>Stopping</code>: The job is being stopped.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * <p>The synchronization type. Valid values:</p>
             * <ul>
             * <li><p><code>FullAndRealtimeIncremental</code>: full and real-time incremental synchronization</p>
             * </li>
             * <li><p><code>RealtimeIncremental</code>: real-time incremental synchronization</p>
             * </li>
             * <li><p><code>Full</code>: full synchronization</p>
             * </li>
             * <li><p><code>OfflineIncremental</code>: offline incremental synchronization</p>
             * </li>
             * <li><p><code>FullAndOfflineIncremental</code>: full and offline incremental synchronization</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FullAndRealtimeIncremental</p>
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace that contains the job.</p>
             * 
             * <strong>example:</strong>
             * <p>26442</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the source data source. Valid values: <code>PolarDB</code>, <code>MySQL</code>, <code>Kafka</code>, <code>LogHub</code>, <code>Hologres</code>, <code>Oracle</code>, <code>OceanBase</code>, <code>MongoDB</code>, <code>RedShift</code>, <code>Hive</code>, <code>SQLServer</code>, <code>Doris</code>, and <code>ClickHouse</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Mysql</p>
             */
            public Builder sourceDataSourceType(String sourceDataSourceType) {
                this.sourceDataSourceType = sourceDataSourceType;
                return this;
            }

            public DIJobs build() {
                return new DIJobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDIJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDIJobsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIJobs")
        private java.util.List<DIJobs> DIJobs;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PagingInfo(Builder builder) {
            this.DIJobs = builder.DIJobs;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return DIJobs
         */
        public java.util.List<DIJobs> getDIJobs() {
            return this.DIJobs;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DIJobs> DIJobs; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.DIJobs = model.DIJobs;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>A list of Data Integration jobs.</p>
             */
            public Builder DIJobs(java.util.List<DIJobs> DIJobs) {
                this.DIJobs = DIJobs;
                return this;
            }

            /**
             * <p>The returned page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries that meet the filter criteria.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
