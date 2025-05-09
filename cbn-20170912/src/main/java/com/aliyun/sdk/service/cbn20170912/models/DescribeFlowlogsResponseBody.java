// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeFlowlogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowlogsResponseBody</p>
 */
public class DescribeFlowlogsResponseBody extends TeaModel {
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

    private DescribeFlowlogsResponseBody(Builder builder) {
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

    public static DescribeFlowlogsResponseBody create() {
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

        private Builder(DescribeFlowlogsResponseBody model) {
            this.flowLogs = model.flowLogs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the flow log.</p>
         */
        public Builder flowLogs(FlowLogs flowLogs) {
            this.flowLogs = flowLogs;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F7DDDC17-FA06-4AC2-8F35-59D2470FCFC1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFlowlogsResponseBody build() {
            return new DescribeFlowlogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowlogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowlogsResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue</p>
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
     * {@link DescribeFlowlogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowlogsResponseBody</p>
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
     * {@link DescribeFlowlogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowlogsResponseBody</p>
     */
    public static class FlowLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FlowLogId")
        private String flowLogId;

        @com.aliyun.core.annotation.NameInMap("FlowLogName")
        private String flowLogName;

        @com.aliyun.core.annotation.NameInMap("FlowLogVersion")
        private String flowLogVersion;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Long interval;

        @com.aliyun.core.annotation.NameInMap("LogFormatString")
        private String logFormatString;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterAttachmentId")
        private String transitRouterAttachmentId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private FlowLog(Builder builder) {
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.flowLogId = builder.flowLogId;
            this.flowLogName = builder.flowLogName;
            this.flowLogVersion = builder.flowLogVersion;
            this.interval = builder.interval;
            this.logFormatString = builder.logFormatString;
            this.logStoreName = builder.logStoreName;
            this.projectName = builder.projectName;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowLog create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
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
         * @return flowLogVersion
         */
        public String getFlowLogVersion() {
            return this.flowLogVersion;
        }

        /**
         * @return interval
         */
        public Long getInterval() {
            return this.interval;
        }

        /**
         * @return logFormatString
         */
        public String getLogFormatString() {
            return this.logFormatString;
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
         * @return transitRouterAttachmentId
         */
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private String cenId; 
            private String creationTime; 
            private String description; 
            private String flowLogId; 
            private String flowLogName; 
            private String flowLogVersion; 
            private Long interval; 
            private String logFormatString; 
            private String logStoreName; 
            private String projectName; 
            private String regionId; 
            private String status; 
            private Tags tags; 
            private String transitRouterAttachmentId; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(FlowLog model) {
                this.cenId = model.cenId;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.flowLogId = model.flowLogId;
                this.flowLogName = model.flowLogName;
                this.flowLogVersion = model.flowLogVersion;
                this.interval = model.interval;
                this.logFormatString = model.logFormatString;
                this.logStoreName = model.logStoreName;
                this.projectName = model.projectName;
                this.regionId = model.regionId;
                this.status = model.status;
                this.tags = model.tags;
                this.transitRouterAttachmentId = model.transitRouterAttachmentId;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cen-7qthudw0ll6jmc****</p>
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * <p>The time when the flow log was created.</p>
             * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-24T13:00:52Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>myFlowlog</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the flow log.</p>
             * 
             * <strong>example:</strong>
             * <p>flowlog-m5evbtbpt****</p>
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
             * <p>The flow log version.</p>
             * <p>Flow logs are automatically created in the latest version, which is <strong>3</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder flowLogVersion(String flowLogVersion) {
                this.flowLogVersion = flowLogVersion;
                return this;
            }

            /**
             * <p>The time window for collecting log data. Unit: seconds. Valid values: <strong>60</strong> or <strong>600</strong> Default value: <strong>600</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder interval(Long interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The string that defines the format of the flow log. Format:</p>
             * <p><code>${Field 1}${Field 2}${Field 3}</code></p>
             * 
             * <strong>example:</strong>
             * <p>${srcaddr}${dstaddr}${bytes}</p>
             */
            public Builder logFormatString(String logFormatString) {
                this.logFormatString = logFormatString;
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
             * <p>The name of the project that stores the captured traffic data.</p>
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
             * <p>The status of the flow log. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: The flow log is enabled.</li>
             * <li><strong>Inactive</strong>: The flow log is disabled.</li>
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
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the network instance connection</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-5x4o4ynzuqbv6g****</p>
             */
            public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
                this.transitRouterAttachmentId = transitRouterAttachmentId;
                return this;
            }

            /**
             * <p>The ID of the transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-bp1g9313sx675zr1lajmj</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public FlowLog build() {
                return new FlowLog(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFlowlogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowlogsResponseBody</p>
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
