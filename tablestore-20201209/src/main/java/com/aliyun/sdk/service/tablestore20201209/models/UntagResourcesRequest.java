// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
    @Body
    @NameInMap("All")
    private Boolean all;

    @Body
    @NameInMap("ResourceIds")
    private java.util.List < String > resourceIds;

    @Body
    @NameInMap("ResourceType")
    private String resourceType;

    @Body
    @NameInMap("TagKeys")
    private java.util.List < String > tagKeys;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
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
        private java.util.List < String > resourceIds; 
        private String resourceType; 
        private java.util.List < String > tagKeys; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
        } 

        /**
         * All.
         */
        public Builder all(Boolean all) {
            this.putBodyParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * ResourceIds.
         */
        public Builder resourceIds(java.util.List < String > resourceIds) {
            this.putBodyParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TagKeys.
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            this.putBodyParameter("TagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
