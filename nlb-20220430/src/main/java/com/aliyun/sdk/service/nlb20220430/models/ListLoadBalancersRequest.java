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
 * {@link ListLoadBalancersRequest} extends {@link RequestModel}
 *
 * <p>ListLoadBalancersRequest</p>
 */
public class ListLoadBalancersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DNSName")
    private String DNSName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6AddressType")
    private String ipv6AddressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerBusinessStatus")
    private String loadBalancerBusinessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private java.util.List<String> loadBalancerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerNames")
    private java.util.List<String> loadBalancerNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerType")
    private String loadBalancerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcIds")
    private java.util.List<String> vpcIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private ListLoadBalancersRequest(Builder builder) {
        super(builder);
        this.addressIpVersion = builder.addressIpVersion;
        this.addressType = builder.addressType;
        this.DNSName = builder.DNSName;
        this.ipv6AddressType = builder.ipv6AddressType;
        this.loadBalancerBusinessStatus = builder.loadBalancerBusinessStatus;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.loadBalancerNames = builder.loadBalancerNames;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.loadBalancerType = builder.loadBalancerType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
        this.vpcIds = builder.vpcIds;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLoadBalancersRequest create() {
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
     * @return DNSName
     */
    public String getDNSName() {
        return this.DNSName;
    }

    /**
     * @return ipv6AddressType
     */
    public String getIpv6AddressType() {
        return this.ipv6AddressType;
    }

    /**
     * @return loadBalancerBusinessStatus
     */
    public String getLoadBalancerBusinessStatus() {
        return this.loadBalancerBusinessStatus;
    }

    /**
     * @return loadBalancerIds
     */
    public java.util.List<String> getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return loadBalancerNames
     */
    public java.util.List<String> getLoadBalancerNames() {
        return this.loadBalancerNames;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
    }

    /**
     * @return loadBalancerType
     */
    public String getLoadBalancerType() {
        return this.loadBalancerType;
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
     * @return vpcIds
     */
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListLoadBalancersRequest, Builder> {
        private String addressIpVersion; 
        private String addressType; 
        private String DNSName; 
        private String ipv6AddressType; 
        private String loadBalancerBusinessStatus; 
        private java.util.List<String> loadBalancerIds; 
        private java.util.List<String> loadBalancerNames; 
        private String loadBalancerStatus; 
        private String loadBalancerType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 
        private java.util.List<String> vpcIds; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListLoadBalancersRequest request) {
            super(request);
            this.addressIpVersion = request.addressIpVersion;
            this.addressType = request.addressType;
            this.DNSName = request.DNSName;
            this.ipv6AddressType = request.ipv6AddressType;
            this.loadBalancerBusinessStatus = request.loadBalancerBusinessStatus;
            this.loadBalancerIds = request.loadBalancerIds;
            this.loadBalancerNames = request.loadBalancerNames;
            this.loadBalancerStatus = request.loadBalancerStatus;
            this.loadBalancerType = request.loadBalancerType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vpcIds = request.vpcIds;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The IP version of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong>: IPv4</li>
         * <li><strong>DualStack</strong>: dual-stack</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.putQueryParameter("AddressIpVersion", addressIpVersion);
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The type of IPv4 address used by the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. The NLB instance can be accessed over the Internet.</li>
         * <li><strong>Intranet</strong>: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. The NLB instance can be accessed over the VPC where the NLB instance is deployed.</li>
         * </ul>
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
         * <p>The domain name of the NLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-wb7r6dlwetvt5j****.cn-hangzhou.nlb.aliyuncs.com</p>
         */
        public Builder DNSName(String DNSName) {
            this.putQueryParameter("DNSName", DNSName);
            this.DNSName = DNSName;
            return this;
        }

        /**
         * <p>The type of IPv6 address used by the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The NLB instance uses a public IP address. The domain name of the NLB instance is resolved to the public IP address. The NLB instance can be accessed over the Internet.</li>
         * <li><strong>Intranet</strong>: The NLB instance uses a private IP address. The domain name of the NLB instance is resolved to the private IP address. The NLB instance can be accessed over the VPC where the NLB instance is deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            this.putQueryParameter("Ipv6AddressType", ipv6AddressType);
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * <p>The business status of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal</strong>: The NLB instance is not working as expected.</li>
         * <li><strong>Normal</strong>: The NLB instance is working as expected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder loadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.putQueryParameter("LoadBalancerBusinessStatus", loadBalancerBusinessStatus);
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }

        /**
         * <p>The NLB instance IDs. You can specify up to 20 IDs in each call.</p>
         */
        public Builder loadBalancerIds(java.util.List<String> loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>The names of the NLB instances. You can specify up to 20 names in each call.</p>
         */
        public Builder loadBalancerNames(java.util.List<String> loadBalancerNames) {
            this.putQueryParameter("LoadBalancerNames", loadBalancerNames);
            this.loadBalancerNames = loadBalancerNames;
            return this;
        }

        /**
         * <p>The status of the NLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Inactive</strong>: The NLB instance is disabled. Listeners of an NLB instance in the Inactive state do not forward traffic.</li>
         * <li><strong>Active</strong>: The NLB instance is running.</li>
         * <li><strong>Provisioning</strong>: The NLB instance is being created.</li>
         * <li><strong>Configuring</strong>: The NLB instance is being modified.</li>
         * <li><strong>Deleting</strong>: The NLB instance is being deleted.</li>
         * <li><strong>Deleted</strong>: The NLB instance is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.putQueryParameter("LoadBalancerStatus", loadBalancerStatus);
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * <p>The type of the Server Load Balancer (SLB) instances. Set the value to <strong>network</strong>, which specifies NLB.</p>
         * 
         * <strong>example:</strong>
         * <p>network</p>
         */
        public Builder loadBalancerType(String loadBalancerType) {
            this.putQueryParameter("LoadBalancerType", loadBalancerType);
            this.loadBalancerType = loadBalancerType;
            return this;
        }

        /**
         * <p>The number of entries to return in each call. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token used to specify a particular page of results. Valid values:</p>
         * <ul>
         * <li>Leave this parameter empty for the first query or the only query.</li>
         * <li>Set this parameter to the value of NextToken obtained from the previous query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
            this.putQueryParameter("RegionId", regionId);
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
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags of the NLB instance.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The IDs of the virtual private clouds (VPCs) where the NLB instances are deployed. You can specify up to 10 VPC IDs in each call.</p>
         */
        public Builder vpcIds(java.util.List<String> vpcIds) {
            this.putQueryParameter("VpcIds", vpcIds);
            this.vpcIds = vpcIds;
            return this;
        }

        /**
         * <p>The ID of the zone. You can call the <a href="https://help.aliyun.com/document_detail/443890.html">DescribeZones</a> operation to query the most recent zone list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListLoadBalancersRequest build() {
            return new ListLoadBalancersRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListLoadBalancersRequest} extends {@link TeaModel}
     *
     * <p>ListLoadBalancersRequest</p>
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
             * <p>The key of the tag. You can specify up to 20 tags. The tag key cannot be an empty string.</p>
             * <p>It must be 1 to 64 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. You can specify up to 20 tags. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>ValueTest</p>
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
