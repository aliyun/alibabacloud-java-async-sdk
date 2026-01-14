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
 * {@link ListApplicationMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationMonitorResponseBody</p>
 */
public class ListApplicationMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationMonitors")
    private java.util.List<ApplicationMonitors> applicationMonitors;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationMonitors
     */
    public java.util.List<ApplicationMonitors> getApplicationMonitors() {
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
        private java.util.List<ApplicationMonitors> applicationMonitors; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationMonitorResponseBody model) {
            this.applicationMonitors = model.applicationMonitors;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of origin probing tasks.</p>
         */
        public Builder applicationMonitors(java.util.List<ApplicationMonitors> applicationMonitors) {
            this.applicationMonitors = applicationMonitors;
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

        public ListApplicationMonitorResponseBody build() {
            return new ListApplicationMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationMonitorResponseBody</p>
     */
    public static class ApplicationMonitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceleratorId")
        private String acceleratorId;

        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("DetectEnable")
        private Boolean detectEnable;

        @com.aliyun.core.annotation.NameInMap("DetectThreshold")
        private Integer detectThreshold;

        @com.aliyun.core.annotation.NameInMap("DetectTimes")
        private Integer detectTimes;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("OptionsJson")
        private String optionsJson;

        @com.aliyun.core.annotation.NameInMap("SilenceTime")
        private Integer silenceTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
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

            private Builder() {
            } 

            private Builder(ApplicationMonitors model) {
                this.acceleratorId = model.acceleratorId;
                this.address = model.address;
                this.detectEnable = model.detectEnable;
                this.detectThreshold = model.detectThreshold;
                this.detectTimes = model.detectTimes;
                this.listenerId = model.listenerId;
                this.optionsJson = model.optionsJson;
                this.silenceTime = model.silenceTime;
                this.state = model.state;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
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
             * <p>The URL or IP address that was probed.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Indicates whether the automatic diagnostics feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder detectEnable(Boolean detectEnable) {
                this.detectEnable = detectEnable;
                return this;
            }

            /**
             * <p>The threshold that is used to trigger the automatic diagnostics feature.</p>
             * 
             * <strong>example:</strong>
             * <p>１</p>
             */
            public Builder detectThreshold(Integer detectThreshold) {
                this.detectThreshold = detectThreshold;
                return this;
            }

            /**
             * <p>The number of times that are required to reach the threshold before the automatic diagnostics feature can be triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>１</p>
             */
            public Builder detectTimes(Integer detectTimes) {
                this.detectTimes = detectTimes;
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
             * <p>The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;http_method&quot;: &quot;get&quot;,&quot;header&quot;: &quot;key:asd&quot;,&quot;acceptable_response_code&quot;: &quot;500&quot;,&quot;cert_verify&quot;: true }</p>
             */
            public Builder optionsJson(String optionsJson) {
                this.optionsJson = optionsJson;
                return this;
            }

            /**
             * <p>The silence period of the automatic diagnostics feature. This parameter indicates the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers an automatic diagnostic task, GA must wait until the silence period ends before GA can trigger another automatic diagnostic task.</p>
             * <p>If the number of consecutive times that the availability rate drops below the threshold of automatic diagnostics reaches the value of <strong>DetectTimes</strong> , the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period even if the availability rate stays below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.</p>
             * <p>Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder silenceTime(Integer silenceTime) {
                this.silenceTime = silenceTime;
                return this;
            }

            /**
             * <p>The status of the origin probing task. Valid values:</p>
             * <ul>
             * <li><strong>active:</strong> The origin probing task is running.</li>
             * <li><strong>inactive:</strong> The origin probing task is stopped.</li>
             * <li><strong>init:</strong> The origin probing task is being initialized.</li>
             * <li><strong>deleting:</strong> The origin probing task is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
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

            /**
             * <p>The origin probing task name.</p>
             * 
             * <strong>example:</strong>
             * <p>task1</p>
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
