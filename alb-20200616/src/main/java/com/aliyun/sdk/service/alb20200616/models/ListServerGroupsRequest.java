// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link ListServerGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListServerGroupsRequest</p>
 */
public class ListServerGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupIds")
    private java.util.List<String> serverGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupNames")
    private java.util.List<String> serverGroupNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerGroupType")
    private String serverGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ListServerGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serverGroupIds
     */
    public java.util.List<String> getServerGroupIds() {
        return this.serverGroupIds;
    }

    /**
     * @return serverGroupNames
     */
    public java.util.List<String> getServerGroupNames() {
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
    public java.util.List<Tag> getTag() {
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
        private java.util.List<String> serverGroupIds; 
        private java.util.List<String> serverGroupNames; 
        private String serverGroupType; 
        private java.util.List<Tag> tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListServerGroupsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceGroupId = request.resourceGroupId;
            this.serverGroupIds = request.serverGroupIds;
            this.serverGroupNames = request.serverGroupNames;
            this.serverGroupType = request.serverGroupType;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
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
         * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXG****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the server group belongs.</p>
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
         * <p>The server group IDs.</p>
         */
        public Builder serverGroupIds(java.util.List<String> serverGroupIds) {
            this.putQueryParameter("ServerGroupIds", serverGroupIds);
            this.serverGroupIds = serverGroupIds;
            return this;
        }

        /**
         * <p>The names of the server groups to be queried. You can specify at most 10 server group names.</p>
         */
        public Builder serverGroupNames(java.util.List<String> serverGroupNames) {
            this.putQueryParameter("ServerGroupNames", serverGroupNames);
            this.serverGroupNames = serverGroupNames;
            return this;
        }

        /**
         * <p>The server group type. Valid values:</p>
         * <ul>
         * <li><strong>Instance</strong>: instances, including ECS instances, ENIs, and elastic container instances.</li>
         * <li><strong>Ip</strong>: IP addresses.</li>
         * <li><strong>Fc</strong>: Function Compute</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder serverGroupType(String serverGroupType) {
            this.putQueryParameter("ServerGroupType", serverGroupType);
            this.serverGroupType = serverGroupType;
            return this;
        }

        /**
         * <p>The tags that are added to the server group. You can specify up to 10 tags in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15zckdt37pq72zv****</p>
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

    /**
     * 
     * {@link ListServerGroupsRequest} extends {@link TeaModel}
     *
     * <p>ListServerGroupsRequest</p>
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
             * <p>The tag key. You can specify up to 10 tag keys.</p>
             * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. You can specify up to 10 tag values.</p>
             * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
