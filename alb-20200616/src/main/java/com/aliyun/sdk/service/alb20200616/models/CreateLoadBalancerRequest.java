// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressAllocatedMode")
    private String addressAllocatedMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtectionEnabled")
    private Boolean deletionProtectionEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerBillingConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private LoadBalancerBillingConfig loadBalancerBillingConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerEdition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerEdition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionConfig")
    private ModificationProtectionConfig modificationProtectionConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < ZoneMappings> zoneMappings;

    private CreateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.addressAllocatedMode = builder.addressAllocatedMode;
        this.addressIpVersion = builder.addressIpVersion;
        this.addressType = builder.addressType;
        this.clientToken = builder.clientToken;
        this.deletionProtectionEnabled = builder.deletionProtectionEnabled;
        this.dryRun = builder.dryRun;
        this.loadBalancerBillingConfig = builder.loadBalancerBillingConfig;
        this.loadBalancerEdition = builder.loadBalancerEdition;
        this.loadBalancerName = builder.loadBalancerName;
        this.modificationProtectionConfig = builder.modificationProtectionConfig;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressAllocatedMode
     */
    public String getAddressAllocatedMode() {
        return this.addressAllocatedMode;
    }

    /**
     * @return addressIpVersion
     */
    public String getAddressIpVersion() {
        return this.addressIpVersion;
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deletionProtectionEnabled
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.deletionProtectionEnabled;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return loadBalancerBillingConfig
     */
    public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }

    /**
     * @return loadBalancerEdition
     */
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    /**
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return modificationProtectionConfig
     */
    public ModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return zoneMappings
     */
    public java.util.List < ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerRequest, Builder> {
        private String addressAllocatedMode; 
        private String addressIpVersion; 
        private String addressType; 
        private String clientToken; 
        private Boolean deletionProtectionEnabled; 
        private Boolean dryRun; 
        private LoadBalancerBillingConfig loadBalancerBillingConfig; 
        private String loadBalancerEdition; 
        private String loadBalancerName; 
        private ModificationProtectionConfig modificationProtectionConfig; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private String vpcId; 
        private java.util.List < ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest request) {
            super(request);
            this.addressAllocatedMode = request.addressAllocatedMode;
            this.addressIpVersion = request.addressIpVersion;
            this.addressType = request.addressType;
            this.clientToken = request.clientToken;
            this.deletionProtectionEnabled = request.deletionProtectionEnabled;
            this.dryRun = request.dryRun;
            this.loadBalancerBillingConfig = request.loadBalancerBillingConfig;
            this.loadBalancerEdition = request.loadBalancerEdition;
            this.loadBalancerName = request.loadBalancerName;
            this.modificationProtectionConfig = request.modificationProtectionConfig;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * The mode in which IP addresses are allocated. Valid values:
         * <p>
         * 
         * *   **Fixed**: The ALB instance uses a static IP address.
         * *   **Dynamic**: dynamically allocates an IP address to each zone of the ALB instance.
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            this.putQueryParameter("AddressAllocatedMode", addressAllocatedMode);
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * The protocol version. Valid values:
         * <p>
         * 
         * *   **IPv4:** IPv4.
         * *   **DualStack:** dual stack.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.putQueryParameter("AddressIpVersion", addressIpVersion);
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * The type of the address of the ALB instance. Valid values:
         * <p>
         * 
         * *   **Internet:** The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. In this case, the ALB instance can be accessed over the Internet.
         * *   **Intranet:** The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters.
         * 
         * >  If you do not specify this parameter, the system uses the value of **RequestId** as the value of **ClientToken**. The value of the **RequestId** parameter may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to enable deletion protection. Default value: false. Valid values:
         * <p>
         * 
         * *   **true:** enables deletion protection.
         * *   **false:** disables deletion protection.
         */
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            this.putQueryParameter("DeletionProtectionEnabled", deletionProtectionEnabled);
            this.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Default value: false. Valid values:
         * <p>
         * 
         * *   **true:** performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false:** performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The billing method of the ALB instance.
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.putQueryParameter("LoadBalancerBillingConfig", loadBalancerBillingConfig);
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values:
         * <p>
         * 
         * *   **Basic:** basic.
         * *   **Standard:** standard.
         * *   **StandardWithWaf:** WAF-enabled.
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.putQueryParameter("LoadBalancerEdition", loadBalancerEdition);
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * The name of the ALB instance.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * The configuration of the configuration read-only mode.
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.putQueryParameter("ModificationProtectionConfig", modificationProtectionConfig);
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) in which you want to create the ALB instance.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The zones and the vSwitches in the zones. You must specify at least two zones.
         */
        public Builder zoneMappings(java.util.List < ZoneMappings> zoneMappings) {
            this.putQueryParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public CreateLoadBalancerRequest build() {
            return new CreateLoadBalancerRequest(this);
        } 

    } 

    public static class LoadBalancerBillingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
        private String bandwidthPackageId;

        @com.aliyun.core.annotation.NameInMap("PayType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String payType;

        private LoadBalancerBillingConfig(Builder builder) {
            this.bandwidthPackageId = builder.bandwidthPackageId;
            this.payType = builder.payType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerBillingConfig create() {
            return builder().build();
        }

        /**
         * @return bandwidthPackageId
         */
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        public static final class Builder {
            private String bandwidthPackageId; 
            private String payType; 

            /**
             * The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing ALB instance.
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * The billing method of the ALB instance.
             * <p>
             * 
             * Set the value to **PostPay**, which specifies the pay-as-you-go billing method.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            public LoadBalancerBillingConfig build() {
                return new LoadBalancerBillingConfig(this);
            } 

        } 

    }
    public static class ModificationProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ModificationProtectionConfig(Builder builder) {
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModificationProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String reason; 
            private String status; 

            /**
             * The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The reason must start with a letter.
             * <p>
             * 
             * > This parameter takes effect only if `Status` is set to **ConsoleProtection**.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Specifies whether to enable the configuration read-only mode. Valid values:
             * <p>
             * 
             * *   **NonProtection**: disables the configuration read-only mode. In this case, you cannot specify ModificationProtectionReason. If you specify ModificationProtectionReason, the value of the parameter is cleared.
             * *   **ConsoleProtection**: enables the configuration read-only mode. In this case, you can specify ModificationProtectionReason.
             * 
             * > If you set this parameter to **ConsoleProtection**, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ModificationProtectionConfig build() {
                return new ModificationProtectionConfig(this);
            } 

        } 

    }
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
             * The tag key can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.
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
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("IntranetAddress")
        private String intranetAddress;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.allocationId = builder.allocationId;
            this.intranetAddress = builder.intranetAddress;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return allocationId
         */
        public String getAllocationId() {
            return this.allocationId;
        }

        /**
         * @return intranetAddress
         */
        public String getIntranetAddress() {
            return this.intranetAddress;
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

        public static final class Builder {
            private String allocationId; 
            private String intranetAddress; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * AllocationId.
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * The private IPv4 address. You must add at least two zones. You can add a maximum of 10 zones.
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an ALB instance. You can specify up to 10 zones.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The zone ID of the ALB instance. You can specify up to 10 zones for an ALB instance.
             * <p>
             * 
             * You can call the [DescribeZones](~~36064~~) operation to query the most recent zone list.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
}
