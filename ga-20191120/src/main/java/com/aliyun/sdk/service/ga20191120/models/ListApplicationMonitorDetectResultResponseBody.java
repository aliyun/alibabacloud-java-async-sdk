// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link ListApplicationMonitorDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationMonitorDetectResultResponseBody</p>
 */
public class ListApplicationMonitorDetectResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationMonitorDetectResultList")
    private java.util.List<ApplicationMonitorDetectResultList> applicationMonitorDetectResultList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationMonitorDetectResultResponseBody(Builder builder) {
        this.applicationMonitorDetectResultList = builder.applicationMonitorDetectResultList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationMonitorDetectResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationMonitorDetectResultList
     */
    public java.util.List<ApplicationMonitorDetectResultList> getApplicationMonitorDetectResultList() {
        return this.applicationMonitorDetectResultList;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationMonitorDetectResultList> applicationMonitorDetectResultList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationMonitorDetectResultResponseBody model) {
            this.applicationMonitorDetectResultList = model.applicationMonitorDetectResultList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the diagnostic result of the origin probing task.</p>
         */
        public Builder applicationMonitorDetectResultList(java.util.List<ApplicationMonitorDetectResultList> applicationMonitorDetectResultList) {
            this.applicationMonitorDetectResultList = applicationMonitorDetectResultList;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationMonitorDetectResultResponseBody build() {
            return new ListApplicationMonitorDetectResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationMonitorDetectResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationMonitorDetectResultResponseBody</p>
     */
    public static class ApplicationMonitorDetectResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("DetectTime")
        private String detectTime;

        @com.aliyun.core.annotation.NameInMap("DiagStatus")
        private String diagStatus;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private ApplicationMonitorDetectResultList(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.content = builder.content;
            this.detail = builder.detail;
            this.detectTime = builder.detectTime;
            this.diagStatus = builder.diagStatus;
            this.listenerId = builder.listenerId;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.statusCode = builder.statusCode;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationMonitorDetectResultList create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return detectTime
         */
        public String getDetectTime() {
            return this.detectTime;
        }

        /**
         * @return diagStatus
         */
        public String getDiagStatus() {
            return this.diagStatus;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String content; 
            private String detail; 
            private String detectTime; 
            private String diagStatus; 
            private String listenerId; 
            private String port; 
            private String protocol; 
            private String statusCode; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(ApplicationMonitorDetectResultList model) {
                this.acceleratorId = model.acceleratorId;
                this.content = model.content;
                this.detail = model.detail;
                this.detectTime = model.detectTime;
                this.diagStatus = model.diagStatus;
                this.listenerId = model.listenerId;
                this.port = model.port;
                this.protocol = model.protocol;
                this.statusCode = model.statusCode;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The ID of the GA instance on which the origin probing task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>ga-bp1odcab8tmno0hdq****</p>
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * <p>The response content returned by the origin probing task.</p>
             * 
             * <strong>example:</strong>
             * <p>502 BadGateway</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The description of the diagnostic result. Valid values:</p>
             * <ul>
             * <li><strong>All forward nodes work well.:</strong> The origin server is normal.</li>
             * <li><strong>Endpoint network error.:</strong> The origin server is abnormal. You must check whether the origin server is running as expected.</li>
             * <li><strong>Public network error.:</strong> An Internet error occurred, which is a network error that occurred when the client connected to the acceleration region.</li>
             * <li><strong>Ga internal error.:</strong> An internal error occurred. For example, an exception occurred when GA processed a request.</li>
             * <li><strong>Ga has been deleted.:</strong> The current GA instance is deleted.</li>
             * <li><strong>Ga state is not stable.:</strong> The current GA instance is in an unstable state, such as the Configuring state.</li>
             * <li><strong>Ga has no listener configuration.:</strong> No listener is configured for the current GA instance.</li>
             * <li><strong>Missing endpoint configuration.:</strong> No endpoint is configured.</li>
             * <li><strong>Missing acceleration region configuration.:</strong> No acceleration region is configured.</li>
             * <li><strong>Missing endpointgroup configuration.:</strong> No endpoint group is configured.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All forward nodes work well</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time when the diagnosis of the origin probing task ends.</p>
             * 
             * <strong>example:</strong>
             * <p>1663205460</p>
             */
            public Builder detectTime(String detectTime) {
                this.detectTime = detectTime;
                return this;
            }

            /**
             * <p>The diagnostic result of the origin probing task. Valid values:</p>
             * <ul>
             * <li><strong>success:</strong> The origin probing task succeeded.</li>
             * <li><strong>failed:</strong> The origin probing task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder diagStatus(String diagStatus) {
                this.diagStatus = diagStatus;
                return this;
            }

            /**
             * <p>The ID of the listener on which the origin probing task runs.</p>
             * 
             * <strong>example:</strong>
             * <p>lsr-bp1bpn0kn908w4nbw****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The network transmission protocol that is used by the listener. Valid values:</p>
             * <ul>
             * <li><strong>tcp:</strong> TCP.</li>
             * <li><strong>udp:</strong> UDP.</li>
             * <li><strong>http:</strong> HTTP.</li>
             * <li><strong>https:</strong> HTTPS.</li>
             * </ul>
             * <blockquote>
             * <p> UDP listeners do not support probing.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>http</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The error code returned by the origin probing task.</p>
             * 
             * <strong>example:</strong>
             * <p>502</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The origin probing task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sm-bp1fpdjfju9k8yr1y****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public ApplicationMonitorDetectResultList build() {
                return new ApplicationMonitorDetectResultList(this);
            } 

        } 

    }
}
