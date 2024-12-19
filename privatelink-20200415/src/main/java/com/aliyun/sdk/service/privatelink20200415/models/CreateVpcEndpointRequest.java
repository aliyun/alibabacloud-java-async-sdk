// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

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
 * {@link CreateVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcEndpointRequest</p>
 */
public class CreateVpcEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointDescription")
    private String endpointDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointName")
    private String endpointName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    private String endpointType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyDocument")
    private String policyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectedEnabled")
    private Boolean protectedEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private java.util.List<String> securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Zone")
    private java.util.List<Zone> zone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZonePrivateIpAddressCount")
    private Long zonePrivateIpAddressCount;

    private CreateVpcEndpointRequest(Builder builder) {
        super(builder);
        this.addressIpVersion = builder.addressIpVersion;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointDescription = builder.endpointDescription;
        this.endpointName = builder.endpointName;
        this.endpointType = builder.endpointType;
        this.policyDocument = builder.policyDocument;
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
     * @return addressIpVersion
     */
    public String getAddressIpVersion() {
        return this.addressIpVersion;
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
     * @return policyDocument
     */
    public String getPolicyDocument() {
        return this.policyDocument;
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
    public java.util.List<String> getSecurityGroupId() {
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
     * @return zone
     */
    public java.util.List<Zone> getZone() {
        return this.zone;
    }

    /**
     * @return zonePrivateIpAddressCount
     */
    public Long getZonePrivateIpAddressCount() {
        return this.zonePrivateIpAddressCount;
    }

    public static final class Builder extends Request.Builder<CreateVpcEndpointRequest, Builder> {
        private String addressIpVersion; 
        private String clientToken; 
        private Boolean dryRun; 
        private String endpointDescription; 
        private String endpointName; 
        private String endpointType; 
        private String policyDocument; 
        private Boolean protectedEnabled; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<String> securityGroupId; 
        private String serviceId; 
        private String serviceName; 
        private java.util.List<Tag> tag; 
        private String vpcId; 
        private java.util.List<Zone> zone; 
        private Long zonePrivateIpAddressCount; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcEndpointRequest request) {
            super(request);
            this.addressIpVersion = request.addressIpVersion;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.endpointDescription = request.endpointDescription;
            this.endpointName = request.endpointName;
            this.endpointType = request.endpointType;
            this.policyDocument = request.policyDocument;
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
         * AddressIpVersion.
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.putQueryParameter("AddressIpVersion", addressIpVersion);
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The description of the endpoint.</p>
         * <p>The description must be 2 to 256 characters in length, and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my Endpoint.</p>
         */
        public Builder endpointDescription(String endpointDescription) {
            this.putQueryParameter("EndpointDescription", endpointDescription);
            this.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * <p>The name of the endpoint.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder endpointName(String endpointName) {
            this.putQueryParameter("EndpointName", endpointName);
            this.endpointName = endpointName;
            return this;
        }

        /**
         * <p>The endpoint type. Valid values:</p>
         * <ul>
         * <li><strong>Interface</strong> You can specify an Application Load Balancer (ALB) instance, a Classic Load Balancer (CLB) instance, or a Network Load Balancer (NLB) instance.</li>
         * <li><strong>Reverse</strong> You can specify a Virtual Private Cloud (VPC) NAT gateway.</li>
         * </ul>
         * <blockquote>
         * <p> Services that support reverse endpoints are provided by Alibaba Cloud or Alibaba Cloud partners. To create such a service on your own, contact your account manager.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Interface</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        /**
         * PolicyDocument.
         */
        public Builder policyDocument(String policyDocument) {
            this.putQueryParameter("PolicyDocument", policyDocument);
            this.policyDocument = policyDocument;
            return this;
        }

        /**
         * <p>Specifies whether to enable user authentication. This parameter is available in Security Token Service (STS) mode. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables user authentication. After user authentication is enabled, only the user who creates the endpoint can modify or delete the endpoint in STS mode.</li>
         * <li><strong>false</strong> (default): disables user authentication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder protectedEnabled(Boolean protectedEnabled) {
            this.putQueryParameter("ProtectedEnabled", protectedEnabled);
            this.protectedEnabled = protectedEnabled;
            return this;
        }

        /**
         * <p>The region ID of the endpoint.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/120468.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The IDs of security groups that are associated with the endpoint elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>sg-hp33bw6ynvm2yb0e****</p>
         */
        public Builder securityGroupId(java.util.List<String> securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The ID of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3xdsq46ael67lo****</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the endpoint service with which the endpoint is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3vpx8yqxblby3i****</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The tags to add to the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-hp356stwkxg3fn2xe****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zones where the endpoint is deployed.</p>
         */
        public Builder zone(java.util.List<Zone> zone) {
            this.putQueryParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        /**
         * <p>The number of private IP addresses that are assigned to an elastic network interface (ENI) in each zone. Set the value to <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

    /**
     * 
     * {@link CreateVpcEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateVpcEndpointRequest</p>
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
             * <p>The key of the tag to add to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag to add to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>prod</p>
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
     * {@link CreateVpcEndpointRequest} extends {@link TeaModel}
     *
     * <p>CreateVpcEndpointRequest</p>
     */
    public static class Zone extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6Address")
        private String ipv6Address;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ip")
        private String ip;

        private Zone(Builder builder) {
            this.ipv6Address = builder.ipv6Address;
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
         * @return ipv6Address
         */
        public String getIpv6Address() {
            return this.ipv6Address;
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
            private String ipv6Address; 
            private String vSwitchId; 
            private String zoneId; 
            private String ip; 

            /**
             * Ipv6Address.
             */
            public Builder ipv6Address(String ipv6Address) {
                this.ipv6Address = ipv6Address;
                return this;
            }

            /**
             * <p>The ID of the vSwitch where you want to create the endpoint ENI in the zone. You can specify up to 10 vSwitch IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-hp3uf6045ljdhd5zr****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the zone in which the endpoint is deployed.</p>
             * <p>You can specify up to 10 zone IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote-b</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * <p>The IP address of the zone in which the endpoint is deployed.</p>
             * <p>You can specify up to 10 IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
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
