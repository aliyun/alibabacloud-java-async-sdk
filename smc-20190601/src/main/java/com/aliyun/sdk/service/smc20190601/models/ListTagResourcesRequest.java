// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smc20190601.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private String nextToken; 
        private Long ownerId; 
        private java.util.List<String> resourceId; 
        private String resourceOwnerAccount; 
        private String resourceType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest request) {
            super(request);
            this.nextToken = request.nextToken;
            this.ownerId = request.ownerId;
            this.resourceId = request.resourceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The IDs of SMC resources. SMC resources include migration sources and migration jobs. You can specify a maximum of 50 SMC resource IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1e2fsl57knvuug****</p>
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
         * <p>The type of the SMC resource. Valid values:</p>
         * <ul>
         * <li>sourceserver: migration source.</li>
         * <li>replicationjob: migration job.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sourceserver</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tags that are attached to SMC resources.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
             * <p>The key of tag N. The tag key must be 1 to 64 characters in length. Valid values of N: 1 to 20.</p>
             * <p>Tag.N is used for exact match of SMC resources to which the tag is attached. Tag N consists of a key-value pair.</p>
             * <ul>
             * <li>Tag keys and values are case-sensitive.</li>
             * <li>If you set only the Tag.N.Key parameter, all resources to which the specified tags are attached are returned.</li>
             * <li>If you set only the Tag.N.Value parameter, the error message InvalidParameter.TagValue is returned.</li>
             * <li>If you specify multiple tag key-value pairs at a time, only SMC resources that match all tag key-value pairs are returned.</li>
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
             * <p>The value of tag N. The value must be 1 to 64 characters in length. Valid values of N: 1 to 20.</p>
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
}
