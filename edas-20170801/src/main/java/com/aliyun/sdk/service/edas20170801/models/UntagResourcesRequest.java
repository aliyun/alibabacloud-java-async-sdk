// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
    @com.aliyun.core.annotation.NameInMap("DeleteAll")
    private Boolean deleteAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKeys")
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
         * <p>Specifies whether to remove all existing tags from the specified resources. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: removes all existing tags from the specified resources.</li>
         * <li><strong>false</strong>: does not remove all existing tags from the specified resources.</li>
         * </ul>
         * <blockquote>
         * <p>All existing tags of a resource are removed only if the <strong>tagKeys</strong> parameter is left empty and the <strong>DeleteAll</strong> parameter is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deleteAll(Boolean deleteAll) {
            this.putQueryParameter("DeleteAll", deleteAll);
            this.deleteAll = deleteAll;
            return this;
        }

        /**
         * <p>The IDs of the resources from which you want to remove tags. You can specify up to 20 IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;f5ad6ff7-xxxx-xxxx-xxxx-2axxxx82xxxx&quot;]</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The region in which the resource resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>The type of the resource. Valid values:</p>
         * <ul>
         * <li><strong>application</strong>: Enterprise Distributed Application Service (EDAS) application</li>
         * <li><strong>cluster</strong>: EDAS cluster</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tags that you want to remove. You can specify up to 20 tags. Set this parameter to a JSON array.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;tagKey1&quot;,&quot;tagKey2&quot;]</p>
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
