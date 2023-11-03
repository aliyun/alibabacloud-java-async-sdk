// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServiceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServiceResourcesResponseBody</p>
 */
public class ListVpcEndpointServiceResourcesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    private ListVpcEndpointServiceResourcesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServiceResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Resources> resources; 

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next requests are performed.
         * *   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The service resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListVpcEndpointServiceResourcesResponseBody build() {
            return new ListVpcEndpointServiceResourcesResponseBody(this);
        } 

    } 

    public static class Resources extends TeaModel {
        @NameInMap("AutoAllocatedEnabled")
        private Boolean autoAllocatedEnabled;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RelatedDeprecatedEndpointCount")
        private Long relatedDeprecatedEndpointCount;

        @NameInMap("RelatedEndpointCount")
        private Long relatedEndpointCount;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceSupportIPv6")
        private Boolean resourceSupportIPv6;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Resources(Builder builder) {
            this.autoAllocatedEnabled = builder.autoAllocatedEnabled;
            this.ip = builder.ip;
            this.regionId = builder.regionId;
            this.relatedDeprecatedEndpointCount = builder.relatedDeprecatedEndpointCount;
            this.relatedEndpointCount = builder.relatedEndpointCount;
            this.resourceId = builder.resourceId;
            this.resourceSupportIPv6 = builder.resourceSupportIPv6;
            this.resourceType = builder.resourceType;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return autoAllocatedEnabled
         */
        public Boolean getAutoAllocatedEnabled() {
            return this.autoAllocatedEnabled;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return relatedDeprecatedEndpointCount
         */
        public Long getRelatedDeprecatedEndpointCount() {
            return this.relatedDeprecatedEndpointCount;
        }

        /**
         * @return relatedEndpointCount
         */
        public Long getRelatedEndpointCount() {
            return this.relatedEndpointCount;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceSupportIPv6
         */
        public Boolean getResourceSupportIPv6() {
            return this.resourceSupportIPv6;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean autoAllocatedEnabled; 
            private String ip; 
            private String regionId; 
            private Long relatedDeprecatedEndpointCount; 
            private Long relatedEndpointCount; 
            private String resourceId; 
            private Boolean resourceSupportIPv6; 
            private String resourceType; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * Indicates whether automatic resource allocation is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder autoAllocatedEnabled(Boolean autoAllocatedEnabled) {
                this.autoAllocatedEnabled = autoAllocatedEnabled;
                return this;
            }

            /**
             * The IP address of the service resource.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the region where the service resource is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The number of endpoints that are associated with the service resource that is smoothly migrated.
             */
            public Builder relatedDeprecatedEndpointCount(Long relatedDeprecatedEndpointCount) {
                this.relatedDeprecatedEndpointCount = relatedDeprecatedEndpointCount;
                return this;
            }

            /**
             * The number of endpoints that are associated with the service resource.
             */
            public Builder relatedEndpointCount(Long relatedEndpointCount) {
                this.relatedEndpointCount = relatedEndpointCount;
                return this;
            }

            /**
             * The service resource ID.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Indicates whether IPv6 is enabled for the endpoint service. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder resourceSupportIPv6(Boolean resourceSupportIPv6) {
                this.resourceSupportIPv6 = resourceSupportIPv6;
                return this;
            }

            /**
             * The type of the service resource.
             * <p>
             * 
             * Only **slb** is returned. This value indicates a Classic Load Balancer (CLB) instance.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The ID of the vSwitch to which the service resource belongs.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the service resource belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the zone to which the service resource belongs.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
