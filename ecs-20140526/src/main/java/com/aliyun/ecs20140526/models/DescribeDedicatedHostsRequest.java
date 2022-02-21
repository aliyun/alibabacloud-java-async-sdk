// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDedicatedHostsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDedicatedHostsRequest</p>
 */
public class DescribeDedicatedHostsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("DedicatedHostIds")
    private String dedicatedHostIds;

    @Query
    @NameInMap("DedicatedHostName")
    private String dedicatedHostName;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("DedicatedHostClusterId")
    private String dedicatedHostClusterId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("LockReason")
    private String lockReason;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("DedicatedHostType")
    private String dedicatedHostType;

    private DescribeDedicatedHostsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
        this.dedicatedHostIds = builder.dedicatedHostIds;
        this.dedicatedHostName = builder.dedicatedHostName;
        this.pageNumber = builder.pageNumber;
        this.tag = builder.tag;
        this.dedicatedHostClusterId = builder.dedicatedHostClusterId;
        this.pageSize = builder.pageSize;
        this.lockReason = builder.lockReason;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.dedicatedHostType = builder.dedicatedHostType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDedicatedHostsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return dedicatedHostIds
     */
    public String getDedicatedHostIds() {
        return this.dedicatedHostIds;
    }

    /**
     * @return dedicatedHostName
     */
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
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
     * @return dedicatedHostClusterId
     */
    public String getDedicatedHostClusterId() {
        return this.dedicatedHostClusterId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return lockReason
     */
    public String getLockReason() {
        return this.lockReason;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return dedicatedHostType
     */
    public String getDedicatedHostType() {
        return this.dedicatedHostType;
    }

    public static final class Builder extends Request.Builder<DescribeDedicatedHostsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String zoneId; 
        private String dedicatedHostIds; 
        private String dedicatedHostName; 
        private Integer pageNumber; 
        private java.util.List < Tag> tag; 
        private String dedicatedHostClusterId; 
        private Integer pageSize; 
        private String lockReason; 
        private String resourceGroupId; 
        private String status; 
        private String dedicatedHostType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDedicatedHostsRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.zoneId = response.zoneId;
            this.dedicatedHostIds = response.dedicatedHostIds;
            this.dedicatedHostName = response.dedicatedHostName;
            this.pageNumber = response.pageNumber;
            this.tag = response.tag;
            this.dedicatedHostClusterId = response.dedicatedHostClusterId;
            this.pageSize = response.pageSize;
            this.lockReason = response.lockReason;
            this.resourceGroupId = response.resourceGroupId;
            this.status = response.status;
            this.dedicatedHostType = response.dedicatedHostType;
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
         * The ID of the resource master account, that is, the UID.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the region to which the dedicated host belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The ID of the dedicated host. You can specify up to 100 IDs at a time. Separate IDs with commas (,).
         */
        public Builder dedicatedHostIds(String dedicatedHostIds) {
            this.putQueryParameter("DedicatedHostIds", dedicatedHostIds);
            this.dedicatedHostIds = dedicatedHostIds;
            return this;
        }

        /**
         * The name of the dedicated host.
         */
        public Builder dedicatedHostName(String dedicatedHostName) {
            this.putQueryParameter("DedicatedHostName", dedicatedHostName);
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }

        /**
         * The number of pages to return.
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
         * The ID of the DDH cluster.
         */
        public Builder dedicatedHostClusterId(String dedicatedHostClusterId) {
            this.putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
            this.dedicatedHostClusterId = dedicatedHostClusterId;
            return this;
        }

        /**
         * The number of rows per page of the response information. Maximum Value: 100
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
         * The reason why the dedicated host is locked. Valid values:
         * <p>
         * -financial: locked due to overdue payments.
         * -security: locked for security reasons.
         */
        public Builder lockReason(String lockReason) {
            this.putQueryParameter("LockReason", lockReason);
            this.lockReason = lockReason;
            return this;
        }

        /**
         * The ID of the resource group to which the DDH belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Proprietary host the use of state. Valid values:
         * <p>
         * 
         * -Available: running. The running status of the dedicated host.
         * 
         * -UnderAssessment: a physical machine is at risk, that is, the latency of a failure. The physical machine is in the available state, but may cause problems with ECS instances on the dedicated host.
         * 
         * -PermanentFailure: fault. The dedicated host is unavailable due to a permanent failure.
         * 
         * Default value: Available
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Proprietary the host specification type.
         */
        public Builder dedicatedHostType(String dedicatedHostType) {
            this.putQueryParameter("DedicatedHostType", dedicatedHostType);
            this.dedicatedHostType = dedicatedHostType;
            return this;
        }

        @Override
        public DescribeDedicatedHostsRequest build() {
            return new DescribeDedicatedHostsRequest(this);
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
             * 专有宿主机的标签键。N的取值范围：1~20。一旦传入该值，则不允许为空字符串。最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或`https://`。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 专有宿主机的标签值。N的取值范围：1~20。一旦传入该值，可以为空字符串。最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。
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
