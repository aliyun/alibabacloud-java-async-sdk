// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("EventItems")
    private EventItems eventItems;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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
         * The events.
         */
        public Builder eventItems(EventItems eventItems) {
            this.eventItems = eventItems;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    public static class EventItemsEventItems extends TeaModel {
        @NameInMap("CallerUid")
        private Long callerUid;

        @NameInMap("EventId")
        private Integer eventId;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventPayload")
        private String eventPayload;

        @NameInMap("EventReason")
        private String eventReason;

        @NameInMap("EventRecordTime")
        private String eventRecordTime;

        @NameInMap("EventTime")
        private String eventTime;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("EventUserType")
        private String eventUserType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
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
             * The ID of the user who executed the event.
             */
            public Builder callerUid(Long callerUid) {
                this.callerUid = callerUid;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder eventId(Integer eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The event name.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The request or context parameters of the event.
             */
            public Builder eventPayload(String eventPayload) {
                this.eventPayload = eventPayload;
                return this;
            }

            /**
             * The source of the event.
             */
            public Builder eventReason(String eventReason) {
                this.eventReason = eventReason;
                return this;
            }

            /**
             * The time when the event was recorded. The time is slightly later than the time the event occurred.
             */
            public Builder eventRecordTime(String eventRecordTime) {
                this.eventRecordTime = eventRecordTime;
                return this;
            }

            /**
             * The time when the event occurred.
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * The event type.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The type of the user who executed the event.
             */
            public Builder eventUserType(String eventUserType) {
                this.eventUserType = eventUserType;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the resource associated with the event. Only instance IDs are supported for this parameter.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The type of the resource associated with the event. Only instances are supported for this parameter.
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
    public static class EventItems extends TeaModel {
        @NameInMap("EventItems")
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
             * The events.
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
