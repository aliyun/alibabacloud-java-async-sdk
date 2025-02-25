// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowNodeInstanceContainerStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListFlowNodeInstanceContainerStatusResponseBody</p>
 */
public class ListFlowNodeInstanceContainerStatusResponseBody extends TeaModel {
    @NameInMap("ContainerStatusList")
    private ContainerStatusList containerStatusList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    private ListFlowNodeInstanceContainerStatusResponseBody(Builder builder) {
        this.containerStatusList = builder.containerStatusList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowNodeInstanceContainerStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return containerStatusList
     */
    public ContainerStatusList getContainerStatusList() {
        return this.containerStatusList;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private ContainerStatusList containerStatusList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * ContainerStatusList.
         */
        public Builder containerStatusList(ContainerStatusList containerStatusList) {
            this.containerStatusList = containerStatusList;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListFlowNodeInstanceContainerStatusResponseBody build() {
            return new ListFlowNodeInstanceContainerStatusResponseBody(this);
        } 

    } 

    public static class ContainerStatus extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ContainerId")
        private String containerId;

        @NameInMap("HostName")
        private String hostName;

        @NameInMap("Status")
        private String status;

        private ContainerStatus(Builder builder) {
            this.applicationId = builder.applicationId;
            this.containerId = builder.containerId;
            this.hostName = builder.hostName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerStatus create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return containerId
         */
        public String getContainerId() {
            return this.containerId;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationId; 
            private String containerId; 
            private String hostName; 
            private String status; 

            /**
             * Application ID。
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * Container ID。
             */
            public Builder containerId(String containerId) {
                this.containerId = containerId;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ContainerStatus build() {
                return new ContainerStatus(this);
            } 

        } 

    }
    public static class ContainerStatusList extends TeaModel {
        @NameInMap("ContainerStatus")
        private java.util.List < ContainerStatus> containerStatus;

        private ContainerStatusList(Builder builder) {
            this.containerStatus = builder.containerStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerStatusList create() {
            return builder().build();
        }

        /**
         * @return containerStatus
         */
        public java.util.List < ContainerStatus> getContainerStatus() {
            return this.containerStatus;
        }

        public static final class Builder {
            private java.util.List < ContainerStatus> containerStatus; 

            /**
             * ContainerStatus.
             */
            public Builder containerStatus(java.util.List < ContainerStatus> containerStatus) {
                this.containerStatus = containerStatus;
                return this;
            }

            public ContainerStatusList build() {
                return new ContainerStatusList(this);
            } 

        } 

    }
}
