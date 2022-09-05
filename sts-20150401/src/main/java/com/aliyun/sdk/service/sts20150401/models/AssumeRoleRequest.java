// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sts20150401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssumeRoleRequest} extends {@link RequestModel}
 *
 * <p>AssumeRoleRequest</p>
 */
public class AssumeRoleRequest extends Request {
    @Query
    @NameInMap("DurationSeconds")
    private Long durationSeconds;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("RoleArn")
    @Validation(required = true)
    private String roleArn;

    @Query
    @NameInMap("RoleSessionName")
    @Validation(required = true)
    private String roleSessionName;

    private AssumeRoleRequest(Builder builder) {
        super(builder);
        this.durationSeconds = builder.durationSeconds;
        this.policy = builder.policy;
        this.roleArn = builder.roleArn;
        this.roleSessionName = builder.roleSessionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleRequest create() {
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
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return roleSessionName
     */
    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public static final class Builder extends Request.Builder<AssumeRoleRequest, Builder> {
        private Long durationSeconds; 
        private String policy; 
        private String roleArn; 
        private String roleSessionName; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.policy = request.policy;
            this.roleArn = request.roleArn;
            this.roleSessionName = request.roleSessionName;
        } 

        /**
         * DurationSeconds.
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * RoleSessionName.
         */
        public Builder roleSessionName(String roleSessionName) {
            this.putQueryParameter("RoleSessionName", roleSessionName);
            this.roleSessionName = roleSessionName;
            return this;
        }

        @Override
        public AssumeRoleRequest build() {
            return new AssumeRoleRequest(this);
        } 

    } 

}
