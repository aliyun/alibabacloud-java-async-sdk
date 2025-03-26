// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListVirtualPhysicalConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListVirtualPhysicalConnectionsRequest</p>
 */
public class ListVirtualPhysicalConnectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsConfirmed")
    private Boolean isConfirmed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhysicalConnectionId")
    private String physicalConnectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnectionAliUids")
    private java.util.List<String> virtualPhysicalConnectionAliUids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnectionBusinessStatus")
    private String virtualPhysicalConnectionBusinessStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnectionIds")
    private java.util.List<String> virtualPhysicalConnectionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VirtualPhysicalConnectionStatuses")
    private java.util.List<String> virtualPhysicalConnectionStatuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlanIds")
    private java.util.List<String> vlanIds;

    private ListVirtualPhysicalConnectionsRequest(Builder builder) {
        super(builder);
        this.isConfirmed = builder.isConfirmed;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.physicalConnectionId = builder.physicalConnectionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.virtualPhysicalConnectionAliUids = builder.virtualPhysicalConnectionAliUids;
        this.virtualPhysicalConnectionBusinessStatus = builder.virtualPhysicalConnectionBusinessStatus;
        this.virtualPhysicalConnectionIds = builder.virtualPhysicalConnectionIds;
        this.virtualPhysicalConnectionStatuses = builder.virtualPhysicalConnectionStatuses;
        this.vlanIds = builder.vlanIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualPhysicalConnectionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isConfirmed
     */
    public Boolean getIsConfirmed() {
        return this.isConfirmed;
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
     * @return physicalConnectionId
     */
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return virtualPhysicalConnectionAliUids
     */
    public java.util.List<String> getVirtualPhysicalConnectionAliUids() {
        return this.virtualPhysicalConnectionAliUids;
    }

    /**
     * @return virtualPhysicalConnectionBusinessStatus
     */
    public String getVirtualPhysicalConnectionBusinessStatus() {
        return this.virtualPhysicalConnectionBusinessStatus;
    }

    /**
     * @return virtualPhysicalConnectionIds
     */
    public java.util.List<String> getVirtualPhysicalConnectionIds() {
        return this.virtualPhysicalConnectionIds;
    }

    /**
     * @return virtualPhysicalConnectionStatuses
     */
    public java.util.List<String> getVirtualPhysicalConnectionStatuses() {
        return this.virtualPhysicalConnectionStatuses;
    }

    /**
     * @return vlanIds
     */
    public java.util.List<String> getVlanIds() {
        return this.vlanIds;
    }

    public static final class Builder extends Request.Builder<ListVirtualPhysicalConnectionsRequest, Builder> {
        private Boolean isConfirmed; 
        private Integer maxResults; 
        private String nextToken; 
        private String physicalConnectionId; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private java.util.List<String> virtualPhysicalConnectionAliUids; 
        private String virtualPhysicalConnectionBusinessStatus; 
        private java.util.List<String> virtualPhysicalConnectionIds; 
        private java.util.List<String> virtualPhysicalConnectionStatuses; 
        private java.util.List<String> vlanIds; 

        private Builder() {
            super();
        } 

        private Builder(ListVirtualPhysicalConnectionsRequest request) {
            super(request);
            this.isConfirmed = request.isConfirmed;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.physicalConnectionId = request.physicalConnectionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.virtualPhysicalConnectionAliUids = request.virtualPhysicalConnectionAliUids;
            this.virtualPhysicalConnectionBusinessStatus = request.virtualPhysicalConnectionBusinessStatus;
            this.virtualPhysicalConnectionIds = request.virtualPhysicalConnectionIds;
            this.virtualPhysicalConnectionStatuses = request.virtualPhysicalConnectionStatuses;
            this.vlanIds = request.vlanIds;
        } 

        /**
         * <p>Specifies whether the hosted connection is accepted by the tenant. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isConfirmed(Boolean isConfirmed) {
            this.putQueryParameter("IsConfirmed", isConfirmed);
            this.isConfirmed = isConfirmed;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
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
         * <li>You must specify the token that is obtained from the previous query as the value of NextToken.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the Express Connect circuit over which the hosted connections are created.</p>
         * <p>Express Connect circuits in this topic refer to Express Connect circuits over which hosted connections are created.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1ciz7ekd2grn1as****</p>
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * <p>The region ID of the hosted connection.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the hosted connection belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tag list.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The information about the Alibaba Cloud account that owns the hosted connection.</p>
         * 
         * <strong>example:</strong>
         * <p>189xxx</p>
         */
        public Builder virtualPhysicalConnectionAliUids(java.util.List<String> virtualPhysicalConnectionAliUids) {
            this.putQueryParameter("VirtualPhysicalConnectionAliUids", virtualPhysicalConnectionAliUids);
            this.virtualPhysicalConnectionAliUids = virtualPhysicalConnectionAliUids;
            return this;
        }

        /**
         * <p>The business status of the hosted connection. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * <li><strong>SecurityLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder virtualPhysicalConnectionBusinessStatus(String virtualPhysicalConnectionBusinessStatus) {
            this.putQueryParameter("VirtualPhysicalConnectionBusinessStatus", virtualPhysicalConnectionBusinessStatus);
            this.virtualPhysicalConnectionBusinessStatus = virtualPhysicalConnectionBusinessStatus;
            return this;
        }

        /**
         * <p>The information about the hosted connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxx</p>
         */
        public Builder virtualPhysicalConnectionIds(java.util.List<String> virtualPhysicalConnectionIds) {
            this.putQueryParameter("VirtualPhysicalConnectionIds", virtualPhysicalConnectionIds);
            this.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
            return this;
        }

        /**
         * <p>The business status of the hosted connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxx</p>
         */
        public Builder virtualPhysicalConnectionStatuses(java.util.List<String> virtualPhysicalConnectionStatuses) {
            this.putQueryParameter("VirtualPhysicalConnectionStatuses", virtualPhysicalConnectionStatuses);
            this.virtualPhysicalConnectionStatuses = virtualPhysicalConnectionStatuses;
            return this;
        }

        /**
         * <p>The VLAN ID of the hosted connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxx</p>
         */
        public Builder vlanIds(java.util.List<String> vlanIds) {
            this.putQueryParameter("VlanIds", vlanIds);
            this.vlanIds = vlanIds;
            return this;
        }

        @Override
        public ListVirtualPhysicalConnectionsRequest build() {
            return new ListVirtualPhysicalConnectionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListVirtualPhysicalConnectionsRequest} extends {@link TeaModel}
     *
     * <p>ListVirtualPhysicalConnectionsRequest</p>
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
             * <p>The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>It can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
             * <p>It can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
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
