// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVirtualPhysicalConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListVirtualPhysicalConnectionsRequest</p>
 */
public class ListVirtualPhysicalConnectionsRequest extends Request {
    @Query
    @NameInMap("IsConfirmed")
    private Boolean isConfirmed;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PhysicalConnectionId")
    private String physicalConnectionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("VirtualPhysicalConnectionAliUids")
    private java.util.List < String > virtualPhysicalConnectionAliUids;

    @Query
    @NameInMap("VirtualPhysicalConnectionBusinessStatus")
    private String virtualPhysicalConnectionBusinessStatus;

    @Query
    @NameInMap("VirtualPhysicalConnectionIds")
    private java.util.List < String > virtualPhysicalConnectionIds;

    @Query
    @NameInMap("VirtualPhysicalConnectionStatuses")
    private java.util.List < String > virtualPhysicalConnectionStatuses;

    @Query
    @NameInMap("VlanIds")
    private java.util.List < String > vlanIds;

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
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return virtualPhysicalConnectionAliUids
     */
    public java.util.List < String > getVirtualPhysicalConnectionAliUids() {
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
    public java.util.List < String > getVirtualPhysicalConnectionIds() {
        return this.virtualPhysicalConnectionIds;
    }

    /**
     * @return virtualPhysicalConnectionStatuses
     */
    public java.util.List < String > getVirtualPhysicalConnectionStatuses() {
        return this.virtualPhysicalConnectionStatuses;
    }

    /**
     * @return vlanIds
     */
    public java.util.List < String > getVlanIds() {
        return this.vlanIds;
    }

    public static final class Builder extends Request.Builder<ListVirtualPhysicalConnectionsRequest, Builder> {
        private Boolean isConfirmed; 
        private Integer maxResults; 
        private String nextToken; 
        private String physicalConnectionId; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 
        private java.util.List < String > virtualPhysicalConnectionAliUids; 
        private String virtualPhysicalConnectionBusinessStatus; 
        private java.util.List < String > virtualPhysicalConnectionIds; 
        private java.util.List < String > virtualPhysicalConnectionStatuses; 
        private java.util.List < String > vlanIds; 

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
         * Specifies whether the hosted connection is accepted by the tenant. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder isConfirmed(Boolean isConfirmed) {
            this.putQueryParameter("IsConfirmed", isConfirmed);
            this.isConfirmed = isConfirmed;
            return this;
        }

        /**
         * The number of entries per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   You do not need to specify this parameter for the first request.
         * *   You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the Express Connect circuit over which the hosted connections are created.
         * <p>
         * 
         * Express Connect circuits in this topic refer to Express Connect circuits over which hosted connections are created.
         */
        public Builder physicalConnectionId(String physicalConnectionId) {
            this.putQueryParameter("PhysicalConnectionId", physicalConnectionId);
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }

        /**
         * The region ID of the hosted connection.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the hosted connection belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tag list.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The information about the Alibaba Cloud account that owns the hosted connection.
         */
        public Builder virtualPhysicalConnectionAliUids(java.util.List < String > virtualPhysicalConnectionAliUids) {
            this.putQueryParameter("VirtualPhysicalConnectionAliUids", virtualPhysicalConnectionAliUids);
            this.virtualPhysicalConnectionAliUids = virtualPhysicalConnectionAliUids;
            return this;
        }

        /**
         * The business status of the hosted connection. Valid values:
         * <p>
         * 
         * *   **Normal**
         * *   **FinancialLocked**
         * *   **SecurityLocked**
         */
        public Builder virtualPhysicalConnectionBusinessStatus(String virtualPhysicalConnectionBusinessStatus) {
            this.putQueryParameter("VirtualPhysicalConnectionBusinessStatus", virtualPhysicalConnectionBusinessStatus);
            this.virtualPhysicalConnectionBusinessStatus = virtualPhysicalConnectionBusinessStatus;
            return this;
        }

        /**
         * The information about the hosted connection.
         */
        public Builder virtualPhysicalConnectionIds(java.util.List < String > virtualPhysicalConnectionIds) {
            this.putQueryParameter("VirtualPhysicalConnectionIds", virtualPhysicalConnectionIds);
            this.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
            return this;
        }

        /**
         * The business status of the hosted connection.
         */
        public Builder virtualPhysicalConnectionStatuses(java.util.List < String > virtualPhysicalConnectionStatuses) {
            this.putQueryParameter("VirtualPhysicalConnectionStatuses", virtualPhysicalConnectionStatuses);
            this.virtualPhysicalConnectionStatuses = virtualPhysicalConnectionStatuses;
            return this;
        }

        /**
         * The VLAN ID of the hosted connection.
         */
        public Builder vlanIds(java.util.List < String > vlanIds) {
            this.putQueryParameter("VlanIds", vlanIds);
            this.vlanIds = vlanIds;
            return this;
        }

        @Override
        public ListVirtualPhysicalConnectionsRequest build() {
            return new ListVirtualPhysicalConnectionsRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * The key of tag N to add to the resource. You can specify at most 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * It can be up to 64 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the resource. You can specify at most 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * It can be up to 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
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
