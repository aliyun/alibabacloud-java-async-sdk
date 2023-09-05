// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationMonitorResponseBody</p>
 */
public class ListApplicationMonitorResponseBody extends TeaModel {
    @NameInMap("ApplicationMonitors")
    private java.util.List < ApplicationMonitors> applicationMonitors;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationMonitorResponseBody(Builder builder) {
        this.applicationMonitors = builder.applicationMonitors;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationMonitors
     */
    public java.util.List < ApplicationMonitors> getApplicationMonitors() {
        return this.applicationMonitors;
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
        private java.util.List < ApplicationMonitors> applicationMonitors; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of origin probing tasks.
         */
        public Builder applicationMonitors(java.util.List < ApplicationMonitors> applicationMonitors) {
            this.applicationMonitors = applicationMonitors;
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

        public ListApplicationMonitorResponseBody build() {
            return new ListApplicationMonitorResponseBody(this);
        } 

    } 

    public static class ApplicationMonitors extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Address")
        private String address;

        @NameInMap("DetectEnable")
        private Boolean detectEnable;

        @NameInMap("DetectThreshold")
        private Integer detectThreshold;

        @NameInMap("DetectTimes")
        private Integer detectTimes;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("OptionsJson")
        private String optionsJson;

        @NameInMap("SilenceTime")
        private Integer silenceTime;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        private ApplicationMonitors(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.address = builder.address;
            this.detectEnable = builder.detectEnable;
            this.detectThreshold = builder.detectThreshold;
            this.detectTimes = builder.detectTimes;
            this.listenerId = builder.listenerId;
            this.optionsJson = builder.optionsJson;
            this.silenceTime = builder.silenceTime;
            this.state = builder.state;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationMonitors create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return detectEnable
         */
        public Boolean getDetectEnable() {
            return this.detectEnable;
        }

        /**
         * @return detectThreshold
         */
        public Integer getDetectThreshold() {
            return this.detectThreshold;
        }

        /**
         * @return detectTimes
         */
        public Integer getDetectTimes() {
            return this.detectTimes;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return optionsJson
         */
        public String getOptionsJson() {
            return this.optionsJson;
        }

        /**
         * @return silenceTime
         */
        public Integer getSilenceTime() {
            return this.silenceTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String address; 
            private Boolean detectEnable; 
            private Integer detectThreshold; 
            private Integer detectTimes; 
            private String listenerId; 
            private String optionsJson; 
            private Integer silenceTime; 
            private String state; 
            private String taskId; 
            private String taskName; 

            /**
             * The ID of the GA instance on which the origin probing task runs.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The URL or IP address that was probed.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Indicates whether the automatic diagnostics feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder detectEnable(Boolean detectEnable) {
                this.detectEnable = detectEnable;
                return this;
            }

            /**
             * The threshold that is used to trigger the automatic diagnostics feature.
             */
            public Builder detectThreshold(Integer detectThreshold) {
                this.detectThreshold = detectThreshold;
                return this;
            }

            /**
             * The number of times that are required to reach the threshold before the automatic diagnostics feature can be triggered.
             */
            public Builder detectTimes(Integer detectTimes) {
                this.detectTimes = detectTimes;
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
             * The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.
             */
            public Builder optionsJson(String optionsJson) {
                this.optionsJson = optionsJson;
                return this;
            }

            /**
             * The silence period of the automatic diagnostics feature. This parameter indicates the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers an automatic diagnostic task, GA must wait until the silence period ends before GA can trigger another automatic diagnostic task.
             * <p>
             * 
             * If the number of consecutive times that the availability rate drops below the threshold of automatic diagnostics reaches the value of **DetectTimes** , the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period even if the availability rate stays below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.
             * 
             * Unit: seconds.
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * The status of the origin probing task. Valid values:
             * <p>
             * 
             * *   **active:** The origin probing task is running.
             * *   **inactive:** The origin probing task is stopped.
             * *   **init:** The origin probing task is being initialized.
             * *   **deleting:** The origin probing task is being deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The origin probing task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The origin probing task name.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public ApplicationMonitors build() {
                return new ApplicationMonitors(this);
            } 

        } 

    }
}
