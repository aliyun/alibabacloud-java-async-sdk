// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link ListAnycastEipAddressesRequest} extends {@link RequestModel}
 *
 * <p>ListAnycastEipAddressesRequest</p>
 */
public class ListAnycastEipAddressesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnycastEipAddress")
    private String anycastEipAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnycastId")
    private String anycastId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnycastIds")
    private java.util.List<String> anycastIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindInstanceIds")
    private java.util.List<String> bindInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessStatus")
    private String businessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceLocation")
    private String serviceLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListAnycastEipAddressesRequest(Builder builder) {
        super(builder);
        this.anycastEipAddress = builder.anycastEipAddress;
        this.anycastId = builder.anycastId;
        this.anycastIds = builder.anycastIds;
        this.bindInstanceIds = builder.bindInstanceIds;
        this.businessStatus = builder.businessStatus;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceLocation = builder.serviceLocation;
        this.status = builder.status;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnycastEipAddressesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastEipAddress
     */
    public String getAnycastEipAddress() {
        return this.anycastEipAddress;
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return anycastIds
     */
    public java.util.List<String> getAnycastIds() {
        return this.anycastIds;
    }

    /**
     * @return bindInstanceIds
     */
    public java.util.List<String> getBindInstanceIds() {
        return this.bindInstanceIds;
    }

    /**
     * @return businessStatus
     */
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return serviceLocation
     */
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListAnycastEipAddressesRequest, Builder> {
        private String anycastEipAddress; 
        private String anycastId; 
        private java.util.List<String> anycastIds; 
        private java.util.List<String> bindInstanceIds; 
        private String businessStatus; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String resourceGroupId; 
        private String serviceLocation; 
        private String status; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListAnycastEipAddressesRequest request) {
            super(request);
            this.anycastEipAddress = request.anycastEipAddress;
            this.anycastId = request.anycastId;
            this.anycastIds = request.anycastIds;
            this.bindInstanceIds = request.bindInstanceIds;
            this.businessStatus = request.businessStatus;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceLocation = request.serviceLocation;
            this.status = request.status;
            this.tags = request.tags;
        } 

        /**
         * <p>The IP address that is allocated to the Anycast EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>139.95.XX.XX</p>
         */
        public Builder anycastEipAddress(String anycastEipAddress) {
            this.putQueryParameter("AnycastEipAddress", anycastEipAddress);
            this.anycastEipAddress = anycastEipAddress;
            return this;
        }

        /**
         * <p>The ID of the Anycast EIP.</p>
         * <blockquote>
         * <p> To ensure the accuracy of the query result, we do not recommend that you specify <strong>AnycastIds</strong> and <strong>AnycastId</strong> at the same time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aeip-2zeerraiwb7ujsxdc****</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>The IDs of Anycast EIPs.</p>
         * <p>You can enter at most 50 Anycast EIP IDs.</p>
         * <blockquote>
         * <p> To ensure the accuracy of the query result, we do not recommend that you specify <strong>AnycastIds</strong> and <strong>AnycastId</strong> at the same time.</p>
         * </blockquote>
         */
        public Builder anycastIds(java.util.List<String> anycastIds) {
            this.putQueryParameter("AnycastIds", anycastIds);
            this.anycastIds = anycastIds;
            return this;
        }

        /**
         * <p>The IDs of the cloud resources with which the Anycast EIPs are associated.</p>
         * <p>You can enter at most 100 cloud resource IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zebb08phyczzawe****</p>
         */
        public Builder bindInstanceIds(java.util.List<String> bindInstanceIds) {
            this.putQueryParameter("BindInstanceIds", bindInstanceIds);
            this.bindInstanceIds = bindInstanceIds;
            return this;
        }

        /**
         * <p>The service status of the Anycast EIP. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder businessStatus(String businessStatus) {
            this.putQueryParameter("BusinessStatus", businessStatus);
            this.businessStatus = businessStatus;
            return this;
        }

        /**
         * <p>The billing method of the Anycast EIP.</p>
         * <p>Set the value to <strong>PostPaid</strong>, which specifies the pay-as-you-go billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The metering method of the Anycast EIP.</p>
         * <p>Set the value to <strong>PayByTraffic</strong>, which specifies the pay-by-data-transfer metering method.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>20 to 100</strong>. Default value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The name of the Anycast EIP.</p>
         * <p>The name must be 0 to 128 characters in length, and can contain digits, hyphens (-), and underscores (_). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>You do not need to specify this parameter for the first request.</li>
         * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzthsmwsnfuni</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The access area of the Anycast EIP.</p>
         * <p>Set the value to <strong>international</strong>, which specifies the regions outside the Chinese mainland.</p>
         * 
         * <strong>example:</strong>
         * <p>international</p>
         */
        public Builder serviceLocation(String serviceLocation) {
            this.putQueryParameter("ServiceLocation", serviceLocation);
            this.serviceLocation = serviceLocation;
            return this;
        }

        /**
         * <p>The status of the Anycast EIP. Valid values:</p>
         * <ul>
         * <li><strong>Associating</strong></li>
         * <li><strong>Unassociating</strong></li>
         * <li><strong>Allocated</strong></li>
         * <li><strong>Associated</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Releasing</strong></li>
         * <li><strong>Released</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Associated</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListAnycastEipAddressesRequest build() {
            return new ListAnycastEipAddressesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListAnycastEipAddressesRequest} extends {@link TeaModel}
     *
     * <p>ListAnycastEipAddressesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the resource. You can specify up to 20 tag keys. You cannot specify empty strings as tag keys.</p>
             * <p>The key can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The key must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <blockquote>
             * <p> You must specify at least one of <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the resource. You can specify up to 20 tag values. It can be an empty string.</p>
             * <p>The value cannot exceed 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). The value must start with a letter but cannot start with <code>aliyun</code> or <code>acs:</code>. The value cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <blockquote>
             * <p> You must specify at least one of <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
