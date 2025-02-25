// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWafScopeRequest} extends {@link RequestModel}
 *
 * <p>DescribeWafScopeRequest</p>
 */
public class DescribeWafScopeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private Long entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private DescribeWafScopeRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWafScopeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<DescribeWafScopeRequest, Builder> {
        private Long entityId; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWafScopeRequest request) {
            super(request);
            this.entityId = request.entityId;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * The ID of the entity.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the account that you switch from the management account.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view. Valid values:
         * <p>
         * - 0: the current Alibaba Cloud account
         * - 1: the global account
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public DescribeWafScopeRequest build() {
            return new DescribeWafScopeRequest(this);
        } 

    } 

}
