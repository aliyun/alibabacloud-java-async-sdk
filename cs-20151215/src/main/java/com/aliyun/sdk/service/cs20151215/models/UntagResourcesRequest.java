// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @Query
    @NameInMap("all")
    private Boolean all;

    @Query
    @NameInMap("resource_type")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("tag_keys")
    @Validation(required = true)
    private java.util.List < String > tagKeys;

    @Query
    @NameInMap("region_id")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("resource_ids")
    @Validation(required = true)
    private java.util.List < String > resourceIds;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceType = builder.resourceType;
        this.tagKeys = builder.tagKeys;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
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
     * @return all
     */
    public Boolean getAll() {
        return this.all;
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
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceIds
     */
    public java.util.List < String > getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private String resourceType; 
        private java.util.List < String > tagKeys; 
        private String regionId; 
        private java.util.List < String > resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * Specifies whether to delete all custom tags. This parameter takes effect only when "tag_key" is empty. Valid values:[true,false].
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * The definition of the resource type. Valid values: only the resource type "CLUSTER" is supported.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resource_type", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The list of resource tag keys.
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            this.putQueryParameter("tag_keys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * The ID of the region to which the resource belongs.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The list of resource ids.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putQueryParameter("resource_ids", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
