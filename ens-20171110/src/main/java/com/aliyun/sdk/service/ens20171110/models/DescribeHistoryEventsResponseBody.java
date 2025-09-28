// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeHistoryEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHistoryEventsResponseBody</p>
 */
public class DescribeHistoryEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHistoryEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryEventsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
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
        private java.util.List<Events> events; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHistoryEventsResponseBody model) {
            this.events = model.events;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Events.
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
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

        public DescribeHistoryEventsResponseBody build() {
            return new DescribeHistoryEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHistoryEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHistoryEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventLevel")
        private String eventLevel;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("ExtendedAttribute")
        private String extendedAttribute;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private Long notBefore;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private Long publishTime;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private Events(Builder builder) {
            this.eventId = builder.eventId;
            this.eventLevel = builder.eventLevel;
            this.eventStatus = builder.eventStatus;
            this.eventType = builder.eventType;
            this.extendedAttribute = builder.extendedAttribute;
            this.notBefore = builder.notBefore;
            this.publishTime = builder.publishTime;
            this.reason = builder.reason;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return extendedAttribute
         */
        public String getExtendedAttribute() {
            return this.extendedAttribute;
        }

        /**
         * @return notBefore
         */
        public Long getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return publishTime
         */
        public Long getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private String eventId; 
            private String eventLevel; 
            private String eventStatus; 
            private String eventType; 
            private String extendedAttribute; 
            private Long notBefore; 
            private Long publishTime; 
            private String reason; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.eventId = model.eventId;
                this.eventLevel = model.eventLevel;
                this.eventStatus = model.eventStatus;
                this.eventType = model.eventType;
                this.extendedAttribute = model.extendedAttribute;
                this.notBefore = model.notBefore;
                this.publishTime = model.publishTime;
                this.reason = model.reason;
                this.resourceId = model.resourceId;
            } 

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventStatus.
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * ExtendedAttribute.
             */
            public Builder extendedAttribute(String extendedAttribute) {
                this.extendedAttribute = extendedAttribute;
                return this;
            }

            /**
             * NotBefore.
             */
            public Builder notBefore(Long notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(Long publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
