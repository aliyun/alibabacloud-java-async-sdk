// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstanceHistoryEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCInstanceHistoryEventsRequest</p>
 */
public class DescribeRCInstanceHistoryEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventPublishTime")
    private EventPublishTime eventPublishTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private NotBefore notBefore;

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
    private String maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeRCInstanceHistoryEventsRequest(Builder builder) {
        super(builder);
        this.eventPublishTime = builder.eventPublishTime;
        this.notBefore = builder.notBefore;
        this.eventCycleStatus = builder.eventCycleStatus;
        this.eventId = builder.eventId;
        this.eventType = builder.eventType;
        this.impactLevel = builder.impactLevel;
        this.instanceEventCycleStatus = builder.instanceEventCycleStatus;
        this.instanceEventType = builder.instanceEventType;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceId = builder.resourceId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceHistoryEventsRequest create() {
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
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeRCInstanceHistoryEventsRequest, Builder> {
        private EventPublishTime eventPublishTime; 
        private NotBefore notBefore; 
        private String eventCycleStatus; 
        private java.util.List<String> eventId; 
        private String eventType; 
        private String impactLevel; 
        private java.util.List<String> instanceEventCycleStatus; 
        private java.util.List<String> instanceEventType; 
        private String instanceId; 
        private String maxResults; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<String> resourceId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCInstanceHistoryEventsRequest request) {
            super(request);
            this.eventPublishTime = request.eventPublishTime;
            this.notBefore = request.notBefore;
            this.eventCycleStatus = request.eventCycleStatus;
            this.eventId = request.eventId;
            this.eventType = request.eventType;
            this.impactLevel = request.impactLevel;
            this.instanceEventCycleStatus = request.instanceEventCycleStatus;
            this.instanceEventType = request.instanceEventType;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceId = request.resourceId;
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
         * <p>The lifecycle state of the system event. This parameter is valid only when the <strong>InstanceEventCycleStatus.N</strong> parameter is not specified. Valid values:</p>
         * <ul>
         * <li><strong>Scheduled</strong></li>
         * <li><strong>Avoided</strong></li>
         * <li><strong>Executing</strong></li>
         * <li><strong>Executed</strong></li>
         * <li><strong>Canceled</strong></li>
         * <li><strong>Failed</strong></li>
         * <li><strong>Inquiring</strong></li>
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
         * <p>The IDs of one or more system events.</p>
         */
        public Builder eventId(java.util.List<String> eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The system event type. This parameter is valid only when the <strong>InstanceEventType.N</strong> parameter is not specified. Valid values:</p>
         * <ul>
         * <li><strong>SystemMaintenance.Reboot</strong>: The instance was restarted due to system maintenance.</li>
         * <li><strong>SystemMaintenance.Redeploy</strong>: The instance was redeployed due to system maintenance.</li>
         * <li><strong>SystemFailure.Reboot</strong>: The instance was restarted due to system failures.</li>
         * <li><strong>SystemFailure.Redeploy</strong>: The instance was redeployed due to system failures.</li>
         * <li><strong>SystemFailure.Delete</strong>: The instance was released due to an instance creation failure.</li>
         * <li><strong>InstanceFailure.Reboot</strong>: The instance was restarted due to an instance error.</li>
         * <li><strong>InstanceExpiration.Stop</strong>: The subscription instance was stopped due to expiration.</li>
         * <li><strong>InstanceExpiration.Delete</strong>: The subscription instance was released due to expiration.</li>
         * <li><strong>AccountUnbalanced.Stop</strong>: The pay-as-you-go instance is stopped due to an overdue payment.</li>
         * <li><strong>AccountUnbalanced.Delete</strong>: The pay-as-you-go instance was released due to an overdue payment.</li>
         * </ul>
         * <blockquote>
         * <p> The values of this parameter are applicable only to instance system events, but not to disk system events.</p>
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
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder impactLevel(String impactLevel) {
            this.putQueryParameter("ImpactLevel", impactLevel);
            this.impactLevel = impactLevel;
            return this;
        }

        /**
         * <p>The lifecycle states of system events.</p>
         */
        public Builder instanceEventCycleStatus(java.util.List<String> instanceEventCycleStatus) {
            this.putQueryParameter("InstanceEventCycleStatus", instanceEventCycleStatus);
            this.instanceEventCycleStatus = instanceEventCycleStatus;
            return this;
        }

        /**
         * <p>The type of system event N.</p>
         */
        public Builder instanceEventType(java.util.List<String> instanceEventType) {
            this.putQueryParameter("InstanceEventType", instanceEventType);
            this.instanceEventType = instanceEventType;
            return this;
        }

        /**
         * <p>The instance ID. If you do not specify an instance ID, system events of all instances in the specified region are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-yuf59nplc45t2tzn****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The reserved parameter. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder maxResults(String maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region where the instance resides.</p>
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
         * <p>The ID of the resource group that you want to query.</p>
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
         * <p>The ID of resource N.</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>An array that consists of the tags that are supported by system events.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeRCInstanceHistoryEventsRequest build() {
            return new DescribeRCInstanceHistoryEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceHistoryEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsRequest</p>
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

            private Builder() {
            } 

            private Builder(EventPublishTime model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * <p>The end of the time range in which to query published system events. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-01T06:32:31Z</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The beginning of the time range in which to query published system events. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-30T06:32:31Z</p>
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
     * {@link DescribeRCInstanceHistoryEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsRequest</p>
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

            private Builder() {
            } 

            private Builder(NotBefore model) {
                this.end = model.end;
                this.start = model.start;
            } 

            /**
             * <p>The end time of the scheduled execution period for the system event. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-01T06:32:31Z</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The start time of the scheduled execution period for the system event. Specify the time in the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-30T06:32:31Z</p>
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
     * {@link DescribeRCInstanceHistoryEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceHistoryEventsRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag that is added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the port list.</p>
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
