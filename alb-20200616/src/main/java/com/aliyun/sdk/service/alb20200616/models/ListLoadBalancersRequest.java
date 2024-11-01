// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @com.aliyun.core.annotation.NameInMap("LoadBalancerBussinessStatus")
    private String loadBalancerBussinessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private java.util.List < String > loadBalancerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerNames")
    private java.util.List < String > loadBalancerNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcIds")
    private java.util.List < String > vpcIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private ListLoadBalancersRequest(Builder builder) {
        super(builder);
        this.addressIpVersion = builder.addressIpVersion;
        this.addressType = builder.addressType;
        this.DNSName = builder.DNSName;
        this.ipv6AddressType = builder.ipv6AddressType;
        this.loadBalancerBussinessStatus = builder.loadBalancerBussinessStatus;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.loadBalancerNames = builder.loadBalancerNames;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.payType = builder.payType;
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
     * @return loadBalancerBussinessStatus
     */
    public String getLoadBalancerBussinessStatus() {
        return this.loadBalancerBussinessStatus;
    }

    /**
     * @return loadBalancerIds
     */
    public java.util.List < String > getLoadBalancerIds() {
        return this.loadBalancerIds;
    }

    /**
     * @return loadBalancerNames
     */
    public java.util.List < String > getLoadBalancerNames() {
        return this.loadBalancerNames;
    }

    /**
     * @return loadBalancerStatus
     */
    public String getLoadBalancerStatus() {
        return this.loadBalancerStatus;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
     * @return vpcIds
     */
    public java.util.List < String > getVpcIds() {
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
        private String loadBalancerBussinessStatus; 
        private java.util.List < String > loadBalancerIds; 
        private java.util.List < String > loadBalancerNames; 
        private String loadBalancerStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String payType; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 
        private java.util.List < String > vpcIds; 
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
            this.loadBalancerBussinessStatus = request.loadBalancerBussinessStatus;
            this.loadBalancerIds = request.loadBalancerIds;
            this.loadBalancerNames = request.loadBalancerNames;
            this.loadBalancerStatus = request.loadBalancerStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.payType = request.payType;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
            this.vpcIds = request.vpcIds;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong></li>
         * <li><strong>DualStack</strong></li>
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
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</li>
         * <li><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. In this case, the ALB instance can be accessed over the VPC where the ALB instance is deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-95qnr2itwu9orb****.cn-hangzhou.alb.aliyuncs.com</p>
         */
        public Builder DNSName(String DNSName) {
            this.putQueryParameter("DNSName", DNSName);
            this.DNSName = DNSName;
            return this;
        }

        /**
         * <p>The type of IPv6 address that is used by the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Internet</strong>: The ALB instance uses a public IP address. The domain name of the ALB instance is resolved to the public IP address. Therefore, the ALB instance can be accessed over the Internet.</li>
         * <li><strong>Intranet</strong>: The ALB instance uses a private IP address. The domain name of the ALB instance is resolved to the private IP address. Therefore, the ALB instance can be accessed over the VPC in which the ALB instance is deployed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder ipv6AddressType(String ipv6AddressType) {
            this.putQueryParameter("Ipv6AddressType", ipv6AddressType);
            this.ipv6AddressType = ipv6AddressType;
            return this;
        }

        /**
         * <p>The service status of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal</strong></li>
         * <li><strong>Normal</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder loadBalancerBussinessStatus(String loadBalancerBussinessStatus) {
            this.putQueryParameter("LoadBalancerBussinessStatus", loadBalancerBussinessStatus);
            this.loadBalancerBussinessStatus = loadBalancerBussinessStatus;
            return this;
        }

        /**
         * <p>The instance IDs. You can specify at most 20 ALB instance IDs.</p>
         */
        public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
            this.putQueryParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>The instance names. You can specify at most 10 instance names.</p>
         */
        public Builder loadBalancerNames(java.util.List < String > loadBalancerNames) {
            this.putQueryParameter("LoadBalancerNames", loadBalancerNames);
            this.loadBalancerNames = loadBalancerNames;
            return this;
        }

        /**
         * <p>The status of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>Inactive</strong>: The ALB instance is disabled. The listeners do not forward traffic.</li>
         * <li><strong>Active</strong>: The ALB instance is running.</li>
         * <li><strong>Provisioning</strong>: The ALB instance is being created.</li>
         * <li><strong>Configuring</strong>: The ALB instance is being modified.</li>
         * <li><strong>CreateFailed</strong>: The system failed to create the ALB instance. In this case, you are not charged for the ALB instance. You can only delete the ALB instance. By default, the system deletes the ALB instances that are in the CreateFailed state within the last day.</li>
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
         * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
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
         * <p>The billing method of the ALB instance. Set the value to</p>
         * <p><strong>PostPay</strong>, which specifies the pay-as-you-go billing method. This is the default value.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags added to the ALB instance.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the ALB instance belongs. You can specify at most 10 VPC IDs.</p>
         */
        public Builder vpcIds(java.util.List < String > vpcIds) {
            this.putQueryParameter("VpcIds", vpcIds);
            this.vpcIds = vpcIds;
            return this;
        }

        /**
         * <p>The ID of the zone where the ALB instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/189196.html">DescribeZones</a> operation to query zones.</p>
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

            /**
             * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>alueTest</p>
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
