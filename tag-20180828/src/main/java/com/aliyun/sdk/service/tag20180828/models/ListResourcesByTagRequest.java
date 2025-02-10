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
 * {@link ListResourcesByTagRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesByTagRequest</p>
 */
public class ListResourcesByTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagFilter")
    private TagFilter tagFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzyType")
    private String fuzzyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeAllTags")
    private Boolean includeAllTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResult")
    private Integer maxResult;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private ListResourcesByTagRequest(Builder builder) {
        super(builder);
        this.tagFilter = builder.tagFilter;
        this.fuzzyType = builder.fuzzyType;
        this.includeAllTags = builder.includeAllTags;
        this.maxResult = builder.maxResult;
        this.nextToken = builder.nextToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesByTagRequest create() {
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
     * @return fuzzyType
     */
    public String getFuzzyType() {
        return this.fuzzyType;
    }

    /**
     * @return includeAllTags
     */
    public Boolean getIncludeAllTags() {
        return this.includeAllTags;
    }

    /**
     * @return maxResult
     */
    public Integer getMaxResult() {
        return this.maxResult;
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

    public static final class Builder extends Request.Builder<ListResourcesByTagRequest, Builder> {
        private TagFilter tagFilter; 
        private String fuzzyType; 
        private Boolean includeAllTags; 
        private Integer maxResult; 
        private String nextToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesByTagRequest request) {
            super(request);
            this.tagFilter = request.tagFilter;
            this.fuzzyType = request.fuzzyType;
            this.includeAllTags = request.includeAllTags;
            this.maxResult = request.maxResult;
            this.nextToken = request.nextToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
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
         * <p>The type of the query. Valid values:</p>
         * <ul>
         * <li>EQUAL: exact match for resources to which the specified tag is added. This is the default value.</li>
         * <li>NOT: exact match for resources to which the specified tag is not added.</li>
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
         * <p>Specifies whether to return the information of tags added to the resources. Valid values:</p>
         * <ul>
         * <li>False: does not return the information of tags added to the resources. This is the default value.</li>
         * <li>True: returns the information of all tags added to the resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder includeAllTags(Boolean includeAllTags) {
            this.putQueryParameter("IncludeAllTags", includeAllTags);
            this.includeAllTags = includeAllTags;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Default value: 50. Maximum value: 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResult(Integer maxResult) {
            this.putQueryParameter("MaxResult", maxResult);
            this.maxResult = maxResult;
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
         * <p>The region ID.</p>
         * <p>For more information about region IDs, see <a href="https://help.aliyun.com/document_detail/2330902.html">Endpoints</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
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
         * <ul>
         * <li>If you set the FuzzyType parameter to EQUAL, you can set this parameter to a value obtained from the response of the <a href="https://help.aliyun.com/document_detail/2330915.html">ListSupportResourceTypes</a> operation.</li>
         * <li>If you set the FuzzyType parameter to NOT, you can set this parameter to a resource type provided in <strong>Types of resources that support queries based on the NOT operator</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::VPC::VPC</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListResourcesByTagRequest build() {
            return new ListResourcesByTagRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListResourcesByTagRequest} extends {@link TeaModel}
     *
     * <p>ListResourcesByTagRequest</p>
     */
    public static class TagFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagFilter(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
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
             * <p>The tag key. This parameter specifies a filter condition for the query.</p>
             * <p>The tag key can be a maximum of 128 characters in length. It cannot contain <code>http://</code> or <code>https://</code> and cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. This parameter specifies a filter condition for the query.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
