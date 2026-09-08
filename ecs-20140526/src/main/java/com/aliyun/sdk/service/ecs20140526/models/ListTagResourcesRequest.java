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
         * <p>The token used to start the next query.</p>
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
         * <p>The region ID of the resource. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
         * <p>The ECS resource ID. Valid values of N: 1 to 50.</p>
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
         * <li>instance: ECS instance.</li>
         * <li>disk: cloud disk.</li>
         * <li>snapshot: snapshot.</li>
         * <li>image: image.</li>
         * <li>securitygroup: security group.</li>
         * <li>volume: storage volume.</li>
         * <li>eni: Elastic Network Interface (ENI).</li>
         * <li>ddh: dedicated host.</li>
         * <li>ddhcluster: dedicated host cluster.</li>
         * <li>keypair: SSH key pair.</li>
         * <li>launchtemplate: launch template.</li>
         * <li>reservedinstance: reserved instance.</li>
         * <li>snapshotpolicy: automatic snapshot policy.</li>
         * <li>elasticityassurance: elasticity assurance.</li>
         * <li>capacityreservation: capacity reservation.</li>
         * <li>command: Cloud Assistant command.</li>
         * <li>invocation: Cloud Assistant command execution or file sending result.</li>
         * <li>activation: Cloud Assistant managed instance activation code.</li>
         * <li>managedinstance: Cloud Assistant managed instance.</li>
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
         * <p>The tag filter rules.</p>
         * <blockquote>
         * <p>This parameter is in invitational preview and is not publicly available.</p>
         * </blockquote>
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
             * <p>The tag key used to perform an exact search for ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
             * <p>Usage notes of the <code>Tag.N</code> parameter:</p>
             * <ul>
             * <li><p>Method 1: Used to perform an exact search for ECS resources that have the specified tags bound. Each tag is a key-value pair.</p>
             * <ul>
             * <li><p>If you specify only <code>Tag.N.Key</code>, all resources associated with the tag key are returned.</p>
             * </li>
             * <li><p>If you specify only <code>Tag.N.Value</code>, the <code>InvalidParameter.TagValue</code> error is returned.</p>
             * </li>
             * <li><p>If you specify multiple tag key-value pairs at the same time, only ECS resources that match all the specified tag key-value pairs are returned.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p>Method 2: Used to query resource information in non-default resource groups. Set <code>Key</code> to <code>acs:rm:rgId</code> and set the corresponding <code>Value</code> to the resource group ID.</p>
             * <ul>
             * <li><p>If <code>Key</code> is set to <code>acs:rm:rgId</code>, <code>Value</code> can only be set to a non-default resource group ID. If the specified resource group ID is the default resource group, an error message is returned.</p>
             * </li>
             * <li><p>If <code>Key</code> is set to <code>acs:rm:rgId</code>, you cannot specify other tag key-value pairs. If you use multiple <code>Tag.N</code> parameters to query resources by resource group and tags at the same time, an error message is returned.</p>
             * </li>
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
             * <p>The tag value used to perform an exact search for ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 20.</p>
             * <blockquote>
             * <p>If <code>Key=acs:rm:rgId</code>, this parameter can only be set to a resource group ID, and the resource group ID cannot be the default resource group.</p>
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
             * <p>The tag key used to perform a fuzzy search for ECS resources. The tag key must be 1 to 128 characters in length. Valid values of N: 1 to 5.</p>
             * <p><code>TagFilter.N</code> is used to perform a fuzzy search for ECS resources that have the specified tags bound. It consists of a key and one or more values. A fuzzy search may have a latency of up to 2 seconds and supports only scenarios where the number of resources after fuzzy filtering is less than or equal to 5,000.</p>
             * <ul>
             * <li><p>When you perform a fuzzy search for ECS resources by tag key (<code>TagFilter.N.TagKey</code>), the tag value (<code>TagFilter.N.TagValues.N</code>) must be empty. For example, to perform a fuzzy search for ECS resources whose tag key is <code>environment</code>, you can set <code>TagFilter.1.TagKey</code> to <code>env*</code> (prefix match), <code>*env*</code> (infix match), or <code>env</code> (exact match), and <code>TagFilter.1.TagValues</code> must be empty.</p>
             * </li>
             * <li><p>When you perform a fuzzy search for ECS resources by tag value (<code>TagFilter.N.TagValues.N</code>), the tag key (<code>TagFilter.N.TagKey</code>) must be set to an exact value. For example, to perform a fuzzy search for ECS resources whose tag key is <code>env</code> and tag value is <code>product</code>, <code>TagFilter.1.TagKey</code> must be set to the exact value <code>env</code>, and <code>TagFilter.1.TagValues.1</code> can be set to <code>proc*</code> (prefix match), <code>*proc*</code> (infix match), or <code>proc</code> (exact match). Only one search method can be used for the same <code>TagKey</code>. If multiple search methods are specified, the first method takes precedence.</p>
             * </li>
             * <li><p>Tag keys have an AND relationship. Only ECS resources that match all specified tag keys are returned.</p>
             * </li>
             * <li><p>Tag values under the same tag key have an OR relationship. ECS resources that match any of the tag values specified for a tag key are returned.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The <code>TagFilter.N</code> and <code>Tag.N</code> parameters cannot be used at the same time. Otherwise, an error message is returned.</p>
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
             * <p>The tag value used to perform a fuzzy search for ECS resources. The tag value must be 1 to 128 characters in length. Valid values of N: 1 to 5. For the metric description, see the <code>TagFilter.N.TagKey</code> parameter description.</p>
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
