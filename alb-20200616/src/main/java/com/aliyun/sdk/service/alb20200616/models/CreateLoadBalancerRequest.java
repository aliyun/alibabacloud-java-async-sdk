// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The mode in which IP addresses are allocated. Default value: Dynamic. Valid values:</p>
         * <ul>
         * <li><strong>Fixed</strong>: The ALB instance uses a static IP address.</li>
         * <li><strong>Dynamic</strong> (default): The system dynamically allocates an IP address to each zone of the ALB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dynamic</p>
         */
        public Builder addressAllocatedMode(String addressAllocatedMode) {
            this.putQueryParameter("AddressAllocatedMode", addressAllocatedMode);
            this.addressAllocatedMode = addressAllocatedMode;
            return this;
        }

        /**
         * <p>The protocol version. Valid values:</p>
         * <ul>
         * <li><strong>IPv4:</strong> IPv4.</li>
         * <li><strong>DualStack:</strong> dual stack.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.putQueryParameter("AddressIpVersion", addressIpVersion);
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The type of the address of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet:</strong> The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. In this case, the ALB instance can be accessed over the Internet.</li>
         * <li><strong>Intranet:</strong> The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The value of the <strong>RequestId</strong> parameter may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> enables deletion protection.</li>
         * <li><strong>false:</strong> disables deletion protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtectionEnabled(Boolean deletionProtectionEnabled) {
            this.putQueryParameter("DeletionProtectionEnabled", deletionProtectionEnabled);
            this.deletionProtectionEnabled = deletionProtectionEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true:</strong> performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false:</strong> performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The billing method of the ALB instance.</p>
         * <p>This parameter is required.</p>
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.putQueryParameter("LoadBalancerBillingConfig", loadBalancerBillingConfig);
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * <p>The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Basic:</strong> basic.</li>
         * <li><strong>Standard:</strong> standard.</li>
         * <li><strong>StandardWithWaf:</strong> WAF-enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder loadBalancerEdition(String loadBalancerEdition) {
            this.putQueryParameter("LoadBalancerEdition", loadBalancerEdition);
            this.loadBalancerEdition = loadBalancerEdition;
            return this;
        }

        /**
         * <p>The name of the ALB instance.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>alb1</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putQueryParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The configuration of the configuration read-only mode.</p>
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.putQueryParameter("ModificationProtectionConfig", modificationProtectionConfig);
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which you want to create the ALB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b49rqrybk45nio****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The mappings between zones an vSwitches. You can specify at most 10 zones. If the selected region supports two or more zones, select at least two zones to ensure the high availability of your service.</p>
         * <p>This parameter is required.</p>
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

    /**
     * 
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
     */
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
             * <p>The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cbwp-bp1vevu8h3ieh****</p>
             */
            public Builder bandwidthPackageId(String bandwidthPackageId) {
                this.bandwidthPackageId = bandwidthPackageId;
                return this;
            }

            /**
             * <p>The billing method of the ALB instance.</p>
             * <p>Set the value to <strong>PostPay</strong>, which specifies the pay-as-you-go billing method.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPay</p>
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
    /**
     * 
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
     */
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
             * <p>The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The reason must start with a letter.</p>
             * <blockquote>
             * <p>This parameter takes effect only if <code>Status</code> is set to <strong>ConsoleProtection</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
             * <ul>
             * <li><strong>NonProtection</strong>: disables the configuration read-only mode. In this case, you cannot specify ModificationProtectionReason. If you specify ModificationProtectionReason, the value of the parameter is cleared.</li>
             * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode. In this case, you can specify ModificationProtectionReason.</li>
             * </ul>
             * <blockquote>
             * <p>If you set this parameter to <strong>ConsoleProtection</strong>, you cannot use the ALB console to modify instance configurations. However, you can call API operations to modify instance configurations.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ConsoleProtection</p>
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
    /**
     * 
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
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
             * <p>The tag key can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value can be up to 128 characters in length, and cannot start with acs: or aliyun. It cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>product</p>
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
    /**
     * 
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationId")
        private String allocationId;

        @com.aliyun.core.annotation.NameInMap("EipType")
        private String eipType;

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
            this.eipType = builder.eipType;
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
         * @return eipType
         */
        public String getEipType() {
            return this.eipType;
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
            private String eipType; 
            private String intranetAddress; 
            private String vSwitchId; 
            private String zoneId; 

            /**
             * <p>The ID of the EIP to be associated with the Internet-facing ALB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1aedxso6u80u0qf****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The type of EIP. Valid values:</p>
             * <ul>
             * <li><strong>Common</strong>: an EIP.</li>
             * <li><strong>Anycast</strong>: an Anycast EIP.</li>
             * </ul>
             * <blockquote>
             * <p> For more information about the regions in which ALB supports Anycast EIPs, see <a href="https://help.aliyun.com/document_detail/460727.html">Limits</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Common</p>
             */
            public Builder eipType(String eipType) {
                this.eipType = eipType;
                return this;
            }

            /**
             * <p>The private IPv4 address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.1</p>
             */
            public Builder intranetAddress(String intranetAddress) {
                this.intranetAddress = intranetAddress;
                return this;
            }

            /**
             * <p>The vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone. You can specify at most 10 zones. If the region supports two or more zones, specify at least two zones.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-sersdf****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The zone ID of the cluster. You can specify at most 10 zones. If the region supports two or more zones, specify at least two zones. You can call the <a href="https://help.aliyun.com/document_detail/36064.html">DescribeZones</a> operation to query the most recent zone list.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
