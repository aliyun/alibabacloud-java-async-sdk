// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link CreateLoadBalancerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerRequest</p>
 */
public class CreateLoadBalancerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeletionProtectionConfig")
    private DeletionProtectionConfig deletionProtectionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerBillingConfig")
    private LoadBalancerBillingConfig loadBalancerBillingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
    private String loadBalancerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerType")
    private String loadBalancerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModificationProtectionConfig")
    private ModificationProtectionConfig modificationProtectionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ZoneMappings> zoneMappings;

    private CreateLoadBalancerRequest(Builder builder) {
        super(builder);
        this.addressIpVersion = builder.addressIpVersion;
        this.addressType = builder.addressType;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.clientToken = builder.clientToken;
        this.deletionProtectionConfig = builder.deletionProtectionConfig;
        this.dryRun = builder.dryRun;
        this.loadBalancerBillingConfig = builder.loadBalancerBillingConfig;
        this.loadBalancerName = builder.loadBalancerName;
        this.loadBalancerType = builder.loadBalancerType;
        this.modificationProtectionConfig = builder.modificationProtectionConfig;
        this.regionId = builder.regionId;
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
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deletionProtectionConfig
     */
    public DeletionProtectionConfig getDeletionProtectionConfig() {
        return this.deletionProtectionConfig;
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
     * @return loadBalancerName
     */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * @return loadBalancerType
     */
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * @return modificationProtectionConfig
     */
    public ModificationProtectionConfig getModificationProtectionConfig() {
        return this.modificationProtectionConfig;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
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
    public java.util.List<ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerRequest, Builder> {
        private String addressIpVersion; 
        private String addressType; 
        private String bandwidthPackageId; 
        private String clientToken; 
        private DeletionProtectionConfig deletionProtectionConfig; 
        private Boolean dryRun; 
        private LoadBalancerBillingConfig loadBalancerBillingConfig; 
        private String loadBalancerName; 
        private String loadBalancerType; 
        private ModificationProtectionConfig modificationProtectionConfig; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private String vpcId; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerRequest request) {
            super(request);
            this.addressIpVersion = request.addressIpVersion;
            this.addressType = request.addressType;
            this.bandwidthPackageId = request.bandwidthPackageId;
            this.clientToken = request.clientToken;
            this.deletionProtectionConfig = request.deletionProtectionConfig;
            this.dryRun = request.dryRun;
            this.loadBalancerBillingConfig = request.loadBalancerBillingConfig;
            this.loadBalancerName = request.loadBalancerName;
            this.loadBalancerType = request.loadBalancerType;
            this.modificationProtectionConfig = request.modificationProtectionConfig;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * <p>The IP version of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong> (default): IPv4</li>
         * <li><strong>DualStack</strong>: dual-stack</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.putBodyParameter("AddressIpVersion", addressIpVersion);
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The type of the IPv4 address used by the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The NLB instance uses a public IP address. The domain name of the instance is resolved to the public IP address. The instance is accessible over the Internet.</li>
         * <li><strong>Intranet</strong>: The NLB instance uses a private IP address. The domain name of the instance is resolved to the private IP address. The instance is accessible only within the virtual private cloud (VPC) where the instance is deployed.</li>
         * </ul>
         * <blockquote>
         * <p> To enable a public IPv6 address for a dual-stack NLB instance, call the <a href="https://help.aliyun.com/document_detail/445878.html">EnableLoadBalancerIpv6Internet</a> operation.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder addressType(String addressType) {
            this.putBodyParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cbwp-bp1vevu8h3ieh****</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.putBodyParameter("BandwidthPackageId", bandwidthPackageId);
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>The client token used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token. Ensure that the token is unique among different requests. Only ASCII characters are allowed.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the value of <strong>RequestId</strong> is used.**** The value of <strong>RequestId</strong> is different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configuration of the deletion protection feature.</p>
         */
        public Builder deletionProtectionConfig(DeletionProtectionConfig deletionProtectionConfig) {
            this.putBodyParameter("DeletionProtectionConfig", deletionProtectionConfig);
            this.deletionProtectionConfig = deletionProtectionConfig;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: validates the request without performing the operation. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the validation, the corresponding error message is returned. If the request passes the validation, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): validates the request and performs the operation. If the request passes the validation, a 2xx HTTP status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The billing settings of the NLB instance.</p>
         */
        public Builder loadBalancerBillingConfig(LoadBalancerBillingConfig loadBalancerBillingConfig) {
            this.putBodyParameter("LoadBalancerBillingConfig", loadBalancerBillingConfig);
            this.loadBalancerBillingConfig = loadBalancerBillingConfig;
            return this;
        }

        /**
         * <p>The name of the NLB instance.</p>
         * <p>It must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>NLB1</p>
         */
        public Builder loadBalancerName(String loadBalancerName) {
            this.putBodyParameter("LoadBalancerName", loadBalancerName);
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * <p>The type of the Server Load Balancer (SLB) instance. Set the value to <strong>network</strong>, which specifies NLB.</p>
         * 
         * <strong>example:</strong>
         * <p>network</p>
         */
        public Builder loadBalancerType(String loadBalancerType) {
            this.putBodyParameter("LoadBalancerType", loadBalancerType);
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * <p>The configuration of the configuration read-only mode.</p>
         */
        public Builder modificationProtectionConfig(ModificationProtectionConfig modificationProtectionConfig) {
            this.putBodyParameter("ModificationProtectionConfig", modificationProtectionConfig);
            this.modificationProtectionConfig = modificationProtectionConfig;
            return this;
        }

        /**
         * <p>The ID of the region where the NLB instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the VPC where you want to create the NLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1b49rqrybk45nio****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The mappings between zones and vSwitches. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, you must specify at least two zones.</p>
         * <p>This parameter is required.</p>
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.putBodyParameter("ZoneMappings", zoneMappings);
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
    public static class DeletionProtectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private DeletionProtectionConfig(Builder builder) {
            this.enabled = builder.enabled;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeletionProtectionConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Boolean enabled; 
            private String reason; 

            private Builder() {
            } 

            private Builder(DeletionProtectionConfig model) {
                this.enabled = model.enabled;
                this.reason = model.reason;
            } 

            /**
             * <p>Specifies whether to enable the deletion protection feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The reason why the deletion protection feature is enabled or disabled. The reason must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
             * 
             * <strong>example:</strong>
             * <p>The instance is running</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public DeletionProtectionConfig build() {
                return new DeletionProtectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateLoadBalancerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerRequest</p>
     */
    public static class LoadBalancerBillingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        private LoadBalancerBillingConfig(Builder builder) {
            this.payType = builder.payType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerBillingConfig create() {
            return builder().build();
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        public static final class Builder {
            private String payType; 

            private Builder() {
            } 

            private Builder(LoadBalancerBillingConfig model) {
                this.payType = model.payType;
            } 

            /**
             * <p>The billing method of the NLB instance.</p>
             * <p>Set the value to <strong>PostPay</strong>, which specifies the pay-as-you-go billing method.</p>
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

            private Builder() {
            } 

            private Builder(ModificationProtectionConfig model) {
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The reason for enabling the configuration read-only mode. The reason must be 2 to 128 characters in length, can contain letters, digits, periods (.), underscores (_), and hyphens (-), and must start with a letter.</p>
             * <blockquote>
             * <p> This parameter takes effect only when <strong>Status</strong> is set to <strong>ConsoleProtection</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Service guarantee period</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>Specifies whether to enable the configuration read-only mode. Valid values:</p>
             * <ul>
             * <li><strong>NonProtection</strong>: does not enable the configuration read-only mode. You cannot set the <strong>Reason</strong> parameter. If the <strong>Reason</strong> parameter is set, the value is cleared.</li>
             * <li><strong>ConsoleProtection</strong>: enables the configuration read-only mode. You can set the <strong>Reason</strong> parameter.</li>
             * </ul>
             * <blockquote>
             * <p> If the parameter is set to <strong>ConsoleProtection</strong>, the configuration read-only mode is enabled. You cannot modify the configurations of the NLB instance in the NLB console. However, you can call API operations to modify the configurations of the NLB instance.</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag. The tag key can be up to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag key can contain letters, digits, and the following special characters: _ . : / = + - @</p>
             * <p>You can specify up to 20 tags in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. The tag value can be up to 128 characters in length, cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>. The tag value can contain letters, digits, and the following special characters: _ . : / = + - @</p>
             * <p>You can specify up to 20 tags in each call.</p>
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

        @com.aliyun.core.annotation.NameInMap("Ipv4LocalAddresses")
        private java.util.List<String> ipv4LocalAddresses;

        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("Ipv6LocalAddresses")
        private java.util.List<String> ipv6LocalAddresses;

        @com.aliyun.core.annotation.NameInMap("PrivateIPv4Address")
        private String privateIPv4Address;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.allocationId = builder.allocationId;
            this.ipv4LocalAddresses = builder.ipv4LocalAddresses;
            this.ipv6Address = builder.ipv6Address;
            this.ipv6LocalAddresses = builder.ipv6LocalAddresses;
            this.privateIPv4Address = builder.privateIPv4Address;
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
         * @return ipv4LocalAddresses
         */
        public java.util.List<String> getIpv4LocalAddresses() {
            return this.ipv4LocalAddresses;
        }

        /**
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
        }

        /**
         * @return ipv6LocalAddresses
         */
        public java.util.List<String> getIpv6LocalAddresses() {
            return this.ipv6LocalAddresses;
        }

        /**
         * @return privateIPv4Address
         */
        public String getPrivateIPv4Address() {
            return this.privateIPv4Address;
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
            private java.util.List<String> ipv4LocalAddresses; 
            private String ipv6Address; 
            private java.util.List<String> ipv6LocalAddresses; 
            private String privateIPv4Address; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.allocationId = model.allocationId;
                this.ipv4LocalAddresses = model.ipv4LocalAddresses;
                this.ipv6Address = model.ipv6Address;
                this.ipv6LocalAddresses = model.ipv6LocalAddresses;
                this.privateIPv4Address = model.privateIPv4Address;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the elastic IP address (EIP) that is associated with the Internet-facing NLB instance. Each zone is assigned one EIP. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, specify at least two zones.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-bp1aedxso6u80u0qf****</p>
             */
            public Builder allocationId(String allocationId) {
                this.allocationId = allocationId;
                return this;
            }

            /**
             * <p>The local IPv4 addresses. The IP addresses that the NLB instance uses to communicate with the backend servers. The number of IP addresses must be an even number, which must be at least 2 and at most 8.</p>
             */
            public Builder ipv4LocalAddresses(java.util.List<String> ipv4LocalAddresses) {
                this.ipv4LocalAddresses = ipv4LocalAddresses;
                return this;
            }

            /**
             * <p>The VIP of the IPv6 version. The IPv6 address that the NLB instance uses to provide external services.</p>
             * 
             * <strong>example:</strong>
             * <p>2408:400a:d5:3080:b409:840a:ca:e8e5</p>
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The local IPv6 addresses. The IP addresses that the NLB instance uses to communicate with the backend servers. The number of IP addresses must be an even number, which must be at least 2 and at most 8.</p>
             */
            public Builder ipv6LocalAddresses(java.util.List<String> ipv6LocalAddresses) {
                this.ipv6LocalAddresses = ipv6LocalAddresses;
                return this;
            }

            /**
             * <p>The private virtual IP address (VIP) of the IPv4 version. The private IPv4 address that the NLB instance uses to provide external services.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.1</p>
             */
            public Builder privateIPv4Address(String privateIPv4Address) {
                this.privateIPv4Address = privateIPv4Address;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the zone. You can specify only one vSwitch (subnet) in each zone of an NLB instance. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, you must specify at least two zones.</p>
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
             * <p>The ID of the zone where the NLB instance is deployed. An NLB instance can be deployed in up to 10 zones. If the region supports two or more zones, specify at least two zones.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query the most recent zone list.</p>
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
