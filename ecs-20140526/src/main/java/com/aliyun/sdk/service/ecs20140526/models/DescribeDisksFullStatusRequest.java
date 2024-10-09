// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDisksFullStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeDisksFullStatusRequest</p>
 */
public class DescribeDisksFullStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTime")
    private EventTime eventTime;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    private java.util.List < String > diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventId")
    private java.util.List < String > eventId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventType")
    private String eventType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private String healthStatus;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
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
         * <p>The ID of EBS device N. Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4p****</p>
         */
        public Builder diskId(java.util.List < String > diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The ID of event N. Valid values of N: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>e-bp67acfmxazb4p****</p>
         */
        public Builder eventId(java.util.List < String > eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The event type of the EBS device. Valid values:</p>
         * <ul>
         * <li>Degraded: The performance of the EBS device is degraded.</li>
         * <li>SeverelyDegraded: The performance of the EBS device is severely degraded.</li>
         * <li>Stalled: The performance of the EBS device is severely affected.</li>
         * <li>ErrorDetected: The local disk is damaged.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stalled</p>
         */
        public Builder eventType(String eventType) {
            this.putQueryParameter("EventType", eventType);
            this.eventType = eventType;
            return this;
        }

        /**
         * <p>The health status of the EBS device. Valid values:</p>
         * <ul>
         * <li>Impaired: The EBS device is damaged.</li>
         * <li>Warning: The performance of the EBS device is degraded.</li>
         * <li>Initializing: The EBS device is being initialized.</li>
         * <li>InsufficientData: The status cannot be determined due to insufficient data.</li>
         * <li>NotApplicable: The EBS device cannot be used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warning</p>
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
         * <p>The page number. Pages start from page 1. The value must be a positive integer.</p>
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
         * <p>The region ID of the EBS device. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the EBS device belongs. If you configure this parameter to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2kkmhmhs****</p>
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
         * <p>The lifecycle status of the EBS device. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Disk status</a>. Valid values:</p>
         * <ul>
         * <li>In_use: The EBS device is in use.</li>
         * <li>Available: The EBS device can be attached.</li>
         * <li>Attaching: The EBS device is being attached.</li>
         * <li>Detaching: The EBS device is being detached.</li>
         * <li>Creating: The EBS device is being created.</li>
         * <li>ReIniting: The EBS device is being initialized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags to add to the EBS device.</p>
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

    /**
     * 
     * {@link DescribeDisksFullStatusRequest} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusRequest</p>
     */
    public static class EventTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private String end;

        @com.aliyun.core.annotation.NameInMap("Start")
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
             * <p>The end of the time range to query occurred events.</p>
             * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-08T02:48:52Z</p>
             */
            public Builder end(String end) {
                this.end = end;
                return this;
            }

            /**
             * <p>The beginning of the time range to query occurred events.</p>
             * <p>Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-05-06T02:43:10Z</p>
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
    /**
     * 
     * {@link DescribeDisksFullStatusRequest} extends {@link TeaModel}
     *
     * <p>DescribeDisksFullStatusRequest</p>
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
             * <p>The key of tag N to add to the EBS device. A key-value pair consists of a key specified by the Tag.N.Key parameter and a value specified by the <code>Tag.N.Value</code> parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.</p>
             * <p>Up to 1,000 resources with the specified tags can be returned in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the EBS device. A key-value pair consists of a key specified by the <code>Tag.N.Key</code> parameter and a value specified by the Tag.N.Value parameter. The two parameters are associated with each other. Valid values of N: 1 to 20.</p>
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
