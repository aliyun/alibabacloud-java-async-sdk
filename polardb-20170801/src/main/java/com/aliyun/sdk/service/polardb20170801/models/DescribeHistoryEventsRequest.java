// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
            this.taskId = request.taskId;
            this.toStartTime = request.toStartTime;
        } 

        /**
         * <p>The event archive status. Valid values:</p>
         * <ul>
         * <li><p>Archived: The event is archived.</p>
         * </li>
         * <li><p>UnArchived: The event is not archived.</p>
         * </li>
         * <li><p>All: All events.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        public Builder archiveStatus(String archiveStatus) {
            this.putQueryParameter("ArchiveStatus", archiveStatus);
            this.archiveStatus = archiveStatus;
            return this;
        }

        /**
         * <p>The system event category. Valid values:</p>
         * <ul>
         * <li><strong>Exception</strong>: Exception events.</li>
         * <li><strong>Optimize</strong>: Optimization events.</li>
         * <li><strong>Notification</strong>: Notification events.</li>
         * <li><strong>Maintenance</strong>: Scheduled O&amp;M events.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exception</p>
         */
        public Builder eventCategory(String eventCategory) {
            this.putQueryParameter("EventCategory", eventCategory);
            this.eventCategory = eventCategory;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5345398</p>
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The event level. Valid values:</p>
         * <ul>
         * <li><strong>INFO</strong>: Notification.</li>
         * <li><strong>WARN</strong>: Warning.</li>
         * <li><strong>CRITICAL</strong>: Critical.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder eventLevel(String eventLevel) {
            this.putQueryParameter("EventLevel", eventLevel);
            this.eventLevel = eventLevel;
            return this;
        }

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>Inquiring</strong>: Inquiring.</li>
         * <li><strong>Scheduled</strong>: Scheduled.</li>
         * <li><strong>Running</strong>: Running.</li>
         * <li><strong>Succeed</strong>: Succeeded.</li>
         * <li><strong>Failed</strong>: Failed.</li>
         * <li><strong>Canceled</strong>: Canceled.<blockquote>
         * <p>To query multiple statuses, separate them with commas (,).</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        public Builder eventStatus(String eventStatus) {
            this.putQueryParameter("EventStatus", eventStatus);
            this.eventStatus = eventStatus;
            return this;
        }

        /**
         * <p>The system event type. This parameter is valid only when InstanceEventType.N is not specified. Valid values: </p>
         * <ul>
         * <li><strong>SystemMaintenance.Reboot</strong>: The instance is restarted due to system maintenance.</li>
         * <li><strong>SystemMaintenance.Redeploy</strong>: The instance is redeployed due to system maintenance.</li>
         * <li><strong>SystemFailure.Reboot</strong>: The instance is restarted due to a system failure.</li>
         * <li><strong>SystemFailure.Redeploy</strong>: The instance is redeployed due to a system failure.</li>
         * <li><strong>SystemFailure.Delete</strong>: The instance is released due to a creation failure.</li>
         * <li><strong>InstanceFailure.Reboot</strong>: The instance is restarted due to an instance failure.</li>
         * <li><strong>InstanceExpiration.Stop</strong>: The subscription instance is stopped due to expiration.</li>
         * <li><strong>InstanceExpiration.Delete</strong>: The subscription instance is released due to expiration.</li>
         * <li><strong>AccountUnbalanced.Stop</strong>: The pay-as-you-go instance is stopped due to an overdue payment.</li>
         * <li><strong>AccountUnbalanced.Delete</strong>: The pay-as-you-go instance is released due to an overdue payment.<blockquote>
         * <p>The value of this parameter must be an instance system event, not a disk system event.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SystemFailure.Reboot</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The start time of the task start time range. This parameter specifies that only tasks whose start time is later than this value are queried. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. The earliest supported time is 30 days ago. If the specified time is more than 30 days before the current time, it is automatically changed to 30 days ago.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-02T11:31:03Z</p>
         */
        public Builder fromStartTime(String fromStartTime) {
            this.putQueryParameter("FromStartTime", fromStartTime);
            this.fromStartTime = fromStartTime;
            return this;
        }

        /**
         * <p>The resource ID. This parameter is used to query tasks of the corresponding resources. Separate multiple IDs with commas (,). You can specify up to 30 IDs. By default, this parameter is left empty, which indicates that no limit is applied.</p>
         * <blockquote>
         * <p>Only cluster IDs are supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-2zed3m89cw***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-**********</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong>: Instance resources.</li>
         * <li><strong>Instance</strong>: Host: Host resources.</li>
         * <li><strong>Instance</strong>: User: User resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the scheduled task to be canceled.</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/199648.html">DescribeScheduleTasks</a> operation to query the information about all scheduled tasks under the current account, including the task IDs.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Only tasks in the pending state (the return value of the <code>Status</code> parameter is <code>pending</code>) can be canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>32077515</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The end time of the task start time range. This parameter specifies that only tasks whose start time is earlier than this value are queried. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-03T12:31:03Z</p>
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
