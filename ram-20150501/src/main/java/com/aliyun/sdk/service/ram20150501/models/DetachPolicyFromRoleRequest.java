// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachPolicyFromRoleRequest} extends {@link RequestModel}
 *
 * <p>DetachPolicyFromRoleRequest</p>
 */
public class DetachPolicyFromRoleRequest extends Request {
    @Query
    @NameInMap("PolicyName")
    private String policyName;

    @Query
    @NameInMap("PolicyType")
    private String policyType;

    @Query
    @NameInMap("RoleName")
    private String roleName;

    private DetachPolicyFromRoleRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachPolicyFromRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder extends Request.Builder<DetachPolicyFromRoleRequest, Builder> {
        private String policyName; 
        private String policyType; 
        private String roleName; 

        private Builder() {
            super();
        } 

        private Builder(DetachPolicyFromRoleRequest response) {
            super(response);
            this.policyName = response.policyName;
            this.policyType = response.policyType;
            this.roleName = response.roleName;
        } 

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        @Override
        public DetachPolicyFromRoleRequest build() {
            return new DetachPolicyFromRoleRequest(this);
        } 

    } 

}
