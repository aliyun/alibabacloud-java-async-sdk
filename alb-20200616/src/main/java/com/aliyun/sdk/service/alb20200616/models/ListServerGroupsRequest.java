// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ServerGroupIds")
    private java.util.List < String > serverGroupIds;

    @Query
    @NameInMap("ServerGroupNames")
    private java.util.List < String > serverGroupNames;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private ListServerGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverGroupIds = builder.serverGroupIds;
        this.serverGroupNames = builder.serverGroupNames;
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
        private String resourceGroupId; 
        private java.util.List < String > serverGroupIds; 
        private java.util.List < String > serverGroupNames; 
        private java.util.List < Tag> tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListServerGroupsRequest response) {
            super(response);
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.resourceGroupId = response.resourceGroupId;
            this.serverGroupIds = response.serverGroupIds;
            this.serverGroupNames = response.serverGroupNames;
            this.tag = response.tag;
            this.vpcId = response.vpcId;
        } 

        /**
         * 查询数量
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页查询标识
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 资源组ID
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * 服务器组Id列表
         */
        public Builder serverGroupIds(java.util.List < String > serverGroupIds) {
            this.putQueryParameter("ServerGroupIds", serverGroupIds);
            this.serverGroupIds = serverGroupIds;
            return this;
        }

        /**
         * 服务器组名称
         */
        public Builder serverGroupNames(java.util.List < String > serverGroupNames) {
            this.putQueryParameter("ServerGroupNames", serverGroupNames);
            this.serverGroupNames = serverGroupNames;
            return this;
        }

        /**
         * Tag列表
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * VpcId
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
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
             * 标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值
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
