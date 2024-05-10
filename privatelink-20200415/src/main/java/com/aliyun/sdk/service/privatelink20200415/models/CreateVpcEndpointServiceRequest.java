// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcEndpointServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcEndpointServiceRequest</p>
 */
public class CreateVpcEndpointServiceRequest extends Request {
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
    private java.util.List < Resource> resource;

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
    private Boolean serviceSupportIPv6;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneAffinityEnabled")
    private Boolean zoneAffinityEnabled;

    private CreateVpcEndpointServiceRequest(Builder builder) {
        super(builder);
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
    public java.util.List < Resource> getResource() {
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
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneAffinityEnabled
     */
    public Boolean getZoneAffinityEnabled() {
        return this.zoneAffinityEnabled;
    }

    public static final class Builder extends Request.Builder<CreateVpcEndpointServiceRequest, Builder> {
        private Boolean autoAcceptEnabled; 
        private String clientToken; 
        private Boolean dryRun; 
        private String payer; 
        private String regionId; 
        private java.util.List < Resource> resource; 
        private String resourceGroupId; 
        private String serviceDescription; 
        private String serviceResourceType; 
        private Boolean serviceSupportIPv6; 
        private java.util.List < Tag> tag; 
        private Boolean zoneAffinityEnabled; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcEndpointServiceRequest request) {
            super(request);
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
         * Specifies whether to automatically accept endpoint connection requests. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder autoAcceptEnabled(Boolean autoAcceptEnabled) {
            this.putQueryParameter("AutoAcceptEnabled", autoAcceptEnabled);
            this.autoAcceptEnabled = autoAcceptEnabled;
            return this;
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
         * Specifies whether to perform only a dry run, without performing the actual request.
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
         * The payer of the endpoint service. Valid values:
         * <p>
         * 
         * *   **Endpoint**: the service consumer
         * *   **EndpointService**: the service provider
         * 
         * > By default, the feature of allowing the service provider to pay is unavailable. To use this feature, log on to the [Quota Center console](https://quotas.console.aliyun.com/white-list-products/privatelink/quotas) and click Privileges in the left-side navigation pane. On the **Privileges** page, enter the quota ID `privatelink_whitelist/epsvc_payer_mode`, and click Apply in the Actions column.
         */
        public Builder payer(String payer) {
            this.putQueryParameter("Payer", payer);
            this.payer = payer;
            return this;
        }

        /**
         * The region ID of the endpoint service.
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
         * The service resources of the endpoint service.
         */
        public Builder resource(java.util.List < Resource> resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
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
         * The description of the endpoint service.
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putQueryParameter("ServiceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * The type of the service resource. Valid values:
         * <p>
         * 
         * *   **slb**: a Classic Load Balancer (CLB) instance
         * *   **alb**: an Application Load Balancer (ALB) instance
         * *   **nlb**: a Network Load Balancer (NLB) instance
         */
        public Builder serviceResourceType(String serviceResourceType) {
            this.putQueryParameter("ServiceResourceType", serviceResourceType);
            this.serviceResourceType = serviceResourceType;
            return this;
        }

        /**
         * Specifies whether to enable IPv6 for the endpoint service. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder serviceSupportIPv6(Boolean serviceSupportIPv6) {
            this.putQueryParameter("ServiceSupportIPv6", serviceSupportIPv6);
            this.serviceSupportIPv6 = serviceSupportIPv6;
            return this;
        }

        /**
         * The tags to add to the resource.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Specifies whether to first resolve the domain name of the nearest endpoint that is associated with the endpoint service. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
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
             * The ID of the service resource that is added to the endpoint service. You can specify up to 20 service resource IDs.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the service resource that is added to the endpoint service. You can add up to 20 service resources to the endpoint service. Valid values:
             * <p>
             * 
             * *   **slb**: Classic Load Balancer (CLB) instance
             * *   **alb**: Application Load Balancer (ALB) instance
             * *   **nlb**: Network Load Balancer (NLB) instance
             * 
             * >  In regions where PrivateLink is supported, CLB instances deployed in virtual private clouds (VPCs) can serve as the service resources of the endpoint service.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The zone ID.
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
             * The key of the tag to add to the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.
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
