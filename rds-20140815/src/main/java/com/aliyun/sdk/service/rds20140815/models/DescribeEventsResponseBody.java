// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("EventItems")
    private EventItems eventItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeEventsResponseBody(Builder builder) {
        this.eventItems = builder.eventItems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventItems
     */
    public EventItems getEventItems() {
        return this.eventItems;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private EventItems eventItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * <p>The events.</p>
         */
        public Builder eventItems(EventItems eventItems) {
            this.eventItems = eventItems;
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
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A103039D-B1B2-4C57-B989-7D7C0DA95426</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
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
    public static class EventItemsEventItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallerUid")
        private Long callerUid;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Integer eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventPayload")
        private String eventPayload;

        @com.aliyun.core.annotation.NameInMap("EventReason")
        private String eventReason;

        @com.aliyun.core.annotation.NameInMap("EventRecordTime")
        private String eventRecordTime;

        @com.aliyun.core.annotation.NameInMap("EventTime")
        private String eventTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("EventUserType")
        private String eventUserType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private EventItemsEventItems(Builder builder) {
            this.callerUid = builder.callerUid;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.eventPayload = builder.eventPayload;
            this.eventReason = builder.eventReason;
            this.eventRecordTime = builder.eventRecordTime;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
            this.eventUserType = builder.eventUserType;
            this.regionId = builder.regionId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventItemsEventItems create() {
            return builder().build();
        }

        /**
         * @return callerUid
         */
        public Long getCallerUid() {
            return this.callerUid;
        }

        /**
         * @return eventId
         */
        public Integer getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventPayload
         */
        public String getEventPayload() {
            return this.eventPayload;
        }

        /**
         * @return eventReason
         */
        public String getEventReason() {
            return this.eventReason;
        }

        /**
         * @return eventRecordTime
         */
        public String getEventRecordTime() {
            return this.eventRecordTime;
        }

        /**
         * @return eventTime
         */
        public String getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return eventUserType
         */
        public String getEventUserType() {
            return this.eventUserType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Long callerUid; 
            private Integer eventId; 
            private String eventName; 
            private String eventPayload; 
            private String eventReason; 
            private String eventRecordTime; 
            private String eventTime; 
            private String eventType; 
            private String eventUserType; 
            private String regionId; 
            private String resourceName; 
            private String resourceType; 

            /**
             * <p>The ID of the user who executed the event.</p>
             * 
             * <strong>example:</strong>
             * <p>22973492**********</p>
             */
            public Builder callerUid(Long callerUid) {
                this.callerUid = callerUid;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>11000053</p>
             */
            public Builder eventId(Integer eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>ModifySecurityIPList</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The request or context parameters of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Domain&quot;: &quot;rds-inc-share.aliyuncs.com&quot;, &quot;Api&quot;: &quot;ReleaseInstancePublicConnection&quot;}</p>
             */
            public Builder eventPayload(String eventPayload) {
                this.eventPayload = eventPayload;
                return this;
            }

            /**
             * <p>The source of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>FROM_USER</p>
             */
            public Builder eventReason(String eventReason) {
                this.eventReason = eventReason;
                return this;
            }

            /**
             * <p>The time when the event was recorded. The time is slightly later than the time the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-20T01:12:49Z</p>
             */
            public Builder eventRecordTime(String eventRecordTime) {
                this.eventRecordTime = eventRecordTime;
                return this;
            }

            /**
             * <p>The time when the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-20T01:08:22Z</p>
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>NetworkManagement</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The type of the user who executed the event.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder eventUserType(String eventUserType) {
                this.eventUserType = eventUserType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the resource associated with the event. Only instance IDs are supported for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp1z3065m9976ix8a</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The type of the resource associated with the event. Only instances are supported for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public EventItemsEventItems build() {
                return new EventItemsEventItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsResponseBody</p>
     */
    public static class EventItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventItems")
        private java.util.List < EventItemsEventItems> eventItems;

        private EventItems(Builder builder) {
            this.eventItems = builder.eventItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventItems create() {
            return builder().build();
        }

        /**
         * @return eventItems
         */
        public java.util.List < EventItemsEventItems> getEventItems() {
            return this.eventItems;
        }

        public static final class Builder {
            private java.util.List < EventItemsEventItems> eventItems; 

            /**
             * <p>The events.</p>
             */
            public Builder eventItems(java.util.List < EventItemsEventItems> eventItems) {
                this.eventItems = eventItems;
                return this;
            }

            public EventItems build() {
                return new EventItems(this);
            } 

        } 

    }
}
