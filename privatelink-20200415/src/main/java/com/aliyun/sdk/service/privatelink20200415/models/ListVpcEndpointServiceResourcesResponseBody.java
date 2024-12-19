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
 * {@link ListVpcEndpointServiceResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServiceResourcesResponseBody</p>
 */
public class ListVpcEndpointServiceResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

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
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Resources> resources; 

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        public ListVpcEndpointServiceResourcesResponseBody build() {
            return new ListVpcEndpointServiceResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointServiceResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServiceResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoAllocatedEnabled")
        private Boolean autoAllocatedEnabled;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelatedDeprecatedEndpointCount")
        private Long relatedDeprecatedEndpointCount;

        @com.aliyun.core.annotation.NameInMap("RelatedEndpointCount")
        private Long relatedEndpointCount;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceSupportIPv6")
        private Boolean resourceSupportIPv6;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>Indicates whether automatic resource allocation is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoAllocatedEnabled(Boolean autoAllocatedEnabled) {
                this.autoAllocatedEnabled = autoAllocatedEnabled;
                return this;
            }

            /**
             * <p>The IP address of the service resource.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.23</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the region where the service resource is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of endpoints that are associated with the service resource that is smoothly migrated.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder relatedDeprecatedEndpointCount(Long relatedDeprecatedEndpointCount) {
                this.relatedDeprecatedEndpointCount = relatedDeprecatedEndpointCount;
                return this;
            }

            /**
             * <p>The number of endpoints that are associated with the service resource.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder relatedEndpointCount(Long relatedEndpointCount) {
                this.relatedEndpointCount = relatedEndpointCount;
                return this;
            }

            /**
             * <p>The service resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-hp32z1wp5peaoox2q****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Indicates whether IPv6 is enabled for the endpoint service. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder resourceSupportIPv6(Boolean resourceSupportIPv6) {
                this.resourceSupportIPv6 = resourceSupportIPv6;
                return this;
            }

            /**
             * <p>The type of the service resource.</p>
             * <p>Only <strong>slb</strong> is returned. This value indicates a Classic Load Balancer (CLB) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>slb</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the vSwitch to which the service resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-hp3uf6045ljdhd5zr****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the service resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-hp356stwkxg3fn2xe****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the zone to which the service resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-huhehaote-b</p>
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
