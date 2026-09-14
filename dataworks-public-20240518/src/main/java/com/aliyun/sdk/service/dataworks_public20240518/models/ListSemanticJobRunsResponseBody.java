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
 * {@link ListSemanticJobRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSemanticJobRunsResponseBody</p>
 */
public class ListSemanticJobRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSemanticJobRunsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSemanticJobRunsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSemanticJobRunsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The paginated run record results. Use the JobRunId to download the results of a specific run, and use the ExecutorJobId to query details, retrieve logs, or stop a run.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSemanticJobRunsResponseBody build() {
            return new ListSemanticJobRunsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSemanticJobRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSemanticJobRunsResponseBody</p>
     */
    public static class JobRuns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExecutorJobId")
        private String executorJobId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobRunId")
        private String jobRunId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private JobRuns(Builder builder) {
            this.executorJobId = builder.executorJobId;
            this.gmtCreate = builder.gmtCreate;
            this.jobName = builder.jobName;
            this.jobRunId = builder.jobRunId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobRuns create() {
            return builder().build();
        }

        /**
         * @return executorJobId
         */
        public String getExecutorJobId() {
            return this.executorJobId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobRunId
         */
        public String getJobRunId() {
            return this.jobRunId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String executorJobId; 
            private Long gmtCreate; 
            private String jobName; 
            private String jobRunId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(JobRuns model) {
                this.executorJobId = model.executorJobId;
                this.gmtCreate = model.gmtCreate;
                this.jobName = model.jobName;
                this.jobRunId = model.jobRunId;
                this.userId = model.userId;
            } 

            /**
             * <p>The executor job ID. Pass this value as the ExecutorJobId parameter to GetSemanticJobDetail, GetSemanticJobLog, or KillSemanticJob.</p>
             * 
             * <strong>example:</strong>
             * <p>exec-job-demo</p>
             */
            public Builder executorJobId(String executorJobId) {
                this.executorJobId = executorJobId;
                return this;
            }

            /**
             * <p>The time when the run record was created. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1700000000000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The name of the job to which this run belongs. You can use this value to rerun the job, query run records, or download results.</p>
             * 
             * <strong>example:</strong>
             * <p>semantic-job-demo</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The semantic job run ID. Pass this value as the JobRunId parameter to DownloadSemanticResults to download the results of this run.</p>
             * 
             * <strong>example:</strong>
             * <p>01H00000000000000000000000</p>
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            /**
             * <p>The ID of the user who submitted this run.</p>
             * 
             * <strong>example:</strong>
             * <p>user-demo</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public JobRuns build() {
                return new JobRuns(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSemanticJobRunsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSemanticJobRunsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobRuns")
        private java.util.List<JobRuns> jobRuns;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.jobRuns = builder.jobRuns;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobRuns
         */
        public java.util.List<JobRuns> getJobRuns() {
            return this.jobRuns;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<JobRuns> jobRuns; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.jobRuns = model.jobRuns;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of run records.</p>
             */
            public Builder jobRuns(java.util.List<JobRuns> jobRuns) {
                this.jobRuns = jobRuns;
                return this;
            }

            /**
             * <p>The page number of the returned page, starting from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of records per page in the current response.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of run records that match the current job criteria.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
