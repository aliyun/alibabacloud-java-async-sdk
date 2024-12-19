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
 * {@link CreateVpcEndpointServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcEndpointServiceRequest</p>
 */
public class CreateVpcEndpointServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoAcceptEnabled")
    private Boolean autoAcceptEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Payer")
    private String payer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private java.util.List<Resource> resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceDescription")
    private String serviceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceResourceType")
    private String serviceResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceSupportIPv6")
    @Deprecated
    private Boolean serviceSupportIPv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private CreateVpcEndpointServiceRequest(Builder builder) {
        super(builder);
        this.addressIpVersion = builder.addressIpVersion;
        this.autoAcceptEnabled = builder.autoAcceptEnabled;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.payer = builder.payer;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceDescription = builder.serviceDescription;
        this.serviceResourceType = builder.serviceResourceType;
        this.serviceSupportIPv6 = builder.serviceSupportIPv6;
        this.tag = builder.tag;
        this.zoneAffinityEnabled = builder.zoneAffinityEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcEndpointServiceRequest create() {
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
     * @return autoAcceptEnabled
     */
    public Boolean getAutoAcceptEnabled() {
        return this.autoAcceptEnabled;
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
     * @return payer
     */
    public String getPayer() {
        return this.payer;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resource
     */
    public java.util.List<Resource> getResource() {
        return this.resource;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    /**
     * @return serviceResourceType
     */
    public String getServiceResourceType() {
        return this.serviceResourceType;
    }

    /**
     * @return serviceSupportIPv6
     */
    public Boolean getServiceSupportIPv6() {
        return this.serviceSupportIPv6;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static final class Builder extends Request.Builder<CreateVpcEndpointServiceRequest, Builder> {
        private String addressIpVersion; 
        private Boolean autoAcceptEnabled; 
        private String clientToken; 
        private Boolean dryRun; 
        private String payer; 
        private String regionId; 
        private java.util.List<Resource> resource; 
        private String resourceGroupId; 
        private String serviceDescription; 
        private String serviceResourceType; 
        private Boolean serviceSupportIPv6; 
        private java.util.List<Tag> tag; 
        private Boolean zoneAffinityEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcEndpointServiceRequest request) {
            super(request);
            this.addressIpVersion = request.addressIpVersion;
            this.autoAcceptEnabled = request.autoAcceptEnabled;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.payer = request.payer;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceDescription = request.serviceDescription;
            this.serviceResourceType = request.serviceResourceType;
            this.serviceSupportIPv6 = request.serviceSupportIPv6;
            this.tag = request.tag;
            this.zoneAffinityEnabled = request.zoneAffinityEnabled;
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
         * <p>Specifies whether to automatically accept endpoint connection requests. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled);
            this.autoAcceptEnabled = autoAcceptEnabled;
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
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
         * <p>The payer. Valid values:</p>
         * <ul>
         * <li><strong>Endpoint</strong>: service consumer</li>
         * <li><strong>EndpointService</strong>: service provider</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Endpoint</p>
         */
        public Builder payer(String payer) {
            this.putQueryParameter("Payer", payer);
            this.payer = payer;
            return this;
        }

        /**
         * <p>The region ID of the endpoint service.</p>
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
         * <p>The service resources of the endpoint service.</p>
         */
        public Builder resource(java.util.List<Resource> resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
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
         * <p>The description of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my EndpointService.</p>
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putQueryParameter("ServiceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * <p>The type of the service resource. Valid values:</p>
         * <ul>
         * <li><strong>slb</strong>: Classic Load Balancer (CLB) instance</li>
         * <li><strong>alb</strong>: Application Load Balancer (ALB) instance</li>
         * <li><strong>nlb</strong>: Network Load Balancer (NLB) instance</li>
         * </ul>
         * <blockquote>
         * <p> You cannot access TCP/SSL listeners configured for NLB instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.putQueryParameter("ServiceResourceType", serviceResourceType);
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        /**
         * <p>Specifies whether to enable IPv6 for the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder serviceSupportIPv6(Boolean serviceSupportIPv6) {
            this.putQueryParameter("ServiceSupportIPv6", serviceSupportIPv6);
            this.serviceSupportIPv6 = serviceSupportIPv6;
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
         * <p>Specifies whether to first resolve the domain name of the nearest endpoint that is associated with the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder zoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.putQueryParameter("ZoneAffinityEnabled", zoneAffinityEnabled);
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }

        @Override
        public CreateVpcEndpointServiceRequest build() {
            return new CreateVpcEndpointServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateVpcEndpointServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateVpcEndpointServiceRequest</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Resource(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 
            private String zoneId; 

            /**
             * <p>The ID of the service resource that is added to the endpoint service. You can specify up to 20 service resource IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-hp32z1wp5peaoox2q****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the service resource that is added to the endpoint service. You can add up to 20 service resources to the endpoint service. Valid values:</p>
             * <ul>
             * <li><strong>slb</strong>: CLB instance</li>
             * <li><strong>alb</strong>: ALB instance</li>
             * <li><strong>nlb</strong>: NLB instance</li>
             * </ul>
             * <blockquote>
             * <p> In regions where PrivateLink is supported, CLB instances deployed in virtual private clouds (VPCs) can serve as the service resources of the endpoint service. You cannot access TCP/SSL listeners configured for NLB instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>slb</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateVpcEndpointServiceRequest} extends {@link TeaModel}
     *
     * <p>CreateVpcEndpointServiceRequest</p>
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
             * <p>The key of the tag to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
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
}
