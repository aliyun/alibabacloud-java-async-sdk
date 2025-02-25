// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListTagKeysRequest} extends {@link RequestModel}
 *
 * <p>ListTagKeysRequest</p>
 */
public class ListTagKeysRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagFilter")
    private TagFilter tagFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyType")
    private String fuzzyType;

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
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private ListTagKeysRequest(Builder builder) {
        super(builder);
        this.tagFilter = builder.tagFilter;
        this.category = builder.category;
        this.fuzzyType = builder.fuzzyType;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.queryType = builder.queryType;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagKeysRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tagFilter
     */
    public TagFilter getTagFilter() {
        return this.tagFilter;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return fuzzyType
     */
    public String getFuzzyType() {
        return this.fuzzyType;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListTagKeysRequest, Builder> {
        private TagFilter tagFilter; 
        private String category; 
        private String fuzzyType; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageSize; 
        private String queryType; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTagKeysRequest request) {
            super(request);
            this.tagFilter = request.tagFilter;
            this.category = request.category;
            this.fuzzyType = request.fuzzyType;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.queryType = request.queryType;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceType = request.resourceType;
        } 

        /**
         * TagFilter.
         */
        public Builder tagFilter(TagFilter tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        /**
         * <p>The type of the resource tags. This parameter specifies a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>all (default value)</li>
         * <li>custom</li>
         * <li>system</li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter is not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The type of the query. Valid values:</p>
         * <ul>
         * <li>EQUAL (default): exact match</li>
         * <li>PREFIX: prefix-based fuzzy match</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        public Builder fuzzyType(String fuzzyType) {
            this.putQueryParameter("FuzzyType", fuzzyType);
            this.fuzzyType = fuzzyType;
            return this;
        }

        /**
         * <p>The token that is used to start the next query.</p>
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
         * <p>The number of tag keys to return on each page.</p>
         * <p>Maximum value: 1000. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The category of the tags. This parameter specifies a filter condition for the query. Valid values:</p>
         * <ul>
         * <li>ResourceTag: resource tags, including custom and system tags. This is the default value.</li>
         * <li>MetaTag: preset tags.</li>
         * </ul>
         * <blockquote>
         * <p> The value of this parameter is not case-sensitive.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ResourceTag</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>For more information about region IDs, see <a href="https://help.aliyun.com/document_detail/2330902.html">Endpoints</a>.</p>
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
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The resource type. This parameter specifies a filter condition for the query.</p>
         * <p>Format: <code>ALIYUN::${ProductCode}::${ResourceType}</code>. All letters in the value of this parameter must be in uppercase.</p>
         * <ul>
         * <li><code>ProductCode</code>: the service code. You can set this field to a value obtained from the response of the <a href="https://help.aliyun.com/document_detail/2330915.html">ListSupportResourceTypes</a> operation.</li>
         * <li><code>ResourceType</code>: the resource type. You can set this field to a value obtained from the response of the <a href="https://help.aliyun.com/document_detail/2330915.html">ListSupportResourceTypes</a> operation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::INSTANCE</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListTagKeysRequest build() {
            return new ListTagKeysRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListTagKeysRequest} extends {@link TeaModel}
     *
     * <p>ListTagKeysRequest</p>
     */
    public static class TagFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private TagFilter(Builder builder) {
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String key; 

            /**
             * <p>The tag key for a fuzzy query.</p>
             * <p>This parameter is used together with the <code>FuzzyType</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>team</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
