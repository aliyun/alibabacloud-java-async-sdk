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
         * <p>The total number of events.</p>
         * 
         * <strong>example:</strong>
         * <p>OtherException:3,MysqlIOException:1</p>
         */
        public Builder eventCodeCounts(String eventCodeCounts) {
            this.eventCodeCounts = eventCodeCounts;
            return this;
        }

        /**
         * <p>The information about the events.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Events(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventStatus = builder.eventStatus;
            this.eventTimeList = builder.eventTimeList;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.recoveryTime = builder.recoveryTime;
            this.regionId = builder.regionId;
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

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventStatus; 
            private java.util.List<String> eventTimeList; 
            private String instanceDescription; 
            private String instanceId; 
            private String recoveryTime; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.eventCode = model.eventCode;
                this.eventStatus = model.eventStatus;
                this.eventTimeList = model.eventTimeList;
                this.instanceDescription = model.instanceDescription;
                this.instanceId = model.instanceId;
                this.recoveryTime = model.recoveryTime;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The event code.</p>
             * 
             * <strong>example:</strong>
             * <p>ExceptionEvent</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>The state of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * <p>The event.</p>
             */
            public Builder eventTimeList(java.util.List<String> eventTimeList) {
                this.eventTimeList = eventTimeList;
                return this;
            }

            /**
             * <p>The description of the instance.</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2zecnb327gp36e7lh</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The recovery time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-23T02:11:07Z</p>
             */
            public Builder recoveryTime(String recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
