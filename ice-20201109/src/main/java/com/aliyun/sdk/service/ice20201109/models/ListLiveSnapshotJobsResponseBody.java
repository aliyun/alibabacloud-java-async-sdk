// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveSnapshotJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveSnapshotJobsResponseBody</p>
 */
public class ListLiveSnapshotJobsResponseBody extends TeaModel {
    @NameInMap("JobList")
    private java.util.List < JobList> jobList;

    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SortBy")
    private String sortBy;

    @NameInMap("TotalCount")
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

    /**
     * @return jobList
     */
    public java.util.List < JobList> getJobList() {
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
        private java.util.List < JobList> jobList; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private String sortBy; 
        private Long totalCount; 

        /**
         * JobList.
         */
        public Builder jobList(java.util.List < JobList> jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLiveSnapshotJobsResponseBody build() {
            return new ListLiveSnapshotJobsResponseBody(this);
        } 

    } 

    public static class SnapshotOutput extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("StorageType")
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

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * StorageType.
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
    public static class JobList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("SnapshotOutput")
        private SnapshotOutput snapshotOutput;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TimeInterval")
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

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * SnapshotOutput.
             */
            public Builder snapshotOutput(SnapshotOutput snapshotOutput) {
                this.snapshotOutput = snapshotOutput;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TimeInterval.
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
