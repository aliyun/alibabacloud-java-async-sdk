// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai20240521.models;

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
 * {@link UntagResourcesSystemTagsRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesSystemTagsRequest</p>
 */
public class UntagResourcesSystemTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKey")
    private java.util.List<String> tagKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagOwnerUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tagOwnerUid;

    private UntagResourcesSystemTagsRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
        this.tagOwnerUid = builder.tagOwnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesSystemTagsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKey
     */
    public java.util.List<String> getTagKey() {
        return this.tagKey;
    }

    /**
     * @return tagOwnerUid
     */
    public Long getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public static final class Builder extends Request.Builder<UntagResourcesSystemTagsRequest, Builder> {
        private Boolean all; 
        private String regionId; 
        private java.util.List<String> resourceId; 
        private String resourceType; 
        private java.util.List<String> tagKey; 
        private Long tagOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesSystemTagsRequest request) {
            super(request);
            this.all = request.all;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
            this.tagOwnerUid = request.tagOwnerUid;
        } 

        /**
         * All.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceId(java.util.List<String> resourceId) {
            String resourceIdShrink = shrink(resourceId, "ResourceId", "json");
            this.putQueryParameter("ResourceId", resourceIdShrink);
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
         * TagKey.
         */
        public Builder tagKey(java.util.List<String> tagKey) {
            String tagKeyShrink = shrink(tagKey, "TagKey", "json");
            this.putQueryParameter("TagKey", tagKeyShrink);
            this.tagKey = tagKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tagOwnerUid(Long tagOwnerUid) {
            this.putQueryParameter("TagOwnerUid", tagOwnerUid);
            this.tagOwnerUid = tagOwnerUid;
            return this;
        }

        @Override
        public UntagResourcesSystemTagsRequest build() {
            return new UntagResourcesSystemTagsRequest(this);
        } 

    } 

}
