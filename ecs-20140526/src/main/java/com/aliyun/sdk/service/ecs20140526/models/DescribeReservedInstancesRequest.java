// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("LockReason")
    private String lockReason;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("OfferingType")
    private String offeringType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @Query
    @NameInMap("ReservedInstanceId")
    private java.util.List < String > reservedInstanceId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ReservedInstanceName")
    private String reservedInstanceName;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("AllocationType")
    private String allocationType;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Status")
    private java.util.List < String > status;

    private DescribeReservedInstancesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.tag = builder.tag;
        this.lockReason = builder.lockReason;
        this.instanceType = builder.instanceType;
        this.offeringType = builder.offeringType;
        this.regionId = builder.regionId;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.reservedInstanceId = builder.reservedInstanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.reservedInstanceName = builder.reservedInstanceName;
        this.zoneId = builder.zoneId;
        this.allocationType = builder.allocationType;
        this.scope = builder.scope;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return offeringType
     */
    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return reservedInstanceId
     */
    public java.util.List < String > getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return reservedInstanceName
     */
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return allocationType
     */
    public String getAllocationType() {
        return this.allocationType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeReservedInstancesRequest, Builder> {
        private Integer pageNumber; 
        private java.util.List < Tag> tag; 
        private String lockReason; 
        private String instanceType; 
        private String offeringType; 
        private String regionId; 
        private String instanceTypeFamily; 
        private java.util.List < String > reservedInstanceId; 
        private Long resourceOwnerId; 
        private String reservedInstanceName; 
        private String zoneId; 
        private String allocationType; 
        private String scope; 
        private Integer pageSize; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReservedInstancesRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.tag = request.tag;
            this.lockReason = request.lockReason;
            this.instanceType = request.instanceType;
            this.offeringType = request.offeringType;
            this.regionId = request.regionId;
            this.instanceTypeFamily = request.instanceTypeFamily;
            this.reservedInstanceId = request.reservedInstanceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.reservedInstanceName = request.reservedInstanceName;
            this.zoneId = request.zoneId;
            this.allocationType = request.allocationType;
            this.scope = request.scope;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * The page number of the reserved instance List. Start value: 1.
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
         * Tag list
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The lock type. Valid values:
         * <p>
         * 
         * -financial: The account is overdue or the service has expired.
         * -security: security reasons
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
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
         * The Payment type of the reserved instance. Valid values:
         * <p>
         * 
         * -No Upfront: zero prepaid
         * -Partial Upfront: Partial prepaid
         * -All Upfront: full prepaid
         */
        public Builder offeringType(String offeringType) {
            this.putQueryParameter("OfferingType", offeringType);
            this.offeringType = offeringType;
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
         * The instance type family. For more information, see [instance type family](~~ 25378 ~~).
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
            this.instanceTypeFamily = instanceTypeFamily;
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
         * The ID of the Alibaba Cloud primary account.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The name of the reserved instance.
         */
        public Builder reservedInstanceName(String reservedInstanceName) {
            this.putQueryParameter("ReservedInstanceName", reservedInstanceName);
            this.reservedInstanceName = reservedInstanceName;
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
         * The allocation type. Valid values:
         * <p>
         * 
         * -Normal: queries Reserved Instances under the current account.
         * -Shared: queries Reserved instances that have been Shared by primary and sub-accounts under the current account.
         * 
         * Default value: Normal
         */
        public Builder allocationType(String allocationType) {
            this.putQueryParameter("AllocationType", allocationType);
            this.allocationType = allocationType;
            return this;
        }

        /**
         * The range of Reserved Instances. Valid values:
         * <p>
         * 
         * -Region: Region
         * -Zone: Zone
         * 
         * Default value: Region
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
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
         * The status of the reserved instance. Valid values of N: 1 to 100. Valid values:
         * <p>
         * 
         * -Creating: Creating
         * -Active: in validity period
         * -Expired: Expired
         * -Updating: the reserved instance properties are being changed.
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
