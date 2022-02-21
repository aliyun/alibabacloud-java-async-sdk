// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeReservedInstancesRequest</p>
 */
public class DescribeReservedInstancesRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("ReservedInstanceId")
    private java.util.List < String > reservedInstanceId;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("OfferingType")
    private String offeringType;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("LockReason")
    private String lockReason;

    @Query
    @NameInMap("Status")
    private java.util.List < String > status;

    @Query
    @NameInMap("ReservedInstanceName")
    private String reservedInstanceName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("AllocationType")
    private String allocationType;

    private DescribeReservedInstancesRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.pageSize = builder.pageSize;
        this.instanceType = builder.instanceType;
        this.tag = builder.tag;
        this.zoneId = builder.zoneId;
        this.reservedInstanceId = builder.reservedInstanceId;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.offeringType = builder.offeringType;
        this.scope = builder.scope;
        this.lockReason = builder.lockReason;
        this.status = builder.status;
        this.reservedInstanceName = builder.reservedInstanceName;
        this.pageNumber = builder.pageNumber;
        this.allocationType = builder.allocationType;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return reservedInstanceId
     */
    public java.util.List < String > getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    /**
     * @return reservedInstanceName
     */
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return allocationType
     */
    public String getAllocationType() {
        return this.allocationType;
    }

    public static final class Builder extends Request.Builder<DescribeReservedInstancesRequest, Builder> {
        private Long resourceOwnerId; 
        private String regionId; 
        private Integer pageSize; 
        private String instanceType; 
        private java.util.List < Tag> tag; 
        private String zoneId; 
        private java.util.List < String > reservedInstanceId; 
        private String instanceTypeFamily; 
        private String offeringType; 
        private String scope; 
        private String lockReason; 
        private java.util.List < String > status; 
        private String reservedInstanceName; 
        private Integer pageNumber; 
        private String allocationType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReservedInstancesRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.pageSize = response.pageSize;
            this.instanceType = response.instanceType;
            this.tag = response.tag;
            this.zoneId = response.zoneId;
            this.reservedInstanceId = response.reservedInstanceId;
            this.instanceTypeFamily = response.instanceTypeFamily;
            this.offeringType = response.offeringType;
            this.scope = response.scope;
            this.lockReason = response.lockReason;
            this.status = response.status;
            this.reservedInstanceName = response.reservedInstanceName;
            this.pageNumber = response.pageNumber;
            this.allocationType = response.allocationType;
        } 

        /**
         * Alibaba Cloud main account ID
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100.
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
         * The instance type. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the Zone to which the instance belongs. This parameter is required when the Scope parameter is set to Zone. For more information, see [DescribeZones](~~ 25610 ~~) for a list of zones.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The ID of the reserved instance. Valid values of N: 1 to 100.
         */
        public Builder reservedInstanceId(java.util.List < String > reservedInstanceId) {
            this.putQueryParameter("ReservedInstanceId", reservedInstanceId);
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }

        /**
         * The instance type family. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * The Payment type of the reserved instance. Valid values:
         * <p>
         * 
         * -No Upfront: zero prepaid
         * -Partial Upfront: Partial Upfront
         * -All Upfront: full prepaid
         */
        public Builder offeringType(String offeringType) {
            this.putQueryParameter("OfferingType", offeringType);
            this.offeringType = offeringType;
            return this;
        }

        /**
         * Reserved Instance voucher range. Valid values:
         * <p>
         * 
         * -Region: Regional level
         * -Zone: available area level
         * 
         * Default value: Region
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * Locking type. Valid values:
         * <p>
         * 
         * -financial: account arrears or service expired
         * -security: security reasons
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
            return this;
        }

        /**
         * The status of the reserved instance. Valid values of N: 1 to 100. Valid values:
         * <p>
         * 
         * -Creating: Creating
         * -Active: In validity period
         * -Expired: Expired
         * -Updating: changing reserved instance voucher properties
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Reserved Instance voucher name.
         */
        public Builder reservedInstanceName(String reservedInstanceName) {
            this.putQueryParameter("ReservedInstanceName", reservedInstanceName);
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }

        /**
         * Reserved Instance voucher list page number value from: 1
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
         * Distribution type. Valid values:
         * <p>
         * 
         * -Normal: query the current account reserved instance vouchers.
         * -Shared: query the current account has been established master account sharing reserved instance vouchers.
         * 
         * Default: Normal
         */
        public Builder allocationType(String allocationType) {
            this.putQueryParameter("AllocationType", allocationType);
            this.allocationType = allocationType;
            return this;
        }

        @Override
        public DescribeReservedInstancesRequest build() {
            return new DescribeReservedInstancesRequest(this);
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
             * 预留实例券的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以aliyun和acs:开头，不能包含http://或者https://。
             * <p>
             * 
             * 使用一个标签过滤资源，查询到该标签下的资源数量不能超过1000个；使用多个标签过滤资源，查询到同时绑定了多个标签的资源数量不能超过1000个。如果资源数量超过1000个，请使用[ListTagResources](~~110425~~)接口进行查询。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 预留实例券的标签值。N的取值范围：1~20。一旦传入该值，允许为空字符串。最多支持128个字符，不能以acs:开头，不能包含http://或者https://。
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
