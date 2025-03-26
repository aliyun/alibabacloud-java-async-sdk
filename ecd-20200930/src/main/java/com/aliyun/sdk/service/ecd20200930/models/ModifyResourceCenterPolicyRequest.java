// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyResourceCenterPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourceCenterPolicyRequest</p>
 */
public class ModifyResourceCenterPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> policyGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private ModifyResourceCenterPolicyRequest(Builder builder) {
        super(builder);
        this.policyGroupIds = builder.policyGroupIds;
        this.policyGroupType = builder.policyGroupType;
        this.productType = builder.productType;
        this.resourceIds = builder.resourceIds;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceCenterPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyGroupIds
     */
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    /**
     * @return policyGroupType
     */
    public String getPolicyGroupType() {
        return this.policyGroupType;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<String> getResourceIds() {
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

    public static final class Builder extends Request.Builder<ModifyResourceCenterPolicyRequest, Builder> {
        private java.util.List<String> policyGroupIds; 
        private String policyGroupType; 
        private String productType; 
        private java.util.List<String> resourceIds; 
        private String resourceRegionId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourceCenterPolicyRequest request) {
            super(request);
            this.policyGroupIds = request.policyGroupIds;
            this.policyGroupType = request.policyGroupType;
            this.productType = request.productType;
            this.resourceIds = request.resourceIds;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder policyGroupIds(java.util.List<String> policyGroupIds) {
            this.putQueryParameter("PolicyGroupIds", policyGroupIds);
            this.policyGroupIds = policyGroupIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder policyGroupType(String policyGroupType) {
            this.putQueryParameter("PolicyGroupType", policyGroupType);
            this.policyGroupType = policyGroupType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ModifyResourceCenterPolicyRequest build() {
            return new ModifyResourceCenterPolicyRequest(this);
        } 

    } 

}
