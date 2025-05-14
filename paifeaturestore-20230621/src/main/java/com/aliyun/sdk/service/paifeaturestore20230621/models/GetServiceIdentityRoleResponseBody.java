// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link GetServiceIdentityRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceIdentityRoleResponseBody</p>
 */
public class GetServiceIdentityRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private GetServiceIdentityRoleResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceIdentityRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder {
        private String policy; 
        private String requestId; 
        private String roleName; 

        private Builder() {
        } 

        private Builder(GetServiceIdentityRoleResponseBody model) {
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.roleName = model.roleName;
        } 

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public GetServiceIdentityRoleResponseBody build() {
            return new GetServiceIdentityRoleResponseBody(this);
        } 

    } 

}
