// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("AttributeName")
    private java.util.List < String > attributeName;

    private DescribeAccountAttributesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.zoneId = builder.zoneId;
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
     * @return attributeName
     */
    public java.util.List < String > getAttributeName() {
        return this.attributeName;
    }

    public static final class Builder extends Request.Builder<DescribeAccountAttributesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String zoneId; 
        private java.util.List < String > attributeName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccountAttributesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.zoneId = request.zoneId;
            this.attributeName = request.attributeName;
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
         * The ID of the region. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
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
         * You can call this operation to query the quota of a resource in a specified region. Valid values of N: 1 to 8. Valid values:
         * <p>
         * 
         * -instance-network-type: optional network type.
         * -max-security-groups: the number of security groups.
         * -max-elastic-network-interfaces: the number of enis.
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
         * > you can create ECS instances in mainland china only after you complete real-name authentication.
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
