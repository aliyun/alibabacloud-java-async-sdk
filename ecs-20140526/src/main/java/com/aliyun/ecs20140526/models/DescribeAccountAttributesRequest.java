// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAttributesRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccountAttributesRequest</p>
 */
public class DescribeAccountAttributesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AttributeName")
    private java.util.List < String > attributeName;

    private DescribeAccountAttributesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.zoneId = builder.zoneId;
        this.regionId = builder.regionId;
        this.attributeName = builder.attributeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccountAttributesRequest create() {
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return attributeName
     */
    public java.util.List < String > getAttributeName() {
        return this.attributeName;
    }

    public static final class Builder extends Request.Builder<DescribeAccountAttributesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String zoneId; 
        private String regionId; 
        private java.util.List < String > attributeName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccountAttributesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.zoneId = response.zoneId;
            this.regionId = response.regionId;
            this.attributeName = response.attributeName;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * You can call this operation to query the quota of a resource in a specified region. Valid values of N: 1 to 8. Valid values:
         * <p>
         * 
         * -instance-network-type: optional network type.
         * -max-security-groups: the number of security groups.
         * -max-elastic-network-interfaces: the number of Enis.
         * -max-postpaid-instance-vcpu-count: the maximum number of vCPU cores for a pay-as-you-go instance.
         * -max-spot-instance-vcpu-count: the maximum number of VCPUs in a preemptible instance.
         * -used-postpaid-instance-vcpu-count: the number of vCPU cores of a pay-as-you-go instance.
         * -used-spot-instance-vcpu-count: the number of vCPU cores of a preemptible instance.
         * -max-postpaid-yundisk-capacity: the maximum capacity of a pay-as-you-go cloud disk used as a data disk.
         * -used-postpaid-yundisk-capacity: the capacity of a pay-as-you-go cloud disk used as a data disk.
         * -max-dedicated-hosts: the number of dedicated hosts.
         * -supported-postpaid-instance-types: pay-as-you-go I/O optimized instance types.
         * -max-axt-command-count: the number of cloud assistant commands.
         * -max-axt-invocation-daily: the number of cloud assistant commands that can be executed per day.
         * -real-name-authentication: indicates whether the account has completed real-name authentication.
         * 
         * > You can create ECS instances in mainland China only after you complete real-name authentication.
         * 
         * The default value is null.
         */
        public Builder attributeName(java.util.List < String > attributeName) {
            this.putQueryParameter("AttributeName", attributeName);
            this.attributeName = attributeName;
            return this;
        }

        @Override
        public DescribeAccountAttributesRequest build() {
            return new DescribeAccountAttributesRequest(this);
        } 

    } 

}
