// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeEventsListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsListResponseBody</p>
 */
public class DescribeEventsListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventCodeCounts")
    private String eventCodeCounts;

    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("PageCount")
    private Long pageCount;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Long totalPages;

    private DescribeEventsListResponseBody(Builder builder) {
        this.eventCodeCounts = builder.eventCodeCounts;
        this.events = builder.events;
        this.pageCount = builder.pageCount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventCodeCounts
     */
    public String getEventCodeCounts() {
        return this.eventCodeCounts;
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    /**
     * @return pageCount
     */
    public Long getPageCount() {
        return this.pageCount;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPages
     */
    public Long getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private String eventCodeCounts; 
        private java.util.List<Events> events; 
        private Long pageCount; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 
        private Long totalPages; 

        private Builder() {
        } 

        private Builder(DescribeEventsListResponseBody model) {
            this.eventCodeCounts = model.eventCodeCounts;
            this.events = model.events;
            this.pageCount = model.pageCount;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPages = model.totalPages;
        } 

        /**
         * EventCodeCounts.
         */
        public Builder eventCodeCounts(String eventCodeCounts) {
            this.eventCodeCounts = eventCodeCounts;
            return this;
        }

        /**
         * Events.
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * PageCount.
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeEventsListResponseBody build() {
            return new DescribeEventsListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEventsListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEventsListResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("EventTimeList")
        private java.util.List<String> eventTimeList;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RecoveryTime")
        private String recoveryTime;

        private Events(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventStatus = builder.eventStatus;
            this.eventTimeList = builder.eventTimeList;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.recoveryTime = builder.recoveryTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventTimeList
         */
        public java.util.List<String> getEventTimeList() {
            return this.eventTimeList;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return recoveryTime
         */
        public String getRecoveryTime() {
            return this.recoveryTime;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventStatus; 
            private java.util.List<String> eventTimeList; 
            private String instanceDescription; 
            private String instanceId; 
            private String recoveryTime; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.eventCode = model.eventCode;
                this.eventStatus = model.eventStatus;
                this.eventTimeList = model.eventTimeList;
                this.instanceDescription = model.instanceDescription;
                this.instanceId = model.instanceId;
                this.recoveryTime = model.recoveryTime;
            } 

            /**
             * EventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
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
             * EventTimeList.
             */
            public Builder eventTimeList(java.util.List<String> eventTimeList) {
                this.eventTimeList = eventTimeList;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RecoveryTime.
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
