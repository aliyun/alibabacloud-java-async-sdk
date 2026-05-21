// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceIds")
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tagKeys")
    private java.util.List<String> tagKeys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tagOwnerUid")
    private Long tagOwnerUid;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.category = builder.category;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.tagKeys = builder.tagKeys;
        this.tagOwnerUid = builder.tagOwnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKeys
     */
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return tagOwnerUid
     */
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private String regionId; 
        private String category; 
        private java.util.List<String> resourceIds; 
        private String resourceType; 
        private java.util.List<String> tagKeys; 
        private Long tagOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.category = request.category;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
            this.tagOwnerUid = request.tagOwnerUid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * category.
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * resourceIds.
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putBodyParameter("resourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * tagKeys.
         */
        public Builder tagKeys(java.util.List<String> tagKeys) {
            this.putBodyParameter("tagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * tagOwnerUid.
         */
        public Builder tagOwnerUid(Long tagOwnerUid) {
            this.putBodyParameter("tagOwnerUid", tagOwnerUid);
            this.tagOwnerUid = tagOwnerUid;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
