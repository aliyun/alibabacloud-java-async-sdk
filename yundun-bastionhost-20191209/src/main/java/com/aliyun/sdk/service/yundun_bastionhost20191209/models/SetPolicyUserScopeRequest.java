// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPolicyUserScopeRequest} extends {@link RequestModel}
 *
 * <p>SetPolicyUserScopeRequest</p>
 */
public class SetPolicyUserScopeRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ScopeType")
    @Validation(required = true)
    private String scopeType;

    @Query
    @NameInMap("UserGroupIds")
    private java.util.List < String > userGroupIds;

    @Query
    @NameInMap("UserIds")
    private java.util.List < String > userIds;

    private SetPolicyUserScopeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
        this.scopeType = builder.scopeType;
        this.userGroupIds = builder.userGroupIds;
        this.userIds = builder.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolicyUserScopeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List < String > getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userIds
     */
    public java.util.List < String > getUserIds() {
        return this.userIds;
    }

    public static final class Builder extends Request.Builder<SetPolicyUserScopeRequest, Builder> {
        private String instanceId; 
        private String policyId; 
        private String regionId; 
        private String scopeType; 
        private java.util.List < String > userGroupIds; 
        private java.util.List < String > userIds; 

        private Builder() {
            super();
        } 

        private Builder(SetPolicyUserScopeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.policyId = request.policyId;
            this.regionId = request.regionId;
            this.scopeType = request.scopeType;
            this.userGroupIds = request.userGroupIds;
            this.userIds = request.userIds;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ScopeType.
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            this.putQueryParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * UserIds.
         */
        public Builder userIds(java.util.List < String > userIds) {
            this.putQueryParameter("UserIds", userIds);
            this.userIds = userIds;
            return this;
        }

        @Override
        public SetPolicyUserScopeRequest build() {
            return new SetPolicyUserScopeRequest(this);
        } 

    } 

}
