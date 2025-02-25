// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagResourcesSystemTagsRequest} extends {@link RequestModel}
 *
 * <p>TagResourcesSystemTagsRequest</p>
 */
public class TagResourcesSystemTagsRequest extends Request {
    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private java.util.List < String > resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Tag")
    @Validation(required = true)
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TagOwnerBid")
    private String tagOwnerBid;

    @Query
    @NameInMap("TagOwnerUid")
    @Validation(required = true)
    private Long tagOwnerUid;

    private TagResourcesSystemTagsRequest(Builder builder) {
        super(builder);
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
        this.tagOwnerBid = builder.tagOwnerBid;
        this.tagOwnerUid = builder.tagOwnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagResourcesSystemTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
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
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public static final class Builder extends Request.Builder<TagResourcesSystemTagsRequest, Builder> {
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private String scope; 
        private String securityToken; 
        private java.util.List < Tag> tag; 
        private String tagOwnerBid; 
        private Long tagOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(TagResourcesSystemTagsRequest request) {
            super(request);
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.scope = request.scope;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
            this.tagOwnerBid = request.tagOwnerBid;
            this.tagOwnerUid = request.tagOwnerUid;
        } 

        /**
         * ResourceId.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
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
        public Builder tagOwnerUid(Long tagOwnerUid) {
            this.putQueryParameter("TagOwnerUid", tagOwnerUid);
            this.tagOwnerUid = tagOwnerUid;
            return this;
        }

        @Override
        public TagResourcesSystemTagsRequest build() {
            return new TagResourcesSystemTagsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
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
