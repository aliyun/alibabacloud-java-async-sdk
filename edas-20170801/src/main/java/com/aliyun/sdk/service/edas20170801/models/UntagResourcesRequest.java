// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
    @NameInMap("DeleteAll")
    private Boolean deleteAll;

    @Query
    @NameInMap("ResourceIds")
    @Validation(required = true)
    private String resourceIds;

    @Query
    @NameInMap("ResourceRegionId")
    @Validation(required = true)
    private String resourceRegionId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("TagKeys")
    private String tagKeys;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.deleteAll = builder.deleteAll;
        this.resourceIds = builder.resourceIds;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
        this.tagKeys = builder.tagKeys;
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
     * @return deleteAll
     */
    public Boolean getDeleteAll() {
        return this.deleteAll;
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
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
    public String getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean deleteAll; 
        private String resourceIds; 
        private String resourceRegionId; 
        private String resourceType; 
        private String tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.deleteAll = request.deleteAll;
            this.resourceIds = request.resourceIds;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * Specifies whether to remove all existing tags from the specified resources. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: removes all existing tags from the specified resources.
         * *   **false**: does not remove all existing tags from the specified resources.
         * 
         * > All existing tags of a resource are removed only if the **tagKeys** parameter is left empty and the **DeleteAll** parameter is set to true.
         */
        public Builder deleteAll(Boolean deleteAll) {
            this.putQueryParameter("DeleteAll", deleteAll);
            this.deleteAll = deleteAll;
            return this;
        }

        /**
         * The IDs of the resources from which you want to remove tags. You can specify up to 20 IDs.
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The region in which the resource resides.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * The type of the resource. Valid values:
         * <p>
         * 
         * *   **application**: Enterprise Distributed Application Service (EDAS) application
         * *   **cluster**: EDAS cluster
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tags that you want to remove. You can specify up to 20 tags. Set this parameter to a JSON array.
         */
        public Builder tagKeys(String tagKeys) {
            this.putQueryParameter("TagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
