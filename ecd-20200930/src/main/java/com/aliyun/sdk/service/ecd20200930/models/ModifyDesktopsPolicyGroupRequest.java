// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopsPolicyGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopsPolicyGroupRequest</p>
 */
public class ModifyDesktopsPolicyGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupIds")
    private java.util.List < String > policyGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDesktopsPolicyGroupRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.policyGroupId = builder.policyGroupId;
        this.policyGroupIds = builder.policyGroupIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopsPolicyGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return policyGroupIds
     */
    public java.util.List < String > getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopsPolicyGroupRequest, Builder> {
        private java.util.List < String > desktopId; 
        private String policyGroupId; 
        private java.util.List < String > policyGroupIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopsPolicyGroupRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.policyGroupId = request.policyGroupId;
            this.policyGroupIds = request.policyGroupIds;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud desktop. You can specify one or more desktop IDs. The value is a JSON array.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * 策略ID列表。
         */
        public Builder policyGroupIds(java.util.List < String > policyGroupIds) {
            this.putQueryParameter("PolicyGroupIds", policyGroupIds);
            this.policyGroupIds = policyGroupIds;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDesktopsPolicyGroupRequest build() {
            return new ModifyDesktopsPolicyGroupRequest(this);
        } 

    } 

}
