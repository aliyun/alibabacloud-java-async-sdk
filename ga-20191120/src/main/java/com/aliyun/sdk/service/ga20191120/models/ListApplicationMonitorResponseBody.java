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
         * ApplicationMonitors.
         */
        public Builder applicationMonitors(java.util.List < ApplicationMonitors> applicationMonitors) {
            this.applicationMonitors = applicationMonitors;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
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

        @NameInMap("DetectThreshold")
        private Integer detectThreshold;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("OptionsJson")
        private String optionsJson;

        @NameInMap("State")
        private String state;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        private ApplicationMonitors(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.address = builder.address;
            this.detectThreshold = builder.detectThreshold;
            this.listenerId = builder.listenerId;
            this.optionsJson = builder.optionsJson;
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
         * @return detectThreshold
         */
        public Integer getDetectThreshold() {
            return this.detectThreshold;
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
            private Integer detectThreshold; 
            private String listenerId; 
            private String optionsJson; 
            private String state; 
            private String taskId; 
            private String taskName; 

            /**
             * AcceleratorId.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * DetectThreshold.
             */
            public Builder detectThreshold(Integer detectThreshold) {
                this.detectThreshold = detectThreshold;
                return this;
            }

            /**
             * ListenerId.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * OptionsJson.
             */
            public Builder optionsJson(String optionsJson) {
                this.optionsJson = optionsJson;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
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
