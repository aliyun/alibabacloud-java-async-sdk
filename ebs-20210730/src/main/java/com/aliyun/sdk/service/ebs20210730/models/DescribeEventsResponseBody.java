// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceEvents")
    private java.util.List < ResourceEvents> resourceEvents;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEventsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resourceEvents = builder.resourceEvents;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceEvents
     */
    public java.util.List < ResourceEvents> getResourceEvents() {
        return this.resourceEvents;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < ResourceEvents> resourceEvents; 
        private Integer totalCount; 

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The events.
         */
        public Builder resourceEvents(java.util.List < ResourceEvents> resourceEvents) {
            this.resourceEvents = resourceEvents;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    public static class ResourceEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("RecommendAction")
        private String recommendAction;

        @com.aliyun.core.annotation.NameInMap("RecommendParams")
        private String recommendParams;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ResourceEvents(Builder builder) {
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.eventLevel = builder.eventLevel;
            this.eventName = builder.eventName;
            this.eventType = builder.eventType;
            this.recommendAction = builder.recommendAction;
            this.recommendParams = builder.recommendParams;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceEvents create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return recommendAction
         */
        public String getRecommendAction() {
            return this.recommendAction;
        }

        /**
         * @return recommendParams
         */
        public String getRecommendParams() {
            return this.recommendParams;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String endTime; 
            private String eventLevel; 
            private String eventName; 
            private String eventType; 
            private String recommendAction; 
            private String recommendParams; 
            private String resourceId; 
            private String resourceType; 
            private String startTime; 
            private String status; 

            /**
             * The description of the event.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The end time of the event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The level of the event. Valid values:
             * <p>
             * 
             * 1.  INFO
             * 2.  WARN
             * 3.  CRITICAL
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * The name of the event. Valid values:
             * <p>
             * 
             * *   NoSnapshot: indicates the event that is triggered because no snapshot is created for a disk to protect data on the disk.
             * *   BurstIOTriggered: indicates the event that is triggered when a burst I/O operation is performed on a disk.
             * *   CostOptimizationNeeded: indicates the event that is triggered when cost optimization is required.
             * *   DiskSpecNotMatchedWithInstance: indicates the event that is triggered because the specifications of a disk do not match the instance to which the disk is attached.
             * *   DiskIONo4kAligned: indicates the event that is triggered because the physical and logical sectors involved in a read or write operation are not 4K aligned.
             * *   DiskIOHang: indicates the event that is triggered when an I/O hang occurs on a disk.
             * *   InstanceIOPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of IOPS on an instance reaches the upper limit.
             * *   InstanceBPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of BPS on an instance reaches the upper limit.
             * *   DiskIOPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of IOPS on a disk reaches the upper limit for the associated instance.
             * *   DiskBPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of BPS on a disk reaches the upper limit for the associated instance.
             * *   DiskIOPSExceedDiskMaxLimit: indicates the event that is triggered when the number of IOPS on a disk reaches the upper limit for the disk.
             * *   DiskBPSExceedDiskMaxLimit: indicates the event that is triggered when the number of BPS on a disk reaches the upper limit for the disk.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The type of the event. Valid values:
             * <p>
             * 
             * 1.  Notification
             * 2.  SystemException
             * 3.  Alert
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The recommended action after the event occurred. Valid values:
             * <p>
             * 
             * *   ModifyDiskSpec
             * *   CreateSnapshot
             * *   ResizeDisk
             * *   AdjustProvision
             * *   ModifyInstanceSpec
             */
            public Builder recommendAction(String recommendAction) {
                this.recommendAction = recommendAction;
                return this;
            }

            /**
             * The codes of the parameters for the recommended action after the event occurred.
             */
            public Builder recommendParams(String recommendParams) {
                this.recommendParams = recommendParams;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The start time of the event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the event. Valid values:
             * <p>
             * 
             * 1.  WillExecute
             * 2.  Executing
             * 3.  Executed
             * 4.  Ignore
             * 5.  Expired
             * 6.  Deleted
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceEvents build() {
                return new ResourceEvents(this);
            } 

        } 

    }
}
