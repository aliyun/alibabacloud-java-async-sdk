// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayEventListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlayEventListResponseBody</p>
 */
public class DescribePlayEventListResponseBody extends TeaModel {
    @NameInMap("EventList")
    private java.util.List < EventList> eventList;

    @NameInMap("PageNo")
    private Long pageNo;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribePlayEventListResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayEventListResponseBody create() {
        return builder().build();
    }

    /**
     * @return eventList
     */
    public java.util.List < EventList> getEventList() {
        return this.eventList;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
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

    public static final class Builder {
        private java.util.List < EventList> eventList; 
        private Long pageNo; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * EventList.
         */
        public Builder eventList(java.util.List < EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.pageNo = pageNo;
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

        public DescribePlayEventListResponseBody build() {
            return new DescribePlayEventListResponseBody(this);
        } 

    } 

    public static class EventList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Duration")
        private Float duration;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("Time")
        private Long time;

        @NameInMap("Topic")
        private String topic;

        private EventList(Builder builder) {
            this.description = builder.description;
            this.duration = builder.duration;
            this.eventName = builder.eventName;
            this.time = builder.time;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duration
         */
        public Float getDuration() {
            return this.duration;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String description; 
            private Float duration; 
            private String eventName; 
            private Long time; 
            private String topic; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Float duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
}
