// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListLiveSnapshotJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveSnapshotJobsResponseBody</p>
 */
public class ListLiveSnapshotJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobList")
    private java.util.List<JobList> jobList;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLiveSnapshotJobsResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sortBy = builder.sortBy;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveSnapshotJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobList
     */
    public java.util.List<JobList> getJobList() {
        return this.jobList;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<JobList> jobList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListLiveSnapshotJobsResponseBody model) {
            this.jobList = model.jobList;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sortBy = model.sortBy;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of jobs.</p>
         */
        public Builder jobList(java.util.List<JobList> jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The sorting order of the jobs by creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLiveSnapshotJobsResponseBody build() {
            return new ListLiveSnapshotJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveSnapshotJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveSnapshotJobsResponseBody</p>
     */
    public static class SnapshotOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private SnapshotOutput(Builder builder) {
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotOutput create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String bucket; 
            private String endpoint; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(SnapshotOutput model) {
                this.bucket = model.bucket;
                this.endpoint = model.endpoint;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The bucket of the output endpoint. If the storage type is set to oss, the OSS bucket is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>testbucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The output endpoint. If the storage type is set to oss, the Object Storage Service (OSS) domain name is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The storage type. The value can only be oss.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public SnapshotOutput build() {
                return new SnapshotOutput(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLiveSnapshotJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveSnapshotJobsResponseBody</p>
     */
    public static class JobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("SnapshotOutput")
        private SnapshotOutput snapshotOutput;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TimeInterval")
        private Integer timeInterval;

        private JobList(Builder builder) {
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.snapshotOutput = builder.snapshotOutput;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.timeInterval = builder.timeInterval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return snapshotOutput
         */
        public SnapshotOutput getSnapshotOutput() {
            return this.snapshotOutput;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return timeInterval
         */
        public Integer getTimeInterval() {
            return this.timeInterval;
        }

        public static final class Builder {
            private String createTime; 
            private String jobId; 
            private String jobName; 
            private SnapshotOutput snapshotOutput; 
            private String status; 
            private String templateId; 
            private String templateName; 
            private Integer timeInterval; 

            private Builder() {
            } 

            private Builder(JobList model) {
                this.createTime = model.createTime;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.snapshotOutput = model.snapshotOutput;
                this.status = model.status;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.timeInterval = model.timeInterval;
            } 

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-20T02:48:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the job.</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The output information.</p>
             */
            public Builder snapshotOutput(SnapshotOutput snapshotOutput) {
                this.snapshotOutput = snapshotOutput;
                return this;
            }

            /**
             * <p>The state of the job.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>init: The job is not started.</li>
             * <li>paused: The job is paused.</li>
             * <li>started: The job is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>started</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>a046-263c-3560-978a-fb287666</strong></strong></p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The interval between two adjacent snapshots. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder timeInterval(Integer timeInterval) {
                this.timeInterval = timeInterval;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
}
