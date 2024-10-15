// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    @com.aliyun.core.annotation.NameInMap("all")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resource_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resource_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tag_keys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > tagKeys;

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
    public java.util.List < String > getResourceIds() {
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
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private String regionId; 
        private java.util.List < String > resourceIds; 
        private String resourceType; 
        private java.util.List < String > tagKeys; 

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
         * <p>Specifies whether to remove all custom labels. This parameter takes effect only when <code>tag_keys</code> is left empty. Valid values:</p>
         * <ul>
         * <li><code>true</code>: Remove all custom labels.</li>
         * <li><code>false</code>: Do not remove all custom labels.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("all", all);
            this.all = all;
            return this;
        }

        /**
         * <p>The region ID of the resources.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("region_id", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of resource IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            String resourceIdsShrink = shrink(resourceIds, "resource_ids", "json");
            this.putQueryParameter("resource_ids", resourceIdsShrink);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The type of resource. Set the value to <code>CLUSTER</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resource_type", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of keys of the labels that you want to remove.</p>
         * <p>This parameter is required.</p>
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            String tagKeysShrink = shrink(tagKeys, "tag_keys", "json");
            this.putQueryParameter("tag_keys", tagKeysShrink);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
