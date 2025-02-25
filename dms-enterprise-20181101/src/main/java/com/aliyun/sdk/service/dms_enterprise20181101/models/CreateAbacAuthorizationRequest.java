// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link CreateAbacAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>CreateAbacAuthorizationRequest</p>
 */
public class CreateAbacAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleId")
    private Long roleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private CreateAbacAuthorizationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identityType = builder.identityType;
        this.policyId = builder.policyId;
        this.roleId = builder.roleId;
        this.tid = builder.tid;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAbacAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateAbacAuthorizationRequest, Builder> {
        private String regionId; 
        private String identityType; 
        private Long policyId; 
        private Long roleId; 
        private Long tid; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAbacAuthorizationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identityType = request.identityType;
            this.policyId = request.policyId;
            this.roleId = request.roleId;
            this.tid = request.tid;
            this.userId = request.userId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RoleId.
         */
        public Builder roleId(Long roleId) {
            this.putQueryParameter("RoleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateAbacAuthorizationRequest build() {
            return new CreateAbacAuthorizationRequest(this);
        } 

    } 

}
