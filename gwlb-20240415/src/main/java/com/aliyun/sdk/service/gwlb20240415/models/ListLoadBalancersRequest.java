// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415.models;

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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressIpVersion")
    private String addressIpVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerBusinessStatus")
    private String loadBalancerBusinessStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
    private java.util.List<String> loadBalancerIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerNames")
    private java.util.List<String> loadBalancerNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerStatus")
    private String loadBalancerStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficMode")
    private String trafficMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcIds")
    private java.util.List<String> vpcIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private java.util.List<String> zoneIds;

    private ListLoadBalancersRequest(Builder builder) {
        super(builder);
        this.addressIpVersion = builder.addressIpVersion;
        this.loadBalancerBusinessStatus = builder.loadBalancerBusinessStatus;
        this.loadBalancerIds = builder.loadBalancerIds;
        this.loadBalancerNames = builder.loadBalancerNames;
        this.loadBalancerStatus = builder.loadBalancerStatus;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.skip = builder.skip;
        this.tag = builder.tag;
        this.trafficMode = builder.trafficMode;
        this.vpcIds = builder.vpcIds;
        this.zoneIds = builder.zoneIds;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return trafficMode
     */
    public String getTrafficMode() {
        return this.trafficMode;
    }

    /**
     * @return vpcIds
     */
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    /**
     * @return zoneIds
     */
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder extends Request.Builder<ListLoadBalancersRequest, Builder> {
        private String addressIpVersion; 
        private String loadBalancerBusinessStatus; 
        private java.util.List<String> loadBalancerIds; 
        private java.util.List<String> loadBalancerNames; 
        private String loadBalancerStatus; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceGroupId; 
        private Integer skip; 
        private java.util.List<Tag> tag; 
        private String trafficMode; 
        private java.util.List<String> vpcIds; 
        private java.util.List<String> zoneIds; 

        private Builder() {
            super();
        } 

        private Builder(ListLoadBalancersRequest request) {
            super(request);
            this.addressIpVersion = request.addressIpVersion;
            this.loadBalancerBusinessStatus = request.loadBalancerBusinessStatus;
            this.loadBalancerIds = request.loadBalancerIds;
            this.loadBalancerNames = request.loadBalancerNames;
            this.loadBalancerStatus = request.loadBalancerStatus;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.skip = request.skip;
            this.tag = request.tag;
            this.trafficMode = request.trafficMode;
            this.vpcIds = request.vpcIds;
            this.zoneIds = request.zoneIds;
        } 

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4</li>
         * </ul>
         * <p>Enumeration values:</p>
         * <ul>
         * <li>IPv4: IPv4</li>
         * <li>DualStack: DualStack</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder addressIpVersion(String addressIpVersion) {
            this.putBodyParameter("AddressIpVersion", addressIpVersion);
            this.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * <p>The business status of the GWLB instance. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: running as expected</li>
         * <li><strong>FinancialLocked</strong>: locked due to overdue payments</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder loadBalancerBusinessStatus(String loadBalancerBusinessStatus) {
            this.putBodyParameter("LoadBalancerBusinessStatus", loadBalancerBusinessStatus);
            this.loadBalancerBusinessStatus = loadBalancerBusinessStatus;
            return this;
        }

        /**
         * <p>The GWLB instance IDs. You can query at most 20 GWLB instances in each call.</p>
         */
        public Builder loadBalancerIds(java.util.List<String> loadBalancerIds) {
            this.putBodyParameter("LoadBalancerIds", loadBalancerIds);
            this.loadBalancerIds = loadBalancerIds;
            return this;
        }

        /**
         * <p>The GWLB instance names. You can specify at most 20 GWLB instance names in each call.</p>
         */
        public Builder loadBalancerNames(java.util.List<String> loadBalancerNames) {
            this.putBodyParameter("LoadBalancerNames", loadBalancerNames);
            this.loadBalancerNames = loadBalancerNames;
            return this;
        }

        /**
         * <p>The GWLB instance status. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: The GWLB instance is running.</li>
         * <li><strong>Inactive</strong>: The GWLB instance is disabled. Listeners of GWLB instances in the Inactive state do not forward traffic.</li>
         * <li><strong>Provisioning</strong>: The GWLB instance is being created.</li>
         * <li><strong>Configuring</strong>: The GWLB instance is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder loadBalancerStatus(String loadBalancerStatus) {
            this.putBodyParameter("LoadBalancerStatus", loadBalancerStatus);
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 1000. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WyJyb290IiwibiIsIm4iLDEsMCwxNjg1MDY1NTgyNzYwLCI2NDcwMGY2ZTc2Zjc0MWFiZGEyZjQyNzc4ZDk2MmJkOTk3ZGZmM2Nm****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2htf5qsyrn****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The number of entries to be skipped in the call.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder skip(Integer skip) {
            this.putBodyParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * <p>The tags. You can specify at most 20 tags in each call.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TrafficMode.
         */
        public Builder trafficMode(String trafficMode) {
            this.putBodyParameter("TrafficMode", trafficMode);
            this.trafficMode = trafficMode;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) IDs. You can query at most 20 IDs in each call.</p>
         */
        public Builder vpcIds(java.util.List<String> vpcIds) {
            this.putBodyParameter("VpcIds", vpcIds);
            this.vpcIds = vpcIds;
            return this;
        }

        /**
         * <p>The zone IDs. You can query at most 20 zone IDs in each call.</p>
         */
        public Builder zoneIds(java.util.List<String> zoneIds) {
            this.putBodyParameter("ZoneIds", zoneIds);
            this.zoneIds = zoneIds;
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
             * <p>The tag key The tag key cannot be an empty string.</p>
             * <p>The tag key can be up to 128 characters in length. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testTagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value The tag value can be up to 256 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>testTagValue</p>
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
