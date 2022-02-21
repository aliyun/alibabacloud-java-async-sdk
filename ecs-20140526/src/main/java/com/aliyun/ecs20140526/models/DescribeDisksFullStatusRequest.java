// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("EventTime")
    private EventTime eventTime;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("EventId")
    private java.util.List < String > eventId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DiskId")
    private java.util.List < String > diskId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("HealthStatus")
    private String healthStatus;

    @Query
    @NameInMap("EventType")
    private String eventType;

    private DescribeDisksFullStatusRequest(Builder builder) {
        super(builder);
        this.eventTime = builder.eventTime;
        this.tag = builder.tag;
        this.sourceRegionId = builder.sourceRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.eventId = builder.eventId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.diskId = builder.diskId;
        this.status = builder.status;
        this.healthStatus = builder.healthStatus;
        this.eventType = builder.eventType;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return eventId
     */
    public java.util.List < String > getEventId() {
        return this.eventId;
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
     * @return diskId
     */
    public java.util.List < String > getDiskId() {
        return this.diskId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return eventType
     */
    public String getEventType() {
        return this.eventType;
    }

    public static final class Builder extends Request.Builder<DescribeDisksFullStatusRequest, Builder> {
        private EventTime eventTime; 
        private java.util.List < Tag> tag; 
        private String sourceRegionId; 
        private String ownerAccount; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long ownerId; 
        private String resourceGroupId; 
        private java.util.List < String > eventId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.List < String > diskId; 
        private String status; 
        private String healthStatus; 
        private String eventType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDisksFullStatusRequest response) {
            super(response);
            this.eventTime = response.eventTime;
            this.tag = response.tag;
            this.sourceRegionId = response.sourceRegionId;
            this.ownerAccount = response.ownerAccount;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.ownerId = response.ownerId;
            this.resourceGroupId = response.resourceGroupId;
            this.eventId = response.eventId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.diskId = response.diskId;
            this.status = response.status;
            this.healthStatus = response.healthStatus;
            this.eventType = response.eventType;
        } 

        /**
         * EventTime.
         */
        public Builder eventTime(EventTime eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * The account name of the resource master account.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the RAM user.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The ID of the resource group to which the block storage resource belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The page number of the query result. Value range: positive integer
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
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID of the block storage. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the block storage. Valid values of N: 1 to 100.
         */
        public Builder diskId(java.util.List < String > diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * Specifies the lifecycle status of block storage. For more information, see [disk Status Table](~~ 25689 ~~). Valid values:
         * <p>
         * 
         * -In_use: In use
         * -Available: to be mounted
         * -Attaching: Mounting
         * -Detaching: uninstalling
         * -Creating: Creating
         * -ReIniting: initializing
         * 
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The health status of the block storage. Valid values:
         * <p>
         * 
         * -Impaired: temporary read/write failure
         * -Warning: service degradation
         * -Initializing: Initializing
         * -InsufficientData: insufficient data
         * -NotApplicable: not applicable
         * 
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("HealthStatus", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * Specify the block storage event type. Valid values:
         * <p>
         * 
         * -Degraded: the performance of block storage is Degraded.
         * -SeverelyDegraded: the performance of block storage is severely degraded.
         * -Stalled: block storage performance is severely affected.
         * -ErrorDetected: The local disk is damaged.
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        @Override
        public DescribeDisksFullStatusRequest build() {
            return new DescribeDisksFullStatusRequest(this);
        } 

    } 

    public static class EventTime extends TeaModel {
        @NameInMap("Start")
        private String start;

        @NameInMap("End")
        private String end;

        private EventTime(Builder builder) {
            this.start = builder.start;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTime create() {
            return builder().build();
        }

        /**
         * @return start
         */
        public String getStart() {
            return this.start;
        }

        /**
         * @return end
         */
        public String getEnd() {
            return this.end;
        }

        public static final class Builder {
            private String start; 
            private String end; 

            /**
             * Query the start time of the event occurrence time.
             * <p>
             * 
             * The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is "yyyy-MM-ddTHH:mm:ssZ ".
             */
            public Builder start(String start) {
                this.start = start;
                return this;
            }

            /**
             * Query the end time of the event occurrence time.
             * <p>
             * 
             * The time follows the [ISO8601](~~ 25696 ~~) standard and uses UTC +0. The format is "yyyy-MM-ddTHH:mm:ssZ ".
             */
            public Builder end(String end) {
                this.end = end;
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
             * 块存储资源绑定的标签键。N表示可以设置一个或多个标签键，且N的数值和`Tag.N.Value`参数中的N对应，构成键值对。N的取值范围：1~20
             * <p>
             * 
             * 使用一个标签过滤资源，查询到该标签下的资源数量不能超过1000个；使用多个标签过滤资源，查询到同时绑定了多个标签的资源数量不能超过1000个。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 块存储资源绑定的标签值。N表示可以设置一个或多个标签值，且N的数值和`Tag.N.Key`参数中的N对应，构成键值对。N的取值范围：1~20
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
