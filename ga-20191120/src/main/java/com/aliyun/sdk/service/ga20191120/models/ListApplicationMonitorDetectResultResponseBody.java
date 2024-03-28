// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationMonitorDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationMonitorDetectResultResponseBody</p>
 */
public class ListApplicationMonitorDetectResultResponseBody extends TeaModel {
    @NameInMap("ApplicationMonitorDetectResultList")
    private java.util.List < ApplicationMonitorDetectResultList> applicationMonitorDetectResultList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return applicationMonitorDetectResultList
     */
    public java.util.List < ApplicationMonitorDetectResultList> getApplicationMonitorDetectResultList() {
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
        private java.util.List < ApplicationMonitorDetectResultList> applicationMonitorDetectResultList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details about the diagnostic result of the origin probing task.
         */
        public Builder applicationMonitorDetectResultList(java.util.List < ApplicationMonitorDetectResultList> applicationMonitorDetectResultList) {
            this.applicationMonitorDetectResultList = applicationMonitorDetectResultList;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationMonitorDetectResultResponseBody build() {
            return new ListApplicationMonitorDetectResultResponseBody(this);
        } 

    } 

    public static class ApplicationMonitorDetectResultList extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Content")
        private String content;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("DetectTime")
        private String detectTime;

        @NameInMap("DiagStatus")
        private String diagStatus;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("StatusCode")
        private String statusCode;

        @NameInMap("TaskId")
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

            /**
             * The ID of the GA instance on which the origin probing task runs.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The response content returned by the origin probing task.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The description of the diagnostic result. Valid values:
             * <p>
             * 
             * *   **All forward nodes work well.:** The origin server is normal.
             * *   **Endpoint network error.:** The origin server is abnormal. You must check whether the origin server is running as expected.
             * *   **Public network error.:** An Internet error occurred, which is a network error that occurred when the client connected to the acceleration region.
             * *   **Ga internal error.:** An internal error occurred. For example, an exception occurred when GA processed a request.
             * *   **Ga has been deleted.:** The current GA instance is deleted.
             * *   **Ga state is not stable.:** The current GA instance is in an unstable state, such as the Configuring state.
             * *   **Ga has no listener configuration.:** No listener is configured for the current GA instance.
             * *   **Missing endpoint configuration.:** No endpoint is configured.
             * *   **Missing acceleration region configuration.:** No acceleration region is configured.
             * *   **Missing endpointgroup configuration.:** No endpoint group is configured.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The time when the diagnosis of the origin probing task ends.
             */
            public Builder detectTime(String detectTime) {
                this.detectTime = detectTime;
                return this;
            }

            /**
             * The diagnostic result of the origin probing task. Valid values:
             * <p>
             * 
             * *   **success:** The origin probing task succeeded.
             * *   **failed:** The origin probing task failed.
             */
            public Builder diagStatus(String diagStatus) {
                this.diagStatus = diagStatus;
                return this;
            }

            /**
             * The ID of the listener on which the origin probing task runs.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The listener port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The network transmission protocol that is used by the listener. Valid values:
             * <p>
             * 
             * *   **tcp:** TCP.
             * *   **udp:** UDP.
             * *   **http:** HTTP.
             * *   **https:** HTTPS.
             * 
             * >  UDP listeners do not support probing.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The error code returned by the origin probing task.
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * The origin probing task ID.
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
