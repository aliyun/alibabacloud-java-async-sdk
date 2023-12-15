// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryEventsRequest</p>
 */
public class DescribeHistoryEventsRequest extends Request {
    @Query
    @NameInMap("ArchiveStatus")
    private String archiveStatus;

    @Query
    @NameInMap("EventCategory")
    private String eventCategory;

    @Query
    @NameInMap("EventId")
    private String eventId;

    @Query
    @NameInMap("EventLevel")
    private String eventLevel;

    @Query
    @NameInMap("EventStatus")
    private String eventStatus;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("FromStartTime")
    private String fromStartTime;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("ToStartTime")
    private String toStartTime;

    private DescribeHistoryEventsRequest(Builder builder) {
        super(builder);
        this.archiveStatus = builder.archiveStatus;
        this.eventCategory = builder.eventCategory;
        this.eventId = builder.eventId;
        this.eventLevel = builder.eventLevel;
        this.eventStatus = builder.eventStatus;
        this.eventType = builder.eventType;
        this.fromStartTime = builder.fromStartTime;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceType = builder.resourceType;
        this.securityToken = builder.securityToken;
        this.taskId = builder.taskId;
        this.toStartTime = builder.toStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHistoryEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return archiveStatus
     */
    public String getArchiveStatus() {
        return this.archiveStatus;
    }

    /**
     * @return eventCategory
     */
    public String getEventCategory() {
        return this.eventCategory;
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
     * @return fromStartTime
     */
    public String getFromStartTime() {
        return this.fromStartTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return toStartTime
     */
    public String getToStartTime() {
        return this.toStartTime;
    }

    public static final class Builder extends Request.Builder<DescribeHistoryEventsRequest, Builder> {
        private String archiveStatus; 
        private String eventCategory; 
        private String eventId; 
        private String eventLevel; 
        private String eventStatus; 
        private String eventType; 
        private String fromStartTime; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceType; 
        private String securityToken; 
        private String taskId; 
        private String toStartTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHistoryEventsRequest request) {
            super(request);
            this.archiveStatus = request.archiveStatus;
            this.eventCategory = request.eventCategory;
            this.eventId = request.eventId;
            this.eventLevel = request.eventLevel;
            this.eventStatus = request.eventStatus;
            this.eventType = request.eventType;
            this.fromStartTime = request.fromStartTime;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceType = request.resourceType;
            this.securityToken = request.securityToken;
            this.taskId = request.taskId;
            this.toStartTime = request.toStartTime;
        } 

        /**
         * Archive status.
         */
        public Builder archiveStatus(String archiveStatus) {
            this.putQueryParameter("ArchiveStatus", archiveStatus);
            this.archiveStatus = archiveStatus;
            return this;
        }

        /**
         * Event category.
         */
        public Builder eventCategory(String eventCategory) {
            this.putQueryParameter("EventCategory", eventCategory);
            this.eventCategory = eventCategory;
            return this;
        }

        /**
         * The event ID.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * Event Level.
         */
        public Builder eventLevel(String eventLevel) {
            this.putQueryParameter("EventLevel", eventLevel);
            this.eventLevel = eventLevel;
            return this;
        }

        /**
         * The status of the exception. Valid values:
         * <p>
         * 
         * *   **1**: pending handling
         * *   **2**: ignored
         * *   **4**: confirmed
         * *   **8**: marked as a false positive
         * *   **16**: handling
         * *   **32**: handled
         * *   **64**: expired
         */
        public Builder eventStatus(String eventStatus) {
            this.putQueryParameter("EventStatus", eventStatus);
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * The type of the system event.
         * <p>
         * 
         * You can call the DescribeSystemEventMetaList operation to obtain the value of the response parameter `EventType`. The value of the EventType parameter indicates the types of system events that occurred for all cloud services in your Alibaba Cloud account. For more information, see [DescribeSystemEventMetaList](~~114972~~).
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The beginning of the time range to query. Only tasks that have a start time later than or equal to the time specified by this parameter are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The start time can be up to 30 days earlier than the current time. If you set this parameter to a time more than 30 days earlier than the current time, the specified time is automatically converted to a time that is exactly 30 days earlier than the current time.
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of the page to return. Valid values: any non-zero positive integer.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid value: **30 to 200**. Default value: **30**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The type of resource. Set the value to INSTANCE.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The task ID.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The end of the time range to query. Only tasks that have a start time earlier than or equal to the time specified by this parameter are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder toStartTime(String toStartTime) {
            this.putQueryParameter("ToStartTime", toStartTime);
            this.toStartTime = toStartTime;
            return this;
        }

        @Override
        public DescribeHistoryEventsRequest build() {
            return new DescribeHistoryEventsRequest(this);
        } 

    } 

}
