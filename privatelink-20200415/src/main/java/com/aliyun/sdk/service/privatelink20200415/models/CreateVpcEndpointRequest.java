// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcEndpointRequest</p>
 */
public class CreateVpcEndpointRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EndpointDescription")
    private String endpointDescription;

    @Query
    @NameInMap("EndpointName")
    private String endpointName;

    @Query
    @NameInMap("EndpointType")
    private String endpointType;

    @Query
    @NameInMap("ProtectedEnabled")
    private Boolean protectedEnabled;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityGroupId")
    private java.util.List < String > securityGroupId;

    @Query
    @NameInMap("ServiceId")
    private String serviceId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    @Query
    @NameInMap("Zone")
    private java.util.List < Zone> zone;

    @Query
    @NameInMap("ZonePrivateIpAddressCount")
    private Long zonePrivateIpAddressCount;

    private CreateVpcEndpointRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointDescription = builder.endpointDescription;
        this.endpointName = builder.endpointName;
        this.endpointType = builder.endpointType;
        this.protectedEnabled = builder.protectedEnabled;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityGroupId = builder.securityGroupId;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
        this.zone = builder.zone;
        this.zonePrivateIpAddressCount = builder.zonePrivateIpAddressCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointDescription
     */
    public String getEndpointDescription() {
        return this.endpointDescription;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * @return protectedEnabled
     */
    public Boolean getProtectedEnabled() {
        return this.protectedEnabled;
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
     * @return securityGroupId
     */
    public java.util.List < String > getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zone
     */
    public java.util.List < Zone> getZone() {
        return this.zone;
    }

    /**
     * @return zonePrivateIpAddressCount
     */
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

    public static final class Builder extends Request.Builder<CreateVpcEndpointRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String endpointDescription; 
        private String endpointName; 
        private String endpointType; 
        private Boolean protectedEnabled; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < String > securityGroupId; 
        private String serviceId; 
        private String serviceName; 
        private java.util.List < Tag> tag; 
        private String vpcId; 
        private java.util.List < Zone> zone; 
        private Long zonePrivateIpAddressCount; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcEndpointRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.endpointDescription = request.endpointDescription;
            this.endpointName = request.endpointName;
            this.endpointType = request.endpointType;
            this.protectedEnabled = request.protectedEnabled;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityGroupId = request.securityGroupId;
            this.serviceId = request.serviceId;
            this.serviceName = request.serviceName;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
            this.zone = request.zone;
            this.zonePrivateIpAddressCount = request.zonePrivateIpAddressCount;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The description of the endpoint.
         * <p>
         * 
         * The description must be 2 to 256 characters in length, and cannot start with `http://` or `https://`.
         */
        public Builder endpointDescription(String endpointDescription) {
            this.putQueryParameter("EndpointDescription", endpointDescription);
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * The name of the endpoint.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder endpointName(String endpointName) {
            this.putQueryParameter("EndpointName", endpointName);
            this.endpointName = endpointName;
            return this;
        }

        /**
         * The type of the endpoint.
         * <p>
         * 
         * Set the value to **Interface**. Then, you can specify Application Load Balancer (ALB) and Classic Load Balancer (CLB) instances as service resources for the endpoint service.
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:
         * <p>
         * 
         * *   **true**: enables user authentication. After user authentication is enabled, only the user who creates the endpoint can modify or delete the endpoint in STS mode.
         * *   **false** (default): disables user authentication.
         */
        public Builder protectedEnabled(Boolean protectedEnabled) {
            this.putQueryParameter("ProtectedEnabled", protectedEnabled);
            this.protectedEnabled = protectedEnabled;
            return this;
        }

        /**
         * The region ID of the endpoint.
         * <p>
         * 
         * You can call the [DescribeRegions](~~120468~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the security group that is associated with the endpoint ENI. The security group can be used to control data transfer between the VPC and the endpoint ENI.
         * <p>
         * 
         * The endpoint can be associated with up to 10 security groups.
         */
        public Builder securityGroupId(java.util.List < String > securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The ID of the endpoint service with which the endpoint is associated.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * The name of the endpoint service with which the endpoint is associated.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the endpoint belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The zones where the endpoint is deployed.
         */
        public Builder zone(java.util.List < Zone> zone) {
            this.putQueryParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        /**
         * The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Set the value to **1**.
         */
        public Builder zonePrivateIpAddressCount(Long zonePrivateIpAddressCount) {
            this.putQueryParameter("ZonePrivateIpAddressCount", zonePrivateIpAddressCount);
            this.zonePrivateIpAddressCount = zonePrivateIpAddressCount;
            return this;
        }

        @Override
        public CreateVpcEndpointRequest build() {
            return new CreateVpcEndpointRequest(this);
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Zone extends TeaModel {
        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ip")
        private String ip;

        private Zone(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zoneId; 
            private String ip; 

            /**
             * The ID of the vSwitch where you want to create the endpoint ENI in the zone. You can specify up to 10 vSwitch IDs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the zone in which the endpoint is deployed.
             * <p>
             * 
             * You can specify up to 10 zone IDs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The IP address of the zone in which the endpoint is deployed.
             * <p>
             * 
             * You can specify up to 10 IP addresses.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
}
