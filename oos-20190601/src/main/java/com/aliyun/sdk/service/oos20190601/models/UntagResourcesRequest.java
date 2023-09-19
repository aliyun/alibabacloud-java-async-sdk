// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
    @NameInMap("All")
    private Boolean all;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceIds")
    @Validation(required = true)
    private java.util.Map < String, ? > resourceIds;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("TagKeys")
    private java.util.Map < String, ? > tagKeys;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.regionId = builder.regionId;
        this.resourceIds = builder.resourceIds;
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
     * @return resourceIds
     */
    public java.util.Map < String, ? > getResourceIds() {
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
    public java.util.Map < String, ? > getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private String regionId; 
        private java.util.Map < String, ? > resourceIds; 
        private String resourceType; 
        private java.util.Map < String, ? > tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.regionId = request.regionId;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * Specifies whether to remove all tags. This parameter takes effect only if TagKeys is left empty. Valid values: true and false. Default value: false. TagKeys is required if this parameter is set to false.
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the resources for which you want to modify the resource group. The number of resource IDs is 1 to 50.
         * <p>
         * 
         * *   If you set ResourceType to template, specify ResourceIds in the \["TemplateName1","TemplateName2"] format.
         * *   If you set ResourceType to parameter, specify ResourceIds in the \["Name1","Name2"] format.
         * *   If you set ResourceType to secretparameter, specify ResourceIds in the \["Name1","Name2"] format.
         * *   If you set ResourceType to stateconfiguration, specify ResourceIds in the \["StateConfigurationId 1","StateConfigurationId 2"] format.
         * *   If you set ResourceType to application, specify ResourceIds in the \["Name1","Name2"] format.
         */
        public Builder resourceIds(java.util.Map < String, ? > resourceIds) {
            String resourceIdsShrink = shrink(resourceIds, "ResourceIds", "json");
            this.putQueryParameter("ResourceIds", resourceIdsShrink);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * The type of the resource for which you want to modify the resource group. Valid values:
         * <p>
         * 
         * *   template: template.
         * *   parameter: parameter.
         * *   secretparameter: encryption parameter.
         * *   stateconfiguration: desired-state configuration.
         * *   application: application.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The tag keys. The number of keys ranges from 1 to 20.
         */
        public Builder tagKeys(java.util.Map < String, ? > tagKeys) {
            String tagKeysShrink = shrink(tagKeys, "TagKeys", "json");
            this.putQueryParameter("TagKeys", tagKeysShrink);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
