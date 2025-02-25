// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStackEventsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackEventsResponseBody</p>
 */
public class ListStackEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List < Events> events;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListStackEventsResponseBody(Builder builder) {
        this.events = builder.events;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return events
     */
    public java.util.List < Events> getEvents() {
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
        private java.util.List < Events> events; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The events.</p>
         */
        public Builder events(java.util.List < Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The page number of the returned page.<br>Pages start from page 1.<br>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.<br>Maximum value: 50.<br>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned events.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackEventsResponseBody build() {
            return new ListStackEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackEventsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackEventsResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("PhysicalResourceId")
        private String physicalResourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("StackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("StackName")
        private String stackName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusReason")
        private String statusReason;

        private Events(Builder builder) {
            this.createTime = builder.createTime;
            this.eventId = builder.eventId;
            this.logicalResourceId = builder.logicalResourceId;
            this.physicalResourceId = builder.physicalResourceId;
            this.resourceType = builder.resourceType;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return physicalResourceId
         */
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private String createTime; 
            private String eventId; 
            private String logicalResourceId; 
            private String physicalResourceId; 
            private String resourceType; 
            private String stackId; 
            private String stackName; 
            private String status; 
            private String statusReason; 

            /**
             * <p>The time when the event was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-08-01T04:07:39</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0086612d-77cf-4056-b0b5-ff8e94ad****</p>
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The logical ID of the resource. The logical ID indicates the name of the resource that is defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>WebServer</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The physical ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5e3tfdbinchnexh****</p>
             */
            public Builder physicalResourceId(String physicalResourceId) {
                this.physicalResourceId = physicalResourceId;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The stack ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The stack name.</p>
             * 
             * <strong>example:</strong>
             * <p>StackName</p>
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * <p>The state of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_COMPLETE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The reason why the resource is in the current state.</p>
             * 
             * <strong>example:</strong>
             * <p>state changed</p>
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
