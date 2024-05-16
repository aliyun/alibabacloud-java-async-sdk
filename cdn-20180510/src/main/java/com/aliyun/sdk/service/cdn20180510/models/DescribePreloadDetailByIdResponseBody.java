// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreloadDetailByIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreloadDetailByIdResponseBody</p>
 */
public class DescribePreloadDetailByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UrlDetails")
    private java.util.List < UrlDetails> urlDetails;

    private DescribePreloadDetailByIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.urlDetails = builder.urlDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreloadDetailByIdResponseBody create() {
        return builder().build();
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return urlDetails
     */
    public java.util.List < UrlDetails> getUrlDetails() {
        return this.urlDetails;
    }

    public static final class Builder {
        private String requestId; 
        private Long totalCount; 
        private java.util.List < UrlDetails> urlDetails; 

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of queried tasks.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The details of the task, including the task ID, start time, end time, domain name, success rate, status, returned error code, and completion details of all URL resources.
         */
        public Builder urlDetails(java.util.List < UrlDetails> urlDetails) {
            this.urlDetails = urlDetails;
            return this;
        }

        public DescribePreloadDetailByIdResponseBody build() {
            return new DescribePreloadDetailByIdResponseBody(this);
        } 

    } 

    public static class Urls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Urls(Builder builder) {
            this.description = builder.description;
            this.success = builder.success;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Urls create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String description; 
            private String success; 
            private String url; 

            /**
             * The details of resource prefetch.
             * <p>
             * 
             * *   If the resource is prefetched on all POPs, "Successfully preloaded" is returned.
             * *   If the resource fails to be prefetched on some POPs, the failure details separated by vertical bars (|) are returned.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The success percentage, which indicates the number of POPs on which the resource is prefetched.
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            /**
             * The URL of the prefetched resource.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Urls build() {
                return new Urls(this);
            } 

        } 

    }
    public static class UrlDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("RetCode")
        private String retCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Urls")
        private java.util.List < Urls> urls;

        private UrlDetails(Builder builder) {
            this.creationTime = builder.creationTime;
            this.domain = builder.domain;
            this.endTime = builder.endTime;
            this.process = builder.process;
            this.retCode = builder.retCode;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.urls = builder.urls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UrlDetails create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
        }

        /**
         * @return retCode
         */
        public String getRetCode() {
            return this.retCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return urls
         */
        public java.util.List < Urls> getUrls() {
            return this.urls;
        }

        public static final class Builder {
            private String creationTime; 
            private String domain; 
            private String endTime; 
            private String process; 
            private String retCode; 
            private String status; 
            private String taskId; 
            private java.util.List < Urls> urls; 

            /**
             * The time when the task was created. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The domain name for prefetching resources.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The time when the task ended. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The progress of the prefetch task, which indicates the number of points of presence (POPs) on which the prefetch task is completed.
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * The turned error code. A value of `0` indicates that the task succeeded.
             */
            public Builder retCode(String retCode) {
                this.retCode = retCode;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **Complete**
             * *   **Refreshing**
             * *   **Failed**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the task that you want to query.
             * <p>
             * 
             * You can call the PushObjectCache operation to query task IDs. Then, you can use the task IDs to query task status.
             * 
             * You can query one task ID at a time.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The completion details of all URL resources in the task.
             */
            public Builder urls(java.util.List < Urls> urls) {
                this.urls = urls;
                return this;
            }

            public UrlDetails build() {
                return new UrlDetails(this);
            } 

        } 

    }
}
