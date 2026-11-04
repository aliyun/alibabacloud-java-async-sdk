// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
    @com.aliyun.core.annotation.NameInMap("EventList")
    private java.util.List<EventList> eventList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEventsResponseBody(Builder builder) {
        this.eventList = builder.eventList;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
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
     * @return eventList
     */
    public java.util.List<EventList> getEventList() {
        return this.eventList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<EventList> eventList; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEventsResponseBody model) {
            this.eventList = model.eventList;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of events on the current page, returned in descending order of the event log time.</p>
         */
        public Builder eventList(java.util.List<EventList> eventList) {
            this.eventList = eventList;
            return this;
        }

        /**
         * <p>The compatibility field. The current version does not set this field. Do not rely on its value.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The compatibility field. The current version does not generate a next page token. Do not use this field for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>unused</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number corresponding to the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of events per page used in the current response.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of events that meet all filter conditions within the retrievable window of the last 30 days. Unit: events.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
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
    public static class EventList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
        private String appInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("DetailInfo")
        private String detailInfo;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("MemberEniIp")
        private String memberEniIp;

        @com.aliyun.core.annotation.NameInMap("OccurredTime")
        private String occurredTime;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private EventList(Builder builder) {
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupName = builder.appInstanceGroupName;
            this.detailInfo = builder.detailInfo;
            this.eventId = builder.eventId;
            this.eventType = builder.eventType;
            this.memberEniIp = builder.memberEniIp;
            this.occurredTime = builder.occurredTime;
            this.officeSiteId = builder.officeSiteId;
            this.productType = builder.productType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventList create() {
            return builder().build();
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceGroupName
         */
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        /**
         * @return detailInfo
         */
        public String getDetailInfo() {
            return this.detailInfo;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return memberEniIp
         */
        public String getMemberEniIp() {
            return this.memberEniIp;
        }

        /**
         * @return occurredTime
         */
        public String getOccurredTime() {
            return this.occurredTime;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appInstanceGroupId; 
            private String appInstanceGroupName; 
            private String detailInfo; 
            private String eventId; 
            private String eventType; 
            private String memberEniIp; 
            private String occurredTime; 
            private String officeSiteId; 
            private String productType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(EventList model) {
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupName = model.appInstanceGroupName;
                this.detailInfo = model.detailInfo;
                this.eventId = model.eventId;
                this.eventType = model.eventType;
                this.memberEniIp = model.memberEniIp;
                this.occurredTime = model.occurredTime;
                this.officeSiteId = model.officeSiteId;
                this.productType = model.productType;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the delivery group associated with the event. This parameter may be empty if the event is not associated with a delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the delivery group associated with the event. This parameter may be empty if the event is not associated with a delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D workstation group</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * <p>The event detail text. The content varies with <code>EventType</code> and may be empty. For example, a session release event can return JSON text to describe the release reason.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Reason&quot;:&quot;ByUser&quot;}</p>
             */
            public Builder detailInfo(String detailInfo) {
                this.detailInfo = detailInfo;
                return this;
            }

            /**
             * <p>The unique identifier of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>evt-9ciijz60n4xsv****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The event type identifier. Different products may return different values. You can use this value for subsequent accurate filtering.</p>
             * 
             * <strong>example:</strong>
             * <p>SessionDisconnected</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The private IP address of the member ENI of the cloud resource associated with the event. This parameter may be empty if it is not applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.10</p>
             */
            public Builder memberEniIp(String memberEniIp) {
                this.memberEniIp = memberEniIp;
                return this;
            }

            /**
             * <p>The time when the event occurred. Format: <code>yyyy-MM-dd HH:mm:ss</code>. Time zone: UTC+8 (Asia/Shanghai).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-29 14:17:33</p>
             */
            public Builder occurredTime(String occurredTime) {
                this.occurredTime = occurredTime;
                return this;
            }

            /**
             * <p>The ID of the office network associated with the event. This parameter may be empty if it is not applicable.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai+dir-123456****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The product type to which the event belongs. This field is an open string and may be extended as supported event sources increase. Callers should not limit the value to the products currently listed in the <code>ProductType</code> request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudApp</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the end user who generated the event. This parameter may be empty if the event is not associated with an end user.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public EventList build() {
                return new EventList(this);
            } 

        } 

    }
}
