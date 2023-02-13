// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksFullStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeDisksFullStatusRequest</p>
 */
public class DescribeDisksFullStatusRequest extends Request {
    @Query
    @NameInMap("EventTime")
    private EventTime eventTime;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("DiskId")
    private java.util.List < String > diskId;

    @Query
    @NameInMap("EventId")
    private java.util.List < String > eventId;

    @Query
    @NameInMap("EventType")
    private String eventType;

    @Query
    @NameInMap("HealthStatus")
    private String healthStatus;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeDisksFullStatusRequest(Builder builder) {
        super(builder);
        this.eventTime = builder.eventTime;
        this.sourceRegionId = builder.sourceRegionId;
        this.diskId = builder.diskId;
        this.eventId = builder.eventId;
        this.eventType = builder.eventType;
        this.healthStatus = builder.healthStatus;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksFullStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventTime
     */
    public EventTime getEventTime() {
        return this.eventTime;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return diskId
     */
    public java.util.List < String > getDiskId() {
        return this.diskId;
    }

    /**
     * @return eventId
     */
    public java.util.List < String > getEventId() {
        return this.eventId;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeDisksFullStatusRequest, Builder> {
        private EventTime eventTime; 
        private String sourceRegionId; 
        private java.util.List < String > diskId; 
        private java.util.List < String > eventId; 
        private String eventType; 
        private String healthStatus; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDisksFullStatusRequest request) {
            super(request);
            this.eventTime = request.eventTime;
            this.sourceRegionId = request.sourceRegionId;
            this.diskId = request.diskId;
            this.eventId = request.eventId;
            this.eventType = request.eventType;
            this.healthStatus = request.healthStatus;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
            this.tag = request.tag;
        } 

        /**
         * EventTime.
         */
        public Builder eventTime(EventTime eventTime) {
            this.putQueryParameter("EventTime", eventTime);
            this.eventTime = eventTime;
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
         * The ID of EBS device N. Valid values of N: 1 to 100.
         */
        public Builder diskId(java.util.List < String > diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the event. Valid values of N: 1 to 100.
         */
        public Builder eventId(java.util.List < String > eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * The event type. Valid values:
         * <p>
         * 
         * *   Degraded: The performance of the EBS device is degraded.
         * *   SeverelyDegraded: The performance of the EBS device is severely degraded.
         * *   Stalled: The performance of the EBS device is severely affected.
         * *   ErrorDetected: The local disk is damaged.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * The health status of the EBS device. Valid values:
         * <p>
         * 
         * *   Impaired: The EBS device is damaged.
         * *   Warning: The performance of the EBS device may be degraded.
         * *   Initializing: The disk is being initialized.
         * *   InsufficientData: The status cannot be determined due to insufficient data.
         * *   NotApplicable: The EBS device cannot be used.
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
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
         * The number of the page to return. The value must be a positive integer.
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 100.
         * <p>
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the EBS device. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the EBS device belongs. When you use this property to query resources, the number of resources that are contained in the specified resource group cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The lifecycle status of the EBS device. For more information, see [Disk status](~~25689~~). Valid values:
         * <p>
         * 
         * *   In_use: The disk is in use.
         * *   Available: The disk can be attached.
         * *   Attaching: The disk is being attached.
         * *   Detaching: The disk is being detached.
         * *   Creating: The disk is being created.
         * *   ReIniting: The disk is being initialized.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tags of the instance.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeDisksFullStatusRequest build() {
            return new DescribeDisksFullStatusRequest(this);
        } 

    } 

    public static class EventTime extends TeaModel {
        @NameInMap("End")
        private String end;

        @NameInMap("Start")
        private String start;

        private EventTime(Builder builder) {
            this.end = builder.end;
            this.start = builder.start;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTime create() {
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
             * The end of the time range in which to query occurred events.
             * <p>
             * 
             * The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is specified in UTC.
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * The start of the time range in which to query occurred events.
             * <p>
             * 
             * The time follows the [ISO 8601](~~25696~~) standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time specified in UTC.
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            public EventTime build() {
                return new EventTime(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of tag N added to the EBS device. A key-value pair consists of a key specified by the Tag.N.Key parameter and a value specified by the `Tag.N.Value` parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.
             * <p>
             * 
             * If a single tag is specified to query resources, up to 1,000 resources that have this tag added are returned. If multiple tags are specified to query resources, up to 1,000 resources that have all these tags added are returned.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N added to the EBS device. A key-value pair consists of a key specified by the `Tag.N.Key` parameter and a value specified by the Tag.N.Value parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.
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
