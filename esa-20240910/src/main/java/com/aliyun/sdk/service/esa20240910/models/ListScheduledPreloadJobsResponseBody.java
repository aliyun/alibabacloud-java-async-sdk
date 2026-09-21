// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListScheduledPreloadJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListScheduledPreloadJobsResponseBody</p>
 */
public class ListScheduledPreloadJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Jobs")
    private java.util.List<Jobs> jobs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListScheduledPreloadJobsResponseBody(Builder builder) {
        this.jobs = builder.jobs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledPreloadJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobs
     */
    public java.util.List<Jobs> getJobs() {
        return this.jobs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Jobs> jobs; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListScheduledPreloadJobsResponseBody model) {
            this.jobs = model.jobs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of prefetch task information.</p>
         */
        public Builder jobs(java.util.List<Jobs> jobs) {
            this.jobs = jobs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-A198-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records after filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScheduledPreloadJobsResponseBody build() {
            return new ListScheduledPreloadJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScheduledPreloadJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListScheduledPreloadJobsResponseBody</p>
     */
    public static class Jobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private String aliUid;

        @com.aliyun.core.annotation.NameInMap("CreatedAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("Domains")
        private String domains;

        @com.aliyun.core.annotation.NameInMap("ErrorInfo")
        private String errorInfo;

        @com.aliyun.core.annotation.NameInMap("ExecutionCount")
        private Integer executionCount;

        @com.aliyun.core.annotation.NameInMap("FailedFileOss")
        private String failedFileOss;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InsertWay")
        private String insertWay;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private Long siteId;

        @com.aliyun.core.annotation.NameInMap("TaskSubmitted")
        private Integer taskSubmitted;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UrlCount")
        private Integer urlCount;

        @com.aliyun.core.annotation.NameInMap("UrlSubmitted")
        private Integer urlSubmitted;

        private Jobs(Builder builder) {
            this.aliUid = builder.aliUid;
            this.createdAt = builder.createdAt;
            this.domains = builder.domains;
            this.errorInfo = builder.errorInfo;
            this.executionCount = builder.executionCount;
            this.failedFileOss = builder.failedFileOss;
            this.fileId = builder.fileId;
            this.id = builder.id;
            this.insertWay = builder.insertWay;
            this.name = builder.name;
            this.siteId = builder.siteId;
            this.taskSubmitted = builder.taskSubmitted;
            this.taskType = builder.taskType;
            this.urlCount = builder.urlCount;
            this.urlSubmitted = builder.urlSubmitted;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return domains
         */
        public String getDomains() {
            return this.domains;
        }

        /**
         * @return errorInfo
         */
        public String getErrorInfo() {
            return this.errorInfo;
        }

        /**
         * @return executionCount
         */
        public Integer getExecutionCount() {
            return this.executionCount;
        }

        /**
         * @return failedFileOss
         */
        public String getFailedFileOss() {
            return this.failedFileOss;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return insertWay
         */
        public String getInsertWay() {
            return this.insertWay;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return siteId
         */
        public Long getSiteId() {
            return this.siteId;
        }

        /**
         * @return taskSubmitted
         */
        public Integer getTaskSubmitted() {
            return this.taskSubmitted;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return urlCount
         */
        public Integer getUrlCount() {
            return this.urlCount;
        }

        /**
         * @return urlSubmitted
         */
        public Integer getUrlSubmitted() {
            return this.urlSubmitted;
        }

        public static final class Builder {
            private String aliUid; 
            private String createdAt; 
            private String domains; 
            private String errorInfo; 
            private Integer executionCount; 
            private String failedFileOss; 
            private String fileId; 
            private String id; 
            private String insertWay; 
            private String name; 
            private Long siteId; 
            private Integer taskSubmitted; 
            private String taskType; 
            private Integer urlCount; 
            private Integer urlSubmitted; 

            private Builder() {
            } 

            private Builder(Jobs model) {
                this.aliUid = model.aliUid;
                this.createdAt = model.createdAt;
                this.domains = model.domains;
                this.errorInfo = model.errorInfo;
                this.executionCount = model.executionCount;
                this.failedFileOss = model.failedFileOss;
                this.fileId = model.fileId;
                this.id = model.id;
                this.insertWay = model.insertWay;
                this.name = model.name;
                this.siteId = model.siteId;
                this.taskSubmitted = model.taskSubmitted;
                this.taskType = model.taskType;
                this.urlCount = model.urlCount;
                this.urlSubmitted = model.urlSubmitted;
            } 

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>15685865xxx14622</p>
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The task creation time in ISO 8601 format (for example, 2024-01-01T00:00:00+Z).</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-01T08:53:13Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>The list of domain names for prefetch.</p>
             * 
             * <strong>example:</strong>
             * <p>testurl.com</p>
             */
            public Builder domains(String domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The fault error message.</p>
             * 
             * <strong>example:</strong>
             * <p>invalid domain:test.com</p>
             */
            public Builder errorInfo(String errorInfo) {
                this.errorInfo = errorInfo;
                return this;
            }

            /**
             * <p>The number of prefetch schedules.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executionCount(Integer executionCount) {
                this.executionCount = executionCount;
                return this;
            }

            /**
             * <p>The OSS URL of the failed file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7">https://xxxobject.oss-cn-reginon.aliyuncs.com/9d91_xxxxxxxxxxx_158bb6e0f97c477791209bb46bd599f7</a></p>
             */
            public Builder failedFileOss(String failedFileOss) {
                this.failedFileOss = failedFileOss;
                return this;
            }

            /**
             * <p>The URL list file ID, which is used for download.</p>
             * 
             * <strong>example:</strong>
             * <p>665d3b48621bccf3fe29e1a7</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>665d3af3621bccf3fe29e1a4</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The URL insertion method. Valid values:</p>
             * <ul>
             * <li>oss: URLs are imported in bulk from an OSS file.</li>
             * <li>testBox: URLs are entered one by one in a text box.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder insertWay(String insertWay) {
                this.insertWay = insertWay;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>190007158391808</p>
             */
            public Builder siteId(Long siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The number of URLs that have been submitted to the system for prefetch.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskSubmitted(Integer taskSubmitted) {
                this.taskSubmitted = taskSubmitted;
                return this;
            }

            /**
             * <p>The task type (refresh or prefetch). Valid values:</p>
             * <ul>
             * <li>path: Directory refresh.</li>
             * <li>refresh: URL refresh.</li>
             * <li>preload: URL prefetch.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preload</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of URLs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder urlCount(Integer urlCount) {
                this.urlCount = urlCount;
                return this;
            }

            /**
             * <p>The number of submitted URLs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder urlSubmitted(Integer urlSubmitted) {
                this.urlSubmitted = urlSubmitted;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
}
