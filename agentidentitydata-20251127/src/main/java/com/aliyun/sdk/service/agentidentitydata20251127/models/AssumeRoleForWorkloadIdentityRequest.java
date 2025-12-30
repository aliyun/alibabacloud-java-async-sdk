// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link AssumeRoleForWorkloadIdentityRequest} extends {@link RequestModel}
 *
 * <p>AssumeRoleForWorkloadIdentityRequest</p>
 */
public class AssumeRoleForWorkloadIdentityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DurationSeconds")
    private Long durationSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleSessionName")
    private String roleSessionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkloadAccessToken")
    private String workloadAccessToken;

    private AssumeRoleForWorkloadIdentityRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.policy = builder.policy;
        this.roleSessionName = builder.roleSessionName;
        this.workloadAccessToken = builder.workloadAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleForWorkloadIdentityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return roleSessionName
     */
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    /**
     * @return workloadAccessToken
     */
    public String getWorkloadAccessToken() {
        return this.workloadAccessToken;
    }

    public static final class Builder extends Request.Builder<AssumeRoleForWorkloadIdentityRequest, Builder> {
        private Long durationSeconds; 
        private String policy; 
        private String roleSessionName; 
        private String workloadAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleForWorkloadIdentityRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.policy = request.policy;
            this.roleSessionName = request.roleSessionName;
            this.workloadAccessToken = request.workloadAccessToken;
        } 

        /**
         * DurationSeconds.
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putBodyParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * RoleSessionName.
         */
        public Builder roleSessionName(String roleSessionName) {
            this.putBodyParameter("RoleSessionName", roleSessionName);
            this.roleSessionName = roleSessionName;
            return this;
        }

        /**
         * WorkloadAccessToken.
         */
        public Builder workloadAccessToken(String workloadAccessToken) {
            this.putBodyParameter("WorkloadAccessToken", workloadAccessToken);
            this.workloadAccessToken = workloadAccessToken;
            return this;
        }

        @Override
        public AssumeRoleForWorkloadIdentityRequest build() {
            return new AssumeRoleForWorkloadIdentityRequest(this);
        } 

    } 

}
