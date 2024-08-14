// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIJobsResponseBody</p>
 */
public class ListDIJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DIJobPaging")
    private DIJobPaging DIJobPaging;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDIJobsResponseBody(Builder builder) {
        this.DIJobPaging = builder.DIJobPaging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DIJobPaging
     */
    public DIJobPaging getDIJobPaging() {
        return this.DIJobPaging;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DIJobPaging DIJobPaging; 
        private String requestId; 

        /**
         * The pagination information.
         */
        public Builder DIJobPaging(DIJobPaging DIJobPaging) {
            this.DIJobPaging = DIJobPaging;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIJobsResponseBody build() {
            return new ListDIJobsResponseBody(this);
        } 

    } 

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
             * The task ID.
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * The type of the destination. The value Hologres is returned.
             */
            public Builder destinationDataSourceType(String destinationDataSourceType) {
                this.destinationDataSourceType = destinationDataSourceType;
                return this;
            }

            /**
             * The task name.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * The task status. Valid values:
             * <p>
             * 
             * *   Finished
             * *   Initialized
             * *   Stopped
             * *   Failed
             * *   Running
             * *   Stopping
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * The synchronization type. Valid values:
             * <p>
             * 
             * *   FullAndRealtimeIncremental: one-time full synchronization and real-time incremental synchronization
             * *   RealtimeIncremental: real-time incremental synchronization
             * *   Full: one-time full synchronization
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * The workspace ID.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The type of the source. The value MySQL is returned.
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
    public static class DIJobPaging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIJobs")
        private java.util.List < DIJobs> DIJobs;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private DIJobPaging(Builder builder) {
            this.DIJobs = builder.DIJobs;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIJobPaging create() {
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
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DIJobs> DIJobs; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The list of tasks.
             */
            public Builder DIJobs(java.util.List < DIJobs> DIJobs) {
                this.DIJobs = DIJobs;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DIJobPaging build() {
                return new DIJobPaging(this);
            } 

        } 

    }
}
