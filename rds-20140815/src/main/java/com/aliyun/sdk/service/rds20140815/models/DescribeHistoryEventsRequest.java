// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeHistoryEventsRequest</p>
 */
public class DescribeHistoryEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveStatus")
    private String archiveStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCategory")
    private String eventCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventLevel")
    private String eventLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventStatus")
    private String eventStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromStartTime")
    private String fromStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToStartTime")
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
         * The resource status. Valid values: **importing**, failed, checksuccess, and deleted.
         */
        public Builder archiveStatus(String archiveStatus) {
            this.putQueryParameter("ArchiveStatus", archiveStatus);
            this.archiveStatus = archiveStatus;
            return this;
        }

        /**
         * The system event category. For more information, see [View the event history of an ApsaraDB RDS instance](~~129759~~).
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
         * The event level. Valid values: ***high***, **medium**, and **low**.
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
         * *   1: pending
         * *   2: ignored
         * *   4: confirmed
         * *   8: marked as false positive
         * *   16: handling
         * *   32: handled
         * *   64: expired
         */
        public Builder eventStatus(String eventStatus) {
            this.putQueryParameter("EventStatus", eventStatus);
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * The system event type. This parameter takes effect only when InstanceEventType.N is not specified. Valid values: SystemMaintenance.Reboot: The instance is restarted due to system maintenance. SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance. SystemFailure.Reboot: The instance is restarted due to a system error. SystemFailure.Redeploy: The instance is redeployed due to a system error. SystemFailure.Delete: The instance is released due to an instance creation failure. InstanceFailure.Reboot: The instance is restarted due to an instance error. InstanceExpiration.Stop: The subscription instance is stopped due to expiration. InstanceExpiration.Delete: The subscription instance is released due to expiration. AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment. AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment. For more information, see Overview. The values of this parameter are applicable only to instance system events, but not to disk system events.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The beginning of the time range to query. Only tasks that have a start time later than or equal to the time specified by this parameter are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The start time can be up to 30 days earlier than the current time. If you set this parameter to a time more than 30 days earlier than the current time, this time is automatically converted to a time that is exactly 30 days earlier than the current time.
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number. Valid values: any non-zero positive integer. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 30.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~610399~~) operation to query the most recent region list.
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
         * The resource type. Set the value to **INSTANCE**.
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
         * The task ID. This value is used to query the data of a specific task.
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
