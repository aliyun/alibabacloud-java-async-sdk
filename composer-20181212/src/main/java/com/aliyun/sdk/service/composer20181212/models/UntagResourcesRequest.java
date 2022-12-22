// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

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
    @NameInMap("ResourceId")
    @Validation(required = true)
    private java.util.List < String > resourceId;

    @Body
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Body
    @NameInMap("TagKey")
    private java.util.List < String > tagKey;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.tagKey = builder.tagKey;
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
     * @return tagKey
     */
    public java.util.List < String > getTagKey() {
        return this.tagKey;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private java.util.List < String > resourceId; 
        private String resourceType; 
        private java.util.List < String > tagKey; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.tagKey = request.tagKey;
        } 

        /**
         * 系统规定参数。取值：UntagResources。
         */
        public Builder all(Boolean all) {
            this.putBodyParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * The type of the resources. Set the value to ALIYUN::LC::FLOW.
         * <p>
         * 
         * *   ALIYUN::LC::FLOW indicates Logic Composer workflows.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * system
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Specifies a maximum of 50 resource IDs.
         */
        public Builder tagKey(java.util.List < String > tagKey) {
            this.putBodyParameter("TagKey", tagKey);
            this.tagKey = tagKey;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
