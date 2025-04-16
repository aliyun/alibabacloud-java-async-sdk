// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link ListTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTagResourcesRequest</p>
 */
public class ListTagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagFilter")
    private java.util.List<TagFilter> tagFilter;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
        this.tagFilter = builder.tagFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tagFilter
     */
    public java.util.List<TagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private String sourceRegionId; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List<String> resourceId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private java.util.List<Tag> tag; 
        private java.util.List<TagFilter> tagFilter; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
            this.tagFilter = request.tagFilter;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the resource. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
         * <p>The resource IDs. Valid values of N: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1j6qtvdm8w0z1o****</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li>instance: ECS instance</li>
         * <li>disk: disk</li>
         * <li>snapshot: snapshot</li>
         * <li>image: image</li>
         * <li>securitygroup: security group</li>
         * <li>volume: storage volume</li>
         * <li>eni: elastic network interface (ENI)</li>
         * <li>ddh: dedicated host</li>
         * <li>ddhcluster: dedicated host cluster</li>
         * <li>keypair: SSH key pair</li>
         * <li>launchtemplate: launch template</li>
         * <li>reservedinstance: reserved instance</li>
         * <li>snapshotpolicy: automatic snapshot policy</li>
         * <li>elasticityassurance: elasticity assurance</li>
         * <li>capacityreservation: capacity reservation</li>
         * <li>command: Cloud Assistant command</li>
         * <li>invocation: Cloud Assistant command execution result or file delivery result</li>
         * <li>activation: activation code for a Cloud Assistant managed instance</li>
         * <li>managedinstance: Cloud Assistant managed instance</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The regular expressions used to filter tags.</p>
         */
        public Builder tagFilter(java.util.List<TagFilter> tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        @Override
        public ListTagResourcesRequest build() {
            return new ListTagResourcesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTagResourcesRequest} extends {@link TeaModel}
     *
     * <p>ListTagResourcesRequest</p>
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
             * <p>The key of tag N used for exact search of ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
             * <p>Methods of using the <code>Tag.N</code> parameter pair (Tag.N.Key and Tag.N.Value):</p>
             * <ul>
             * <li><p>Method 1: Use this parameter pair for exact search of ECS resources that have specified tags added. Each tag is a key-value pair.</p>
             * <ul>
             * <li>If you specify only <code>Tag.N.Key</code>, all ECS resources whose tags contain the specified tag key are returned.</li>
             * <li>If you specify only <code>Tag.N.Value</code>, the <code>InvalidParameter.TagValue</code> error is returned.</li>
             * <li>If you specify multiple tag key-value pairs, only the ECS resources that have all these tag key-value pairs added are returned.</li>
             * </ul>
             * </li>
             * <li><p>Method 2: Use this parameter pair to query resource information of a non-default resource group. Set <code>Key</code> to <code>acs:rm:rgId</code> and <code>Value</code> to the ID of a resource group.</p>
             * <ul>
             * <li>If you set <code>Key</code> to <code>acs:rm:rgId</code>, you must set <code>Value</code> to the ID of a non-default resource group. If you set Value to the ID of the default resource group, an error message is returned.</li>
             * <li>If you set <code>Key</code> to <code>acs:rm:rgId</code>, you cannot specify other Tag.N parameter pairs. If you specify multiple <code>Tag.N</code> parameter pairs to query resource groups and resources at the same time, an error message is returned.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N used for exact search of ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
             * <blockquote>
             * <p>When Key is set to <code>acs:rm:rgId</code>, you can set Value only to the ID of a non-default resource group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link ListTagResourcesRequest} extends {@link TeaModel}
     *
     * <p>ListTagResourcesRequest</p>
     */
    public static class TagFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValues")
        private java.util.List<String> tagValues;

        private TagFilter(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String tagKey; 
            private java.util.List<String> tagValues; 

            private Builder() {
            } 

            private Builder(TagFilter model) {
                this.tagKey = model.tagKey;
                this.tagValues = model.tagValues;
            } 

            /**
             * <p>The key of tag N used for fuzzy search of ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 5.</p>
             * <p>The <code>TagFilter.N</code> parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) is used for fuzzy search of ECS resources that have specified tags added. In the specified tags, a single tag key may correspond to one or more tag values. Fuzzy search may have a latency of 2 seconds. A fuzzy search can return a result set of entries about a maximum of 5,000 resources.</p>
             * <ul>
             * <li>When you use <code>TagFilter.N.TagKey</code> for fuzzy search of ECS resources, you must leave <code>TagFilter.N.TagValues.N</code> empty. For example, to query ECS resources whose tags contain the <code>environment</code> tag key, you can set <code>TagFilter.1.TagKey</code> to <code>env*</code> for prefix search, <code>*env*</code> for infix search, or <code>env</code> for exact search, but you must leave <code>TagFilter.1.TagValues</code> empty.</li>
             * <li>When you use <code>TagFilter.N.TagValues.N</code> for fuzzy search of ECS resources, you must set <code>TagFilter.N.TagKey</code> to an exact value. For example, to query ECS resources that have a tag composed of the <code>env</code> tag key and the <code>product</code> tag value, you must set <code>TagFilter.1.TagKey</code> to <code>env</code> and can set <code>TagFilter.1.TagValues.1</code> to <code>proc*</code> for prefix search, to <code>*proc*</code> for infix search, or to <code>proc</code> for exact search. Only one of the preceding search methods can be used for each tag key (<code>TagFilter.N.TagKey</code>). If multiple search methods are configured for a tag key, the first search method prevails.</li>
             * <li>If you specify multiple tag keys, only the ECS resources that have all the specified tag keys added are returned.</li>
             * <li>If you specify a tag key that corresponds to multiple tag values, all the ECS resources that have one or more of these tag key-value pairs added are returned.</li>
             * </ul>
             * <blockquote>
             * <p>The <code>TagFilter.N</code> parameter pair (TagFilter.N.TagKey and TagFilter.N.TagValues.N) cannot be used together with the <code>Tag.N</code> parameter pair (Tag.N.Key and Tag.N.Value). Otherwise, an error message is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The values of tag N used for fuzzy search of ECS resources. The tag values must be 1 to 128 characters in length. Valid values of N: 1 to 5. For more information, see the description of <code>TagFilter.N.TagKey</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestTagFilter</p>
             */
            public Builder tagValues(java.util.List<String> tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
