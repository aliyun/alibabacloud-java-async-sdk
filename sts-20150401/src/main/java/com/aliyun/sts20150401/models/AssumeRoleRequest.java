// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sts20150401.models;

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
    @NameInMap("RoleArn")
    private String roleArn;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("RoleSessionName")
    private String roleSessionName;

    @Query
    @NameInMap("DurationSeconds")
    private Long durationSeconds;

    private AssumeRoleRequest(Builder builder) {
        super(builder);
        this.roleArn = builder.roleArn;
        this.policy = builder.policy;
        this.roleSessionName = builder.roleSessionName;
        this.durationSeconds = builder.durationSeconds;
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
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
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
     * @return durationSeconds
     */
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public static final class Builder extends Request.Builder<AssumeRoleRequest, Builder> {
        private String roleArn; 
        private String policy; 
        private String roleSessionName; 
        private Long durationSeconds; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleRequest response) {
            super(response);
            this.roleArn = response.roleArn;
            this.policy = response.policy;
            this.roleSessionName = response.roleSessionName;
            this.durationSeconds = response.durationSeconds;
        } 

        /**
         * The RAM role ARN to assume.
         * <p>
         * 
         * This role is a RAM role whose trusted entity is an Alibaba cloud account. For more information, see [create a RAM role with a trusted entity as an Alibaba Cloud account](~~ 93691 ~~) or [CreateRole](~~ 28710 ~~).
         * 
         * Format: "acs:ram ::< account_id>:role/<role_name>".
         * 
         * > You can view the role ARN through the RAM console or API. The details are as follows:
         * > - RAM console: For more information, see [view the ARN of a RAM role](~~ 39744 ~~).
         * > - API: For more information, see [ListRoles](~~ 28713 ~~) or [GetRole](~~ 28711 ~~).
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * An additional policy added for STS Token to further restrict STS Token permissions. The details are as follows:
         * <p>
         * -If this policy is specified, the final policy STS Token the intersection of the RAM role policy and the policy.
         * -If this policy is not specified, the final policy is STS Token to take the policy of the RAM role.
         * 
         * The description must be 1 to 1024 characters in length.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The name of the role session.
         * <p>
         * 
         * This parameter is a custom parameter. The user who calls this API, such as the username. In the operation audit log, even operations performed by the same RAM role can be distinguished by different "RoleSessionName" to implement user-level access audit.
         * 
         * The description must be 2 to 64 characters in length and can contain letters, digits, periods (.), at(@), hyphens (-), and underscores (_).
         */
        public Builder roleSessionName(String roleSessionName) {
            this.putQueryParameter("RoleSessionName", roleSessionName);
            this.roleSessionName = roleSessionName;
            return this;
        }

        /**
         * The expiration time. Unit: seconds.
         * <p>
         * 
         * The minimum validity period is 900 seconds, and the maximum validity period is the "MaxSessionDuration" time for the role to be assumed. The default value is 3600 seconds.
         * > You can set the maximum session time "MaxSessionDuration" by using the CreateRole or UpdateRole ". For more information, see [CreateRole](~~ 28710 ~~) or [UpdateRole](~~ 28712 ~~).
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        @Override
        public AssumeRoleRequest build() {
            return new AssumeRoleRequest(this);
        } 

    } 

}
