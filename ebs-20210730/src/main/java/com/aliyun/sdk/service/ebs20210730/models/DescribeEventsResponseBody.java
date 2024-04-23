// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceEvents")
    private java.util.List < ResourceEvents> resourceEvents;

    @NameInMap("TotalCount")
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
         * NextToken.
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
         * ResourceEvents.
         */
        public Builder resourceEvents(java.util.List < ResourceEvents> resourceEvents) {
            this.resourceEvents = resourceEvents;
            return this;
        }

        /**
         * TotalCount.
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
        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EventLevel")
        private String eventLevel;

        @NameInMap("EventName")
        private String eventName;

        @NameInMap("EventType")
        private String eventType;

        @NameInMap("RecommendAction")
        private String recommendAction;

        @NameInMap("RecommendParams")
        private String recommendParams;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * EventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
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
             * RecommendAction.
             */
            public Builder recommendAction(String recommendAction) {
                this.recommendAction = recommendAction;
                return this;
            }

            /**
             * RecommendParams.
             */
            public Builder recommendParams(String recommendParams) {
                this.recommendParams = recommendParams;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
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
