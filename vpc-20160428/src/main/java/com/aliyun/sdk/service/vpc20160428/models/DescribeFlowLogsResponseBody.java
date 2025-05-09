// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowLogsResponseBody</p>
 */
public class DescribeFlowLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowLogs")
    private FlowLogs flowLogs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeFlowLogsResponseBody model) {
            this.flowLogs = model.flowLogs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the flow logs.</p>
         */
        public Builder flowLogs(FlowLogs flowLogs) {
            this.flowLogs = flowLogs;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The number of flow logs that are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFlowLogsResponseBody build() {
            return new DescribeFlowLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class TrafficPath extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrafficPathList")
        private java.util.List<String> trafficPathList;

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
        public java.util.List<String> getTrafficPathList() {
            return this.trafficPathList;
        }

        public static final class Builder {
            private java.util.List<String> trafficPathList; 

            private Builder() {
            } 

            private Builder(TrafficPath model) {
                this.trafficPathList = model.trafficPathList;
            } 

            /**
             * TrafficPathList.
             */
            public Builder trafficPathList(java.util.List<String> trafficPathList) {
                this.trafficPathList = trafficPathList;
                return this;
            }

            public TrafficPath build() {
                return new TrafficPath(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class FlowLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggregationInterval")
        private Integer aggregationInterval;

        @com.aliyun.core.annotation.NameInMap("BusinessStatus")
        private String businessStatus;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FlowLogDeliverErrorMessage")
        private String flowLogDeliverErrorMessage;

        @com.aliyun.core.annotation.NameInMap("FlowLogDeliverStatus")
        private String flowLogDeliverStatus;

        @com.aliyun.core.annotation.NameInMap("FlowLogId")
        private String flowLogId;

        @com.aliyun.core.annotation.NameInMap("FlowLogName")
        private String flowLogName;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TrafficPath")
        private TrafficPath trafficPath;

        @com.aliyun.core.annotation.NameInMap("TrafficType")
        private String trafficType;

        private FlowLog(Builder builder) {
            this.aggregationInterval = builder.aggregationInterval;
            this.businessStatus = builder.businessStatus;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.flowLogDeliverErrorMessage = builder.flowLogDeliverErrorMessage;
            this.flowLogDeliverStatus = builder.flowLogDeliverStatus;
            this.flowLogId = builder.flowLogId;
            this.flowLogName = builder.flowLogName;
            this.ipVersion = builder.ipVersion;
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
         * @return flowLogDeliverErrorMessage
         */
        public String getFlowLogDeliverErrorMessage() {
            return this.flowLogDeliverErrorMessage;
        }

        /**
         * @return flowLogDeliverStatus
         */
        public String getFlowLogDeliverStatus() {
            return this.flowLogDeliverStatus;
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
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
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
            private String flowLogDeliverErrorMessage; 
            private String flowLogDeliverStatus; 
            private String flowLogId; 
            private String flowLogName; 
            private String ipVersion; 
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

            private Builder() {
            } 

            private Builder(FlowLog model) {
                this.aggregationInterval = model.aggregationInterval;
                this.businessStatus = model.businessStatus;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.flowLogDeliverErrorMessage = model.flowLogDeliverErrorMessage;
                this.flowLogDeliverStatus = model.flowLogDeliverStatus;
                this.flowLogId = model.flowLogId;
                this.flowLogName = model.flowLogName;
                this.ipVersion = model.ipVersion;
                this.logStoreName = model.logStoreName;
                this.projectName = model.projectName;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.serviceType = model.serviceType;
                this.status = model.status;
                this.tags = model.tags;
                this.trafficPath = model.trafficPath;
                this.trafficType = model.trafficType;
            } 

            /**
             * <p>The sampling interval of the flow log. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder aggregationInterval(Integer aggregationInterval) {
                this.aggregationInterval = aggregationInterval;
                return this;
            }

            /**
             * <p>The business status of the flow log. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong></li>
             * <li><strong>FinancialLocked</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder businessStatus(String businessStatus) {
                this.businessStatus = businessStatus;
                return this;
            }

            /**
             * <p>The time when the flow log was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-21T03:08:50Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>If the flow log failed to be delivered, you can troubleshoot based on the following error messages that may be returned:</p>
             * <ul>
             * <li><strong>UnavaliableTarget</strong>: The Logstore of SLS is unavailable and cannot receive logs. Check whether the Logstore is available.</li>
             * <li><strong>ProjectNotExist</strong>: The project of SLS does not exist. We recommend that you delete the project and create a new one.</li>
             * <li><strong>UnknownError</strong>: An internal error occurred. Try again later.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UnavaliableTarget</p>
             */
            public Builder flowLogDeliverErrorMessage(String flowLogDeliverErrorMessage) {
                this.flowLogDeliverErrorMessage = flowLogDeliverErrorMessage;
                return this;
            }

            /**
             * <p>Indicates whether the flow log is delivered. Valid values:</p>
             * <ul>
             * <li><strong>SUCCESS</strong> </li>
             * <li><strong>FAILED</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FAILED</p>
             */
            public Builder flowLogDeliverStatus(String flowLogDeliverStatus) {
                this.flowLogDeliverStatus = flowLogDeliverStatus;
                return this;
            }

            /**
             * <p>The ID of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>fl-bp1f6qqhsrc2c12ta****</p>
             */
            public Builder flowLogId(String flowLogId) {
                this.flowLogId = flowLogId;
                return this;
            }

            /**
             * <p>The name of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>myFlowlog</p>
             */
            public Builder flowLogName(String flowLogName) {
                this.flowLogName = flowLogName;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>The Logstore that stores the captured traffic data.</p>
             * 
             * <strong>example:</strong>
             * <p>FlowLogStore</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The project that manages the captured traffic data.</p>
             * 
             * <strong>example:</strong>
             * <p>FlowLogProject</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The region ID of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the flow log belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4ph****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the resource from which traffic is captured.</p>
             * 
             * <strong>example:</strong>
             * <p>eni-askldfas****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource from which traffic is captured. Valid values:</p>
             * <ul>
             * <li><strong>NetworkInterface</strong>: ENI</li>
             * <li><strong>VSwitch</strong>: all ENIs in a vSwitch</li>
             * <li><strong>VPC</strong>: all ENIs in a VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NetworkInterface</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The hosting type of the cloud service.</p>
             * <ul>
             * <li>This parameter can be empty, which indicates that the flow log is created by the user.</li>
             * <li>If this parameter is not empty, the value is set to <strong>sls</strong>. The value sls indicates that the flow log is created in the Simple Log Service (SLS) console.</li>
             * </ul>
             * <blockquote>
             * <p>A flow log that is created in the SLS console can be displayed in the VPC list. However, you cannot modify, start, stop, or delete the flow log in the VPC console. If you want to manage the flow log, you can log on to the <a href="https://sls.console.aliyun.com">SLS console</a> and perform required operations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>sls</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The status of the flow log. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong></li>
             * <li><strong>Activating</strong></li>
             * <li><strong>Inactive</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The sampling scope of the traffic that is collected. Valid values:</p>
             * <ul>
             * <li><strong>all</strong> (default value): all traffic</li>
             * <li><strong>internetGateway</strong>: Internet traffic</li>
             * </ul>
             * <blockquote>
             * <p>By default, the traffic path feature is unavailable. To use this feature, <a href="https://workorder-intl.console.aliyun.com/?spm=5176.11182188.console-base-top.dworkorder.18ae4882n3v6ZW#/ticket/createIndex">submit a ticket</a>.</p>
             * </blockquote>
             */
            public Builder trafficPath(TrafficPath trafficPath) {
                this.trafficPath = trafficPath;
                return this;
            }

            /**
             * <p>The type of traffic that is captured by the flow log. Valid values:</p>
             * <ul>
             * <li><strong>All</strong>: all traffic</li>
             * <li><strong>Allow</strong>: traffic that is allowed by access control</li>
             * <li><strong>Drop</strong>: traffic that is denied by access control</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>All</p>
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
    /**
     * 
     * {@link DescribeFlowLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogsResponseBody</p>
     */
    public static class FlowLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowLog")
        private java.util.List<FlowLog> flowLog;

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
        public java.util.List<FlowLog> getFlowLog() {
            return this.flowLog;
        }

        public static final class Builder {
            private java.util.List<FlowLog> flowLog; 

            private Builder() {
            } 

            private Builder(FlowLogs model) {
                this.flowLog = model.flowLog;
            } 

            /**
             * FlowLog.
             */
            public Builder flowLog(java.util.List<FlowLog> flowLog) {
                this.flowLog = flowLog;
                return this;
            }

            public FlowLogs build() {
                return new FlowLogs(this);
            } 

        } 

    }
}
