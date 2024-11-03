// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of queried tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The details of the task, including the task ID, start time, end time, domain name, success rate, status, returned error code, and completion details of all URL resources.</p>
         */
        public Builder urlDetails(java.util.List < UrlDetails> urlDetails) {
            this.urlDetails = urlDetails;
            return this;
        }

        public DescribePreloadDetailByIdResponseBody build() {
            return new DescribePreloadDetailByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePreloadDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreloadDetailByIdResponseBody</p>
     */
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
             * <p>The details of resource prefetch.</p>
             * <ul>
             * <li>If the resource is prefetched on all POPs, &quot;Successfully preloaded&quot; is returned.</li>
             * <li>If the resource fails to be prefetched on some POPs, the failure details separated by vertical bars (|) are returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Successfully preloaded</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The success percentage, which indicates the number of POPs on which the resource is prefetched.</p>
             * 
             * <strong>example:</strong>
             * <p>47%</p>
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The URL of the prefetched resource.</p>
             * 
             * <strong>example:</strong>
             * <p>/abc.jpg</p>
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
    /**
     * 
     * {@link DescribePreloadDetailByIdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreloadDetailByIdResponseBody</p>
     */
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
             * <p>The time when the task was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-23T02:26:56Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The domain name for prefetching resources.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The time when the task ended. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-23T02:27:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The progress of the prefetch task, which indicates the number of points of presence (POPs) on which the prefetch task is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The turned error code. A value of <code>0</code> indicates that the task succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder retCode(String retCode) {
                this.retCode = retCode;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>Complete</strong></li>
             * <li><strong>Refreshing</strong></li>
             * <li><strong>Failed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the task that you want to query.</p>
             * <p>You can call the PushObjectCache operation to query task IDs. Then, you can use the task IDs to query task status.</p>
             * <p>You can query one task ID at a time.</p>
             * 
             * <strong>example:</strong>
             * <p>14286878547</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The completion details of all URL resources in the task.</p>
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
