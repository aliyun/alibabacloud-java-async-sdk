// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
    @com.aliyun.core.annotation.NameInMap("EventItems")
    private java.util.List<EventItems> eventItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Long totalRecordCount;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventItems
     */
    public java.util.List<EventItems> getEventItems() {
        return this.eventItems;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<EventItems> eventItems; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeEventsResponseBody model) {
            this.eventItems = model.eventItems;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The event items.</p>
         */
        public Builder eventItems(java.util.List<EventItems> eventItems) {
            this.eventItems = eventItems;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4748127A-6D50-432C-B635-433467074C27</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalRecordCount(Long totalRecordCount) {
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
    public static class EventItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventId")
        private Long eventId;

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

        private EventItems(Builder builder) {
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

        public static EventItems create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
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
            private Long eventId; 
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

            private Builder() {
            } 

            private Builder(EventItems model) {
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.eventPayload = model.eventPayload;
                this.eventReason = model.eventReason;
                this.eventRecordTime = model.eventRecordTime;
                this.eventTime = model.eventTime;
                this.eventType = model.eventType;
                this.eventUserType = model.eventUserType;
                this.regionId = model.regionId;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>50421290</p>
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>ModifySecurityIps</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;Domain\&quot;: \&quot;rds-cn-hangzhou.aliyuncs.com\&quot;}</p>
             */
            public Builder eventPayload(String eventPayload) {
                this.eventPayload = eventPayload;
                return this;
            }

            /**
             * <p>The reason.</p>
             * 
             * <strong>example:</strong>
             * <p>FROM_USER</p>
             */
            public Builder eventReason(String eventReason) {
                this.eventReason = eventReason;
                return this;
            }

            /**
             * <p>The record time. The time is in the YYYY-MM-DDTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-15T06:39:49Z</p>
             */
            public Builder eventRecordTime(String eventRecordTime) {
                this.eventRecordTime = eventRecordTime;
                return this;
            }

            /**
             * <p>The event time. The time is in the YYYY-MM-DDTHH:mm:ssZ format in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-15T06:35:00Z</p>
             */
            public Builder eventTime(String eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>SecurityManagement</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The event user type.</p>
             * 
             * <strong>example:</strong>
             * <p>USRE</p>
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
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>px-bp1v8udesc89g156g</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public EventItems build() {
                return new EventItems(this);
            } 

        } 

    }
}
