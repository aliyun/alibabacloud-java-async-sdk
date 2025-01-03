// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
    private java.util.List<ResourceEvents> resourceEvents;

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
    public java.util.List<ResourceEvents> getResourceEvents() {
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
        private java.util.List<ResourceEvents> resourceEvents; 
        private Integer totalCount; 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The events.</p>
         */
        public Builder resourceEvents(java.util.List<ResourceEvents> resourceEvents) {
            this.resourceEvents = resourceEvents;
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

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("ExtraAttributes")
        private String extraAttributes;

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
            this.extraAttributes = builder.extraAttributes;
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
         * @return extraAttributes
         */
        public String getExtraAttributes() {
            return this.extraAttributes;
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
            private String extraAttributes; 
            private String recommendAction; 
            private String recommendParams; 
            private String resourceId; 
            private String resourceType; 
            private String startTime; 
            private String status; 

            /**
             * <p>The description of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>need snapshot</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end time of the event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1679538083000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The level of the event. Valid values:</p>
             * <ol>
             * <li>INFO</li>
             * <li>WARN</li>
             * <li>CRITICAL</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>INFO</p>
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * <p>The name of the event. Valid values:</p>
             * <ul>
             * <li>NoSnapshot: indicates the event that is triggered because no snapshot is created for a disk to protect data on the disk.</li>
             * <li>BurstIOTriggered: indicates the event that is triggered when a burst I/O operation is performed on a disk.</li>
             * <li>CostOptimizationNeeded: indicates the event that is triggered when cost optimization is required.</li>
             * <li>DiskSpecNotMatchedWithInstance: indicates the event that is triggered because the specifications of a disk do not match the instance to which the disk is attached.</li>
             * <li>DiskIONo4kAligned: indicates the event that is triggered because the physical and logical sectors involved in a read or write operation are not 4K aligned.</li>
             * <li>DiskIOHang: indicates the event that is triggered when an I/O hang occurs on a disk.</li>
             * <li>InstanceIOPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of IOPS on an instance reaches the upper limit.</li>
             * <li>InstanceBPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of BPS on an instance reaches the upper limit.</li>
             * <li>DiskIOPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of IOPS on a disk reaches the upper limit for the associated instance.</li>
             * <li>DiskBPSExceedInstanceMaxLimit: indicates the event that is triggered when the number of BPS on a disk reaches the upper limit for the associated instance.</li>
             * <li>DiskIOPSExceedDiskMaxLimit: indicates the event that is triggered when the number of IOPS on a disk reaches the upper limit for the disk.</li>
             * <li>DiskBPSExceedDiskMaxLimit: indicates the event that is triggered when the number of BPS on a disk reaches the upper limit for the disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DiskIOHang</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The type of the event. Valid values:</p>
             * <ol>
             * <li>Notification</li>
             * <li>SystemException</li>
             * <li>Alert</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Alert</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>Extra attributes of event, possible fields are:</p>
             * <ul>
             * <li>EcsInstanceId: ECS instance ID where the cloud disk is mounted;</li>
             * <li>Adapter: cloud disk mount point.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;EcsInstanceId&quot;:&quot;i-uf6dkn9qpcw6y94g7ag7&quot;,&quot;Adapter&quot;:&quot;hda&quot;}</p>
             */
            public Builder extraAttributes(String extraAttributes) {
                this.extraAttributes = extraAttributes;
                return this;
            }

            /**
             * <p>The recommended action after the event occurred. Valid values:</p>
             * <ul>
             * <li>ModifyDiskSpec</li>
             * <li>CreateSnapshot</li>
             * <li>ResizeDisk</li>
             * <li>AdjustProvision</li>
             * <li>ModifyInstanceSpec</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AdjustProvision</p>
             */
            public Builder recommendAction(String recommendAction) {
                this.recommendAction = recommendAction;
                return this;
            }

            /**
             * <p>The codes of the parameters for the recommended action after the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>4296</p>
             */
            public Builder recommendParams(String recommendParams) {
                this.recommendParams = recommendParams;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp67acfmxazb4p****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>disk</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The start time of the event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1684204822000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the event. Valid values:</p>
             * <ol>
             * <li>WillExecute</li>
             * <li>Executing</li>
             * <li>Executed</li>
             * <li>Ignore</li>
             * <li>Expired</li>
             * <li>Deleted</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>WillExecute</p>
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
