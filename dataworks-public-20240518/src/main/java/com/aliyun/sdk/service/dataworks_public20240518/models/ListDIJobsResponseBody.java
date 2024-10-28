// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
        private Long DIJobId;

        @com.aliyun.core.annotation.NameInMap("DestinationDataSourceType")
        private String destinationDataSourceType;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("MigrationType")
        private String migrationType;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SourceDataSourceType")
        private String sourceDataSourceType;

        private DIJobs(Builder builder) {
            this.DIJobId = builder.DIJobId;
            this.destinationDataSourceType = builder.destinationDataSourceType;
            this.jobName = builder.jobName;
            this.jobStatus = builder.jobStatus;
            this.migrationType = builder.migrationType;
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
            private String jobName; 
            private String jobStatus; 
            private String migrationType; 
            private Long projectId; 
            private String sourceDataSourceType; 

            /**
             * <p>The ID of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>32599</p>
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * <p>The destination type. Valid values: Hologres and Hive.</p>
             * 
             * <strong>example:</strong>
             * <p>Hologres</p>
             */
            public Builder destinationDataSourceType(String destinationDataSourceType) {
                this.destinationDataSourceType = destinationDataSourceType;
                return this;
            }

            /**
             * <p>The name of the synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_to_holo_sync_35197</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The status of the synchronization task. Valid values:</p>
             * <ul>
             * <li>Finished</li>
             * <li>Initialized</li>
             * <li>Stopped</li>
             * <li>Failed</li>
             * <li>Running</li>
             * <li>Stopping</li>
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
             * <li>FullAndRealtimeIncremental: one-time full synchronization and real-time incremental synchronization</li>
             * <li>RealtimeIncremental: real-time incremental synchronization</li>
             * <li>Full: full synchronization</li>
             * <li>OfflineIncremental: batch incremental synchronization</li>
             * <li>FullAndOfflineIncremental: one-time full synchronization and batch incremental synchronization</li>
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
             * <p>The ID of the DataWorks workspace to which the synchronization task belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>26442</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The source type. The value MySQL is returned.</p>
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
        private java.util.List < DIJobs> DIJobs;

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
        public java.util.List < DIJobs> getDIJobs() {
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
            private java.util.List < DIJobs> DIJobs; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * <p>The synchronization tasks returned.</p>
             */
            public Builder DIJobs(java.util.List < DIJobs> DIJobs) {
                this.DIJobs = DIJobs;
                return this;
            }

            /**
             * <p>The page number.</p>
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
             * <p>The total number of entries returned.</p>
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
