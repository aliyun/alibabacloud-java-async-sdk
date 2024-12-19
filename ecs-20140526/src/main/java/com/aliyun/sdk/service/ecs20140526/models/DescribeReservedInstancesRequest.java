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
 * {@link DescribeReservedInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeReservedInstancesRequest</p>
 */
public class DescribeReservedInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllocationType")
    private String allocationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LockReason")
    private String lockReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfferingType")
    private String offeringType;

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
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedInstanceId")
    private java.util.List<String> reservedInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReservedInstanceName")
    private String reservedInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private java.util.List<String> status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeReservedInstancesRequest(Builder builder) {
        super(builder);
        this.allocationType = builder.allocationType;
        this.instanceType = builder.instanceType;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.lockReason = builder.lockReason;
        this.offeringType = builder.offeringType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.reservedInstanceId = builder.reservedInstanceId;
        this.reservedInstanceName = builder.reservedInstanceName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scope = builder.scope;
        this.status = builder.status;
        this.tag = builder.tag;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReservedInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationType
     */
    public String getAllocationType() {
        return this.allocationType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
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
     * @return reservedInstanceId
     */
    public java.util.List<String> getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    /**
     * @return reservedInstanceName
     */
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return status
     */
    public java.util.List<String> getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeReservedInstancesRequest, Builder> {
        private String allocationType; 
        private String instanceType; 
        private String instanceTypeFamily; 
        private String lockReason; 
        private String offeringType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.List<String> reservedInstanceId; 
        private String reservedInstanceName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scope; 
        private java.util.List<String> status; 
        private java.util.List<Tag> tag; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReservedInstancesRequest request) {
            super(request);
            this.allocationType = request.allocationType;
            this.instanceType = request.instanceType;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.lockReason = request.lockReason;
            this.offeringType = request.offeringType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.reservedInstanceId = request.reservedInstanceId;
            this.reservedInstanceName = request.reservedInstanceName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scope = request.scope;
            this.status = request.status;
            this.tag = request.tag;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The allocation type of the reserved instances. Valid values:</p>
         * <ul>
         * <li>Normal: queries all reserved instances that belong to the current account.</li>
         * <li>Shared: queries the reserved instances that are shared between the current main account and linked accounts.</li>
         * </ul>
         * <p>Default value: Normal.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder allocationType(String allocationType) {
            this.putQueryParameter("AllocationType", allocationType);
            this.allocationType = allocationType;
            return this;
        }

        /**
         * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The instance family. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g5</p>
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * <p>The reason why the reserved instance is locked. Valid values:</p>
         * <ul>
         * <li>financial: The reserved instance is locked because the account has overdue payments or the service expires.</li>
         * <li>security: The reserved instance is locked due to security reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>security</p>
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
            return this;
        }

        /**
         * <p>The payment option of the reserved instance. Valid values:</p>
         * <ul>
         * <li>No Upfront</li>
         * <li>Partial Upfront</li>
         * <li>All Upfront</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All Upfront</p>
         */
        public Builder offeringType(String offeringType) {
            this.putQueryParameter("OfferingType", offeringType);
            this.offeringType = offeringType;
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
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID of the instances. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The IDs of reserved instances. You can specify up to 100 IDs of reserved instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-bpzhex2ulpzf53****</p>
         */
        public Builder reservedInstanceId(java.util.List<String> reservedInstanceId) {
            this.putQueryParameter("ReservedInstanceId", reservedInstanceId);
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }

        /**
         * <p>The name of the reserved instance.</p>
         * 
         * <strong>example:</strong>
         * <p>testReservedInstanceName</p>
         */
        public Builder reservedInstanceName(String reservedInstanceName) {
            this.putQueryParameter("ReservedInstanceName", reservedInstanceName);
            this.reservedInstanceName = reservedInstanceName;
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
         * <p>The scope of the reserved instance. Valid values:</p>
         * <ul>
         * <li>Region: regional</li>
         * <li>Zone: zonal</li>
         * </ul>
         * <p>Default value: Region.</p>
         * 
         * <strong>example:</strong>
         * <p>Region</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * <p>The statuses of the reserved instances.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(java.util.List<String> status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the reserved instance. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The zone ID of the reserved instances. This parameter is required when Scope is set to Zone. You can call the <a href="https://help.aliyun.com/document_detail/25610.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-z</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeReservedInstancesRequest build() {
            return new DescribeReservedInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeReservedInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeReservedInstancesRequest</p>
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
             * <p>The key of tag N of the reserved instance. The tag key cannot be empty and can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
             * <blockquote>
             * <p> If you specify a single tag to query resources, up to 1,000 resources to which the tag is added are returned. If you specify multiple tags to query resources, up to 1,000 resources to which all specified tags are added are returned. To query more than 1,000 resources that have specified tags added, call the <a href="https://help.aliyun.com/document_detail/110425.html">ListTagResources</a> operation.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the reserved instance. The tag value cannot be empty and can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
