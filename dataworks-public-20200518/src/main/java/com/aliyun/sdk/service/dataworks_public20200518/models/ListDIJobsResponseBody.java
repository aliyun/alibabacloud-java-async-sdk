// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDIJobsResponseBody model) {
            this.DIJobPaging = model.DIJobPaging;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder DIJobPaging(DIJobPaging DIJobPaging) {
            this.DIJobPaging = DIJobPaging;
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

            private Builder() {
            } 

            private Builder(DIJobs model) {
                this.DIJobId = model.DIJobId;
                this.destinationDataSourceType = model.destinationDataSourceType;
                this.jobName = model.jobName;
                this.jobStatus = model.jobStatus;
                this.migrationType = model.migrationType;
                this.projectId = model.projectId;
                this.sourceDataSourceType = model.sourceDataSourceType;
            } 

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16626</p>
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * <p>The type of the destination. The value Hologres is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Hologres</p>
             */
            public Builder destinationDataSourceType(String destinationDataSourceType) {
                this.destinationDataSourceType = destinationDataSourceType;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql_to_holo_sync_8772</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
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
             * <p>Finished</p>
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
             * <li>Full: one-time full synchronization</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Full</p>
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1967</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the source. The value MySQL is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
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
    public static class DIJobPaging extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DIJobs")
        private java.util.List<DIJobs> DIJobs;

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
        public java.util.List<DIJobs> getDIJobs() {
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
            private java.util.List<DIJobs> DIJobs; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(DIJobPaging model) {
                this.DIJobs = model.DIJobs;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of tasks.</p>
             */
            public Builder DIJobs(java.util.List<DIJobs> DIJobs) {
                this.DIJobs = DIJobs;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
