// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowLogsResponseBody</p>
 */
public class DescribeFlowLogsResponseBody extends TeaModel {
    @NameInMap("FlowLogs")
    private FlowLogs flowLogs;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageSize")
    private String pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalCount")
    private String totalCount;

    private DescribeFlowLogsResponseBody(Builder builder) {
        this.flowLogs = builder.flowLogs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowLogs
     */
    public FlowLogs getFlowLogs() {
        return this.flowLogs;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private FlowLogs flowLogs; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String success; 
        private String totalCount; 

        /**
         * The information about the flow logs.
         */
        public Builder flowLogs(FlowLogs flowLogs) {
            this.flowLogs = flowLogs;
            return this;
        }

        /**
         * The number of the returned page.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation is successful. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The number of flow logs that are queried.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFlowLogsResponseBody build() {
            return new DescribeFlowLogsResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class TrafficPath extends TeaModel {
        @NameInMap("TrafficPathList")
        private java.util.List < String > trafficPathList;

        private TrafficPath(Builder builder) {
            this.trafficPathList = builder.trafficPathList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficPath create() {
            return builder().build();
        }

        /**
         * @return trafficPathList
         */
        public java.util.List < String > getTrafficPathList() {
            return this.trafficPathList;
        }

        public static final class Builder {
            private java.util.List < String > trafficPathList; 

            /**
             * TrafficPathList.
             */
            public Builder trafficPathList(java.util.List < String > trafficPathList) {
                this.trafficPathList = trafficPathList;
                return this;
            }

            public TrafficPath build() {
                return new TrafficPath(this);
            } 

        } 

    }
    public static class FlowLog extends TeaModel {
        @NameInMap("AggregationInterval")
        private Integer aggregationInterval;

        @NameInMap("BusinessStatus")
        private String businessStatus;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("FlowLogId")
        private String flowLogId;

        @NameInMap("FlowLogName")
        private String flowLogName;

        @NameInMap("LogStoreName")
        private String logStoreName;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("TrafficPath")
        private TrafficPath trafficPath;

        @NameInMap("TrafficType")
        private String trafficType;

        private FlowLog(Builder builder) {
            this.aggregationInterval = builder.aggregationInterval;
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.flowLogId = builder.flowLogId;
            this.flowLogName = builder.flowLogName;
            this.logStoreName = builder.logStoreName;
            this.projectName = builder.projectName;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.trafficPath = builder.trafficPath;
            this.trafficType = builder.trafficType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLog create() {
            return builder().build();
        }

        /**
         * @return aggregationInterval
         */
        public Integer getAggregationInterval() {
            return this.aggregationInterval;
        }

        /**
         * @return businessStatus
         */
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return flowLogId
         */
        public String getFlowLogId() {
            return this.flowLogId;
        }

        /**
         * @return flowLogName
         */
        public String getFlowLogName() {
            return this.flowLogName;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return trafficPath
         */
        public TrafficPath getTrafficPath() {
            return this.trafficPath;
        }

        /**
         * @return trafficType
         */
        public String getTrafficType() {
            return this.trafficType;
        }

        public static final class Builder {
            private Integer aggregationInterval; 
            private String businessStatus; 
            private String creationTime; 
            private String description; 
            private String flowLogId; 
            private String flowLogName; 
            private String logStoreName; 
            private String projectName; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceId; 
            private String resourceType; 
            private String serviceType; 
            private String status; 
            private Tags tags; 
            private TrafficPath trafficPath; 
            private String trafficType; 

            /**
             * The sampling interval of the flow log. Unit: seconds.
             */
            public Builder aggregationInterval(Integer aggregationInterval) {
                this.aggregationInterval = aggregationInterval;
                return this;
            }

            /**
             * The business status of the flow log. Valid values:
             * <p>
             * 
             * *   **Normal**: active
             * *   **FinancialLocked**: locked due to overdue payments
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * The time when the flow log was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the flow log.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the flow log.
             */
            public Builder flowLogId(String flowLogId) {
                this.flowLogId = flowLogId;
                return this;
            }

            /**
             * The name of the flow log.
             */
            public Builder flowLogName(String flowLogName) {
                this.flowLogName = flowLogName;
                return this;
            }

            /**
             * The Logstore that stores the captured traffic data.
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * The project that manages the captured traffic data.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * The region ID of the flow log.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the flow log belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the resource from which traffic is captured.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource from which traffic is captured. Valid values:
             * <p>
             * 
             * *   **NetworkInterface**: an ENI
             * *   **VSwitch**: all ENIs in a vSwitch
             * *   **VPC**: all ENIs in a VPC
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The hosting type of the cloud service.
             * <p>
             * 
             * *   This parameter can be empty, which indicates that the flow log is created by the user.
             * *   If this parameter is not empty, the value is fixed as **sls**. The value sls indicates that the flow log is created in the Log Service console.
             * 
             * >  A flow log that is created in the Log Service console can be displayed in the VPC list. However, you cannot modify, start, stop, or delete the flow log in the VPC console. If you want to manage the flow log, you can log on to the [Log Service console](https://sls.console.aliyun.com) and perform required operations.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The status of the flow log. Valid values:
             * <p>
             * 
             * *   **Active**: enabled
             * *   **Activating**: being enabled
             * *   **Inactive**: disabled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * An array that consists of the details of the returned tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The scope of the traffic that you want to capture. Valid values:
             * <p>
             * 
             * *   **all** (default value): all traffic
             * *   **internetGateway**: Internet traffic
             * 
             * >  By default, the traffic path feature is unavailable. To use this feature, [submit a ticket](https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex).
             */
            public Builder trafficPath(TrafficPath trafficPath) {
                this.trafficPath = trafficPath;
                return this;
            }

            /**
             * The type of traffic that is captured by the flow log. Valid values:
             * <p>
             * 
             * *   **All**: all traffic
             * *   **Allow**: traffic that is allowed by access control
             * *   **Drop**: traffic that is denied by access control
             */
            public Builder trafficType(String trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            public FlowLog build() {
                return new FlowLog(this);
            } 

        } 

    }
    public static class FlowLogs extends TeaModel {
        @NameInMap("FlowLog")
        private java.util.List < FlowLog> flowLog;

        private FlowLogs(Builder builder) {
            this.flowLog = builder.flowLog;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLogs create() {
            return builder().build();
        }

        /**
         * @return flowLog
         */
        public java.util.List < FlowLog> getFlowLog() {
            return this.flowLog;
        }

        public static final class Builder {
            private java.util.List < FlowLog> flowLog; 

            /**
             * FlowLog.
             */
            public Builder flowLog(java.util.List < FlowLog> flowLog) {
                this.flowLog = flowLog;
                return this;
            }

            public FlowLogs build() {
                return new FlowLogs(this);
            } 

        } 

    }
}
