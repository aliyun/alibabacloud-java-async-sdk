// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeInstanceHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceHistoryEventsRequest</p>
 */
public class DescribeInstanceHistoryEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventPublishTime")
    private EventPublishTime eventPublishTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private NotBefore notBefore;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventCycleStatus")
    private String eventCycleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private java.util.List<String> eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImpactLevel")
    private String impactLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceEventCycleStatus")
    private java.util.List<String> instanceEventCycleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceEventType")
    private java.util.List<String> instanceEventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeInstanceHistoryEventsRequest(Builder builder) {
        super(builder);
        this.eventPublishTime = builder.eventPublishTime;
        this.notBefore = builder.notBefore;
        this.sourceRegionId = builder.sourceRegionId;
        this.eventCycleStatus = builder.eventCycleStatus;
        this.eventId = builder.eventId;
        this.eventType = builder.eventType;
        this.impactLevel = builder.impactLevel;
        this.instanceEventCycleStatus = builder.instanceEventCycleStatus;
        this.instanceEventType = builder.instanceEventType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceHistoryEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventPublishTime
     */
    public EventPublishTime getEventPublishTime() {
        return this.eventPublishTime;
    }

    /**
     * @return notBefore
     */
    public NotBefore getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return eventCycleStatus
     */
    public String getEventCycleStatus() {
        return this.eventCycleStatus;
    }

    /**
     * @return eventId
     */
    public java.util.List<String> getEventId() {
        return this.eventId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return impactLevel
     */
    public String getImpactLevel() {
        return this.impactLevel;
    }

    /**
     * @return instanceEventCycleStatus
     */
    public java.util.List<String> getInstanceEventCycleStatus() {
        return this.instanceEventCycleStatus;
    }

    /**
     * @return instanceEventType
     */
    public java.util.List<String> getInstanceEventType() {
        return this.instanceEventType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceHistoryEventsRequest, Builder> {
        private EventPublishTime eventPublishTime; 
        private NotBefore notBefore; 
        private String sourceRegionId; 
        private String eventCycleStatus; 
        private java.util.List<String> eventId; 
        private String eventType; 
        private String impactLevel; 
        private java.util.List<String> instanceEventCycleStatus; 
        private java.util.List<String> instanceEventType; 
        private String instanceId; 
        private Long maxResults; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<String> resourceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceHistoryEventsRequest request) {
            super(request);
            this.eventPublishTime = request.eventPublishTime;
            this.notBefore = request.notBefore;
            this.sourceRegionId = request.sourceRegionId;
            this.eventCycleStatus = request.eventCycleStatus;
            this.eventId = request.eventId;
            this.eventType = request.eventType;
            this.impactLevel = request.impactLevel;
            this.instanceEventCycleStatus = request.instanceEventCycleStatus;
            this.instanceEventType = request.instanceEventType;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
        } 

        /**
         * EventPublishTime.
         */
        public Builder eventPublishTime(EventPublishTime eventPublishTime) {
            this.putQueryParameter("EventPublishTime", eventPublishTime);
            this.eventPublishTime = eventPublishTime;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(NotBefore notBefore) {
            this.putQueryParameter("NotBefore", notBefore);
            this.notBefore = notBefore;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The lifecycle state of the system event. This parameter takes effect only when InstanceEventCycleStatus.N is not specified. Valid values:</p>
         * <ul>
         * <li>Scheduled</li>
         * <li>Avoided</li>
         * <li>Executing</li>
         * <li>Executed</li>
         * <li>Canceled</li>
         * <li>Failed</li>
         * <li>Inquiring</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executed</p>
         */
        public Builder eventCycleStatus(String eventCycleStatus) {
            this.putQueryParameter("EventCycleStatus", eventCycleStatus);
            this.eventCycleStatus = eventCycleStatus;
            return this;
        }

        /**
         * <p>The ID of system event N. Valid values of N: 1 to 100. You can repeat this parameter to pass multiple values.</p>
         * 
         * <strong>example:</strong>
         * <p>e-uf64yvznlao4jl2c****</p>
         */
        public Builder eventId(java.util.List<String> eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The type of the system event. This parameter takes effect only when InstanceEventType.N is not specified. Valid values:</p>
         * <ul>
         * <li>SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</li>
         * <li>SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</li>
         * <li>SystemFailure.Reboot: The instance is restarted due to a system error.</li>
         * <li>SystemFailure.Redeploy: The instance is redeployed due to a system error.</li>
         * <li>SystemFailure.Delete: The instance is released due to an instance creation failure.</li>
         * <li>InstanceFailure.Reboot: The instance is restarted due to an instance error.</li>
         * <li>InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</li>
         * <li>InstanceExpiration.Delete: The subscription instance is released due to expiration.</li>
         * <li>AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</li>
         * <li>AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</li>
         * </ul>
         * <blockquote>
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/66574.html">Overview</a>. The values of this parameter are applicable only to instance system events, but not to disk system events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SystemMaintenance.Reboot</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder impactLevel(String impactLevel) {
            this.putQueryParameter("ImpactLevel", impactLevel);
            this.impactLevel = impactLevel;
            return this;
        }

        /**
         * <p>The lifecycle state of system event N. Valid values of N: 1 to 7. You can repeat this parameter to pass multiple values. Valid values:</p>
         * <ul>
         * <li>Scheduled</li>
         * <li>Avoided</li>
         * <li>Executing</li>
         * <li>Executed</li>
         * <li>Canceled</li>
         * <li>Failed</li>
         * <li>Inquiring</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executed</p>
         */
        public Builder instanceEventCycleStatus(java.util.List<String> instanceEventCycleStatus) {
            this.putQueryParameter("InstanceEventCycleStatus", instanceEventCycleStatus);
            this.instanceEventCycleStatus = instanceEventCycleStatus;
            return this;
        }

        /**
         * <p>The type of system event N. Valid values of N: 1 to 30. You can repeat this parameter to pass multiple values. Valid values:</p>
         * <ul>
         * <li>SystemMaintenance.Reboot: The instance is restarted due to system maintenance.</li>
         * <li>SystemMaintenance.Redeploy: The instance is redeployed due to system maintenance.</li>
         * <li>SystemFailure.Reboot: The instance is restarted due to a system error.</li>
         * <li>SystemFailure.Redeploy: The instance is redeployed due to a system error.</li>
         * <li>SystemFailure.Delete: The instance is released due to an instance creation failure.</li>
         * <li>InstanceFailure.Reboot: The instance is restarted due to an instance error.</li>
         * <li>InstanceExpiration.Stop: The subscription instance is stopped due to expiration.</li>
         * <li>InstanceExpiration.Delete: The subscription instance is released due to expiration.</li>
         * <li>AccountUnbalanced.Stop: The pay-as-you-go instance is stopped due to an overdue payment.</li>
         * <li>AccountUnbalanced.Delete: The pay-as-you-go instance is released due to an overdue payment.</li>
         * </ul>
         * <blockquote>
         * <p> For more information, see <a href="https://help.aliyun.com/document_detail/66574.html">Overview</a>. The values of this parameter are applicable only to instance system events, but not to disk system events.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SystemMaintenance.Reboot</p>
         */
        public Builder instanceEventType(java.util.List<String> instanceEventType) {
            this.putQueryParameter("InstanceEventType", instanceEventType);
            this.instanceEventType = instanceEventType;
            return this;
        }

        /**
         * <p>The ID of the instance. If this parameter is not specified, the system events of all instances in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf678mass4zvr9n1****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
         * <p>Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
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
         * <p>The region ID of the resource. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the resource group to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of resource N. Valid values of N: 1 to 100. You can repeat this parameter to pass multiple values. Valid values:</p>
         * <ul>
         * <li>When <code>ResourceType</code> is set to instance, ResourceId.N specifies the ID of instance N.</li>
         * <li>When <code>ResourceType</code> is set to ddh, ResourceId.N specifies the ID of dedicated host N.</li>
         * <li>When <code>ResourceType</code> is set to managedhost, ResourceId.N specifies the ID of physical machine N from a smart hosting pool.</li>
         * </ul>
         * <p>If this parameter is not specified, the system events of all resources of the type specified by <code>ResourceType</code> in the region specified by <code>RegionId</code> are queried.</p>
         * <blockquote>
         * <p> We recommend that you use <code>ResourceId.N</code> to specify one or more resource IDs. If you specify both <code>ResourceId.N</code> and <code>InstanceId</code>, <code>ResourceId.N</code> takes precedence by default.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-uf678mass4zvr9n1****</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li>instance: ECS instance</li>
         * <li>ddh: dedicated host</li>
         * <li>managehost: physical machine in a smart hosting pool</li>
         * </ul>
         * <p>Default value: instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeInstanceHistoryEventsRequest build() {
            return new DescribeInstanceHistoryEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceHistoryEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstanceHistoryEventsRequest</p>
     */
    public static class EventPublishTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private EventPublishTime(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventPublishTime create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            /**
             * <p>The end of the time range in which to query published system events. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-01T06:32:31Z</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The beginning of the time range in which to query published system events. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-30T06:32:31Z</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public EventPublishTime build() {
                return new EventPublishTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceHistoryEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstanceHistoryEventsRequest</p>
     */
    public static class NotBefore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private String start;

        private NotBefore(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotBefore create() {
            return builder().build();
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        public static final class Builder {
            private String end; 
            private String start; 

            /**
             * <p>The latest scheduled end time for the system event. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-01T06:32:31Z</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The earliest scheduled start time for the system event. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-30T06:32:31Z</p>
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public NotBefore build() {
                return new NotBefore(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceHistoryEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstanceHistoryEventsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
