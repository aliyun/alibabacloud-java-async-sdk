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
    @NameInMap("ExternalId")
    private String externalId;

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
        this.externalId = builder.externalId;
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
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
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
        private String externalId; 
        private String policy; 
        private String roleArn; 
        private String roleSessionName; 

        private Builder() {
            super();
        } 

        private Builder(AssumeRoleRequest request) {
            super(request);
            this.durationSeconds = request.durationSeconds;
            this.externalId = request.externalId;
            this.policy = request.policy;
            this.roleArn = request.roleArn;
            this.roleSessionName = request.roleSessionName;
        } 

        /**
         * The validity period of the STS token. Unit: seconds.
         * <p>
         * 
         * Minimum value: 900. Maximum value: the value of the `MaxSessionDuration` parameter. Default value: 3600.
         * 
         * You can call the CreateRole or UpdateRole operation to configure the `MaxSessionDuration` parameter. For more information, see [CreateRole](~~28710~~) or [UpdateRole](~~28712~~).
         */
        public Builder durationSeconds(Long durationSeconds) {
            this.putQueryParameter("DurationSeconds", durationSeconds);
            this.durationSeconds = durationSeconds;
            return this;
        }

        /**
         * ExternalId.
         */
        public Builder externalId(String externalId) {
            this.putQueryParameter("ExternalId", externalId);
            this.externalId = externalId;
            return this;
        }

        /**
         * The policy that specifies the permissions of the returned STS token. You can use this parameter to grant the STS token fewer permissions than the permissions granted to the RAM role.
         * <p>
         * 
         * *   If you specify this parameter, the permissions of the returned STS token are the permissions that are included in the value of this parameter and owned by the RAM role.
         * *   If you do not specify this parameter, the returned STS token has all the permissions of the RAM role.
         * 
         * The value must be 1 to 2,048 characters in length.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the RAM role.
         * <p>
         * 
         * The trusted entity of the RAM role is an Alibaba Cloud account. For more information, see [Create a RAM role for a trusted Alibaba Cloud account](~~93691~~) or [CreateRole](~~28710~~).
         * 
         * Format: `acs:ram::<account_id>:role/<role_name>`.
         * 
         * You can view the ARN in the RAM console or by calling operations.
         * 
         * *   For more information about how to view the ARN in the RAM console, see [How do I find the ARN of the RAM role?](~~39744~~)
         * *   For more information about how to view the ARN by calling operations, see [ListRoles](~~28713~~) or [GetRole](~~28711~~).
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The custom name of the role session.
         * <p>
         * 
         * Set this parameter based on your business requirements. In most cases, you can set this parameter to the identity of the API caller. For example, you can specify a username. You can specify `RoleSessionName` to identify API callers that assume the same RAM role in ActionTrail logs. This allows you to track the users that perform the operations.
         * 
         * The value must be 2 to 64 characters in length and can contain letters, digits, periods (.), at signs (@), hyphens (-), and underscores (\_).
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
