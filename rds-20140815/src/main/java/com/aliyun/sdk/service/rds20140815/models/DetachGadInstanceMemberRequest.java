// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachGadInstanceMemberRequest} extends {@link RequestModel}
 *
 * <p>DetachGadInstanceMemberRequest</p>
 */
public class DetachGadInstanceMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GadInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gadInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memberInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DetachGadInstanceMemberRequest(Builder builder) {
        super(builder);
        this.gadInstanceName = builder.gadInstanceName;
        this.memberInstanceName = builder.memberInstanceName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachGadInstanceMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gadInstanceName
     */
    public String getGadInstanceName() {
        return this.gadInstanceName;
    }

    /**
     * @return memberInstanceName
     */
    public String getMemberInstanceName() {
        return this.memberInstanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DetachGadInstanceMemberRequest, Builder> {
        private String gadInstanceName; 
        private String memberInstanceName; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DetachGadInstanceMemberRequest request) {
            super(request);
            this.gadInstanceName = request.gadInstanceName;
            this.memberInstanceName = request.memberInstanceName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The ID of the global active database cluster.
         */
        public Builder gadInstanceName(String gadInstanceName) {
            this.putQueryParameter("GadInstanceName", gadInstanceName);
            this.gadInstanceName = gadInstanceName;
            return this;
        }

        /**
         * The ID of the instance that serves as the unit node you want to remove. You can call the DescribeGadInstances query the instance ID.
         */
        public Builder memberInstanceName(String memberInstanceName) {
            this.putQueryParameter("MemberInstanceName", memberInstanceName);
            this.memberInstanceName = memberInstanceName;
            return this;
        }

        /**
         * The region ID of the central node. You can call the DescribeGadInstances operation to query the region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DetachGadInstanceMemberRequest build() {
            return new DetachGadInstanceMemberRequest(this);
        } 

    } 

}
