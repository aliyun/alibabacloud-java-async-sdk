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
         * ApplicationMonitorDetectResultList.
         */
        public Builder applicationMonitorDetectResultList(java.util.List < ApplicationMonitorDetectResultList> applicationMonitorDetectResultList) {
            this.applicationMonitorDetectResultList = applicationMonitorDetectResultList;
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

        public ListApplicationMonitorDetectResultResponseBody build() {
            return new ListApplicationMonitorDetectResultResponseBody(this);
        } 

    } 

    public static class ApplicationMonitorDetectResultList extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("DiagStatus")
        private String diagStatus;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("Port")
        private String port;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("TaskId")
        private String taskId;

        private ApplicationMonitorDetectResultList(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.detail = builder.detail;
            this.diagStatus = builder.diagStatus;
            this.listenerId = builder.listenerId;
            this.port = builder.port;
            this.protocol = builder.protocol;
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
         * @return detail
         */
        public String getDetail() {
            return this.detail;
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
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String acceleratorId; 
            private String detail; 
            private String diagStatus; 
            private String listenerId; 
            private String port; 
            private String protocol; 
            private String taskId; 

            /**
             * AcceleratorId.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DiagStatus.
             */
            public Builder diagStatus(String diagStatus) {
                this.diagStatus = diagStatus;
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
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * TaskId.
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
