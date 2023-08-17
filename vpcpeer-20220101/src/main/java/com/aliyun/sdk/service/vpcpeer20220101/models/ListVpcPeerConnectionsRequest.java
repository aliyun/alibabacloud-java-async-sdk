// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcPeerConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListVpcPeerConnectionsRequest</p>
 */
public class ListVpcPeerConnectionsRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Body
    @NameInMap("VpcId")
    private java.util.List < String > vpcId;

    private ListVpcPeerConnectionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcPeerConnectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return vpcId
     */
    public java.util.List < String > getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListVpcPeerConnectionsRequest, Builder> {
        private String instanceId; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 
        private java.util.List < String > vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListVpcPeerConnectionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.vpcId = request.vpcId;
        } 

        /**
         * The ID of the VPC peering connection that you want to query.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of entries to return per page. Valid values: **1** to **100**. Default value: **20**.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The name of the VPC peering connection that you want to query.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
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
         * The ID of the region where you want to query VPC peering connections.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * For more information about resource groups, see [What is a resource group?](~~94475~~)
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.
         */
        public Builder vpcId(java.util.List < String > vpcId) {
            String vpcIdShrink = shrink(vpcId, "VpcId", "simple");
            this.putBodyParameter("VpcId", vpcIdShrink);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListVpcPeerConnectionsRequest build() {
            return new ListVpcPeerConnectionsRequest(this);
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
             * The tag key. You can specify at most 20 tag keys. It cannot be an empty string.
             * <p>
             * 
             * The key cannot exceed 64 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. You can specify at most 20 tag values. The tag key can be an empty string.
             * <p>
             * 
             * The tag value cannot exceed 128 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.
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
