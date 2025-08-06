// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListVodTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListVodTagResourcesRequest</p>
 */
public class ListVodTagResourcesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagOwnerBid")
    private String tagOwnerBid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagOwnerUid")
    private String tagOwnerUid;

    private ListVodTagResourcesRequest(Builder builder) {
        super(builder);
        this.nextToken = builder.nextToken;
        this.ownerId = builder.ownerId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
        this.tagOwnerBid = builder.tagOwnerBid;
        this.tagOwnerUid = builder.tagOwnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVodTagResourcesRequest create() {
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
     * @return tagOwnerBid
     */
    public String getTagOwnerBid() {
        return this.tagOwnerBid;
    }

    /**
     * @return tagOwnerUid
     */
    public String getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public static final class Builder extends Request.Builder<ListVodTagResourcesRequest, Builder> {
        private String nextToken; 
        private Long ownerId; 
        private java.util.List<String> resourceId; 
        private String resourceType; 
        private java.util.List<Tag> tag; 
        private String tagOwnerBid; 
        private String tagOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(ListVodTagResourcesRequest request) {
            super(request);
            this.nextToken = request.nextToken;
            this.ownerId = request.ownerId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
            this.tagOwnerBid = request.tagOwnerBid;
            this.tagOwnerUid = request.tagOwnerUid;
        } 

        /**
         * NextToken.
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
         * ResourceId.
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TagOwnerBid.
         */
        public Builder tagOwnerBid(String tagOwnerBid) {
            this.putQueryParameter("TagOwnerBid", tagOwnerBid);
            this.tagOwnerBid = tagOwnerBid;
            return this;
        }

        /**
         * TagOwnerUid.
         */
        public Builder tagOwnerUid(String tagOwnerUid) {
            this.putQueryParameter("TagOwnerUid", tagOwnerUid);
            this.tagOwnerUid = tagOwnerUid;
            return this;
        }

        @Override
        public ListVodTagResourcesRequest build() {
            return new ListVodTagResourcesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListVodTagResourcesRequest} extends {@link TeaModel}
     *
     * <p>ListVodTagResourcesRequest</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
