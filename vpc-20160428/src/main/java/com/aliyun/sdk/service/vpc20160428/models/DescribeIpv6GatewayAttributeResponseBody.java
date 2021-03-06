// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6GatewayAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpv6GatewayAttributeResponseBody</p>
 */
public class DescribeIpv6GatewayAttributeResponseBody extends TeaModel {
    @NameInMap("BusinessStatus")
    private String businessStatus;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("ExpiredTime")
    private String expiredTime;

    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @NameInMap("Ipv6GatewayId")
    private String ipv6GatewayId;

    @NameInMap("Name")
    private String name;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Spec")
    private String spec;

    @NameInMap("Status")
    private String status;

    @NameInMap("VpcId")
    private String vpcId;

    private DescribeIpv6GatewayAttributeResponseBody(Builder builder) {
        this.businessStatus = builder.businessStatus;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.expiredTime = builder.expiredTime;
        this.instanceChargeType = builder.instanceChargeType;
        this.ipv6GatewayId = builder.ipv6GatewayId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.spec = builder.spec;
        this.status = builder.status;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpv6GatewayAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return ipv6GatewayId
     */
    public String getIpv6GatewayId() {
        return this.ipv6GatewayId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String businessStatus; 
        private String creationTime; 
        private String description; 
        private String expiredTime; 
        private String instanceChargeType; 
        private String ipv6GatewayId; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String spec; 
        private String status; 
        private String vpcId; 

        /**
         * BusinessStatus.
         */
        public Builder businessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * Ipv6GatewayId.
         */
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Spec.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public DescribeIpv6GatewayAttributeResponseBody build() {
            return new DescribeIpv6GatewayAttributeResponseBody(this);
        } 

    } 

}
