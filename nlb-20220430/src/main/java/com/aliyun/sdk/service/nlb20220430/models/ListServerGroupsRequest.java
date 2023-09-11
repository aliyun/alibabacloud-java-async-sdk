// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListServerGroupsRequest</p>
 */
public class ListServerGroupsRequest extends Request {
    @Body
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("ServerGroupIds")
    private java.util.List < String > serverGroupIds;

    @Body
    @NameInMap("ServerGroupNames")
    private java.util.List < String > serverGroupNames;

    @Body
    @NameInMap("ServerGroupType")
    private String serverGroupType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Body
    @NameInMap("VpcId")
    private String vpcId;

    private ListServerGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverGroupIds = builder.serverGroupIds;
        this.serverGroupNames = builder.serverGroupNames;
        this.serverGroupType = builder.serverGroupType;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return serverGroupIds
     */
    public java.util.List < String > getServerGroupIds() {
        return this.serverGroupIds;
    }

    /**
     * @return serverGroupNames
     */
    public java.util.List < String > getServerGroupNames() {
        return this.serverGroupNames;
    }

    /**
     * @return serverGroupType
     */
    public String getServerGroupType() {
        return this.serverGroupType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListServerGroupsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < String > serverGroupIds; 
        private java.util.List < String > serverGroupNames; 
        private String serverGroupType; 
        private java.util.List < Tag> tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListServerGroupsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.serverGroupIds = request.serverGroupIds;
            this.serverGroupNames = request.serverGroupNames;
            this.serverGroupType = request.serverGroupType;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
        } 

        /**
         * The number of entries per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
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
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID of the NLB instance.
         * <p>
         * 
         * You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the server group belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The server group ID. You can specify up to 20 server group IDs in each call.
         */
        public Builder serverGroupIds(java.util.List < String > serverGroupIds) {
            this.putBodyParameter("ServerGroupIds", serverGroupIds);
            this.serverGroupIds = serverGroupIds;
            return this;
        }

        /**
         * The names of the server groups to be queried. You can specify up to 20 names in each call.
         */
        public Builder serverGroupNames(java.util.List < String > serverGroupNames) {
            this.putBodyParameter("ServerGroupNames", serverGroupNames);
            this.serverGroupNames = serverGroupNames;
            return this;
        }

        /**
         * The type of server group. Valid values:
         * <p>
         * 
         * *   **Instance** : allows you to add servers of the **Ecs**, **Ens**, and **Eci** types.
         * *   **Ip**: allows you to add servers by specifying IP addresses.
         */
        public Builder serverGroupType(String serverGroupType) {
            this.putBodyParameter("ServerGroupType", serverGroupType);
            this.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the server group belongs.
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListServerGroupsRequest build() {
            return new ListServerGroupsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag. You can specify up to 10 tag keys.
             * <p>
             * 
             * The tag key can be up to 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. You can specify up to 10 tag values.
             * <p>
             * 
             * The tag value can be up to 128 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
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
